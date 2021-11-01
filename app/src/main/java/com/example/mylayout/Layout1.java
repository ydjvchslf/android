package com.example.mylayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

//layout1.xml과 한쌍인 Layout1.java 를 생성, 그리고 LinearLayout 상속 추가
public class Layout1 extends LinearLayout {

    // 3.
    ImageView imageView;
    TextView textView;
    TextView textView2;


    public Layout1(Context context) {
        super(context);
        //생성자 생성하고 초기화 하는 함수를 만들어 줌, init() 는 밑에 정의 해줄거임
        init(context);

    }

    public Layout1(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        //생성자 생성하고 초기화 하는 함수를 만들어 줌
        init(context);
    }

    public void init(Context context){
        //Layout1.java 와 layout1.xml 을 연결시켜주는 인플레이터 필요!
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //인플레이터로 연결 성공 layout1.xml과 this(Layout1.java), 연결해줘 true ~
        inflater.inflate(R.layout.layout1, this, true);

        //2. 인플레이터로 연결해줬으니, layout1.xml에서 만들어준 imageView, TextView1, TextView2를 갖다 쓸 수 있어
        //3. 위에 변수 선언 후, id로 찾아 할당
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
    }

    // 4. 이 클래스(객체) 바깥에서도 쓸 수 있도록 함수 하나 만들어줄거야
    public void setImage(int resId){
        imageView.setImageResource(resId);
    }

    public void setName(String name){
        textView.setText(name);
    }

    public void setMobile(String mobile){
        textView2.setText(mobile);
    }


}
