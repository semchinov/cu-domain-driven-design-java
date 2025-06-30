package ru.chernyshoff.dddjava.domain;

import java.util.List;
import java.util.UUID;

public class User {
     private UUID id;
     private String username;
     private List<Form> forms;
     private List<Dialog> dialogs;
     private List<Like> likes;
}
