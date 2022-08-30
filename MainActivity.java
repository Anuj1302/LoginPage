package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myloginpage.MESSAGE";
   TextView textView;
   EditText user;
   EditText pass;
//   Button button;
//    private Object TextView;
    Button button;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.open);
        Intent intent2 = getIntent();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user = findViewById(R.id.username);
                pass = findViewById(R.id.password);
                if(user.getText().toString().length() == 0 || pass.getText().toString().length() == 0){
                    Toast.makeText(MainActivity.this, "Both username and password is required!", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Welcome", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
    public void openit(View v){
//        String message = "hello";
        Intent intent = new Intent(this, MainActivity2.class);
        Toast.makeText(this, "Opening Sign-Up Page", Toast.LENGTH_SHORT).show();
//        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
    public void browser(View view){
        Intent intent3 = new Intent(this, MainActivity3.class);
        startActivity(intent3);
    }

}