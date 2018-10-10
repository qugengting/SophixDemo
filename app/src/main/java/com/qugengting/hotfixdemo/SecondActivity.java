package com.qugengting.hotfixdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by xuruibin on 2018/10/10.
 * 描述：
 */
public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        changedImageViewSrc();
    }

    //要修复的内容
    private void changedImageViewSrc() {
        ImageView imageView = findViewById(R.id.iv_girl);
        imageView.setImageResource(R.mipmap.add);
    }
}
