package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.app.UiModeManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double lhs = 0;
    double rhs = 0;
    char op = ' ';

    TextView resultsView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
//        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);

        resultsView = findViewById(R.id.resultsText);
        Button oneBtn = findViewById(R.id.oneBtn);
        Button twoBtn = findViewById(R.id.twoBtn);
        Button threeBtn = findViewById(R.id.threeBtn);
        Button fourBtn = findViewById(R.id.fourBtn);
        Button fiveBtn = findViewById(R.id.fiveBtn);
        Button sixBtn = findViewById(R.id.sixBtn);
        Button sevenBtn = findViewById(R.id.sevenBtn);
        Button eightBtn = findViewById(R.id.eightBtn);
        Button nineBtn = findViewById(R.id.nineBtn);
        Button zeroBtn = findViewById(R.id.zeroBtn);

        ImageButton calcBtn = findViewById(R.id.calcBtn);
        ImageButton addBtn = findViewById(R.id.addBtn);
        ImageButton subBtn = findViewById(R.id.subBtn);
        ImageButton mulBtn = findViewById(R.id.mulBtn);
        ImageButton divBtn = findViewById(R.id.divBtn);

        Button clearButton = findViewById(R.id.clearBtn);

        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultsView.setText(resultsView.getText() + "1");
            }
        });
        twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultsView.setText(resultsView.getText() + "2");
            }
        });
        threeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultsView.setText(resultsView.getText() + "3");
            }
        });
        fourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultsView.setText(resultsView.getText() + "4");
            }
        });

        fiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultsView.setText(resultsView.getText() + "5");
            }
        });
        sixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultsView.setText(resultsView.getText() + "6");
            }
        });
        sevenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultsView.setText(resultsView.getText() + "7");
            }
        });
        eightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultsView.setText(resultsView.getText() + "8");
            }
        });
        nineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultsView.setText(resultsView.getText() + "9");
            }
        });
        zeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultsView.setText(resultsView.getText() + "0");
            }
        });

        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op != ' ' && resultsView.getText() != ""){
                    rhs = Double.valueOf(resultsView.getText().toString());
                    switch (op){
                        case 'a': resultsView.setText(String.valueOf(lhs + rhs));
                                    break;
                        case 's' : resultsView.setText(String.valueOf(lhs - rhs));
                            break;
                        case 'm': resultsView.setText(String.valueOf(lhs * rhs));
                            break;
                        case 'd': resultsView.setText(String.valueOf(lhs / rhs));
                    }
                }

            }
        });
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetLhs();
                op = 'a';
            }
        });
        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetLhs();
                op = 'd';
            }
        });
        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetLhs();
                op = 's';
            }
        });
        mulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetLhs();
                op = 'm';
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultsView.setText("0");
            }
        });
    }

    private void GetLhs(){
        if(resultsView.getText() != ""){
            lhs = Double.valueOf(resultsView.getText().toString());
            resultsView.setText("");
        }

    }
}