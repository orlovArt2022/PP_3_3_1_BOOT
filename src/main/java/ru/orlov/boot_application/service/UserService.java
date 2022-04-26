package ru.orlov.boot_application.service;


import ru.orlov.boot_application.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void addUser(User user);

    void deleteUser(Long id);

    void editUser(User newUser);

    User getByIdUser(Long id);
}
