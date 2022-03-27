package ru.netology.opp2vk.domain;

import java.util.Date;

public class Comment {
    private String id;
    private String authorId;
    private Date dateComment;
    private Comment[] replies;
    private int likesCount;
    private String text;
//getter setter
}
