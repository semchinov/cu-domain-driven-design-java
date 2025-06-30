package ru.chernyshoff.dddjava.domain;

import java.util.List;
import java.util.UUID;

public class Form {
    private UUID id;
    private String name;
    private String description;
//    private List<Photo> photos;

    private UUID userId;
    private List<Like> likes;


//    public static class Photo {
//        private String url;
//        private String description;
//    }
    // TODO:
    //    Подумать про фото как сущность (может приделать ее к сообщению)
}
