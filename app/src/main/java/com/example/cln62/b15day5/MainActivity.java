package com.example.cln62.b15day5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button myButton;
    Button myButton2;

    EditText usernameEditText;
    EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = findViewById(R.id.button2);
        usernameEditText = findViewById(R.id.editText);
        passwordEditText = findViewById(R.id.editText2);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();
//                Toast.makeText(MainActivity.this, username, Toast.LENGTH_LONG).show();
                /*if (!username.equals("abc")) {
                    Toast.makeText(MainActivity.this, "wrong username, please input again", Toast.LENGTH_LONG).show();
                }
                else {
                    if (!password.equals("123")) {
                        Toast.makeText(MainActivity.this, "wrong password, please input again", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Toast.makeText(MainActivity.this, "login in successful!", Toast.LENGTH_SHORT).show();
                    }
                }*/

                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                i.putExtra("username", username);
                i.putExtra("password", password);
                startActivity(i);
            }
        });

        myButton2 = findViewById(R.id.button3);

        myButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "TEST BUTTON CLIKED", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
