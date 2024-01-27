package com.example.assignment_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tv_01 , tv_02;
    private EditText et_01;
    private Button btn_01;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_01 = (TextView) findViewById(R.id.tv_01);
        tv_02 = (TextView) findViewById(R.id.tv_02);
        et_01 = (EditText) findViewById(R.id.et_01);
        btn_01 = (Button) findViewById(R.id.btn_01);

        btn_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = et_01.getText().toString();
                int num2=Integer.parseInt(num);
                double result = num2*39.36;
                tv_02.setText("Inches : " + result);
                Toast.makeText(MainActivity.this, "Converted", Toast.LENGTH_SHORT).show();

            }
        });
    }
}