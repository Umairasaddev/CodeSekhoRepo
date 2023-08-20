package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


// Ctrl + /


    Button ClickButton; // declare
    EditText editText;


    String emailPattern = "abc";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        initialize
        ClickButton = findViewById(R.id.ClickButton);
        editText = findViewById(R.id.editText);





        ClickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "50 50 Samjh a rhi haa", Toast.LENGTH_SHORT).show();

                if (editText.equals(emailPattern))
                {
                    editText.setVisibility(View.GONE);
                }
                else {
                    editText.setVisibility(View.VISIBLE);
                }

                Intent intent  = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);


            }
        });

    }
}

