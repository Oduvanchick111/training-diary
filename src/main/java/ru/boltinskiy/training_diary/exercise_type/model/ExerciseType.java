package ru.boltinskiy.training_diary.exercise_type.model;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@Table(name = "exercise_type")
public class ExerciseType {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "exercise_type_id")
    private Long id;
    private String name;
}
