package com.damage0413.big_homework;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_change,btn_opt,btn_in,btn_delete,btn_out;
    @TargetApi(Build.VERSION_CODES.M)
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    @SuppressLint("NewApi")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_change=findViewById(R.id.change);
        btn_change.setOnClickListener(this);

        btn_in=findViewById(R.id.in);
        btn_in.setOnClickListener(this);

        btn_opt=findViewById(R.id.opt);
        btn_opt.setOnClickListener(this);

        btn_delete=findViewById(R.id.delete);
        btn_delete.setOnClickListener(this);

        btn_out=findViewById(R.id.out);
        btn_out.setOnClickListener(this);



    }
    
    @RequiresApi(api = Build.VERSION_CODES.M)
    void readRequest() {             //获取相机拍摄读写权限
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE,Manifest.permission.CAMERA}, 1);
            }
        }
    }
}
