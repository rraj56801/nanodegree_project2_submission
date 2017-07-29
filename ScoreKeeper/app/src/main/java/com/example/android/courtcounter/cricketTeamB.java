package com.example.android.courtcounter;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by RahulRaj on 28-07-2017.
 */
public class cricketTeamB {
    //flag_update_score variable controls when to update the score of team B

    String flag_update_score = "update";
    int scoreTeamB = 0;
    int overTeam = 0;
    int overFlag = 0;
    int ballFlag = 0;
    Button teamBSixScore_button;
    Button teamBFourScore_button;
    Button teamBThreeScore_button;
    Button teamBTwoScore_button;
    Button teamBOneScore_button;
    Button teamBwideScore_button;
    Button teamBnoballScore_button;
    Button teamBZeroScore_button;
    Button teamBBreak_button;
    TextView over_teamB_textView;
    TextView score_teamB_textView;
    private Activity activity;

    public cricketTeamB(Activity b) {
        activity = b;
        click();
    }

    public void click() {
        /**
         * Finding different views by their ID
         */
        over_teamB_textView = (TextView) activity.findViewById(R.id.over_textview_team_b_id);
        score_teamB_textView = (TextView) activity.findViewById(R.id.score_textview_team_b_id);
        teamBSixScore_button = (Button) activity.findViewById(R.id.button_value_b_6);
        teamBFourScore_button = (Button) activity.findViewById(R.id.button_value_b_4);
        teamBThreeScore_button = (Button) activity.findViewById(R.id.button_value_b_3);
        teamBTwoScore_button = (Button) activity.findViewById(R.id.button_value_b_2);
        teamBOneScore_button = (Button) activity.findViewById(R.id.button_value_b_1);
        teamBwideScore_button = (Button) activity.findViewById(R.id.button_value_b_wide);
        teamBnoballScore_button = (Button) activity.findViewById(R.id.button_value_b_noball);
        teamBZeroScore_button = (Button) activity.findViewById(R.id.button_value_b_zero);
        teamBBreak_button = (Button) activity.findViewById(R.id.button_value_b_break);
        /**
         * Using button to perform several activity
         */
        teamBSixScore_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag_update_score.equals("update")) {
                    scoreTeamB = scoreTeamB + 6;
                    generateOver();
                }
                displayScoreForTeamB(scoreTeamB);
                displayOverForTeamB(overTeam, ballFlag);
            }
        });
        teamBFourScore_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag_update_score.equals("update")) {
                    scoreTeamB = scoreTeamB + 4;
                    generateOver();
                }
                displayScoreForTeamB(scoreTeamB);
                displayOverForTeamB(overTeam, ballFlag);
            }
        });
        teamBThreeScore_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag_update_score.equals("update")) {
                    scoreTeamB = scoreTeamB + 3;
                    generateOver();
                }
                displayScoreForTeamB(scoreTeamB);
                displayOverForTeamB(overTeam, ballFlag);
            }
        });
        teamBTwoScore_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag_update_score.equals("update")) {
                    scoreTeamB = scoreTeamB + 2;
                    generateOver();
                }
                displayScoreForTeamB(scoreTeamB);
                displayOverForTeamB(overTeam, ballFlag);
            }
        });
        teamBOneScore_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag_update_score.equals("update")) {
                    scoreTeamB = scoreTeamB + 1;
                    generateOver();
                }
                displayScoreForTeamB(scoreTeamB);
                displayOverForTeamB(overTeam, ballFlag);
            }
        });
        teamBwideScore_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag_update_score.equals("update")) {
                    scoreTeamB = scoreTeamB + 1;
                }
                displayScoreForTeamB(scoreTeamB);
                displayOverForTeamB(overTeam, ballFlag);
            }
        });
        teamBnoballScore_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag_update_score.equals("update")) {
                    scoreTeamB = scoreTeamB + 1;
                }
                displayScoreForTeamB(scoreTeamB);
                displayOverForTeamB(overTeam, ballFlag);
            }
        });
        teamBZeroScore_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag_update_score.equals("update")) {
                    generateOver();
                }
                displayScoreForTeamB(scoreTeamB);
                displayOverForTeamB(overTeam, ballFlag);
            }
        });
        teamBBreak_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flag_update_score = "no_update";
                displayScoreForTeamB(scoreTeamB);
                displayOverForTeamB(overTeam, ballFlag);
                cricketTeamA teamAmethod = new cricketTeamA(activity);
                teamAmethod.click();
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
     * Display over played by team B
     *
     * @param over_teamB
     * @param ball_teamB
     */
    private void displayOverForTeamB(int over_teamB, int ball_teamB) {
        over_teamB_textView.setText(over_teamB + "." + ball_teamB);
    }

    /**
     * Display Score of Team B
     *
     * @param score_teamB
     */
    private void displayScoreForTeamB(int score_teamB) {
        score_teamB_textView.setText("" + score_teamB);
    }
}
