import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MySwingApp {
    public static void main(String[] args) {
        // Creating some sample players
        Player player1 = new Player(1, "Player 1", "2020", "Forward");
        Player player2 = new Player(2, "Player 2", "2021", "PointGuard");
        Player player3 = new Player(3, "Player 3", "2019", "Center");

        JFrame frame = new JFrame("Player Names Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creating a panel to hold the components
        JPanel panel = new JPanel();

        // Creating a button to display player names
        JButton displayButton = new JButton("Display Player Information");

        // Creating a button to edit player information
        JButton editButton = new JButton("Edit Player");

        // Adding action listener to the "Display" button
        displayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayPlayerInformation();
            }
        });

        // Adding action listener to the "Edit" button
        editButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showEditPlayerDialog();
            }
        });

        // Adding the buttons to the panel
        panel.add(displayButton);
        panel.add(editButton);

        // Adding the panel to the frame
        frame.getContentPane().add(panel);

        // Adjusting frame size and making it visible
        frame.pack();
        frame.setVisible(true);
    }

    // Method to display player information
    private static void displayPlayerInformation() {
        // Get the list of players
        ArrayList<Player> players = Player.getPlayers();

        // Create a StringBuilder to hold the player information
        StringBuilder info = new StringBuilder();

        // Loop through the players and append their information to the StringBuilder
        for (Player player : players) {
            info.append("Name: ").append(player.getName()).append("\n");
            info.append("Number: ").append(player.getNumber()).append("\n");
            info.append("Year: ").append(player.getYear()).append("\n");
            info.append("Position: ").append(player.getPosition()).append("\n\n");
        }

        // Display the player information in a dialog
        JOptionPane.showMessageDialog(null, info.toString(), "Player Information", JOptionPane.INFORMATION_MESSAGE);
    }

    // Method to show a dialog for editing player information
    private static void showEditPlayerDialog() {
        // Get the list of players
        ArrayList<Player> players = Player.getPlayers();

        // Create an array of player names
        String[] playerNames = new String[players.size()];
        for (int i = 0; i < players.size(); i++) {
            playerNames[i] = players.get(i).getName();
        }

        // Show a dialog with a combo box to select a player
        JComboBox<String> playerComboBox = new JComboBox<>(playerNames);
        int result = JOptionPane.showConfirmDialog(null, playerComboBox, "Select a player to edit", JOptionPane.OK_CANCEL_OPTION);

        // If the user clicks "OK", get the selected player and show a dialog for manual editing
        if (result == JOptionPane.OK_OPTION) {
            String selectedPlayerName = (String) playerComboBox.getSelectedItem();
            Player selectedPlayer = findPlayerByName(selectedPlayerName);

            if (selectedPlayer != null) {
                showManualEditDialog(selectedPlayer);
            } else {
                JOptionPane.showMessageDialog(null, "Player not found", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Method to find a player by name
    private static Player findPlayerByName(String playerName) {
        ArrayList<Player> players = Player.getPlayers();
        for (Player player : players) {
            if (player.getName().equals(playerName)) {
                return player;
            }
        }
        return null;
    }

    // Method to show a dialog for manual editing of player information
    private static void showManualEditDialog(Player player) {
        JFrame editFrame = new JFrame("Edit Player Information");
        editFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel editPanel = new JPanel();

        JTextField nameField = new JTextField(player.getName());
        JTextField numberField = new JTextField(String.valueOf(player.getNumber()));
        JTextField yearField = new JTextField(player.getYear());
        JTextField positionField = new JTextField(player.getPosition());

        JButton updateButton = new JButton("Update");

        // Adding action listener to the "Update" button
        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Update player information
                player.setName(nameField.getText());
                player.setNumber(Integer.parseInt(numberField.getText()));
                player.setYear(yearField.getText());
                player.setPosition(positionField.getText());

                // Show a message indicating successful update
                JOptionPane.showMessageDialog(editFrame, "Player information updated", "Update Successful", JOptionPane.INFORMATION_MESSAGE);

                // Dispose the edit frame
                editFrame.dispose();
            }
        });

        // Adding components to the edit panel
        editPanel.add(new JLabel("Name:"));
        editPanel.add(nameField);
        editPanel.add(new JLabel("Number:"));
        editPanel.add(numberField);
        editPanel.add(new JLabel("Year:"));
        editPanel.add(yearField);
        editPanel.add(new JLabel("Position:"));
        editPanel.add(positionField);
        editPanel.add(updateButton);

        // Adding the edit panel to the edit frame
        editFrame.getContentPane().add(editPanel);

        // Adjusting frame size and making it visible
        editFrame.pack();
        editFrame.setVisible(true);
    }
}