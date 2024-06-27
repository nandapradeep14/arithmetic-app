package com.nanda.arithmeticapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class oddeven extends AppCompatActivity {

    AppCompatButton b1,b2;
    EditText ed1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_oddeven);
        b1=(AppCompatButton)findViewById(R.id.oe);
        b2=(AppCompatButton) findViewById(R.id.go);
        ed1=(EditText) findViewById(R.id.num1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int smallest;
                String num1 = ed1.getText().toString();

                int n1 = Integer.parseInt(num1);

                if(n1%2==0)
                {
                    Toast.makeText(getApplicationContext(),String.valueOf("even"),Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),String.valueOf("odd"),Toast.LENGTH_LONG).show();
                }

            }
        });
       // b1.setOnClickListener(new View.OnClickListener());

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

    }
}