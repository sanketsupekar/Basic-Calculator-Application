package com.internshala.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button one,two,three,four,five,six,seven,eight,nine,zero,clear,add,sub,mul,div,dot,equal;
    public TextView show,showOperator,showOne,showTwo,showAns;
    double num1=0,num2=0;
    double result;
    String operator;
    boolean txtOne =true;

    {
        operator = null;
    }

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setComponentValue();
        zero.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(operator==null){
                    showOne.setText(showOne.getText() + "0");
                    txtOne=false;
                }
                else{
                    showTwo.setText(showTwo.getText() + "0");
                }
                }

        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operator == null) {
                    showOne.setText(showOne.getText() + "1");
                    txtOne=false;
                }
                else{
                    showTwo.setText(showTwo.getText() + "1");
                }

            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operator==null) {
                    showOne.setText(showOne.getText() + "2");
                    txtOne=false;
                }
                else{
                    showTwo.setText(showTwo.getText() + "2");
                }            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operator==null) {
                    showOne.setText(showOne.getText() + "3");
                    txtOne=false;
                }
                else{
                    showTwo.setText(showTwo.getText() + "3");
                }            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operator==null) {
                    showOne.setText(showOne.getText() + "4");
                    txtOne=false;
                }
                else{
                    showTwo.setText(showTwo.getText() + "4");
                }            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operator==null) {
                    showOne.setText(showOne.getText() + "5");
                    txtOne=false;
                }
                else{
                    showTwo.setText(showTwo.getText() + "5");
                }            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operator==null) {
                    showOne.setText(showOne.getText() + "6");
                    txtOne=false;
                }
                else{
                    showTwo.setText(showTwo.getText() + "6");
                }            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operator==null) {
                    showOne.setText(showOne.getText() + "7");
                    txtOne=false;
                }
                else{
                    showTwo.setText(showTwo.getText() + "7");
                }            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operator==null) {
                    showOne.setText(showOne.getText() + "8");
                    txtOne=false;
                }
                else{
                    showTwo.setText(showTwo.getText() + "8");
                }            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operator==null) {
                    showOne.setText(showOne.getText() + "9");
                    txtOne=false;
                }
                else{
                    showTwo.setText(showTwo.getText() + "9");
                }            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operator==null) {
                    showOne.setText(showOne.getText() + ".");
                    txtOne=false;
                }
                else{
                    showTwo.setText(showTwo.getText() + ".");
                }            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!txtOne) {
                    showOperator.setText("+");
                    operator = "+";
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!txtOne) {

                    showOperator.setText("-");
                    operator = "-";
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!txtOne) {

                    showOperator.setText("*");
                    operator = "*";
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!txtOne) {

                    showOperator.setText("/");
                    operator = "/";
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showOne.setText("");
                showTwo.setText("");
                showOperator.setText("");
                showAns.setText("");
                operator=null;
                txtOne=true;
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operator != null) {
                    num1 = Double.parseDouble(showOne.getText().toString());
                    num2 = Double.parseDouble(showTwo.getText().toString());
                    switch (operator) {
                        case "+":
                            result = num1 + num2;
                            break;
                        case "-":
                            result = num1 - num2;
                            break;
                        case "*":
                            result = num1 * num2;
                            break;
                        case "/":
                            result = num1 / num2;
                            break;
                        default:
                            break;
                    }

                    showAns.setText("= " + (double) result);
                }
            }
        });


    }
    public void setComponentValue()
    {
        zero= findViewById(R.id.btn0);
        one= findViewById(R.id.btn1);
        two= findViewById(R.id.btn2);
        three= findViewById(R.id.btn3);
        four= findViewById(R.id.btn4);
        five= findViewById(R.id.btn5);
        six= findViewById(R.id.btn6);
        seven= findViewById(R.id.btn7);
        eight= findViewById(R.id.btn8);
        nine= findViewById(R.id.btn9);
        add= findViewById(R.id.btnAdd);
        sub= findViewById(R.id.btnSub);
        mul =findViewById(R.id.btnMul);
        div=findViewById(R.id.btnDiv);
        dot=findViewById(R.id.btnDot);
        equal= findViewById(R.id.btnEqual);
        clear= findViewById(R.id.btnClear);

        show= findViewById(R.id.txtShow);
        showOne= findViewById(R.id.txtShowOne);
        showTwo= findViewById(R.id.txtShowTwo);
        showOperator= findViewById(R.id.txtShowOperator);

        showAns = findViewById(R.id.txtShowAns);

    }
}