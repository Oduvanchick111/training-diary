package ru.boltinskiy.training_diary.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.boltinskiy.training_diary.user.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
