package ru.boltinskiy.training_diary.exercise.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.boltinskiy.training_diary.exercise.model.Exercise;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
}
