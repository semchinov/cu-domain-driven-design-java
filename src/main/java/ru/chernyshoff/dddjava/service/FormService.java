package ru.chernyshoff.dddjava.service;

import ru.chernyshoff.dddjava.domain.Form;

import java.util.UUID;

public interface FormService {

    public Form createForm(UUID userId, String name, String description);

    public Form updateForm(UUID formId, String newName, String newDescription);

    public UUID deleteForm(UUID formId);

}
