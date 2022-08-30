package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;
    Button button;
//    Button buttonz;
    EditText name;
    EditText last;
    EditText mail;
    EditText date;
    EditText number;
    EditText passs;
    Button check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        textView =findViewById(R.id.textView6);
        Intent intent = getIntent();
        button = findViewById(R.id.button2);
//        buttonz = findViewById(R.id.checkBox);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name=findViewById(R.id.firstname);
                last=findViewById(R.id.last);
                mail=findViewById(R.id.email);
                date=findViewById(R.id.editTextDate);
                number=findViewById(R.id.editTextPhone);
                passs=findViewById(R.id.password);
//                check = findViewById(R.id.checkBox);
                if(name.getText().toString().length() == 0 || last.getText().toString().length()==0 || mail.getText().toString().length()==0 || date.getText().toString().length()==0 || passs.getText().toString().length() ==0 || number.getText().toString().length() ==0){
                    Toast.makeText(MainActivity2.this, "ERROR!! All the fields are Mandatory", Toast.LENGTH_SHORT).show();
                }
               else {
                    Toast.makeText(MainActivity2.this, "Successful", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void back(View view){
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }
}