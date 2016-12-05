package com.example.android.quakereport;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by osborne on 12/2/2016.
 */

public class Quake {

    private String mPlace = "hello";
    private double mMag;
    private long mTimestamp;

    /**
     * Construct a new Quake object
     *
     * @param aPlace
     * @param aMag
     * @param aTimestamp
     */
    public Quake(String aPlace, double aMag, long aTimestamp){
        mPlace = aPlace;
        mMag = aMag;
        mTimestamp = aTimestamp;

    }

    public String getPlace() {
        return mPlace;
    }

    public String getMag() {
        return Double.toString(mMag);
    }

    public String getDate() {
        // Create a formatter for displaying the date in a String
        DateFormat dateFormat = new SimpleDateFormat("MMM d, yyyy");
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT-8"));
        // Create a new Date object and give it the mTimeStamp
        Date date = new Date(mTimestamp);

        return dateFormat.format(date);
    }
}
