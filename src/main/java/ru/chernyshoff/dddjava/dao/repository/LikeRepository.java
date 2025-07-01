package ru.chernyshoff.dddjava.dao.repository;

import ru.chernyshoff.dddjava.domain.Like;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface LikeRepository {

    UUID insert(Like like);

    Optional<Like> get(UUID formId, UUID userId);

    List<Like> listByForm(UUID formId);

    List<Like> listByUser(UUID userId);

    void delete(UUID formId, UUID userId);

}
