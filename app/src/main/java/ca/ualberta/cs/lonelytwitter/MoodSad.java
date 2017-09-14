package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Saddog on 9/14/2017.
 */

public class MoodSad extends CurrentMood {
    public MoodSad(){
        super();
    }

    public MoodSad(Date date) {
        super(date);
    }

    public String getMood() {
        return this.mood = "Sad mood.";
    }

}
