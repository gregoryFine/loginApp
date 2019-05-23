package com.example.qqlike;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;

public class ButterKnifeActivity extends AppCompatActivity {

    @BindView(R.id.hello_world)
    Button helloWorld;
    @BindView(R.id.hello_earth)
    Button helloEarth;
    @BindView(R.id.hello_moon)
    Button helloMoon;
    @BindView(R.id.like)
    CheckBox helloLike;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butter_knife);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.hello_world, R.id.hello_earth, R.id.hello_moon})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.hello_world:
                break;
            case R.id.hello_earth:
                break;
            case R.id.hello_moon:
                break;
        }
        Toast.makeText(ButterKnifeActivity.this, String.valueOf(view.getId()), Toast.LENGTH_LONG).show();
    }


    @OnCheckedChanged({R.id.like})
    void onCheckChanged(CompoundButton vi, boolean isChecked){
        Toast.makeText(ButterKnifeActivity.this, String.valueOf(isChecked), Toast.LENGTH_LONG).show();
    }

}
