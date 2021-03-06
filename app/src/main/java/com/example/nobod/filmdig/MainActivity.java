package com.example.nobod.filmdig;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    //incremento para nome da foto
    private static int i = 0;

    public static int getI(){
        return i;
    }

    public static void incrementI(){
        i++;
    }

    public static boolean isContinuo() {
        return continuo;
    }

    public static void setContinuo(boolean continuo) {
        MainActivity.continuo = continuo;
    }

    public static boolean continuo = false;

    public static boolean getStartStop() {
        return startStop;
    }

    public static void setStartStop(boolean startStop) {
        MainActivity.startStop = startStop;
    }

    public static boolean startStop = false;

    public static int getWindHeight() {
        return windHeight;
    }

    public static void setWindHeight(int windHeight) {
        MainActivity.windHeight = windHeight;
    }

    public static int getWindWidth() {
        return windWidth;
    }

    public static void setWindWidth(int windWidth) {
        MainActivity.windWidth = windWidth;
    }

    //Tamanhos do sensor
    public static int windHeight, windWidth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        if (null == savedInstanceState) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, Camera2BasicFragment.newInstance())
                    .commit();

        }

    }
}