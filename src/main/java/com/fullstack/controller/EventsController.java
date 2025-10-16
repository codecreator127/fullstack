package com.fullstack.controller;


import com.fullstack.api.EventsApi;
import com.fullstack.model.DeleteEventById200Response;
import com.fullstack.model.Event;
import com.fullstack.model.EventRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventsController implements EventsApi {

    @Override
    public ResponseEntity<Event> getEventById(Integer eventId) {
        Event event = new Event();
        event.setId(eventId);
        event.setTitle("Sample Event");
        event.setDescription("This is a sample event description.");


        return ResponseEntity.ok(event);
    }

    @Override
    public ResponseEntity<List<Event>> getEvents() {
        Event event = new Event();
        event.setTitle("Sample Event");
        event.setDescription("All events fetched.");

        return ResponseEntity.ok(List.of(event));
    }

    @Override
    public ResponseEntity<Event> createEvent(EventRequest eventRequest) {

        Event event = new Event();

        event.setTitle("Sample Event");
        event.setDescription("Event Created.");

        return ResponseEntity.ok(event);
    }

    @Override
    public ResponseEntity<Event> updateEventById(Integer id, Event event) {
        event.setId(1); // Simulate setting an ID for the created event
        event.setTitle("Sample Event");
        event.setDescription("Event updated.");

        return ResponseEntity.ok(event);
    }

    @Override
    public ResponseEntity<DeleteEventById200Response> deleteEventById(Integer id) {

        // get the event, then delete it

        DeleteEventById200Response response = new DeleteEventById200Response();
        response.setMessage("Event deleted successfully");
        return ResponseEntity.ok(response);
    }

}
