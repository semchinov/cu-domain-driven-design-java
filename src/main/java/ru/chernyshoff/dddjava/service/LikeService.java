package ru.chernyshoff.dddjava.service;

import ru.chernyshoff.dddjava.domain.Like;

import java.util.UUID;

public interface LikeService {

    public Like createLike(UUID userId, UUID formId);

    public void deleteLike(UUID userId, UUID formId);

}
