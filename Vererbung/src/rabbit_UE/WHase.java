package rabbit_UE;

public class WHase extends Hase {


    public WHase(String name, String thePresents) {
        super(name);

    }

    public void bringsPresents() {
        System.out.println(getName() + "thePresents");
    }
//    public void bark(String sleep) {
//        System.out.println(getName() + " bellt und jammert: " + wuff);

    public void sleep() {
        System.out.println(getName() + "zzzz");

    }
}

