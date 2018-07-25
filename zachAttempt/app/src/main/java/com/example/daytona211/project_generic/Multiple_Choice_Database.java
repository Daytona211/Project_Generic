package com.example.daytona211.project_generic;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Multiple_Choice_Database extends SQLiteOpenHelper  {

    private SQLiteDatabase dataBase;

    public Multiple_Choice_Database(Context context) {
        super(context, "Coding Buddy mc",null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.dataBase = db;
        final String SQL_CREATE_QUESTIONS_TABLE {
            Multiple_Choice_Database.Questions
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
