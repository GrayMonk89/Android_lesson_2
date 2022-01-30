package ru.gb.android_lesson_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //region Variables
    Button buttonOne;
    Button buttonTwo;
    Button buttonThree;
    Button buttonFour;
    Button buttonFive;
    Button buttonSix;
    Button buttonSeven;
    Button buttonEight;
    Button buttonNine;
    Button buttonZero;
    Button buttonEquals;
    Button buttonDot;
    Button buttonDivide;
    Button buttonPlus;
    Button buttonMultiply;
    Button buttonMinus;
    TextView textViewInput;
    TextView textViewResult;
    Button clearText;
    String firstOperand;
    String secondOperand;
    String currentOperation = "";
    String nextOperation;
    //endregion
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createLinks();
        setListeners();
    }
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        textViewInput.setText(savedInstanceState.getString("textViewInput"));
        textViewResult.setText(savedInstanceState.getString("textViewResult"));
    }

    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("textViewInput",textViewInput.getText().toString());
        outState.putString("textViewResult",textViewResult.getText().toString());
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case(R.id.button_one):{
                textViewInput.append("1");
                break;
            }
            case(R.id.button_two):{
                textViewInput.append("2");
                break;
            }
            case(R.id.button_three):{
                textViewInput.append("3");
                break;
            }
            case(R.id.button_four):{
                textViewInput.append("4");
                break;
            }
            case(R.id.button_five):{
                textViewInput.append("5");
                break;
            }
            case(R.id.button_six):{
                textViewInput.append("6");
                break;
            }
            case(R.id.button_seven):{
                textViewInput.append("7");
                break;
            }
            case(R.id.button_eight):{
                textViewInput.append("8");
                break;
            }
            case(R.id.button_nine):{
                textViewInput.append("9");
                break;
            }
            case(R.id.button_zero):{
                textViewInput.append("0");
                break;
            }
            case(R.id.button_equals):{
                textViewInput.append(" = ");
                break;
            }
            case(R.id.button_dot):{
                textViewInput.append(" . ");
                break;
            }
            case(R.id.button_divide):{
                textViewInput.append(" / ");
                break;
            }
            case(R.id.button_minus):{
                textViewInput.append(" - ");
                break;
            }
            case(R.id.button_multiply):{
                textViewInput.append(" * ");
                break;
            }
            case(R.id.button_plus):{
                textViewInput.append(" + ");
                break;
            }
            case(R.id.clear_text):{
                textViewInput.setText("");
                textViewResult.setText("");
                break;
            }
            default:{
            }
        }
    }

    private void createLinks(){
        buttonOne = findViewById(R.id.button_one);
        buttonTwo = findViewById(R.id.button_two);
        buttonThree = findViewById(R.id.button_three);
        buttonFour = findViewById(R.id.button_four);
        buttonFive = findViewById(R.id.button_five);
        buttonSix = findViewById(R.id.button_six);
        buttonSeven = findViewById(R.id.button_seven);
        buttonEight = findViewById(R.id.button_eight);
        buttonNine = findViewById(R.id.button_nine);
        buttonZero = findViewById(R.id.button_zero);
        buttonEquals = findViewById(R.id.button_equals);
        buttonDot = findViewById(R.id.button_dot);
        buttonDivide = findViewById(R.id.button_divide);
        buttonPlus = findViewById(R.id.button_plus);
        buttonMultiply = findViewById(R.id.button_multiply);
        buttonMinus = findViewById(R.id.button_minus);
        textViewInput = findViewById(R.id.textViewInput);
        textViewResult = findViewById(R.id.textViewResult);
        clearText = findViewById(R.id.clear_text);
    }

    private void setListeners(){
        buttonOne.setOnClickListener(this);
        buttonTwo.setOnClickListener(this);
        buttonThree.setOnClickListener(this);
        buttonFour.setOnClickListener(this);
        buttonFive.setOnClickListener(this);
        buttonSix.setOnClickListener(this);
        buttonSeven.setOnClickListener(this);
        buttonEight.setOnClickListener(this);
        buttonNine.setOnClickListener(this);
        buttonZero.setOnClickListener(this);
        buttonEquals.setOnClickListener(this);
        buttonDot.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        clearText.setOnClickListener(this);
    }
}