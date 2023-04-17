import java.util.Objects;

public class Player {
    private static int counter = 0;
   private int id;
    private String name;
    private int points;
    private Team team;

    public Player(String name, int points) {
        this.id = counter++;
        this.name = name;
        this.points = points;

    }

    public static void setCounter(int counter) {
        Player.counter = counter;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public Team getTeam() {
        return team;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return name.equals(player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
