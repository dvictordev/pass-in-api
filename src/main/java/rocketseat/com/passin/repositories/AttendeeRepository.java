package rocketseat.com.passin.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import rocketseat.com.passin.domain.attendee.Attendee;

public interface AttendeeRepository extends JpaRepository<Attendee, String> {

    List<Attendee> findBYEventId(String event_id);
}
