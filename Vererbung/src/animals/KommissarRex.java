package animals;


//nur ein Bsp, um zu zeigen wie Konstruktoren unterschiedlich sind
//ACHTUNG: immer überlegen, ob es wirklich sinn macht für so eine spezielle Situation
//wirklich eine abgeleitete Klasse zu erstellen oder vielleicht
//doch nur eine Instanz von einem zB Schäfer Hund
public class KommissarRex extends Dog{
    //normalerweise würden wir keine eigene Klasse machen, sondern eine Instanz
    public KommissarRex(int age) {
        super("Rex", age);
    }
}
