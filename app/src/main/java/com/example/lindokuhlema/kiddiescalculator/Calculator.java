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
    TextView disp;
    int firstNum, secondNum;
    String optr;

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

        disp = (TextView) findViewById(R.id.display);

        try{
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
        } catch(Exception e){

        }

    }
    public void operation(){
        if(optr.equals("+")){
            secondNum = Integer.parseInt(disp.getText().toString());
            disp.setText("");
            firstNum = firstNum + secondNum;
            disp.setText("" + Integer.toString(firstNum));
        } else if(optr.equals("-")){
            secondNum = Integer.parseInt(disp.getText().toString());
            disp.setText("");
            firstNum = firstNum - secondNum;
            disp.setText("" + Integer.toString(firstNum));
        } else if(optr.equals("*")){
            secondNum = Integer.parseInt(disp.getText().toString());
            disp.setText("");
            firstNum = firstNum * secondNum;
            disp.setText("" + Integer.toString(firstNum));
        } else if(optr.equals("/")){
            secondNum = Integer.parseInt(disp.getText().toString());
            disp.setText("");
            firstNum = firstNum / secondNum;
            disp.setText("" + Integer.toString(firstNum));
        } }

    @Override public void onClick(View view) {
        String s = disp.getText().toString();
        switch(view.getId()){
            case R.id.one: if(secondNum != 0){
                secondNum = 0;
                disp.setText("");
            }
             //disp.append(one.getText());
                s += one.getText();
                disp.setText(s);
                break;
            case R.id.two: if(secondNum != 0)
            { secondNum = 0;
                disp.setText("");
            }
                s += two.getText();
                //disp.append(two.getText());
                disp.setText(s);
                break;
            case R.id.three: if(secondNum != 0){
                secondNum = 0;
                disp.setText("");
            }
            //s = disp.append(three.getText().toString());
                s += three.getText();
                disp.setText(s);
                break;
            case R.id.four: if(secondNum != 0){
                secondNum = 0;
                disp.setText("");
            }
                s += four.getText();
            //disp.append(four.getText());
                disp.setText(s);
                break;
            case R.id.five: if(secondNum != 0){
                secondNum = 0;
                disp.setText("");
            }
                s += five.getText();
            //disp.append(five.getText());
                disp.setText(s);
                break;
            case R.id.six: if(secondNum != 0){
                secondNum = 0;
                disp.setText("");
            }
                s += six.getText();
           //disp.append(six.getText());
                disp.setText(s);
                break;
            case R.id.seven: if(secondNum != 0){
                secondNum = 0;
                disp.setText("");
            }
                s += seven.getText();
           //disp.append(seven.getText());
                disp.setText(s);
                break;
            case R.id.eight: if(secondNum != 0){
                secondNum = 0;
                disp.setText("");
            }
                s += eight.getText();
                //disp.append(eight.getText());
                disp.setText(s);
                break;
            case R.id.nine: if(secondNum != 0){
                secondNum = 0;
                disp.setText("");
            }
                s += nine.getText();
                //disp.append(nine.getText());
                disp.setText(s);
                break;
            case R.id.zero: if(secondNum != 0){
                secondNum = 0;
                disp.setText("");
            }
            disp.append(zero.getText());
                disp.setText(s);
                break;
            case R.id.cancel:
                firstNum = 0;
                secondNum = 0;
                disp.setText("");
                break;
            case R.id.add: optr = "+";
                if(firstNum == 0){
                    firstNum = Integer.parseInt(disp.getText().toString());
                    s += " + ";
                    disp.setText(s);
                } else if(secondNum != 0){
                    secondNum = 0;
                    disp.setText(s);
                } else{ secondNum = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                    firstNum = firstNum + secondNum;
                    disp.setText("" + Integer.toString(firstNum));
                }
                break;
            case R.id.sub: optr = "-";
                if(firstNum == 0){
                    firstNum = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                } else if(secondNum != 0){
                    secondNum = 0;
                    disp.setText("");
                } else{ secondNum = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                    firstNum = firstNum - secondNum;
                    disp.setText("" + Integer.toString(firstNum));
                }
                break;
            case R.id.mul: optr = "*";
                if(firstNum == 0){
                    firstNum = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                } else if(secondNum != 0){
                    secondNum = 0;
                    disp.setText("");
                }
                else{
                    secondNum = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                    firstNum = firstNum * secondNum;
                    disp.setText("" + Integer.toString(firstNum));
                }
                break;
            case R.id.div: optr = "/";
                if(firstNum == 0){
                    firstNum = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                } else if(secondNum == 0){
                    throw new IllegalArgumentException("Error: Cannot divide by 0!");
                } else{
                    secondNum = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                    firstNum = firstNum / secondNum;
                    disp.setText("" + Integer.toString(firstNum));
                }
                break;
            case R.id.equal: if(!optr.equals(null)){
                if(secondNum != 0){
                    if(optr.equals("+")){
                        disp.setText("" + Integer.toString(firstNum));
                    } else if(optr.equals("-")){
                        disp.setText("" + Integer.toString(firstNum));
                    } else if(optr.equals("*")){
                        disp.setText("" + Integer.toString(firstNum));
                    } else if(optr.equals("/")){
                        disp.setText("" + Integer.toString(firstNum));
                    }
                } else{
                    operation();
                }
            } break;
        }
    }
}
