package com.jmgarzo.mycv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SummaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(getString(R.string.summary));
        setContentView(R.layout.activity_summary);
    }
}
