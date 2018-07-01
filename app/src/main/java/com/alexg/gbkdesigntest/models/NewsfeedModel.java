package com.alexg.gbkdesigntest.models;

public class NewsfeedModel {
    public String title;
    public String likes;
    public String comment;
    public int photo;
    public boolean isLiked;

    NewsfeedModel() {

    }

    public NewsfeedModel(String title, String likes, String comment, int photoId, boolean isLiked) {
        this.title = title;
        this.likes = likes;
        this.comment = comment;
        this.photo = photoId;
        this.isLiked = isLiked;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }


    public boolean isLiked() {
        return isLiked;
    }

    public void setLiked(boolean liked) {
        isLiked = liked;
    }

}
