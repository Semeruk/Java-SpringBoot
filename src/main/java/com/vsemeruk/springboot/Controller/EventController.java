package com.vsemeruk.springboot.Controller;

import com.vsemeruk.springboot.Entity.Event;
import com.vsemeruk.springboot.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}
