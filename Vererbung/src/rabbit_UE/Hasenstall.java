package rabbit_UE;

import java.util.ArrayList;
import java.util.Iterator;

public class Hasenstall {
    private ArrayList<Hase> all;

    public Hasenstall(){
        all = new ArrayList<>();
    }
    public void addHase(Hase hase){
        all.add(hase);
    }
    public void jumpAll(){
        for(Hase hase : all){
            hase.jump();
        }
//        Iterator<Hase> hasenIterator = all.iterator();
//        while(hasenIterator.hasNext()){
//            Hase hase = hasenIterator.next();
//            hase.jump();
//        }
    }
}
