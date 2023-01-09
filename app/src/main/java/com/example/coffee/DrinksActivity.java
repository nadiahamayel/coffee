package com.example.coffee;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class DrinksActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drinks);
        ArrayAdapter<Drink> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Drink.drinks);
        ListView listView = (ListView) findViewById(R.id.drinks_list);
        listView.setAdapter(arrayAdapter);

        AdapterView.OnItemClickListener item = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent =new Intent(DrinksActivity.this,DrinkDetail.class);
                intent.putExtra("drink_id",(int)i );
                startActivity(intent);

            }
        };
        listView.setOnItemClickListener(item);
    }
}
