public class Main {
    public static void main(String[] args) {
        Class c = new Class("PR2", 20, 3 );

        Student s= new Student("Max", "M");

        System.out.println(s);
        s.enroll(c);
        s.printClasses();

        System.out.println();

        Class m = new Class("Modelle", 20, 3);
        s.enroll(m);
        s.printClasses();

        Class[] cs = s.getClasses();
        for (int i=0; i<cs.length; i++) {
            System.out.println(cs[i]);
        }
        s.enroll(c);
        System.out.println();

        Class pr = new Class("PR1", 20,3);
        Class db = new Class("DB", 20,3);

        s.enroll(pr);
        s.enroll(db);




    }
}