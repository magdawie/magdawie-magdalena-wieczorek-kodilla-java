package com.kodilla.testing.forum.statistics;

import java.util.Objects;

public class StatCalculate {

    private Statistics statistics;

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averageNumberOfPostPerUser;
    private double averageNumberOfCommentsPerUser;
    private double averageNumberOFCommentsPrePost;

    public StatCalculate(Statistics statistics) {
        this.statistics = statistics;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }


    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAverageNumberOfPostPerUser() {
        return averageNumberOfPostPerUser;
    }

    public double getAverageNumberOfCommentsPerUser() {
        return averageNumberOfCommentsPerUser;
    }

    public double getAverageNumberOFCommentsPrePost() {
        return averageNumberOFCommentsPrePost;
    }

    public void calculateAdvStatistics() {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        if(numberOfUsers != 0){
            averageNumberOfPostPerUser = (double) numberOfPosts/(double) numberOfUsers;
            averageNumberOfCommentsPerUser = (double) numberOfComments/(double) numberOfUsers;
        }
        averageNumberOFCommentsPrePost = (double) numberOfComments/(double) numberOfPosts;
    }

    public void showStatistics(){
        System.out.println("Number of users " +numberOfUsers);
        System.out.println("NUmber of posts " +numberOfPosts);
        System.out.println("Number of comments " +numberOfComments);
        System.out.println("Average number of posts per user " + averageNumberOfPostPerUser);
        System.out.println("Average number of comments per user" + averageNumberOfCommentsPerUser);
        System.out.println("Average number of comments per post " + averageNumberOFCommentsPrePost);
    }
}
