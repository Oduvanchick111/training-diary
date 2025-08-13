package ru.boltinskiy.training_diary.exercise.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import ru.boltinskiy.training_diary.exercise_type.model.ExerciseType;
import ru.boltinskiy.training_diary.workout.model.Workout;

@Data
@Builder
@Entity
@Table(name = "exercise")
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exercise_id")
    private Long id;
    @JoinColumn(name = "workout_id")
    @ManyToOne
    private Workout workout;
    @JoinColumn(name = "exercise_type_id")
    @ManyToOne
    private ExerciseType exerciseType;
    private Long weight;
    private Long setsCount;
    private Long repsPerSet;
    private String firstSetVideoPath;
    private String lastSetVideoPath;
}
