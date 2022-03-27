package ru.netology.opp2vk.domain;

import java.util.Date;

public class Post {
    private String id;
    private String name;
    private String authorId;
    private String[] attachmentsIds;
    private GeoInfo geoInfo;
    private Date date;
    private String textBox;
    private LikeInfo likeInfo;
    private RepostInfo repostInfo;
    private int viewsCount;
    private String[] links;
    private Comment[] comments;
    private String dateComment;
    private String replayComment;
    private String[] likesComment;
    private String find;
    private boolean canDelete;
    private boolean canPin;
    private boolean canEdit;
    private boolean isFavorite;
    private boolean isPinned;
    //getter setter
}
