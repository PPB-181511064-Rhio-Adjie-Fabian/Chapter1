package com.example.firsttry;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class second_page extends AppCompatActivity implements View.OnClickListener {
    Button nextPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        nextPage = (Button) findViewById(R.id.button2);
        nextPage.setOnClickListener((View.OnClickListener) this);
    }

    public void onClick(View v){
        Intent movingObject = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(movingObject);
        setContentView(R.layout.activity_main);
    }
}
