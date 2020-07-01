package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView value;
    int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        value=findViewById(R.id.counter);
    }
    public void increase(View view){
        counter++;
        value.setText(Integer.toString(counter));

    }
    public void decrease(View view){
        counter--;
        value.setText(Integer.toString(counter));

    }
    public void reset(View view){
        counter++;
        value.setText(String.valueOf(counter));

    }
}
