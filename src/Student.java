public class Student {
    private String firstName;
    private String lastName;
    private Class[] classes;


    //ein Konstruktor soll die Werte für Vor-uNachname entgegennehmen
    //und das Class-Array mit Länge 3 initialisieren

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        classes = new Class[3]; //ob im Konstruktor oder gleich am Anfang bei den Attributen ist wurscht
    }

    //im folgenden schauen wir ob Kurs im Array (der Kurse des Studenten wo er angemeldet) schon angemeldet haben
    public void enroll(Class c) {
        if (alreadyEnrolled(c)) return; //methode erstellt durch: Vorschleife markieren, rM, refactor, extract to method


        //kurs noch frei?
        if (!c.maxCapacityReached()) {
            if (classes[classes.length - 1] != null) {
                classes = increaseClassArray();
            } else {
                classes[classes.length - 1] = c;//hat Student noch Kapazitäten für neuen Kurs
                for (int i = 0; i < this.classes.length; i++) { //kann auch ohne this. geschrieben werden
                    if (this.classes[i] == null) {
                        c.enroll(); //dadurch wird neuer Student eingeschrieben
                        classes[i] = c; //hier wird Klasse zu seinem Array hinzugefügt
                        System.out.println("Kurs angemeldet");
                        break; //break bringt uns HIER hin, bzw. holt uns aus for schleife raus
                    }
                } //HIER
            }
        } else {
            System.out.println("Keine Anmeldung mehr möglich");
        } //dann HIER
    }


    private Class[] increaseClassArray() {//geht auch private void
        Class[] temp = new Class[classes.length + 1];
        for (int i = 0; i < classes.length; i++) {
            temp[i] = classes[i];
        }

        return temp; //so ende ich weil ich private Class[] oben stehen habe; wenn private void
    }

    private boolean alreadyEnrolled(Class c) {
        for (int i = 0; i < classes.length; i++) {
            if (classes[i] != null) {
                if (classes[i].getName().equals(c.getName())) {
                    System.out.println(c.getName() + "bereits angemeldet");
                    return true;
                }
            }
        }
        return false;
    }

    public void printClasses() {
        for (int i = 0; i < classes.length; i++) {

            if (classes[i] != null) {
                System.out.println(classes[i].getName());
            } else {
                System.out.println(classes[i]);
            }


        }


    }

    public Class[] getClasses() {
        return classes;
    }
}

