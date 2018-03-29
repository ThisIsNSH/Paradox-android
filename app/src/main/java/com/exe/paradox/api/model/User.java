package com.exe.paradox.api.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by shasha on 26/3/18.
 */

public class User {
    @SerializedName("picture")
    String picture;

    @SerializedName("score")
    int score;

    @SerializedName("level")
    int level;

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}