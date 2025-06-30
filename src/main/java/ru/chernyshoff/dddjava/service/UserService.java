package ru.chernyshoff.dddjava.service;

import ru.chernyshoff.dddjava.domain.User;

import java.util.UUID;

public interface UserService {

    User create(User user);

    User get(UUID userId);

    void update(User user);

    void delete(UUID userId);

}
