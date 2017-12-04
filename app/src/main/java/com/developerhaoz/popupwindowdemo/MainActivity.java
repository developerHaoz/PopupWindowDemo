package com.developerhaoz.popupwindowdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mBtnShowPopup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnShowPopup = (Button) findViewById(R.id.main_btn_show_popupwindow);
        mBtnShowPopup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "hello", Toast.LENGTH_SHORT).show();
                View contentView = LayoutInflater.from(MainActivity.this).inflate(R.layout.popupwindow, null);
                PopupWindow popupWindow = new PopupWindow(MainActivity.this);
                popupWindow.setContentView(contentView);
                popupWindow.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);
                popupWindow.setWidth(ViewGroup.LayoutParams.WRAP_CONTENT);
                popupWindow.setOutsideTouchable(true);

                View rootView = LayoutInflater.from(MainActivity.this).inflate(R.layout.activity_main, null);
                popupWindow.showAsDropDown(mBtnShowPopup);
            }
        });
    }
}
