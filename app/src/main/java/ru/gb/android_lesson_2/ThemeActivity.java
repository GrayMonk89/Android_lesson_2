package ru.gb.android_lesson_2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ThemeActivity extends AppCompatActivity implements View.OnClickListener {

    RadioButton radioButtonThemeDefault;
    RadioButton radioButtonThemeOne;
    RadioButton radioButtonThemeTwo;
    Button goBackButton;
    TextView textViewResult;
    private static final String PREF_NAME = "key_pref";
    private static final String PREF_THEME_KEY = "key_pref_theme";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setTheme(getAppTheme());
        setContentView(R.layout.activity_theme);
        init();

    }

    private void init() {
        radioButtonThemeDefault = findViewById(R.id.radioButton_ThemeDefault);
        radioButtonThemeOne = findViewById(R.id.radioButton_ThemeOne);
        radioButtonThemeTwo = findViewById(R.id.radioButton_ThemeTwo);
        goBackButton = findViewById(R.id.Go_Back);
        textViewResult = findViewById(R.id.textViewResult);
        radioButtonThemeDefault.setOnClickListener(this);
        radioButtonThemeOne.setOnClickListener(this);
        radioButtonThemeTwo.setOnClickListener(this);
        goBackButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.radioButton_ThemeDefault): {
                setAppTheme(R.style.ThemeDefault);
                break;
            }
            case (R.id.radioButton_ThemeOne): {
                setAppTheme(R.style.ThemeOne);
                break;
            }
            case (R.id.radioButton_ThemeTwo): {
                setAppTheme(R.style.ThemeTwo);
                break;
            }
            case (R.id.Go_Back): {
                Intent intent = new Intent();
                intent.putExtra(MainActivity.KEY_INTENT_FROM_THEME_TO_MAIN, getAppTheme());
                ThemeActivity.this.setResult(RESULT_OK, intent);
                finish();
                break;
            }
        }
        //recreate();
    }

    protected void setAppTheme(int codeStyle) {
        SharedPreferences sharedPref = getSharedPreferences(PREF_NAME, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt(PREF_THEME_KEY, codeStyle);
        editor.apply();
    }

    protected int getAppTheme() {
        SharedPreferences sharedPref = getSharedPreferences(PREF_NAME, MODE_PRIVATE);
        return sharedPref.getInt(PREF_THEME_KEY, R.style.ThemeDefault);
    }
}