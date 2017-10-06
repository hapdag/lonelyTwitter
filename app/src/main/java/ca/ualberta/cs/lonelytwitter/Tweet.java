package ca.ualberta.cs.lonelytwitter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Saddog on 9/14/2017.
 */


public abstract class Tweet{

    private String message;
    private String date;
    protected ArrayList<CurrentMood> moodList = new ArrayList();

    public void tweetMoodList(CurrentMood mood){
        moodList.add(mood);
    }

    public Tweet(String message){
        this.message = message;
        this.date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

    }

//    public Tweet(String message, Date date) {
//        this.message = message;
//        this.date = date;
//    }

    public abstract Boolean isImportant();


    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    public String getMessage(){
        return this.message;
    }

//    public String getDate() {

//        return (new SimpleDateFormat("yyyy-MM-dd").format(date));
//        return date;
//    }

//    public void setDate(Date date) {
//        this.date = date;
//    }

    @Override
    public String toString(){
        return date.toString()+ " | " + message;
    }
}