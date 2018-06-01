package com.vsemeruk.springboot.Service;

import com.vsemeruk.springboot.Dao.EventDao;
import com.vsemeruk.springboot.Entity.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class EventService {

    @Autowired
    private EventDao eventDao;

    public Collection<Event> getAllEvents() {
        return eventDao.getAllEvents();
    }

    public Event getEventById(int id) {
        return eventDao.getEventById(id);
    }

}
