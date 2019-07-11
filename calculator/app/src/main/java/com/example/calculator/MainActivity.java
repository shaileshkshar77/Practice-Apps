package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public EditText no1;
    public EditText no2;
    public Button btn;
    public TextView res;
    public int n1,n2,ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        no1= findViewById(R.id.no1);
        no2= findViewById(R.id.no2);
        btn= findViewById(R.id.btn);
        res= findViewById(R.id.result);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1=Integer.parseInt(no1.getText().toString());
                n2=Integer.parseInt(no2.getText().toString());
                answ( n1,n2);
            }
        });
    }
    public void answ(int a, int b){
        ans=a+b;
        res.setText(ans+"");

    }


}
