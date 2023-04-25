package animals;

public class App {
    public static void main(String[] args) {
        //statische Attribute können ohne Objekt(Instanz) verwendet werden
        System.out.println(Dog.latinName);
        //statische Methode aufrufen (hier auch ohne Objekt möglich)
        Dog.printLatinName();

        Beagle snoopy = new Beagle("Snoopy", 30, "Lasagne");
        snoopy.eatsLovedFood();
        snoopy.bark("auuuu");

        Dog d = new Dog("Baxter ", 7);
        d.bark("wuff wuff");

        //upcasting and downcasting
        //upcasting
        Beagle freddie = new Beagle ("Freddie", 5, "Gulasch");

        Dog doggo = freddie;

        //bellt wie ein beagle da eine Beagle Instanz auf der Dog Referenz ist
        //wir haben also ein neues Objekt erzeugt und dafür einen Platz im Arbeitsspeicher platz gemacht
        //jeder der Arbeisspeicherplatze hat eine Bezeichnung (zb Beagle@799)
        //dh in der Variable / bzw. dort wo sie gespeichert ist, sind nicht die Daten zur Variable gespeichert

        //ueber doggo referenz sehe ich nur Dog Methoden/Attribute
        //obwohl jetzt zufällig sogar ein Beagle (der mehr kann) drauf ist

        doggo.bark("wuff");


        //downcasting (Achtung Gefaehrlich - Danger Zone) von Basisklasse zu spezieller Klasse
        Dog doggo2 = new Beagle("Hubert", 4, "Spaghetti");
        //wir möchten sein Lieblingsessen wissen
        //nur um zu verstehen wird das folgende gleich drunter geschireben...stellen wir uns vor, da sind 1000 Zeilen Code dahinter
        Beagle b1 = (Beagle)doggo2; //wir wissen ja dass ein Beagle drauf ist, deshalb können wir es casten
        //dh ich weiß, dass da ein hund drinnen ist. aber bitte cast es als Beagle
        b1.eatsLovedFood();



    }
}
