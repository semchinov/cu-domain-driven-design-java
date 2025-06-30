package ru.chernyshoff.dddjava.service;

import ru.chernyshoff.dddjava.domain.Form;

import java.util.UUID;

public interface FormService {

    Form createForm(UUID userId, String name, String description);

    Form updateForm(UUID formId, String newName, String newDescription);

    UUID deleteForm(UUID formId);

}
