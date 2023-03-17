package com.example.scoreboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Integer counter = 0;
    private Integer counter1 = 0;

    private Integer count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickScore(View view) {
        counter++;
        TextView counterView = (TextView) findViewById(R.id.fnatic);
        counterView.setText(counter.toString());
    }

    public void onClickScore1(View view) {
        counter1++;
        TextView counter1View = (TextView) findViewById(R.id.loud);
        counter1View.setText(counter1.toString());
    }

    public void onClickReset(View view) {
        counter = 0;
        counter1 = 0;
        TextView counter3View = (TextView) findViewById(R.id.loud);
        counter3View.setText(counter1.toString());
        TextView counter2View = (TextView) findViewById(R.id.fnatic);
        counter2View.setText(counter.toString());
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count", counter);
        outState.putInt("count1", counter1);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("count")) {
            counter = savedInstanceState.getInt("count");
            counter1 = savedInstanceState.getInt("count1");
        }

    }
}