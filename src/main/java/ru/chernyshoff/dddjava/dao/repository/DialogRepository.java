package ru.chernyshoff.dddjava.dao.repository;

import ru.chernyshoff.dddjava.domain.Dialog;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface DialogRepository {

    UUID insert(Dialog dialog);

    Optional<Dialog> get(UUID dialogId);

    List<Dialog> list(UUID userId);

    void delete(UUID dialogId);

}
