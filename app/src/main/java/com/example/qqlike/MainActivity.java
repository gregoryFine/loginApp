package com.example.qqlike;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private EditText username;
    private EditText password;



    private TextView loginBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginBtn = findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        String usernameString = username.getText().toString().trim();
        String passwordString = password.getText().toString().trim();
        if(!TextUtils.isEmpty(usernameString) && "666666".equals(usernameString) && !TextUtils.isEmpty(passwordString) && "666666".equals(passwordString)){
            Toast.makeText(MainActivity.this, "成功", Toast.LENGTH_LONG).show();
            return;
        }
        Toast.makeText(MainActivity.this, "不成功", Toast.LENGTH_LONG).show();

    }
}
