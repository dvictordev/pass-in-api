package rocketseat.com.passin.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import rocketseat.com.passin.domain.attendee.Attendee;
import rocketseat.com.passin.domain.event.Event;
import rocketseat.com.passin.dto.event.EventResponseDTO;
import rocketseat.com.passin.repositories.AttendeeRepository;
import rocketseat.com.passin.repositories.EventRepository;

@Service
@RequiredArgsConstructor
public class EventService {

    private final EventRepository eventRepository;
    private final AttendeeRepository attendeeRepository;

    public EventResponseDTO getEventDetail(String event_id) {
        Event event = this.eventRepository.findById(event_id)
                .orElseThrow(() -> new RuntimeException("Event not found " + event_id));

        List<Attendee> attendeeList = this.attendeeRepository.findBYEventId(event_id);
        return new EventResponseDTO(event, attendeeList.size());
    }

}
