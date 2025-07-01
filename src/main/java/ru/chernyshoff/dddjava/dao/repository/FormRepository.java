package ru.chernyshoff.dddjava.dao.repository;

import ru.chernyshoff.dddjava.domain.Form;

import java.util.Optional;
import java.util.UUID;

public interface FormRepository {

    UUID insert(Form form);

    Optional<Form> get(UUID formId);

    void update(Form form);

    void delete(UUID formId);

}
