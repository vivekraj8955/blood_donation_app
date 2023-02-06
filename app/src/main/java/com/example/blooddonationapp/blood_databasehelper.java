package com.example.blooddonationapp;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.Entity;
import androidx.room.InvalidationTracker;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

@Database(entities=blood_database.class,exportSchema = false,version = 1)
public abstract class blood_databasehelper extends RoomDatabase {

    private static final String DB_NAME="Database";
    private static blood_databasehelper instance;

    public static synchronized blood_databasehelper getDB(Context context){
        if(instance==null)
        {
            instance= Room.databaseBuilder(context,blood_databasehelper.class,DB_NAME)
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }
    public abstract blood_databaseDao blood_databasedao();

}
