package quizme.quizmee;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Handler;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class Game extends AppCompatActivity {

    private Lib mQuestionLibrary = new Lib();

    CountDownTimer timeCountDownTimer;

    private TextView mScoreView;
    private TextView mNumberView;
    private TextView mQuestionView;
    private TextView mTime;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    private SharedPreferences gamePrefs;

    private String mAnswer;
    public int mScore = 0;
    private int mNumber = -1;
    private int mScoreTime = 0;
    private int mQuestionNumber = 0;
    private int xTime = 11000;
    private int mTimeScore = 0;
    int i = 0;
    private int NumberQuestion;


    @Override
    public void onBackPressed() {
        i++;
        Handler handler = new Handler();
        handler.postDelayed(new Runnable(){
            @Override
            public void run() {
                if (i == 1) {
                    Toast.makeText(Game.this, "Naciśnij dwukrotnie aby wyjść", Toast.LENGTH_SHORT).show();
                } else if (i == 2) {
                    Game.super.onBackPressed();
                }
                i = 0;
            }
        },500);
    };





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);//wymusza pełny ekran w aktywnośći
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);//wymusza pełny ekran w aktywnośći
        super.onCreate(savedInstanceState);//wymusza pełny ekran w aktywnośći
        setContentView(R.layout.activity_game2);

        mScoreView = (TextView)findViewById(R.id.score);
        mNumberView = (TextView)findViewById(R.id.number);
        mTime = (TextView)findViewById(R.id.time);
        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonChoice4 = (Button)findViewById(R.id.choice4);


        Intent new_intent=new Intent(this,Pop.class);
        new_intent.putExtra("counter",mScore); //here the value is integer so you use the  new_intent.putExtra(String name,int value)

        updateQuestion();




        //Start of Button Listener for Button1
        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice1.getText() == mAnswer){
                    TextView x = (TextView)findViewById(R.id.time);
                    String text = x.getText().toString();
                    mTimeScore = Integer.parseInt(text);
                    mScore = mScore + 10 + mTimeScore;
                    updateScore(mScore);
                    updateQuestion();
                    //This line of code is optiona


                }else {

                    updateQuestion();
                }
            }
        });

        //End of Button Listener for Button1

        //Start of Button Listener for Button2
        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice2.getText() == mAnswer){
                    TextView x = (TextView)findViewById(R.id.time);
                    String text = x.getText().toString();
                    mTimeScore = Integer.parseInt(text);
                    mScore = mScore + 10 + mTimeScore;
                    updateScore(mScore);
                    updateQuestion();
                    //This line of code is optiona


                }else {

                    updateQuestion();
                }
            }
        });

        //End of Button Listener for Button2


        //Start of Button Listener for Button3
        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice3.getText() == mAnswer){
                    TextView x = (TextView)findViewById(R.id.time);
                    String text = x.getText().toString();
                    mTimeScore = Integer.parseInt(text);
                    mScore = mScore + 10 + mTimeScore;
                    updateScore(mScore);
                    updateQuestion();
                    //This line of code is optiona


                }else {

                    updateQuestion();
                }
            }
        });

        //End of Button Listener for Button3

        //Start of Button Listener for Button4
        mButtonChoice4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice4.getText() == mAnswer){
                    TextView x = (TextView)findViewById(R.id.time);
                    String text = x.getText().toString();
                    mTimeScore = Integer.parseInt(text);
                    mScore = mScore + 10 + mTimeScore;
                    updateScore(mScore);
                    updateQuestion();
                    //This line of code is optiona


                }else {

                    updateQuestion();
                }
            }
        });

        //End of Button Listener for Button4



    }



    private void updateQuestion(){

        if (mNumber == 12){
            timeCountDownTimer.cancel();

            Intent intent = new Intent(Game.this, Pop.class);
            intent.putExtra("name", mScore);
            startActivity(intent);


        }

        mNumber = mNumber + 1;
        updateNumber(mNumber);



        Random rand = new Random();
        int mQuestionNumber  = rand.nextInt(40);


        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
        mButtonChoice4.setText(mQuestionLibrary.getChoice4(mQuestionNumber));

        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);

        if(timeCountDownTimer!=null){
            timeCountDownTimer.cancel();
        }
        timeCountDownTimer = new CountDownTimer(xTime, 1000) {

            public void onTick(long millisUntilFinished) {
                mTime.setText("" + millisUntilFinished / 1000);
            }

            public void onFinish() {
                mTime.setText("0");
            }

        }.start();

    }


    private void updateScore(int point) {
        mScoreView.setText("" + mScore );
    }
    private void updateNumber(int point) {
        mNumberView.setText("" + mNumber );
    }



}