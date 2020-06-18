package com.example.yoony.opensource_android_05;

import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_main);                               //xml을 뷰에 생성하지 않는다.

        setTitle("연습문제 5-7(전문 01-04)");                                   //배너의 타이틀설정
        ActionBar ab = getSupportActionBar();
        ab.setIcon(R.drawable.drawablecustom);                                  //배너의 아이콘설정
        ab.setDisplayUseLogoEnabled(true);
        ab.setDisplayShowHomeEnabled(true);

        LinearLayout.LayoutParams params= new LinearLayout.LayoutParams(        //레이아웃의 크기속성
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );
        params.weight=1;                                                        //Layout_weight설정

        LinearLayout baseLayout=new LinearLayout(this);                //배경이 될 기본 레이아웃 생성
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        baseLayout.setBaselineAligned(false);
        setContentView(baseLayout,params);

        LinearLayout upperLayout=new LinearLayout(this);               //위쪽의 레이아웃들을 담을 레이아웃
        upperLayout.setOrientation(LinearLayout.HORIZONTAL);
        baseLayout.addView(upperLayout,params);

        LinearLayout blueLayout=new LinearLayout(this);                //아래쪽의 파란 레이아웃
        blueLayout.setOrientation(LinearLayout.HORIZONTAL);
        blueLayout.setBackgroundColor(Color.BLUE);
        baseLayout.addView(blueLayout,params);

        LinearLayout redLayout=new LinearLayout(this);                 //위쪽 레이아웃 중 왼쪽에 위치하는 빨간 레이아웃
        redLayout.setOrientation(LinearLayout.VERTICAL);
        redLayout.setBackgroundColor(Color.RED);
        upperLayout.addView(redLayout,params);

        LinearLayout upperRightLayout=new LinearLayout(this);          //오른쪽 위의 레이아웃들을 담을 레이아웃 생성
        upperRightLayout.setOrientation(LinearLayout.VERTICAL);
        upperLayout.addView(upperRightLayout,params);

        LinearLayout yellowLayout=new LinearLayout(this);              //노란색 레이아웃
        yellowLayout.setOrientation(LinearLayout.VERTICAL);
        yellowLayout.setBackgroundColor(Color.YELLOW);
        upperRightLayout.addView(yellowLayout,params);

        LinearLayout blackLayout=new LinearLayout(this);               //검은색 레이아웃
        blackLayout.setOrientation(LinearLayout.VERTICAL);
        blackLayout.setBackgroundColor(Color.BLACK);
        upperRightLayout.addView(blackLayout,params);
    }
}
