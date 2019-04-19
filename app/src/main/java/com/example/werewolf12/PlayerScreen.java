package com.example.werewolf12;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class PlayerScreen extends AppCompatActivity {

    ListView players;
    ArrayList<String> list;
    ArrayAdapter<String> adapter1;
    EditText addName;

    public void addPlayer(View v){
        list.add(addName.getText().toString());
        players.setAdapter(adapter1);
        addName.setText(" ");
    }

    public void nextScreen(View v){
        Intent roleScreen = new Intent(this, RoleScreen.class);

        Bundle extra = new Bundle();
        extra.putSerializable("list", list);

        roleScreen.putExtra("list", extra);
        startActivity(roleScreen);
    }

    public void initialize(){
        addName = (EditText)findViewById(R.id.textPlayer);
        players = (ListView)findViewById(R.id.players);
        list = new ArrayList<String>();
        list.add("Max");
        list.add("Derek");
        list.add("Emily");
        list.add("KT");
        adapter1 = new ArrayAdapter<String>(this, R.layout.list_white , list);
        players.setAdapter(adapter1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_screen);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        initialize();

        players.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position, long arg3)
            {
                list.remove(position);
                adapter1.notifyDataSetChanged();
            }
        });

    }
}
