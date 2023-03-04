package com.example.cantilado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class my_list extends AppCompatActivity {

    ListView listView;
    TextView textView;
    String[] listItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_list);

        listView=(ListView) findViewById(R.id.listView);
        listItem = getResources().getStringArray(R.array.array_technology);

        final ArrayAdapter<String> adapter = new ArrayAdapter(this,R.layout.activity_my_list, R.id.textView, listItem);
        listView.setAdapter(adapter);



    }
}