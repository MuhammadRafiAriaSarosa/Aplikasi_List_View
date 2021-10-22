package com.example.aplikasilistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView lvItem;
    private String[] namakarakter = new String[]{
            "Ahri","Aurelion Sol","Singed","Sett","Syndra","Vex","Zac","Zed" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("ListView Sederhana");

        lvItem = (ListView) findViewById(R.id.List_View);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>( context MainActivity.this, android.R.layout.simple_expandable_list_item_1, android.R.id.text1, namakarakter);

        lvItem.setAdapter(adapter);

        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText( context:MainActivity.this, text: "Memilih : " + namakarakter[position], Toast.LENGTH_LONG) . show();

            }

        });
    }
}