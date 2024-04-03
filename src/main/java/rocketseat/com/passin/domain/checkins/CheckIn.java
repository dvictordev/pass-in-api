package rocketseat.com.passin.domain.checkins;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import rocketseat.com.passin.domain.attendee.Attendee;

@Entity
@Table(name = "check_ins")
public class CheckIn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @OneToOne
    @JoinColumn(name = "attendee_id", nullable = false)
    private Attendee attendee;
}
