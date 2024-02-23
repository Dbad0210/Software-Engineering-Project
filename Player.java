import java.util.ArrayList;

public class Player {

    private String name;
    private int number;
    private String year;
    private String position;
    private static ArrayList<Player> players = new ArrayList<>();


    public Player(int number, String name, String year, String position)
    {
        this.number = number;
        this.name = name;
        this.year = year;
        this.position = position;
        players.add(this); // Add the new player to the static list of players
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public static ArrayList<Player> getPlayers() {
        return players;
    }

    public static void removePlayer(Player player) {
        players.remove(player);
    }
}
