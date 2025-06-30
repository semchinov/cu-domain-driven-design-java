package ru.chernyshoff.dddjava.service;

import ru.chernyshoff.dddjava.domain.User;

import java.util.UUID;

public interface UserService {

    User createUser(String username);

    User updateUser(UUID userId, String newUsername);

    UUID deleteUser(UUID userId);

}
