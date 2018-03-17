package com.example.android.sunshine.data.database;

import java.util.Date;

/**
 * Created by rsk_mac on 3/5/18.
 */

public class ListWeatherEntry {
    
    private  int id;
    private int weatherIconId;
    private Date date;
    private double min;
    private double max;
    
    public ListWeatherEntry(int id, int weatherIconId, Date date, double min, double max)
    {
        this.id = id;
        this.weatherIconId = weatherIconId;
        this.date = date;
        this.max = max;
        this.min = min;
                
    }

    public int getWeatherIconId() {
        return weatherIconId;
    }

    public Date getDate() {
        return date;
    }

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }

    public int getId() {
        return id;
    }
}
