package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;

    private Button increaseBtn;
    private Button decreaseBtn;
    private Button resetBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUI();

        increaseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newText=Integer.toString(Integer.parseInt(textView.getText().toString())+1);
                textView.setText(newText);
            }
        });

        decreaseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Integer.parseInt(textView.getText().toString()) != 0) {
                    String newText = Integer.toString(Integer.parseInt(textView.getText().toString()) - 1);
                    textView.setText(newText);
                }
            }
        });


    }
    public void resetText(View view){
        textView.setText("0");
    }

    private void setUI(){
        textView=findViewById(R.id.textView);
        increaseBtn=findViewById(R.id.increase);
        decreaseBtn=findViewById(R.id.decrease);
        resetBtn=findViewById(R.id.reset);
    }
}