package com.vsemeruk.springboot.Controller;

import com.vsemeruk.springboot.Entity.Event;
import com.vsemeruk.springboot.Service.EventService;

import java.util.Collection;

public class EventController {

    private EventService eventService;

    public Collection<Event> getAllEvents() {
        return eventService.getAllEvents();
    }
}
