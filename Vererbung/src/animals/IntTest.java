package animals;

public class IntTest {
    public static void main(String[] args) {
        int a1 = 12; // primitiver typ
        Integer a2 = new Integer(13); //komplexer Referenztyp (das durchgestrichene sagt mir nur "DAs hät ich mir sparen können)
        Integer a3 = 14; // es passiert eigentlich automatisch das in der Zeile darüber


        //exkurs: parseInt
        String test = "55";
        System.out.println(test + 5);
        int testAlsZahl = Integer.parseInt(test);
        System.out.println(testAlsZahl + 5);

        System.out.println(a1);
        System.out.println(a2);
    }
}
