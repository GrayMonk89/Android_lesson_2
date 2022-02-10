package ru.gb.android_lesson_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class ThemeActivity extends AppCompatActivity {

    RadioButton radioButtonThemeDefault;
    RadioButton radioButtonThemeOne;
    RadioButton radioButtonThemeTwo;
    Button goBackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme);
        init();
        goBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra(MainActivity.KEY_INTENT_FROM_THEME_TO_MAIN,"Привет");
                ThemeActivity.this.setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
    private void init(){
        radioButtonThemeDefault = findViewById(R.id.radioButton_ThemeDefault);
        radioButtonThemeOne = findViewById(R.id.radioButton_ThemeOne);
        radioButtonThemeTwo = findViewById(R.id.radioButton_ThemeTwo);
        goBackButton = findViewById(R.id.Go_Back);
    }
}