package Bsp_Event;

import java.util.ArrayList;

public class EventCalendar {
    private ArrayList<Event> events ;
     public EventCalendar() {
         events = new ArrayList<>();
}


public void add(Event e){
    events.add(e);
}
public void print(){
    for (Event e : events) {
        System.out.println(e);

}
    System.out.println();
}
public void print(ArrayList<Event> events) { //dieses event ist nur innerhalb der beiden {}-Klammern gültig; dh wird
    //innerhalb v scope verdeckt; würde ich auf oberes 'events' zugreifen wollen, dann mit this.
    for (Event e : events) {
        System.out.println(e);
    }
    System.out.println();
}
public Event getByTitle(String eventTitle) {
    Event result = null;
    for (Event e : events) {
        String title = e.getEventTitle();
        if (title.equals(eventTitle)) {
            result = e;
        }
    }
    return result;
}
public ArrayList<Event> getbyEventType(EventType music) {
         ArrayList<Event> result = new ArrayList<>();
    for (int i = 0; i < events.size(); i++) {
        if (events.get(i).getEventType().equals(music)) {
            result.add(events.get(i));
        }

    }
    return result;
}

}
