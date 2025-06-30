package ru.chernyshoff.dddjava.service;

import ru.chernyshoff.dddjava.domain.Like;

import java.util.UUID;

public interface LikeService {

    Like create(Like like);

    void delete(Like like);

}
