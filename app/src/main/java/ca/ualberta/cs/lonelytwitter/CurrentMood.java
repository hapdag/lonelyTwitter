package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Saddog on 9/14/2017.
 */

public abstract class CurrentMood {
    protected String mood;
    protected Date date;


    public CurrentMood() {
        this.date = new Date();
    }

    public CurrentMood(Date date) {
        this.date = date;
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public abstract String getMood();

}
