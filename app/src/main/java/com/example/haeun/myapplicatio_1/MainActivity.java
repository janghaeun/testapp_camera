package com.example.haeun.myapplicatio_1;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    //    static final int REQUEST_IMAGE_CAPTURE = 1;
//
//    // 의도 (Intent) 자체, 외부 활동을 시작하기위한 호출 및 포커스가 활동으로 돌아갈 때 이미지 데이터를 처리하는 코드
//    private void dispatchTaskPictureIntent(){
//
//        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//        if(takePictureIntent.resloveActivity(getPackageManager())!= null){
//            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
//
//        }
//    }
    Button btn = null;
    ImageView iv = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setup();
    }


    private void setup() {
        btn = (Button) findViewById(R.id.btn);
        iv = (ImageView) findViewById(R.id.iv);

        // 버튼클릭
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                //카메라 실행
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                //startActivity(intent);
                startActivityForResult(intent,1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
       iv.setImageURI(data.getData());
    }

}



