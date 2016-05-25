package edu.uta.sis.calendars.web;

import edu.uta.sis.calendars.data.entities.CalendarEntity;
import edu.uta.sis.calendars.data.entities.EventEntity;
import edu.uta.sis.calendars.data.entities.LocationEntity;
import edu.uta.sis.calendars.data.repository.CalendarRepository;
import edu.uta.sis.calendars.data.repository.EventsRepository;
import edu.uta.sis.calendars.data.repository.LocationRepository;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

/**
 * Created by Eero Asunta on 25.5.2016.
 */
@Controller
public class GitTestController {

    @Autowired
    EventsRepository eventsRepository;

    @Autowired
    CalendarRepository calendarRepository;

    @Autowired
    LocationRepository locationRepository;


    @RequestMapping("/xxx")
    public void xxx() {

        // Some cosmetic changes to test git
        //---------------------------------------
        String temp = "Testing: ";
        //-----------------------------------

    }
}

