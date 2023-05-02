package hashmap;

import hasen.Hase;

import java.util.HashMap;
import java.util.Map;

public class HashmapTest {
    public static void main(String[] args) {
        //immer zwei Datentypen zu spezifizieren
        //hashmap ist intern so gespeichert, dass das einfügen zwar nicht so superschnell ist, aber
        //dafür das rauslesen sehr schnell


        //wir möchten alle hasen mit einer steuernummer speicher um sie schnell zu finden um korrekt versteuern zu können
        HashMap<String, Hase> steuerHasen = new HashMap<>();

        Hase h1 = new Hase ("Hansi");
        Hase h2 = new Hase("Susi");

        //etwas in hashmap geben (als Key)
        steuerHasen.put("123H", h1);
        steuerHasen.put("234H", h2);
        //Wert auslesen durch angabe des Schlüsels
        System.out.println(steuerHasen.get("123H"));
//wenn eingegebener Schlüssel nicht vorhanden ist, kommt "Null" zurück
        System.out.println(steuerHasen.get("bloedsinn"));
        //Fragen ob ein Schlüssel in Hashmap ist
        System.out.println(steuerHasen.containsKey("123H"));

        //ACHTUNG: nur notfalls machen (weil langsam), aber ich kann schaun, ob bestimmtes Objekt schon drinnen ist
        System.out.println(steuerHasen.containsValue(h1));

        //was passiert jetzt?
        //steuerHasen.put("123H, h2); //h2 statt h1 über "123H" abrufbar

        //über Hashmap iterieren
        for(Map.Entry<String, Hase> hase : steuerHasen.entrySet()){
            System.out.println(hase.getKey()); //in jeder iteration bekommen ich einmal wert vom Schlüssel und einmal vom Hasen
            Hase h = hase.getValue();
            h.hoppeln();
        }
       // for(String key : steuerHasen.keySet());

        //wenn wir eine Int INt HashMap wollen
    }
}
