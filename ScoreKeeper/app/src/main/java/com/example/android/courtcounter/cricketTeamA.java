package com.example.android.courtcounter;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by RahulRaj on 28-07-2017.
 */
public class cricketTeamA {
    //flag_update_score variable controls when to update the score of team A

    private int flag_update_score = 0;
    private int scoreTeamA = 0;
    private int overTeam = 0;
    private int overFlag = 0;
    private int ballFlag = 0;
    Button teamASixScore_button;
    Button teamAFourScore_button;
    Button teamAThreeScore_button;
    Button teamATwoScore_button;
    Button teamAOneScore_button;
    Button teamAwideScore_button;
    Button teamAnoballScore_button;
    Button teamAZeroScore_button;
    Button teamABreak_button;
    TextView over_teamA_textView;
    TextView score_teamA_textView;
    private Activity activity;

    public cricketTeamA(Activity ac) {
        activity = ac;
        click();
    }

    public void click() {
        /**
         * Finding different views by their ID
         */
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
        /**
         * Using button to perform several activity
         */
        teamASixScore_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag_update_score == 0) {
                    scoreTeamA = scoreTeamA + 6;
                    generateOver();
                }
                displayScoreForTeamA(scoreTeamA);
                displayOverForTeamA(overTeam, ballFlag);
            }
        });
        teamAFourScore_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag_update_score == 0) {
                    scoreTeamA = scoreTeamA + 4;
                    generateOver();
                }
                displayScoreForTeamA(scoreTeamA);
                displayOverForTeamA(overTeam, ballFlag);
            }
        });
        teamAThreeScore_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag_update_score == 0) {
                    scoreTeamA = scoreTeamA + 3;
                    generateOver();
                }
                displayScoreForTeamA(scoreTeamA);
                displayOverForTeamA(overTeam, ballFlag);
            }
        });
        teamATwoScore_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag_update_score == 0) {
                    scoreTeamA = scoreTeamA + 2;
                    generateOver();
                }
                displayScoreForTeamA(scoreTeamA);
                displayOverForTeamA(overTeam, ballFlag);
            }
        });
        teamAOneScore_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag_update_score == 0) {
                    scoreTeamA = scoreTeamA + 1;
                    generateOver();
                }
                displayScoreForTeamA(scoreTeamA);
                displayOverForTeamA(overTeam, ballFlag);
            }
        });
        teamAwideScore_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag_update_score == 0) {
                    scoreTeamA = scoreTeamA + 1;
                }
                displayScoreForTeamA(scoreTeamA);
                displayOverForTeamA(overTeam, ballFlag);
            }
        });
        teamAnoballScore_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag_update_score == 0) {
                    scoreTeamA = scoreTeamA + 1;
                }
                displayScoreForTeamA(scoreTeamA);
                displayOverForTeamA(overTeam, ballFlag);
            }
        });
        teamAZeroScore_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag_update_score == 0) {
                    generateOver();
                }
                displayScoreForTeamA(scoreTeamA);
                displayOverForTeamA(overTeam, ballFlag);
            }
        });
        teamABreak_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flag_update_score = 1;
                displayScoreForTeamA(scoreTeamA);
                displayOverForTeamA(overTeam, ballFlag);
                cricketTeamB teamBmethod = new cricketTeamB(activity);
                teamBmethod.click();
            }
        });
    }
    /**
     * Method to generate Over
     */
    public void generateOver() {
        overFlag = overFlag + 1;
        if (overFlag % 6 == 0) {
            ballFlag = 0;
            overTeam = overTeam + 1;
        } else {
            ballFlag = overFlag % 6;
        }
    }
    /**
     * Display over played by team A
     *
     * @param over_teamA
     * @param ball_teamA
     */
    private void displayOverForTeamA(int over_teamA, int ball_teamA) {
        over_teamA_textView.setText(over_teamA + "." + ball_teamA);
    }
    /**
     * Display Score of Team A
     *
     * @param score_teamA
     */
    private void displayScoreForTeamA(int score_teamA) {
        score_teamA_textView.setText("" + score_teamA);
    }
}
