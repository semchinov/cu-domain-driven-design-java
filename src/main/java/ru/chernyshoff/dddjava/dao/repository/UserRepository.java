package ru.chernyshoff.dddjava.dao.repository;

import ru.chernyshoff.dddjava.domain.User;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository {

    UUID insert(User user);

    Optional<User> get(UUID userId);

    void update(User user);

    void delete(UUID userId);

}
