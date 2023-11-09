package com.example.myproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText e1;
    EditText e2;
//    TextView t1;
//    TextView t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1.getText().toString().equals("admin")&& e2.getText().toString().equals("admin")){
                    Toast.makeText(getApplicationContext(),"Login Successfull",Toast.LENGTH_SHORT).show();

                }else
                {
                    Toast.makeText(getApplicationContext(),"Invalid User!", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
