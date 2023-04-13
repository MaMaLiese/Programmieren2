package Bsp_Event;

public class Main {


    public static void main(String[] args) {



        EventType music = EventType.KONZERT;
        EventType talk = EventType.VORTRAG;
        EventType trip = EventType.REISE;
        System.out.println(music.toString() + " " + talk.toString() + " " + trip.toString());


    }
}