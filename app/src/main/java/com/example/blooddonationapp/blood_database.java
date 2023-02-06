package com.example.blooddonationapp;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
@Entity(tableName = "data")
public class blood_database {

    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name="name")
    private String name;
    @ColumnInfo(name="blood_group")
    private  String blood_group;
    @ColumnInfo(name="address")
    private  String address;
    @ColumnInfo(name="mob_no")
    private  String mob_no;
    @ColumnInfo(name="age")
    private  String age;

    public blood_database(int id, String name, String blood_group, String address, String mob_no, String age) {
        this.id = id;
        this.name = name;
        this.blood_group = blood_group;
        this.address = address;
        this.mob_no = mob_no;
        this.age = age;
    }
@Ignore
    public blood_database(String name, String blood_group, String address, String mob_no, String age) {
        this.name = name;
        this.blood_group = blood_group;
        this.address = address;
        this.mob_no = mob_no;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBlood_group() {
        return blood_group;
    }

    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMob_no() {
        return mob_no;
    }

    public void setMob_no(String mob_no) {
        this.mob_no = mob_no;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
