public class Run_Player {


        public static void main(String[] args) {
            Team t1 = new Team ("Team A");
            t1.add(new Player("Player A1",  20));
            t1.add(new Player("Player A2", 40));
            t1.add(new Player("Player A3", 25));
            t1.add(new Player("Player A4",  205));

            Team t2 = new Team("Team B");
            t2.add(new Player("PlayerB1",  36));
            t2.add(new Player("Player A2",  41));
            t2.add(new Player("PlayerB3",  75));
            t2.add(new Player("PlayerB4",  26));

            Team t3 = new Team("Team C");
            t3.add(new Player("PlayerC1",  90));
            t3.add(new Player("PlayerC2", 40));
            t3.add(new Player("PlayerC3",  25));
            t3.add(new Player("PlayerC4",  215));

            Verwaltung verwaltung = new Verwaltung();
            verwaltung.add(t1);
            verwaltung.add(t2);
            verwaltung.add(t3);

            System.out.println(verwaltung.getWinnerTeam());
            System.out.println(verwaltung.getBestPlayer());
            System.out.println(verwaltung.getPlayerById(7));

            System.out.println(t1.getPlayers().get(1).equals(t2.getPlayers().get(1)));

            System.out.println();

        }

    }
