package orchesterabstract;

public class Instrument {
    private int loudness;


    private String gitarre;
    private String trompete;
    private String klarinette;
    private String geige;

    public Instrument(int loudness) {
        this.loudness = loudness;
    }

    public int getLoudness() {
        return loudness;
    }

    public void setLoudness(int loudness) {
        this.loudness = loudness;
    }
    public int play() {
        System.out.println(gitarre + "wird gezupft");
        System.out.println(trompete + "wird geblasen");
        System.out.println(klarinette + "wird wie Flöte gespielt, jedoch mit metallischen Schaltern");
        System.out.println(geige + "wird mit Bogen gestrichen");
        return getLoudness();
    }
}
