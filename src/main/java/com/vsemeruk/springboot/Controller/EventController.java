package com.vsemeruk.springboot.Controller;

import com.vsemeruk.springboot.Entity.Event;
import com.vsemeruk.springboot.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    // Gather id from URL using Path Variable
    public Event getEventById(@PathVariable("id") int id) {
        return eventService.getEventById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteById(@PathVariable("id") int id) {
        return eventService.deleteEventById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String updateEvent(@RequestBody Event event) {
        return eventService.updateEvent(event);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String addEvent(@RequestBody Event event) {
        return eventService.addEvent(event);
    }
}
