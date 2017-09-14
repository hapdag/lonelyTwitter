package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Saddog on 9/14/2017.
 */

public class MoodHappy extends CurrentMood {
    public MoodHappy(){
        super();
    }

    public MoodHappy(Date date) {
        super(date);
    }

    public String getMood(String mood){
        return this.mood = "Happy mood.";
    }




}

