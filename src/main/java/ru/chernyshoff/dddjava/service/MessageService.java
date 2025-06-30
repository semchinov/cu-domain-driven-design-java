package ru.chernyshoff.dddjava.service;

import ru.chernyshoff.dddjava.domain.Message;

import java.util.UUID;

public interface MessageService {

    Message create(Message message);

    Message get(UUID messageId);

    void delete(UUID message);
}
