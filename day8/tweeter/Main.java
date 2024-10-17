package day8.tweeter;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        TweetManager manager = new TweetManager();

        //Adding some sample tweets
        manager.addTweet(new Tweet("Weather Update", LocalDate.of(2024, 4, 1), 15000, new HashSet<>(Arrays.asList("#punerains", "#weatherupdate"))));
        manager.addTweet(new Tweet("Flood Alert", LocalDate.of(2024, 10, 3), 8000, new HashSet<>(Arrays.asList("#flood", "#punerains"))));
        manager.addTweet(new Tweet("Weather Forecast", LocalDate.of(2024, 2, 2), 12000, new HashSet<>(Arrays.asList("#weatherupdate", "#flood"))));
        manager.addTweet(new Tweet("Traffic Update", LocalDate.of(2024, 10, 4), 20000, new HashSet<>(Arrays.asList("#traffic", "#punerains"))));


        //Listing tweets posted this month
        System.out.println("Tweets posted this month:");
        for (Tweet tweet : manager.tweetsCurrentMonth()) {
            System.out.println(tweet.getSubject());
        }

        //List all the tweets for a hashtag
        System.out.println("\nTweets for #punerains:");
        for(Tweet tweet: manager.tweetsByHashtags("#punerains")){
            System.out.println(tweet);
        }

        //Count the tweets by subject
        System.out.println("\nTweet counts by subject");
        Map<String, Long> tweetCounts = manager.countsTweetBySubject();
        tweetCounts.forEach((subject, count) -> System.out.println(subject + ": " + count));


        //List tweets with more than 10k views
        System.out.println("\nTweets with more than 10k views: ");
        for(Tweet tweet: manager.tweetsOver10KViews()){
            System.out.println(tweet);
        }

        //Print top 5 trending tweets
        System.out.println("\nTop trending tweets:");
        for (Tweet tweet : manager.topTreandingTweets(2)) {
            System.out.println(tweet.getSubject());
        }
    }
}
