package com.vsemeruk.springboot.Dao;

import com.vsemeruk.springboot.Entity.Event;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class EventDao {

    private static Map<Integer, Event> events;

    static {

        events = new HashMap<Integer, Event>() {

            {
                put(1, new Event(1, "Java MeetUp IF", "2/09/18", "18:00", "IF, Sakharova 23"));
                put(2, new Event(2, "Italian Pizza CookBook MeetUp", "7/09/18", "18:00", "IF, Pryvokzalna 13"));
                put(3, new Event(3, "HairCut in 2018", "18/09/18", "14:00", "IF, Parkova 3"));
                put(4, new Event(4, "JEEConf 2018", "4/09/18", "17:00", "IF, Pchilky 37"));
                put(5, new Event(5, "Android Toolset IF", "22/09/18", "17:30", "IF, Moroza 27"));
            }

        };
    }

    public Collection<Event> getAllEvents() {
        return this.events.values();
    }

    public Event getEventById(int id) {
        return this.events.get(id);
    }

    public String deleteEventById(int id) {
        if(events.get(id) != null) {
            this.events.remove(id);
            return "Deleted successful!";
        } else {
            return "Failed, you specified wrong id!";
        }
    }
}
