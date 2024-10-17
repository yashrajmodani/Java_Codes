package day8.tweeter;

import java.time.LocalDate;
import java.util.Set;

public class Tweet {
    private String subject;
    private LocalDate date;
    private int numOfViews;
    private Set<String> hashtags;

    //Constructor
    public Tweet(String subject, LocalDate date, int numOfViews, Set<String> hashtags) {
        this.subject = subject;
        this.date = date;
        this.numOfViews = numOfViews;
        this.hashtags = hashtags;
    }


    //Getters & Setters

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getNumOfViews() {
        return numOfViews;
    }

    public void setNumOfViews(int numOfViews) {
        this.numOfViews = numOfViews;
    }

    public Set<String> getHashtags() {
        return hashtags;
    }

    public void setHashtags(Set<String> hashtags) {
        this.hashtags = hashtags;
    }

    @Override
    public String toString() {
        return "Tweeter [subject: " + subject + ", Date: " + date + ", No. of Views: " + numOfViews + ", Hashtags: " + hashtags;
    }

}


