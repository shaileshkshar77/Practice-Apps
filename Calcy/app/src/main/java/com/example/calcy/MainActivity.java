package com.example.calcy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public EditText name;
    public EditText password;
    public TextView info;
    public Button login;
    public int c=5;
    public String l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name=findViewById(R.id.etname);
        password=findViewById(R.id.etpassword);
        info=findViewById(R.id.tvinfo);
        login=findViewById(R.id.btn);

        l="No of attempts left: 5" ;

        info.setText(l);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vali(name.getText().toString(),password.getText().toString());
            }
        });

    }

    private int vali(String nam,String pass)
    {
        if(nam.equals("Shailesh"))
            if(pass.equals("2810")) {
                Intent intent = new Intent(MainActivity.this, Main1.class);
                startActivity(intent);
                return 0;
            }
        c--;
            l="No of attempts left: " + String.valueOf(c);

        info.setText(l);

            if(c==0)
                login.setEnabled(false);
            return 0;
    }

}
