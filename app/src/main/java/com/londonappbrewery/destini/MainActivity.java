package com.londonappbrewery.destini;

import android.opengl.Visibility;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    TextView mStoryTextView;
    Button button1;
    Button button2;
    int currentText = R.string.T1_Story;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        button1 = (Button) findViewById(R.id.buttonTop);
        button2 = (Button) findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:


        button1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                getNewStorylineB1();
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                getNewStoryLineB2();
            }
        });
    }

    public void getNewStorylineB1(){

        if(currentText == R.string.T1_Story){
            currentText = R.string.T3_Story;
            mStoryTextView.setText(currentText);
            button1.setText(R.string.T3_Ans1);
            button2.setText(R.string.T3_Ans2);
        }
        else if(currentText == R.string.T3_Story){

            currentText = R.string.T6_End;
            mStoryTextView.setText(currentText);

            button1.setVisibility(View.GONE);
            button2.setVisibility(View.GONE);
        }

        else if(currentText == R.string.T2_Story){
            currentText = R.string.T3_Story;
            mStoryTextView.setText(currentText);
            button1.setText(R.string.T3_Ans1);
            button2.setText(R.string.T3_Ans2);
        }

    }

    public void getNewStoryLineB2(){
        if(currentText == R.string.T1_Story){
            currentText = R.string.T2_Story;
            mStoryTextView.setText(currentText);
            button1.setText(R.string.T2_Ans1);
            button2.setText(R.string.T2_Ans2);
        }

        else if(currentText == R.string.T3_Story){

            currentText = R.string.T5_End;
            mStoryTextView.setText(currentText);

            button1.setVisibility(View.GONE);
            button2.setVisibility(View.GONE);
        }
        else if(currentText == R.string.T2_Story){
            currentText = R.string.T4_End;
            mStoryTextView.setText(currentText);

            button1.setVisibility(View.GONE);
            button2.setVisibility(View.GONE);
        }
    }
}
