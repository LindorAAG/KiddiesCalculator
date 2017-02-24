package com.example.lindokuhlema.kiddiescalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by LindokuhleMa on 2017/02/09.
 */
public class Calculator extends AppCompatActivity implements View.OnClickListener{
    Button one, two, three, four, five, six, seven, eight, nine, zero, add, sub, mul, div, cancel, equal;
    TextView display;
    private int valueOne = 0, valueTwo = 0, answer = 0;
    private static final char ADDITION ='+';
    private static final char SUBTRACTION ='-';
    private static final char MULTIPLICATION ='*';
    private static final char DIVISION ='/';
    private char currentAction;
    private String displayExpression;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        cancel = (Button) findViewById(R.id.cancel);
        equal = (Button) findViewById(R.id.equal);
        display = (TextView) findViewById(R.id.display);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);
        cancel.setOnClickListener(this);
        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
        equal.setOnClickListener(this);

        displayExpression="";
    }

    @Override
    public void onClick(View view)
    {
        String[] explode;

        switch(view.getId())
        {

            case R.id.zero:
                displayExpression += zero.getText();
                display.setText(displayExpression);
                break;
            case R.id.one:
                displayExpression += one.getText();
                display.setText(displayExpression);
                break;
            case R.id.two:
                displayExpression += two.getText();
                display.setText(displayExpression);
                break;
            case R.id.three:
                displayExpression += three.getText();
                display.setText(displayExpression);
                break;
            case R.id.four:
                displayExpression += four.getText();
                display.setText(displayExpression);
                break;
            case R.id.five:
                displayExpression += five.getText();
                display.setText(displayExpression);
                break;
            case R.id.six:
                displayExpression += six.getText();
                display.setText(displayExpression);
                break;
            case R.id.seven:
                displayExpression += seven.getText();
                display.setText(displayExpression);
                break;
            case R.id.eight:
                displayExpression += eight.getText();
                display.setText(displayExpression);
                break;
            case R.id.nine:
                displayExpression += nine.getText();
                display.setText(displayExpression);
                break;
            case  R.id.cancel:
                displayExpression =" ";
                answer = 0;
                valueOne = 0;
                valueTwo = 0;
                display.setText(displayExpression);
                displayExpression = "";
                break;
            case R.id.add:
                currentAction = ADDITION;
                displayExpression += " + ";
                display.setText(displayExpression);
                break;
            case R.id.sub:
                currentAction = SUBTRACTION;
                displayExpression += " - ";
                display.setText(displayExpression);
                break;
            case R.id.mul:
                currentAction = MULTIPLICATION;
                displayExpression += " X ";
                display.setText(displayExpression);
                break;
            case R.id.div:
                currentAction = DIVISION;
                displayExpression += " / ";
                display.setText(displayExpression);
                break;
            case R.id.equal:
                if(currentAction == ADDITION )
                {
                    explode = displayExpression.split(" \\+ ");
                    valueOne = Integer.parseInt(explode[0]);
                    valueTwo = Integer.parseInt(explode[1]);
                    answer = (valueOne + valueTwo);
                    displayExpression ="";
                    display.setText(Integer.toString(answer));
                }else if(currentAction == SUBTRACTION)
                {
                    explode = displayExpression.split(" - ");
                    valueOne = Integer.parseInt(explode[0]);
                    valueTwo = Integer.parseInt(explode[1]);
                    answer = (valueOne - valueTwo);
                    displayExpression ="";
                    display.setText(Integer.toString(answer));
                }else if(currentAction == MULTIPLICATION)
                {
                    explode = displayExpression.split(" X ");
                    valueOne = Integer.parseInt(explode[0]);
                    valueTwo = Integer.parseInt(explode[1]);
                    answer = (valueOne * valueTwo);
                    displayExpression ="";
                    display.setText(Integer.toString(answer));
                }else if(currentAction == DIVISION)
                {
                    explode = displayExpression.split(" / ");
                    valueOne = Integer.parseInt(explode[0]);
                    valueTwo = Integer.parseInt(explode[1]);
                    displayExpression ="";
                    if(valueTwo ==0)
                    {
                        display.setText(R.string.divideByZero);
                    }else{
                        answer = (valueOne/valueTwo);
                        display.setText(Integer.toString(answer));
                    }
                }
                break;
        }
    }
}