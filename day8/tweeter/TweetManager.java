package day8.tweeter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TweetManager {
    private List<Tweet> tweets;

    public TweetManager() {
        tweets = new ArrayList<>();
    }

    public void addTweet(Tweet tweet){
        tweets.add(tweet);
    }

    //List all the tweets that are posted in the current month
    public List<Tweet> tweetsCurrentMonth(){
        LocalDate today = LocalDate.now();
        return tweets.stream()
                .filter(tweet -> tweet.getDate().getMonth() == today.getMonth() && tweet.getDate().getYear() == today.getYear())
                .collect(Collectors.toList());
    }

    //List all the tweets for a hashtag
    public List<Tweet> tweetsByHashtags(String hashtag){
        return tweets.stream().filter(tweet -> tweet.getHashtags().contains(hashtag))
                .collect(Collectors.toList());
    }

    //Count the tweets by subject
    public Map<String, Long> countsTweetBySubject(){
        return tweets.stream().collect(Collectors.groupingBy(Tweet::getSubject, Collectors.counting()));
    }

    //List tweets with more than 10k views
    public List<Tweet> tweetsOver10KViews(){
        return  tweets.stream()
                .filter(tweet -> tweet.getNumOfViews() > 10000)
                .collect(Collectors.toList());
    }

    //Print top 5 trending tweets
    public List<Tweet> topTreandingTweets(int n){
        return tweets.stream()
                .sorted(Comparator.comparingInt(Tweet::getNumOfViews).reversed())
                .limit(n)
                .collect(Collectors.toList());
    }
}
