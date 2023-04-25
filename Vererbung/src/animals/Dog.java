package animals;

public class Dog {

    //nur Exkurs: hat nix mit Vererbung zu tun
    //statisches Attribut gibts nur einmal, egal wieviele Hundeobjekte erzeugt werden
    public static String latinName = "canis lupus familiaris";


    //statische Methode dar nur auf lokale Variablen und statische Attribut
    public static void printLatinName() {
        String hansi= "Hansi liebt Hunde";
        System.out.println(latinName);
       // System.out.println(age); // age geht nicht zum aufrufen;
        // in statischer methode kann ich nur statische attribute verwenden(und das lokale Zeugs...."int hansi geht immer");
        //weil sie sich nur auf die Klasse beziehen;
    }

    private String name; //Name des Hundes

    protected int age; //Alter des Hundes

    public Dog(String name, int age) { //diesen Konstruktor kann Java nicht automatisch aufrufen, weil er Parameter nicht kennt
        this.name = name;
        this.age = age;
    }

    //zur Veranschaulichung: zweiter Konstruktor
    //default Kontruktor (ohne Parameter)

    public Dog(){
        name = "Neugeboren";
        age = 0;
    }

    public void bark(String wuff){
        System.out.println(name + "bellt: " + wuff);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
