package com.example.myapplicationtest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button btn_move;
    private EditText et_test;
    private EditText et_test2;
    private String str;
    private String str2;

    ImageView test;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_move = findViewById(R.id.btn_move);
        et_test = findViewById(R.id.et_test);
<<<<<<< HEAD
        et_test2 = findViewById(R.id.et_test2);
=======
        et_test2 = findViewById(R.id.et_test2); //et_test id 값 찾아오기
>>>>>>> 95641d1c483926f0dcb0db7a9237b46e6faac644


        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str=et_test.getText().toString();
                str2=et_test2.getText().toString();
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                intent.putExtra("str", str);
                intent.putExtra("str2", str2);
                startActivity(intent); //액티비티 이동
<<<<<<< HEAD
                Toast.makeText(getApplicationContext(),"로그인 성공",Toast.LENGTH_SHORT).show();
=======
                Toast.makeText(getApplicationContext(),"로그인 성공",Toast.LENGTH_SHORT).show(); //팝업
>>>>>>> 95641d1c483926f0dcb0db7a9237b46e6faac644
            }
        });

        test=(ImageView) findViewById(R.id.test);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"토스트.메이크테스트",Toast.LENGTH_SHORT).show(); // 버튼 누르면 하단에 팝업 생성
            }
        });


    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 95641d1c483926f0dcb0db7a9237b46e6faac644
