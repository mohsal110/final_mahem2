package com.example.mohsal.final_mahem2.Chat;

import android.widget.ImageView;


public class User {
    String nickname;
    String profileUrl;
    String nameText;
    ImageView profileImage;
    String UserId;


    public String getNickname() {
        return nickname;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public ImageView getProfileImage() {
        return profileImage;
    }

    public String getNameText() {
        return nameText;
    }

    public String getUserId() {
        return UserId;
    }
}
