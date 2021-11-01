package com.example.mylayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Layout1 layout1;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout1 = findViewById(R.id.layout1);
        //layout1.java에서 만들어준 메서드 써서 이미지랑 텍스트 넣어주기
        layout1.setImage(R.drawable.ic_launcher_background);
        layout1.setName("용미경");
        layout1.setMobile("010-9999-3333");

        // 버튼 클릭시, 이미지 바뀌도록!
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout1.setImage(R.drawable.ic_launcher_foreground);
            }
        });


    }
}