package com.example.administrator.scrollin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RelativeLayout relay;
    private Button yinc;
    private TextView centr;
    private TextView can;
    private TextView tv;
    private MyWheel wheel;
    private ArrayList<String> datas = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        centr = findViewById(R.id.butto);
        tv = findViewById(R.id.selectTv);
        wheel = findViewById(R.id.scorll);
        relay = findViewById(R.id.lay);
        yinc = findViewById(R.id.yinc);
        can = findViewById(R.id.cance);
        initData();
        wheel.setData(datas);


        yinc.setOnClickListener(this);//隐藏/显示
        centr.setOnClickListener(this);//设置tv
        can.setOnClickListener(this);

    }

    private void initData() {
        datas.add("未完成");
        datas.add("已完成");
        datas.add("其他");
        datas.add("测试1");
        datas.add("测试2");
        datas.add("测试3");
        datas.add("测试4");
        datas.add("测试5");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.yinc:
                if (relay.getVisibility() == View.VISIBLE) {
                    relay.setVisibility(View.GONE);
                } else {
                    relay.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.butto:
                tv.setText(wheel.getSelectedText());
                relay.setVisibility(View.GONE);
                break;

            case R.id.cance:
                relay.setVisibility(View.GONE);
                break;
            default:
                break;
        }

    }
}
