package ru.orlov.boot_application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.orlov.boot_application.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
