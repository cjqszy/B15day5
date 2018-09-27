package com.example.cln62.b15day5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    Button go2First;
    Button go2Next;
    TextView userName;
    TextView passWord;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String usernameFromMainAct = getIntent().getExtras().getString("username");
        String passwordFromMainAdt = getIntent().getExtras().getString("password");

        userName = findViewById(R.id.textView2);
        passWord = findViewById(R.id.textView3);
        userName.setText("username: " + usernameFromMainAct);
        passWord.setText("password: " + passwordFromMainAdt);

        go2First = findViewById(R.id.preButton);
        go2Next = findViewById(R.id.nextButton);

        go2First.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(i);
            }
        });

        go2Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(i);
            }
        });
    }
}
