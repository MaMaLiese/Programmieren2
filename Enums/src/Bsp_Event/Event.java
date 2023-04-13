package Bsp_Event;

public class Event {
   private String eventTitle;
   private String eventLocation;
   private double ticketPrice;
    private EventType music;

    public Event(String eventTitle, String eventLocation, double ticketPrice, EventType music) {
        this.eventTitle = eventTitle;
        this.eventLocation = eventLocation;
        this.ticketPrice = ticketPrice;
        this.music = music;




    }

    public String getEventTitle() {
        return eventTitle;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public EventType getMusic() {
        return music;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void setMusic(EventType music) {
        this.music = music;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventTitle='" + eventTitle + '\'' +
                ", eventLocation='" + eventLocation + '\'' +
                ", ticketPrice=" + ticketPrice +
                ", music=" + music +
                '}';
    }
}
