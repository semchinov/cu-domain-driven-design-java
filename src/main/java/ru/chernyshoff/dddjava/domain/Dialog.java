package ru.chernyshoff.dddjava.domain;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Dialog {
    private List<UUID> userIds;
    private List<Message> messages;

    public static class Message {
        private UUID userId;
        private String text;
        private LocalDateTime time;
    }

}
