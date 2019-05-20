package com.example.qqlike;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class jumpActivity extends AppCompatActivity {

    private TextView send_user_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jump);

        send_user_name = findViewById(R.id.send_user_name);
        Bundle bundleOne = this.getIntent().getBundleExtra("bundleOne");

        Student student = (Student) bundleOne.getSerializable("student");
        School school = bundleOne.getParcelable("school");

        String studentName = student.getName();
        String schoolName = school.getName();

        String username = bundleOne.getString("username");
        send_user_name.setText("欢迎您！" + schoolName + studentName + username);
    }
}
