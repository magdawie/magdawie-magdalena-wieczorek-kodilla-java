package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    int userID;
    String userName;
    char gender;
    LocalDate birthDate;
    int numberOfPosts;

    public ForumUser(int userID, String userName, char gender, LocalDate birthDate, int numberOfPosts) {
        this.userID = userID;
        this.userName = userName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.numberOfPosts = numberOfPosts;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
