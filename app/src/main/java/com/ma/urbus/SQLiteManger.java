package com.ma.urbus;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SQLiteManger extends SQLiteOpenHelper {

    private static SQLiteManger sqLiteManger;
    private static final int Database_version =1;
    private static final String Database_Name ="urBusDB";
    private static final String Table_Name = "User";
    private static final String Counter = "Counter";

    private static final String name_Field ="name";
    private static final String password_Field ="password";
    private static final String email_Field ="email";
    private static final String phoneNo_field ="phoneNo";
    private static final String universityNo_field ="universityNo";

    //for user signin now
    public static String name_signin ="";
    public static String email_signin ="";
    public static String phoneNo_signin ="";
    public static String universityNo_signin ="";

    public static String emailSign ;

    public SQLiteManger(Context context){
        super(context, Database_Name, null , Database_version);
    }

    public static SQLiteManger instanceOfDatabase(Context context){
        if(sqLiteManger == null)
            sqLiteManger = new SQLiteManger(context);
        return  sqLiteManger;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        StringBuilder sql ;
        sql = new StringBuilder()
                .append("CREATE TABLE ")
                .append(Table_Name)
                .append(" ( ")
                .append(Counter)
                .append(" INTEGER PRIMARY KEY AUTOINCREMENT, ")
                .append(name_Field) // 1
                .append(" TEXT, ")
                .append(password_Field) // 2
                .append(" TEXT, ")
                .append(email_Field) //3
                .append(" TEXT, ")
                .append(phoneNo_field)// 4
                .append(" char(10), ")
                .append(universityNo_field) //5
                .append(" varchar(9) )");
        sqLiteDatabase.execSQL(sql.toString());
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    }

    public void addUserToDatabase (user usser){

        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(name_Field, usser.getName());
        contentValues.put(password_Field, usser.getPassword());
        contentValues.put(email_Field, usser.getEmail());
        contentValues.put(universityNo_field, usser.getUniversityNo());
        contentValues.put(phoneNo_field, usser.getPhoneNumber());
        System.out.println("ADDED!!!!!");
        sqLiteDatabase.insert(Table_Name, null, contentValues);
    }

    public boolean checkUsername (String username , String password, String type){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        try(Cursor result = sqLiteDatabase.rawQuery("SELECT * FROM "+ Table_Name, null ))
        {
            if(result.getCount() !=0 ){
                while (result.moveToNext()) {
                    String pass = result.getString(2);
                    String typ = (result.getString(5).equals("0"))?"driver":"student";
                    String email = result.getString(3);
                    if (email.equals(username)&& password.equals(pass))
                        if(typ.equals(type)){
                            ////signed In user info
                            name_signin=result.getString(1);
                            email_signin =result.getString(3);
                             phoneNo_signin =result.getString(4);
                            universityNo_signin=result.getString(5);
                            return true ;
                        }

                }
            }
        }
        return false ;
    }

    public String getSign(int i){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        try(Cursor result = sqLiteDatabase.rawQuery("SELECT * FROM "+ Table_Name , null ))
        {
            if(result.getCount() !=0 ){
                while (result.moveToNext()) {
                    if(result.getString(3).equals(emailSign))
                        return result.getString(i);
                }
            }
        }
        return "";
    }

}
