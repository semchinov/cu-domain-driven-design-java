package ru.chernyshoff.dddjava.service;

import ru.chernyshoff.dddjava.domain.Dialog;

import java.time.LocalDateTime;
import java.util.UUID;

public interface DialogService {

    Dialog createDialog(UUID user1Id, UUID user2Id);

    Dialog addMessageToDialog(UUID dialogId, UUID userId, String text, LocalDateTime time);

    UUID deleteDialog(UUID dialogId);

}
