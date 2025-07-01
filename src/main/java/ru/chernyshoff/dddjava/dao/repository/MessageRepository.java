package ru.chernyshoff.dddjava.dao.repository;

import ru.chernyshoff.dddjava.domain.Message;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface MessageRepository {

    UUID insert(Message message);

    Optional<Message> get(UUID messageId);

    List<Message> list(UUID dialogId);

    void delete(UUID messageId);

}
