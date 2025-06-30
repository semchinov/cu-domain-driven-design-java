package ru.chernyshoff.dddjava.service;

import ru.chernyshoff.dddjava.domain.Form;

import java.util.UUID;

public interface FormService {

    Form create(Form form);

    Form get(UUID formId);

    void update(Form form);

    void delete(UUID formId);

}
