package data.coding.tweetterx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;


class Test {
    public static void main(String[] args) throws InterruptedException {
        /*
         * user     tweet   followers   following
         * 1           5                    2
         * 2           6         1
         *    
         */

        Twitter twitter = new Twitter();
        twitter.postTweet(1, 5); // User 1 posts a new tweet (id = 5).
        
        var feed = twitter.getNewsFeed(1);  // User 1's news feed should return a list with 1 tweet id -> [5]. return [5]
        System.out.println(feed);
       
        twitter.follow(1, 2);    // User 1 follows user 2.
        twitter.postTweet(2, 6); // User 2 posts a new tweet (id = 6).

        feed = twitter.getNewsFeed(1);  // User 1's news feed should return a list with 2 tweet ids -> [6, 5]. Tweet id 6 should precede tweet id 5 because it is posted after tweet id 5.
        System.out.println(feed);
        
        twitter.unfollow(1, 2);  // User 1 unfollows user 2.

        feed = twitter.getNewsFeed(1);  // User 1's news feed should return a list with 1 tweet id -> [5], since user 1 is no longer following user 2.
        System.out.println(feed);
    }
}
public class Twitter {
    
    private Map<Integer, User> userMap;

    public Twitter() {
        userMap = new HashMap<>();
    }
    
    // 
    public void postTweet(int userId, int tweetId) {
        // check if user exists or not 
        // if exists, add new tweet to it
        // if not add new user
        var newTweet = new Tweet(tweetId, System.currentTimeMillis());
       
        if(!userMap.containsKey(userId)) {
            User user = new User(userId);
            user.getTweets().add(newTweet);
            userMap.put(userId, user);
        } else {
            userMap.get(userId).getTweets().add(newTweet);
        }
    }
    
    public List<Integer> getNewsFeed(int userId) {

        if(userMap.get(userId) == null) return List.of();

        List<User> followers = userMap.values().stream().filter(u -> u.getFollowerIds().contains((Integer)userId)).toList();

        List<Tweet> followerTweets = new ArrayList<>();
        for(User e: followers) {
            followerTweets.addAll(e.getTweets());
        }

        List<Tweet> tweets = userMap.get(userId).getTweets();

        List<Tweet> result = new ArrayList<>();
        result.addAll(tweets);
        result.addAll(followerTweets);
        // sort tweets based on timestamp, most recent appears first
        Collections.sort(result, (x,y) -> x.getTimePosted() < y.getTimePosted()? 1 : x.getTimePosted() == y.getTimePosted()? 0 : -1);

        if(result.size() <= 10) return result.stream().map(t -> t.getId()).toList();
        return result.subList(0, 10).stream().map(t -> t.getId()).toList();

    }
    
    public void follow(int followerId, int followeeId) {
        User follower;
        if(!userMap.containsKey(followerId)) {
            follower = new User(followerId);
            userMap.put(followerId, follower);
        } else {
            follower = userMap.get(followerId);
        }

        User followee; 
        if(!userMap.containsKey(followeeId)) {
            followee = new User(followeeId);
            userMap.put(followeeId, followee);
        } else {
            followee = userMap.get(followeeId);
        }
        follower.getFolloweeIds().add(followeeId);
        followee.getFollowerIds().add(followerId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        User follower;
        
        if(!userMap.containsKey(followerId)) {
            follower = new User(followerId);
            userMap.put(followerId, follower);
        } else {
            follower = userMap.get(followerId);
        }

        User followee; 
        if(!userMap.containsKey(followeeId)) {
            followee = new User(followeeId);
            userMap.put(followeeId, followee);
        } else {
            followee = userMap.get(followeeId);
        }
        follower.getFolloweeIds().remove((Integer) followeeId);
        followee.getFollowerIds().remove((Integer)followerId);
    }
}

@Data
class User {
    // followers
    // followees
    // tweets
    // id
    
    private int id;
    private List<Integer> followerIds;
    private List<Integer> followeeIds;
    private List<Tweet> tweets;
    
    public User(int id) {
        this.id = id;
        this.followerIds = new ArrayList<>();
        this.followeeIds = new ArrayList<>();
        this.tweets = new ArrayList<>();
    }
    // getters setters
}


@Data
@AllArgsConstructor
class Tweet {
    private int id;
    private long timePosted;
    {
        try {
            // just to simulate new tweet creation doesn't happen at the same time
            Thread.sleep(1);
        } catch (InterruptedException e) {}
    }
}