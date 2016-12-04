package com.wisnu_krn.distancecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //Punya variabel (x1,y1,x2,y2)
    double x1;
    double x2;
    double y1;
    double y2;

    //Selanjutnya kita buat variabel dx = (x2 - x1) dan dy = (y2 - y1)
    double dx = x2 - x1;
    double dy = y2 - y1;

    //Selanjutnya kita pangkatkan dx kuadrat ama dy kuadrat, hasilnya kita simpen di variabel dsquared
    double dsquared = dx * dx + dy * dy;

    //Terakhir kita dapat result nya dengan cara mengakarkan nilai dsquared
    double result = Math.sqrt(dsquared);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
