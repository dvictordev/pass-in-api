package rocketseat.com.passin.dto.event;

public record EventDetailDto(
        String id,
        String title,
        String details,
        String slug,
        Integer maximunAttendees,
        Integer attendeesAmount) {

}
