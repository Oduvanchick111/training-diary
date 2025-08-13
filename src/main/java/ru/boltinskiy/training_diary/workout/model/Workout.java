package ru.boltinskiy.training_diary.workout.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import ru.boltinskiy.training_diary.user.model.User;

import java.time.LocalDateTime;

@Builder
@Data
@Entity
@Table(name = "workout")
public class Workout {

    @Id
    @Column(name = "workout_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JoinColumn(name = "user_id")
    @ManyToOne
    private User user;
    @Column(name = "date_time")
    private LocalDateTime dateTime;
}
