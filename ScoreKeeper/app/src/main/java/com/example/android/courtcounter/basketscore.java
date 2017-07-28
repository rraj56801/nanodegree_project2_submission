package com.example.android.courtcounter;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by RahulRaj on 28-07-2017.
 */
public class basketscore {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    Button teamAThreeScore_button, teamATwoScore_button, teamAOneScore_button;
    Button teamBThreeScore_button, teamBTwoScore_button, teamBOneScore_button;
    Button reset;
    TextView teamA_textView, teamB_textView;
    private Activity activity;

    public basketscore(Activity a) {
        activity = a;
        click();
    }

    public void click() {
        teamA_textView = (TextView) activity.findViewById(R.id.team_a_score);
        teamB_textView = (TextView) activity.findViewById(R.id.team_b_score);
        teamAThreeScore_button = (Button) activity.findViewById(R.id.team_a_three_score);
        teamATwoScore_button = (Button) activity.findViewById(R.id.team_a_two_score);
        teamAOneScore_button = (Button) activity.findViewById(R.id.team_a_one_score);

        teamBThreeScore_button = (Button) activity.findViewById(R.id.team_b_three_score);
        teamBTwoScore_button = (Button) activity.findViewById(R.id.team_b_two_score);
        teamBOneScore_button = (Button) activity.findViewById(R.id.team_b_one_score);
        reset = (Button) activity.findViewById(R.id.reset_button);


/*
* Team A Code start here
* */

        teamAThreeScore_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamA = scoreTeamA + 3;
                displayForTeamA(scoreTeamA);

            }
        });

        teamATwoScore_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamA = scoreTeamA + 2;
                displayForTeamA(scoreTeamA);

            }
        });
        teamAOneScore_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamA = scoreTeamA + 1;
                displayForTeamA(scoreTeamA);

            }
        });

/*
* Team A Code finished
* */

        /*
* Team B Code start here
* */

        teamBThreeScore_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamB = scoreTeamB + 3;
                displayForTeamB(scoreTeamB);

            }
        });
        teamBTwoScore_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamB = scoreTeamB + 2;
                displayForTeamB(scoreTeamB);

            }
        });
        teamBOneScore_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamB = scoreTeamB + 1;
                displayForTeamB(scoreTeamB);

            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamA = 0;
                scoreTeamB = 0;
                displayForTeamA(0);
                displayForTeamB(0);

            }
        });

    }
    /*
* Team B Code finished
* */

    /*
    * Display Team A  Score
    * */
    private void displayForTeamA(int score) {
        teamA_textView.setText("" + score);
    }

    /*
    * Display Team B  Score
    * */
    private void displayForTeamB(int score) {
        teamB_textView.setText("" + score);
    }


}
