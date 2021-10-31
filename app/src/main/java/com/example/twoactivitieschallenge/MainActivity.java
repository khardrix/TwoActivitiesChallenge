package com.example.twoactivitieschallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE = "com.example.android.twoactivitieschallenge.extra.MESSAGE";
    private Button button1, button2, button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.btn_textOne);
        button2 = findViewById(R.id.btn_textTwo);
        button3 = findViewById(R.id.btn_textThree);
    }

    public void launchSecondActivity(View view) {
        String message = "";
        switch (view.getId()){
            case R.id.btn_textOne:
                Log.d(LOG_TAG, "Button 1 clicked!");
                message = "BUTTON 1 CLICKED!! \n\nJava is a high level, object-oriented, " +
                        "platform independent language. Java, unlike some languages before it " +
                        "allows for the use of words and commands instead of just symbols and " +
                        "numbers. ... Java is very flexible - it can be used to develop software " +
                        "as well as applets (small programs that run on webpages).";
                break;
            case R.id.btn_textTwo:
                Log.d(LOG_TAG, "Button 2 clicked!");
                message = "BUTTON 2 CLICKED!! \n\nKotlin is an open-source statically typed " +
                        "programming language designed by JetBrains. It is object-oriented and " +
                        "supports functional programming features. ... That is because Google " +
                        "decided that Kotlin was its preferred language for building Android apps.";
                break;
            case R.id.btn_textThree:
                Log.d(LOG_TAG, "Button 3 clicked!");
                message = "BUTTON 3 CLICKED!! \n\nKotlin combines features of both " +
                        "object-oriented and functional programming, whereas Java is limited to " +
                        "object-oriented programming. Kotlin allows users to create an extension " +
                        "function while Java doesn't offer any extension functions. Kotlin " +
                        "doesn't offer implicit conversions, and Java supports implicit " +
                        "conversions.";
                break;
        }

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}