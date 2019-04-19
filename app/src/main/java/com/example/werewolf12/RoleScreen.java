package com.example.werewolf12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class RoleScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_role_screen);

        Bundle extra = getIntent().getBundleExtra("list");
        ArrayList<String> list = (ArrayList<String>) extra.getSerializable("list");

        int num = list.size();
        String listSize = String.valueOf(num);
    }
}
