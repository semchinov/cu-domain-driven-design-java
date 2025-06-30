package ru.chernyshoff.dddjava.service;

import ru.chernyshoff.dddjava.domain.Like;

import java.util.UUID;

public interface LikeService {

    Like createLike(UUID userId, UUID formId);

    void deleteLike(UUID userId, UUID formId);

}
