package animals;

public class Beagle extends Dog {
    public String lovedFood; //zusätzliche Eigenschaft

    public Beagle(String name2, int age2, String lovedFood) { //Konstruktor; die ersten attribute sollten in gleicher Reihenfolge
        //eingetragen werden wie in Dog-Class
        //parameter müssen nicht immer gleich heißen, "name2" und "age2" absichtlich gewählt zur Demonstration

        //wenn wir einen default Konstruktor "Dog()" in Basisklasse haben, dann wird dieser automatisch
        // zu Beginn dieses Konstruktors aufgerufen
        //falls es diesen nicht gibt oder wir einen anderen verwenden möchten
        //rufen wir mit super(...) explizit den Konstruktor
        super(name2, age2); //wenn du erzeugt wirst, rufe den Konstruktor der Basisklasse auf und gibt ihm die Attribute mit
        this.lovedFood = lovedFood;
    }
    //neue Methoden
    public void eatsLovedFood(){
        System.out.println(getName() + "(" + age + ") isst " + lovedFood);
        //wenn "age" in Class Dog private ist,
        // kann man hier nicht darauf zugreifen, nur über getName()
        //ist "öffentlicher getter"; age geht weil es protected ist
    }

    //methoden üBERSCHREIBEN (method overriding)


    //diese methode überschreibt eine Methode in einer der Basisklassen

    //at Override: um zu checken ob hier kein Fehler passiert ist

    @Override
    public void bark(String wuff) {
        System.out.println(getName() + " bellt und jammert: " + wuff);

        //!!!!es ist nicht möglich die Sichtbarkeit einzelner Methoden/Attribute einzuschränken
        //dh ist darf nicht aus etwas, das public ist ein private machen
    }
}

