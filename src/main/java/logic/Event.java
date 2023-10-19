package logic;

import java.util.Date;

public class Event {
    private String name;
    private Date date;
    private EventType eventType;
    private String description;

    public Event(String name, Date date, EventType eventType, String description) {
        this.name = name;
        this.date = date;
        this.eventType = eventType;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public EventType getEventType() {
        return eventType;
    }

    public String getDescription() {
        return description;
    }
}
