package com.ma.urbus;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class user {
    private String phoneNumber ;
    private String name;
    private String password;
    private String email;
    private String UniversityNo ;

    public user(String username, String name, String password, String email) {
        this.phoneNumber = username;
        this.name = name;
        this.password = password;
        this.email = email;
        this.UniversityNo = "not Seclected";
    }

        public user(String phoneNumber, String name, String password, String email, String universityNo) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.password = password;
        this.email = email;
        this.UniversityNo = universityNo;
    }

    public String getUniversityNo() {
        return UniversityNo;
    }

    public void setUniversityNo(String type) {
        this.UniversityNo = type;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String username) {
        this.phoneNumber = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
