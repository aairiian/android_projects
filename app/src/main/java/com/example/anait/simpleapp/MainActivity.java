package com.example.anait.simpleapp;

import android.content.Intent;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.TextView;
import android.widget.Toast;



import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int page = 0;
        if(savedInstanceState !=null)
            page = savedInstanceState.getInt("word");

        TextView textView = findViewById(R.id.txt);
        Toast.makeText(MainActivity.this, "Welcome",Toast.LENGTH_LONG).show();
        textView.setText(String.valueOf(Calendar.getInstance().getTime()));

        Button btn = findViewById(R.id.btn);
        EditText editText = findViewById(R.id.input);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                String string = editText.getText().toString();
                intent.putExtra("value", string);
                Toast.makeText(MainActivity.this,editText.getText().toString(),Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });
    }




}
