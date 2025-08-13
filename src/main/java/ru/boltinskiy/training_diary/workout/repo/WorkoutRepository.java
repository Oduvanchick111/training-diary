package ru.boltinskiy.training_diary.workout.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.boltinskiy.training_diary.workout.model.Workout;

@Repository
public interface WorkoutRepository extends JpaRepository<Workout, Long> {
}
