package com.luisfernandomgrs.learning.dailyphrases;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void gerarNovaFrase(View view) {
        TextView txtMessageDaily = findViewById(R.id._txtMessageDaily);
        ArrayList<String> aStrDailyMessage = new ArrayList<String>();
        int iIndiceMessage;

        aStrDailyMessage.add(getString(R.string.dailyMessage0));
        aStrDailyMessage.add(getString(R.string.dailyMessage1));
        aStrDailyMessage.add(getString(R.string.dailyMessage2));
        aStrDailyMessage.add(getString(R.string.dailyMessage3));
        aStrDailyMessage.add(getString(R.string.dailyMessage4));
        aStrDailyMessage.add(getString(R.string.dailyMessage5));
        aStrDailyMessage.add(getString(R.string.dailyMessage6));
        aStrDailyMessage.add(getString(R.string.dailyMessage7));
        aStrDailyMessage.add(getString(R.string.dailyMessage8));
        aStrDailyMessage.add(getString(R.string.dailyMessage9));
        aStrDailyMessage.add(getString(R.string.dailyMessage10));
        aStrDailyMessage.add(getString(R.string.dailyMessage11));
        aStrDailyMessage.add(getString(R.string.dailyMessage12));
        aStrDailyMessage.add(getString(R.string.dailyMessage13));
        aStrDailyMessage.add(getString(R.string.dailyMessage14));
        aStrDailyMessage.add(getString(R.string.dailyMessage15));
        aStrDailyMessage.add(getString(R.string.dailyMessage16));
        aStrDailyMessage.add(getString(R.string.dailyMessage17));
        aStrDailyMessage.add(getString(R.string.dailyMessage18));
        aStrDailyMessage.add(getString(R.string.dailyMessage19));
        aStrDailyMessage.add(getString(R.string.dailyMessage20));
        aStrDailyMessage.add(getString(R.string.dailyMessage21));
        aStrDailyMessage.add(getString(R.string.dailyMessage22));
        aStrDailyMessage.add(getString(R.string.dailyMessage23));
        aStrDailyMessage.add(getString(R.string.dailyMessage24));
        aStrDailyMessage.add(getString(R.string.dailyMessage25));
        aStrDailyMessage.add(getString(R.string.dailyMessage26));
        aStrDailyMessage.add(getString(R.string.dailyMessage27));
        aStrDailyMessage.add(getString(R.string.dailyMessage28));
        aStrDailyMessage.add(getString(R.string.dailyMessage29));
        aStrDailyMessage.add(getString(R.string.dailyMessage30));

        iIndiceMessage = new Random().nextInt((int) aStrDailyMessage.stream().count());

        txtMessageDaily.setText(aStrDailyMessage.get(iIndiceMessage));
    }
}