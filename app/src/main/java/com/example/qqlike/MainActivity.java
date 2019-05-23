package com.example.qqlike;

import android.content.Intent;
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
        }else{
            Toast.makeText(MainActivity.this, "账号或密码不匹配，登录不成功，请重新输入", Toast.LENGTH_LONG).show();
            return;
        }


        Student student = new Student("小明");
        School school = new School();
        school.setName("东明一中");


        Bundle bundleOne = new Bundle();
        bundleOne.putString("username", usernameString);
        bundleOne.putString("password", passwordString);
        bundleOne.putSerializable("student", student);
        bundleOne.putParcelable("school", school);


        Intent intent = new Intent(MainActivity.this, ButterKnifeActivity.class);
        intent.putExtra("bundleOne", bundleOne);

        startActivity(intent);

        //finish();//销毁当前页

    }
}
