import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MySwingApp {
    public static void main(String[] args) {
        // Creating some sample players
        Player player1 = new Player(1, "Player 1", "2020", "Forward");
        Player player2 = new Player(2, "Player 2", "2021", "Midfielder");
        Player player3 = new Player(3, "Player 3", "2019", "Defender");

        JFrame frame = new JFrame("Player Names Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creating a panel to hold the components
        JPanel panel = new JPanel();

        // Creating a button to display player names
        JButton displayButton = new JButton("Display Player Names");

        // Adding action listener to the button
        displayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the list of players
                ArrayList<Player> players = Player.getPlayers();

                // Debug statement to print number of players
                System.out.println("Number of players: " + players.size());

                // Create a StringBuilder to hold the player names
                StringBuilder names = new StringBuilder();

                // Loop through the players and append their names to the StringBuilder
                for (Player player : players) {
                    names.append(player.getName()).append("\n");
                }

                // Display the player names in a dialog
                JOptionPane.showMessageDialog(frame, names.toString(), "Player Names", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Adding the button to the panel
        panel.add(displayButton);

        // Adding the panel to the frame
        frame.getContentPane().add(panel);

        // Adjusting frame size and making it visible
        frame.pack();
        frame.setVisible(true);
    }
}
