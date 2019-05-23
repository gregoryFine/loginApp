package com.example.qqlike;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class jumpActivity extends AppCompatActivity {

    private TextView send_user_name;

    private int count = 10;

    public int getCount(){
        return count;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jump);


        /**
         * 添加fragment组件
         */
        FragmentManager supportFragmentManager = getSupportFragmentManager(); //得到fragmentManager
        FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction(); //开启事物
        //fragmentTransaction.replace(R.id.containerr, new FrameFragment()); // 普通方式创建fragment, 将activity中的空容器替换为fragment
        fragmentTransaction.replace(R.id.containerr, FactoryFragment.newInstance("666666", "is 999999"));//工厂模式创建fragment, 将activity中的容器替换
        fragmentTransaction.commit(); // 提交事物


        /**
         * 传递参数，及页面元素绑定参数
         */
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
