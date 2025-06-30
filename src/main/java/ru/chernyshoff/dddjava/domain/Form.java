package ru.chernyshoff.dddjava.domain;

import java.util.List;
import java.util.UUID;

public class Form {
    private UUID id;
    private UUID userId ;
    private String name;
    private String description;
    private List<UUID> likeIds;
    private List<Photo> photos;

    public static class Photo{
        private String url;
        private String description;
    }
}
