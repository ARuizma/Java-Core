package com.emc.test;

import com.emc.dto.Event;
import com.emc.dto.Organizer;
import com.emc.managers.EventManager;
import com.emc.managers.EventManagerImpl;

public class Test {
    public static void main(String[] args) {
        Organizer organizer = new Organizer();
        organizer.setId(123L);
        organizer.setName("Stuff");
        System.out.println(organizer);

        Event event = new Event(456l,"Stuff","more stuff","asdf","asdf",Boolean.TRUE);
        System.out.println(event.getDescription());

        EventManager em = new EventManagerImpl();
        System.out.println(em.create(12354l).getId());
    }
}
