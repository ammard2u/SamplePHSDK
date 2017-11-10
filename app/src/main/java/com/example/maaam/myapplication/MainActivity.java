package com.example.maaam.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

import my.doctor2u.Doctor2uSdk;
import my.doctor2u.retrofit.req.Coverage;
import my.doctor2u.util.Common;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnHello).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<Coverage> coverageArrayList = new ArrayList<>();
                coverageArrayList.add(new Coverage(Common.FeatureType.HOMEVISIT, Common.CoverageType.PERCENT, 50));

                Doctor2uSdk.getInstance().show(MainActivity.this,
                        "ladieadfadfas@man.com", "Test SDK User", "+60102515285", coverageArrayList, "Patient policy number");
            }
        });
    }
}
