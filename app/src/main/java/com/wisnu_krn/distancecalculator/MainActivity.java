package com.wisnu_krn.distancecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    private EditText x1EditText;
    private EditText y1EditText;
    private EditText x2EditText;
    private EditText y2EditText;
    private Button resetButton;
    private Button calculateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        x1EditText = (EditText) findViewById(R.id.et_x1);
        y1EditText = (EditText) findViewById(R.id.et_y1);
        x2EditText = (EditText) findViewById(R.id.et_x2);
        y2EditText = (EditText) findViewById(R.id.et_y2);
        resetButton = (Button) findViewById(R.id.btn_reset);
        calculateButton = (Button) findViewById(R.id.btn_calculate);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: 04/12/2016 calculate
                //Punya variabel (x1,y1,x2,y2)
                String x1String = x1EditText.getText().toString().trim();
                String y1String = y1EditText.getText().toString().trim();
                String x2String = x2EditText.getText().toString().trim();
                String y2String = y2EditText.getText().toString().trim();

                int result = calculate(x1String, y1String, x2String, y2String);
                displayResult(result);
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: 04/12/2016 reset
            }
        });

    }

    public int calculate(String x1String, String y1String, String x2String, String y2String) {
        x1 = Integer.parseInt(x1String);
        y1 = Integer.parseInt(y1String);
        x2 = Integer.parseInt(x2String);
        y2 = Integer.parseInt(y2String);

        //Selanjutnya kita buat variabel dx = (x2 - x1) dan dy = (y2 - y1)
        int dx = x2 - x1;
        int dy = y2 - y1;

        //Selanjutnya kita pangkatkan dx kuadrat ama dy kuadrat, hasilnya kita simpen di variabel dsquared
        int dsquared = dx * dx + dy * dy;

        //Terakhir kita dapat result nya dengan cara mengakarkan nilai dsquared
        int result = (int) Math.sqrt(dsquared);

        return result;
    }

    public void reset(){
        
    }

    public void displayResult(int result){
        TextView resultTextView = (TextView) findViewById(R.id.tv_result);
        resultTextView.setText(String.valueOf(result));
    }

}
