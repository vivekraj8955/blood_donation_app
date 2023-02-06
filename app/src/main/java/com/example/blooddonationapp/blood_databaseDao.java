package com.example.blooddonationapp;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;
@Dao
public interface blood_databaseDao {
    @Query("select * from data")
    List<blood_database> getAllExpense();

    @Insert
    void addTx(blood_database database);

    @Update
    void updateTx(blood_database database);

    @Delete
    void deleteTx(blood_database database);
}
