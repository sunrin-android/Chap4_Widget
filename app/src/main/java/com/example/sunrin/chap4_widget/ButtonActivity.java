package com.example.sunrin.chap4_widget;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {
    Button button1;
    CheckBox checkBox;
    RadioGroup radioGroup;
    TextView text3;
    BitmapDrawable bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        button1 = findViewById(R.id.button1);
        checkBox = findViewById(R.id.checkBox);
        radioGroup = findViewById(R.id.radioGroup);
        text3 = findViewById(R.id.text3);

        Resources res = getResources();
        bitmap = (BitmapDrawable)res.getDrawable(R.drawable.sample);
        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();
        text3.setText(bitmapWidth + "*" + bitmapHeight);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radio1)
                    Toast.makeText(getApplicationContext(), "남성", Toast.LENGTH_SHORT).show();
                else if (checkedId == R.id.radio2)
                    Toast.makeText(getApplicationContext(), "여성", Toast.LENGTH_SHORT).show();
            }
        });

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    checkBox.setText("is Checked");
                else
                    checkBox.setText("is UnChecked");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setText("20407 김현우");
                Toast.makeText(getApplicationContext(), "버튼 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
