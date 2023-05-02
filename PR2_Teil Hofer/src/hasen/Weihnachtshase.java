package hasen;

public class Weihnachtshase extends Hase {
    public Weihnachtshase(String n) {
        super(n);
    }

    public void verteileGeschenke(){
        System.out.println(name + " gräbt sich durch den Boden und verteilt Geschenke - hätte bei Albuquerque links abbiegen");
    }

    @Override
    public void party(String drink, String cake) {
        System.out.println("Weihnachtshase " + name + " bringt ganz viele Geschenke zur Party");
    }
}