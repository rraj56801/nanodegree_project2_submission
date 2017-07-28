package com.example.android.courtcounter;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by RajBaba on 28-07-2017.
 */
public class cricketTeamA {
    private Activity activity;
    int scoreTeamA = 0;
    int overTeam = 0;
    int overFlag = 0;
    int ballFlag = 0;
    Button teamASixScore_button, teamAFourScore_button, teamAThreeScore_button, teamATwoScore_button, teamAOneScore_button, teamAwideScore_button, teamAnoballScore_button, teamAZeroScore_button, teamABreak_button;
    TextView over_teamA_textView, score_teamA_textView;

    public cricketTeamA(Activity ac) {
        activity = ac;
        click();
    }


    public void click() {

        over_teamA_textView = (TextView) activity.findViewById(R.id.over_textview_team_a_id);
        score_teamA_textView = (TextView) activity.findViewById(R.id.score_textview_team_a_id);

        teamASixScore_button = (Button) activity.findViewById(R.id.button_value_a_6);
        teamAFourScore_button = (Button) activity.findViewById(R.id.button_value_a_4);
        teamAThreeScore_button = (Button) activity.findViewById(R.id.button_value_a_3);
        teamATwoScore_button = (Button) activity.findViewById(R.id.button_value_a_2);
        teamAOneScore_button = (Button) activity.findViewById(R.id.button_value_a_1);
        teamAwideScore_button = (Button) activity.findViewById(R.id.button_value_a_wide);
        teamAnoballScore_button = (Button) activity.findViewById(R.id.button_value_a_noball);
        teamAZeroScore_button = (Button) activity.findViewById(R.id.button_value_a_zero);
        teamABreak_button = (Button) activity.findViewById(R.id.button_value_a_break);

        teamASixScore_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamA = scoreTeamA + 6;
                generateOver();
                displayScoreForTeamA(scoreTeamA);
                displayOverForTeamA(overTeam, ballFlag);

            }
        });

        teamAFourScore_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamA = scoreTeamA + 4;
                generateOver();
                displayScoreForTeamA(scoreTeamA);
                displayOverForTeamA(overTeam, ballFlag);

            }
        });

        teamAThreeScore_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamA = scoreTeamA + 3;
                generateOver();
                displayScoreForTeamA(scoreTeamA);
                displayOverForTeamA(overTeam, ballFlag);

            }
        });

        teamATwoScore_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamA = scoreTeamA + 2;
                generateOver();
                displayScoreForTeamA(scoreTeamA);
                displayOverForTeamA(overTeam, ballFlag);

            }
        });

        teamAOneScore_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamA = scoreTeamA + 1;
                generateOver();
                displayScoreForTeamA(scoreTeamA);
                displayOverForTeamA(overTeam, ballFlag);

            }
        });

        teamAwideScore_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamA = scoreTeamA + 1;
                displayScoreForTeamA(scoreTeamA);
                displayOverForTeamA(overTeam, ballFlag);

            }
        });

        teamAnoballScore_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamA = scoreTeamA + 1;
                displayScoreForTeamA(scoreTeamA);
                displayOverForTeamA(overTeam, ballFlag);

            }
        });

        teamAZeroScore_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generateOver();
                displayScoreForTeamA(scoreTeamA);
                displayOverForTeamA(overTeam, ballFlag);

            }
        });
        teamABreak_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayScoreForTeamA(scoreTeamA);
                displayOverForTeamA(overTeam, ballFlag);
                cricketTeamB teamBmethod = new cricketTeamB(activity);
                teamBmethod.click();


            }
        });


    }

    public void generateOver() {
        overFlag = overFlag + 1;
        if (overFlag % 6 == 0) {
            ballFlag = 0;
            overTeam = overTeam + 1;
        } else {
            ballFlag = overFlag % 6;
        }

    }

    private void displayOverForTeamA(int over_teamA, int ball_teamA) {
        over_teamA_textView.setText(over_teamA + "." + ball_teamA);
    }

    private void displayScoreForTeamA(int score_teamA) {
        score_teamA_textView.setText("" + score_teamA);
    }

}
