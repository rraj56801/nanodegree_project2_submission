package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RelativeLayout relativeLayout, layout_cricket_main, layout_team_cricket, layout_basketball, layout_basket_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeLayout = (RelativeLayout) findViewById(R.id.relative_id);
        layout_cricket_main = (RelativeLayout) findViewById(R.id.cricket_main_id);
        layout_team_cricket = (RelativeLayout) findViewById(R.id.cricket_team_cricket_id);
        layout_basket_main = (RelativeLayout) findViewById(R.id.basket_main_id);
        layout_basketball = (RelativeLayout) findViewById(R.id.layout_basket_id);
        layout_basketball.setVisibility(View.INVISIBLE);
        layout_team_cricket.setVisibility(View.INVISIBLE);
        layout_cricket_main.setVisibility(View.VISIBLE);
    }


    /**
     * Cricket Team A Playing First
     *
     * @param view
     */
    public void cricketDisplayA(View view) {
        layout_cricket_main.setVisibility(View.INVISIBLE);
        layout_basket_main.setVisibility(View.INVISIBLE);
        layout_team_cricket.setVisibility(View.VISIBLE);
        cricketTeamA teamAmethod = new cricketTeamA(MainActivity.this);
        teamAmethod.click();
    }

    /**
     * Cricket Team B Playing First
     *
     * @param view
     */
    public void cricketDisplayB(View view) {

        layout_cricket_main.setVisibility(View.INVISIBLE);
        layout_basket_main.setVisibility(View.INVISIBLE);
        layout_team_cricket.setVisibility(View.VISIBLE);
        cricketTeamB teamBmethod = new cricketTeamB(MainActivity.this);
        teamBmethod.click();
    }

    /**
     * Score Counter button utility
     *
     * @param view
     */
    public void scoreBasket(View view) {
        layout_cricket_main.setVisibility(View.INVISIBLE);
        layout_basket_main.setVisibility(View.INVISIBLE);
        layout_basketball.setVisibility(View.VISIBLE);
        basketscore s = new basketscore(MainActivity.this);
        s.click();
    }

    /**
     * Exit Button code here
     *
     * @param view
     */
    public void systemExit(View view) {
        System.exit(0);
    }
}

