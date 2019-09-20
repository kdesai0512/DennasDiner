package com.example.dennasdiner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                        if (position == 0) {
                            Intent intent = new Intent(MainActivity.this, BreakfastChoicesActivity.class);
                            startActivity(intent);
                        }
                    }
            };
        // Add the listener to the list View
        ListView listView = (ListView) findViewById(R.id.mealChoices);
        listView.setOnItemClickListener(itemClickListener);
    }
}
