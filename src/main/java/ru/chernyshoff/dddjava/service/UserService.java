package ru.chernyshoff.dddjava.service;

import ru.chernyshoff.dddjava.domain.User;

import java.util.UUID;

public interface UserService {

    public User createUser(String username);

    public User updateUser(UUID userId, String newUsername);

    public UUID deleteUser(UUID userId);

}
