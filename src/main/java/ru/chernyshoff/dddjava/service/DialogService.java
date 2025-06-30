package ru.chernyshoff.dddjava.service;

import ru.chernyshoff.dddjava.domain.Dialog;

import java.time.LocalDateTime;
import java.util.UUID;

public interface DialogService {

    Dialog createD(Dialog dialog);

    UUID deleteDialog(UUID dialogId);

}
