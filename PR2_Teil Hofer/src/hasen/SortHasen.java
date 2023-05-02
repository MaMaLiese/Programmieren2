package hasen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortHasen {
    public static void main(String[] args) {
        Hase oh = new Hase(4, 50);
        Hase wh = new Hase(2, 45);
        Hase igel = new Hase(0, 2);


        Hase[] hasenArray = {oh, wh, igel};
        //um zu sehen, dass es wirklich noch nicht sortiert ist
        System.out.println(Arrays.toString(hasenArray));
        System.out.println("------------------------");

        Arrays.sort(hasenArray);
        System.out.println(Arrays.toString(hasenArray));

        List<Hase> hasenListe = new ArrayList<>();

        hasenListe.add(oh);
        hasenListe.add(wh);
       hasenListe.add(igel);

        System.out.println(hasenListe);

    }
}
