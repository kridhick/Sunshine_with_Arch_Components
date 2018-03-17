package com.example.android.sunshine.data.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;
import android.content.Context;
import android.util.Log;

/**
 * Created by rsk_mac on 2/27/18.
 */
@Database(entities = {WeatherEntry.class}, version = 1, exportSchema = false)
@TypeConverters(DateConverter.class)
public abstract class SunshineDatabase extends RoomDatabase {

    private static final String TAG = SunshineDatabase.class.getSimpleName();
    private static final String DATABASE_NAME = "weather";
    private static SunshineDatabase sInstance;
    private static final Object LOCK = new Object();

    public static SunshineDatabase getInstance(Context context)
    {
        Log.d(TAG, "Creating the Database instance");
        if (sInstance == null)
        {
            synchronized (LOCK){
                sInstance = Room.databaseBuilder(context.getApplicationContext(),
                        SunshineDatabase.class, SunshineDatabase.DATABASE_NAME).build();
                Log.d(TAG, "New Database instance created");

            }
        }
        return sInstance;
    }
    public abstract  WeatherDao weatherDao();
}


