import java.util.ArrayList;

public class Team {
    private ArrayList<Player> players;
   private String name;

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public String getName() {
        return name;
    }

    public Team(String name) {
        players = new ArrayList<>();
       this.name = name;
   }
   public void add(Player p){
        players.add(p);
   }
   public void print() {
       for (Player p : players) {
           System.out.println(p);
       }
       System.out.println();
   }


    public int getPointsPerTeam() {
        int sum = 0;
        for (Player p : players) {
            sum += p.getPoints();
        }
        return sum;


    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", points=" + getPointsPerTeam() +
                '}';
    }
}


