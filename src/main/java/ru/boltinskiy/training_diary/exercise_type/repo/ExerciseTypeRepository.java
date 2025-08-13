package ru.boltinskiy.training_diary.exercise_type.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.boltinskiy.training_diary.exercise_type.model.ExerciseType;

@Repository
public interface ExerciseTypeRepository extends JpaRepository<ExerciseType, Long> {
}
