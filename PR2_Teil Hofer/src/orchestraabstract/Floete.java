package orchestraabstract;

public class Floete extends Instrument {
    public Floete(int l) {
        super(l);
    }

    @Override
    public int play() {

        System.out.println("Flöte quietscht fast immer richtig");
        return getLautstaerke();
    }

}