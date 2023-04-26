package rabbit_UE;

public class Hase implements GoesToParty {




        private String name;

    public Hase(String name) {
            this.name = name;
        }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public void sleep () {
            System.out.println(name + "schläft");
        }

        public void jump () {
            System.out.println(name + "hoppelt");
        }


}
