package com.alexg.gbkdesigntest.models;

public class TimelineModel {
    public String title;
    public String subtitle;
    public String time;
    public boolean isAm;
    public boolean isActive;
    public int photoOne;
    public int photoTwo;
    public int photoThree;

    TimelineModel() {

    }

    public TimelineModel(String title, String subtitle, String time, boolean isAm, boolean isActive,
                         int photoOne, int photoTwo, int photoThree) {
        this.title = title;
        this.subtitle = subtitle;
        this.time = time;
        this.isAm = isAm;
        this.isActive = isActive;
        this.photoOne = photoOne;
        this.photoTwo = photoTwo;
        this.photoThree = photoThree;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean isAm() {
        return isAm;
    }

    public void setAm(boolean am) {
        isAm = am;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getPhotoOne() {
        return photoOne;
    }

    public void setPhotoOne(int photoOne) {
        this.photoOne = photoOne;
    }

    public int getPhotoTwo() {
        return photoTwo;
    }

    public void setPhotoTwo(int photoTwo) {
        this.photoTwo = photoTwo;
    }

    public int getPhotoThree() {
        return photoThree;
    }

    public void setPhotoThree(int photoThree) {
        this.photoThree = photoThree;
    }
}
