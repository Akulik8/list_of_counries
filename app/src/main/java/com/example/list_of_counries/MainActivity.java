package com.example.list_of_counries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        String[] counties = getResources().getStringArray(R.array.countries);

        // используем адаптер данных
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                R.layout.list_item, R.id.textView, counties);

        listView.setAdapter(adapter);
    }
}