package sortieren;

public class Frucht implements Comparable<Frucht> {
    protected String name;
    protected double gewicht;
    protected boolean frisch;

    public Frucht(String name, double gewicht, boolean frisch) {
        this.name = name;
        this.gewicht = gewicht;
        this.frisch = frisch;
    }

    public String getName() {
        return name;
    }

    public double getGewicht() {
        return gewicht;
    }

    public boolean isFrisch() {
        return frisch;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public void setFrisch(boolean frisch) {
        this.frisch = frisch;
    }



//sortieren aufsteigend nach Gewicht
    @Override
    public int compareTo(Frucht o) {
       // System.out.println("hier steht jetzt Text nur um zu sehen, wie oft das aufgerufen wird. Normal NIE in compareTo dazwischen eine Ausgabe");
        if(this.gewicht < o.gewicht) {
            return -1; //könnte auch -77 schreiben. das ist wurscht
        }
        if(this.gewicht > o.gewicht){
            return +1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Frucht{" +
                "name='" + name + '\'' +
                ", gewicht=" + gewicht +
                ", frisch=" + frisch +
                '}';
    }
}
