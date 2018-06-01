package com.vsemeruk.springboot.Service;

import com.vsemeruk.springboot.Dao.EventDao;
import com.vsemeruk.springboot.Entity.Event;

import java.util.Collection;

public class EventService {

    private EventDao eventDao;

    public Collection<Event> getAllEvents() {
        return eventDao.getAllEvents();
    }

}
