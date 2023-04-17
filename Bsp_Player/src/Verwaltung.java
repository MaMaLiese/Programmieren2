import java.util.ArrayList;

public class Verwaltung {
    ArrayList<Team> teams = new ArrayList<>();

    public void print() {
        //soll zuerst das Team ausgeben und dann die Player
        for (Team t : teams) {
            System.out.println(t);
            t.print(); //in Class Player erstellt, gibt die player aus

        }
        System.out.println();
    }

    public Team getWinnerTeam() {
        Team winner = null;
        int points = 0;

        for (Team t : teams) {
            if (t.getPointsPerTeam() > points) {
                winner = t;
                points = t.getPointsPerTeam();
            }
        }
        return winner;

    }

    public Player getBestPlayer() {
        Player best = null;
        int points = 0;

        for (Team t : teams) {
            for (Player p : t.getPlayers()) {
                if (p.getPoints() > points) {
                    best = p;
                    points = p.getPoints();
                }
            }
        }
        return best;
    }
    public void add (Team A){
        teams.add(A);
    }
    public Player getPlayerById(int id) {
        for (Team t : teams){
            for (Player p : t.getPlayers()) {
                if(p.getId()==id) {
                    return p;
                }
            }
        }
        return null;

    }
}

