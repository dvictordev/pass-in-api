package rocketseat.com.passin.dto.event;

import rocketseat.com.passin.domain.event.Event;

public class EventResponseDTO {
    EventDetailDto event;

    public EventResponseDTO(Event event, Integer numberOfAttendees) {
        this.event = new EventDetailDto(
                event.getId(),
                event.getTitle(),
                event.getDetails(),
                event.getSlug(),
                event.getMaximumAttendees(),
                numberOfAttendees

        );

    }
}
