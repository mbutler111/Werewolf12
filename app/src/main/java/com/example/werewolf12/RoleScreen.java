package com.example.werewolf12;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class RoleScreen extends AppCompatActivity implements View.OnClickListener{

    int totRoles= 0;
    int vilNum = 0;
    int seeNum = 0;
    int wolfNum = 0;

    public void incVil(){
        vilNum++;
        totRoles++;

        if(totRoles > 16){
            vilNum--;
            totRoles--;
        }

        TextView textView = findViewById(R.id.textVilsNum);
        textView.setText(String.valueOf(vilNum));
        TextView textView1 = findViewById(R.id.textTotRol);
        textView1.setText("Total Roles: " + String.valueOf(totRoles));
    }

    public void decVil(){
        vilNum--;
        totRoles--;

        if(vilNum < 0){
            vilNum++;
            totRoles++;
        }

        TextView textView = findViewById(R.id.textVilsNum);
        textView.setText(String.valueOf(vilNum));
        TextView textView1 = findViewById(R.id.textTotRol);
        textView1.setText("Total Roles: " + String.valueOf(totRoles));
    }

    public void incSee(){
        seeNum++;
        totRoles++;

        if(totRoles > 16){
            seeNum--;
            totRoles--;
        }

        TextView textView = findViewById(R.id.textSeesNum);
        textView.setText(String.valueOf(seeNum));
        TextView textView1 = findViewById(R.id.textTotRol);
        textView1.setText("Total Roles: " + String.valueOf(totRoles));
    }

    public void decSee(){
        seeNum--;
        totRoles--;

        if(seeNum < 0){
            seeNum++;
            totRoles++;
        }

        TextView textView = findViewById(R.id.textSeesNum);
        textView.setText(String.valueOf(seeNum));
        TextView textView1 = findViewById(R.id.textTotRol);
        textView1.setText("Total Roles: " + String.valueOf(totRoles));
    }

    public void incWolf(){
        wolfNum++;
        totRoles++;

        if(totRoles > 16){
            wolfNum--;
            totRoles--;
        }

        TextView textView = findViewById(R.id.textWolfNum);
        textView.setText(String.valueOf(wolfNum));
        TextView textView1 = findViewById(R.id.textTotRol);
        textView1.setText("Total Roles: " + String.valueOf(totRoles));
    }

    public void decWolf(){
        wolfNum--;
        totRoles--;

        if(wolfNum < 0){
            wolfNum++;
            totRoles++;
        }

        TextView textView = findViewById(R.id.textWolfNum);
        textView.setText(String.valueOf(wolfNum));
        TextView textView1 = findViewById(R.id.textTotRol);
        textView1.setText("Total Roles: " + String.valueOf(totRoles));
    }

    public void initialize(){
        Button button1 = findViewById(R.id.butVilUp);
        button1.setOnClickListener(this);
        Button button2 = findViewById(R.id.butVilDow);
        button2.setOnClickListener(this);
        Button button3 = findViewById(R.id.butSeeUp);
        button3.setOnClickListener(this);
        Button button4 = findViewById(R.id.butSeeDow);
        button4.setOnClickListener(this);
        Button button5 = findViewById(R.id.butWolfUp);
        button5.setOnClickListener(this);
        Button button6 = findViewById(R.id.butWolfDow);
        button6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.butVilUp:
                incVil();
                break;
            case R.id.butVilDow:
                decVil();
                break;
            case R.id.butSeeUp:
                incSee();
                break;
            case R.id.butSeeDow:
                decSee();
                break;
            case R.id.butWolfUp:
                incWolf();
                break;
            case R.id.butWolfDow:
                decWolf();
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_role_screen);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        initialize();

        Bundle extra = getIntent().getBundleExtra("list");
        ArrayList<String> list = (ArrayList<String>) extra.getSerializable("list");

        int num = list.size();
        String textSet = "Total Players: " + String.valueOf(num);
        TextView textPlayer = findViewById(R.id.textTotPla);
        textPlayer.setText(textSet);
    }
}
