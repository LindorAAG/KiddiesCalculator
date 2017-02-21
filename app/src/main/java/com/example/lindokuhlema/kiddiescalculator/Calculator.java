package com.example.lindokuhlema.kiddiescalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by LindokuhleMa on 2017/02/09.
 */
public class Calculator extends AppCompatActivity implements View.OnClickListener{
    Button one, two, three, four, five, six, seven, eight, nine, zero, add, sub, mul, div, cancel, equal;
    EditText disp;
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

        disp = (EditText) findViewById(R.id.display);

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
            System.out.print("Error!");
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

    @Override public void onClick(View arg0) {
        Editable str = disp.getText();
        switch(arg0.getId()){
            case R.id.one: if(secondNum != 0){
                secondNum = 0;
                disp.setText("");
            }
            str = str.append(one.getText());
                disp.setText(str);
                break;
            case R.id.two: if(secondNum != 0)
            { secondNum = 0;
                disp.setText("");
            }
            str = str.append(two.getText());
                disp.setText(str);
                break;
            case R.id.three: if(secondNum != 0){
                secondNum = 0;
                disp.setText("");
            }
            str = str.append(three.getText());
                disp.setText(str);
                break;
            case R.id.four: if(secondNum != 0){
                secondNum = 0;
                disp.setText("");
            }
            str = str.append(four.getText());
                disp.setText(str);
                break;
            case R.id.five: if(secondNum != 0){
                secondNum = 0;
                disp.setText("");
            }
            str = str.append(five.getText());
                disp.setText(str);
                break;
            case R.id.six: if(secondNum != 0){
                secondNum = 0;
                disp.setText("");
            }
            str = str.append(six.getText());
                disp.setText(str);
                break;
            case R.id.seven: if(secondNum != 0){
                secondNum = 0;
                disp.setText("");
            }
            str = str.append(seven.getText());
                disp.setText(str);
                break;
            case R.id.eight: if(secondNum != 0){
                secondNum = 0;
                disp.setText("");
            }
            str = str.append(eight.getText());
                disp.setText(str);
                break;
            case R.id.nine: if(secondNum != 0){
                secondNum = 0;
                disp.setText("");
            }
                str = str.append(nine.getText());
                disp.setText(str);
                break;
            case R.id.zero: if(secondNum != 0){
                secondNum = 0;
                disp.setText("");
            }
            str = str.append(zero.getText());
                disp.setText(str);
                break;
            case R.id.cancel: firstNum = 0;
                secondNum = 0;
                disp.setText("");
                break;
            case R.id.add: optr = "+";
                if(firstNum == 0){
                    firstNum = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                } else if(secondNum != 0){
                    secondNum = 0;
                    disp.setText("");
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
                } else if(secondNum != 0){
                    secondNum = 0;
                    disp.setText("");
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
                        disp.setText("");  /*op1 = op1 + op2;*/
                        disp.setText("Result : " + Integer.toString(firstNum));
                    } else if(optr.equals("-")){
                        disp.setText("");/* op1 = op1 - op2;*/
                        disp.setText("Result : " + Integer.toString(firstNum));
                    } else if(optr.equals("*")){
                        disp.setText("");/* op1 = op1 * op2;*/
                        disp.setText("Result : " + Integer.toString(firstNum));
                    } else if(optr.equals("/")){
                        disp.setText("");/* op1 = op1 / op2;*/
                        disp.setText("Result : " + Integer.toString(firstNum));
                    }
                } else{
                    operation();
                }
            } break;
        }
    }
}
