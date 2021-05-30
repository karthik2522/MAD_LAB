 package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;

import java.util.regex.Pattern;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
        Button btn_one, btn_Two, btn_Three, btn_Four, btn_Five, btn_Six;
        Button btn_Seven, btn_Eight, btn_Nine, btn_Zero;
        Button btn_Add,btn_Sub,btn_Mul,btn_Div;
        Button btn_Clear,btn_Equal,btn_Dot;

        EditText txtResult;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            btn_one=(Button)findViewById(R.id.button_one);
            btn_one.setOnClickListener(this);

            btn_Two=(Button)findViewById(R.id.button_two);
            btn_Two.setOnClickListener(this);

            btn_Three=(Button)findViewById(R.id.button_three);
            btn_Three.setOnClickListener(this);

            btn_Four=(Button)findViewById(R.id.button_four);
            btn_Four.setOnClickListener(this);


            btn_Five=(Button)findViewById(R.id.button_five);
            btn_Five.setOnClickListener(this);


            btn_Six=(Button)findViewById(R.id.button_six);
            btn_Six.setOnClickListener(this);


            btn_Seven=(Button)findViewById(R.id.button_seven);
            btn_Seven.setOnClickListener(this);

            btn_Eight=(Button)findViewById(R.id.button_eight);
            btn_Eight.setOnClickListener(this);

            btn_Nine=(Button)findViewById(R.id.button_nine);
            btn_Nine.setOnClickListener(this);

            btn_Zero=(Button)findViewById(R.id.button_zero);
            btn_Zero.setOnClickListener(this);




            btn_Add=(Button)findViewById(R.id.button_add);
            btn_Add.setOnClickListener(this);



            btn_Sub=(Button)findViewById(R.id.button_sub);
            btn_Sub.setOnClickListener(this);



            btn_Mul=(Button)findViewById(R.id.button_mul);
            btn_Mul.setOnClickListener(this);



            btn_Div=(Button)findViewById(R.id.button_div);
            btn_Div.setOnClickListener(this);




            btn_Clear=(Button)findViewById(R.id.button_clear);
            btn_Clear.setOnClickListener(this);



            btn_Equal=(Button)findViewById(R.id.button_equal);
            btn_Equal.setOnClickListener(this);



            btn_Dot=(Button)findViewById(R.id.button_dot);
            btn_Dot.setOnClickListener(this);



            txtResult= (EditText) findViewById(R.id.txt_result);
            txtResult.setText("");
    }
    public void onClick(View v)
    {
        if(v.equals(btn_one))
        txtResult.append("1");
        if(v.equals(btn_Two))
        txtResult.append("2");
        if(v.equals(btn_Three))
        txtResult.append("3");
        if(v.equals(btn_Four))
        txtResult.append("4");
        if(v.equals(btn_Five))
        txtResult.append("5");
        if(v.equals(btn_Six))
        txtResult.append("6");
        if(v.equals(btn_Seven))
        txtResult.append("7");
        if(v.equals(btn_Eight))
        txtResult.append("8");
        if(v.equals(btn_Nine))
        txtResult.append("9");
        if(v.equals(btn_Zero))
        txtResult.append("0");
        if(v.equals(btn_Dot))
        txtResult.append(".");
        if(v.equals(btn_Clear))
        txtResult.setText("");

        if(v.equals(btn_Equal))
        {
            try {
                String data = txtResult.getText().toString();
                if(data.contains("/")){
                    String[] operands = data.split("/");
                    if(operands.length==2) {
                        double operand1 = Double.parseDouble(operands[0]);
                        double operand2 = Double.parseDouble(operands[1]);
                        double result = operand1 / operand2;
                        txtResult.setText(String.valueOf(result));
                    }

                        else{
                            Toast.makeText(getBaseContext(),"Invalid Input",
                                    Toast.LENGTH_LONG).show();
                        }

                    }
                    else if(data.contains("*")){
                        String[] operands = data.split(Pattern.quote("*"));
                        if(operands.length==2){
                            double operand1 = Double.parseDouble(operands[0]);
                            double operand2 = Double.parseDouble(operands[1]);
                            double result = operand1 * operand2;
                            txtResult.setText(String.valueOf(result));
                        }
                        else{
                            Toast.makeText(getBaseContext(),"Invalid Input",
                                    Toast.LENGTH_LONG).show();
                        }
                    }
                else if (data.contains("+")) {
                    String[] operands = data.split(Pattern.quote("+"));
                    if(operands.length==2) {
                        double operand1 = Double.parseDouble(operands[0]);
                        double operand2 = Double.parseDouble(operands[1]);
                        double result = operand1 + operand2;
                        txtResult.setText(String.valueOf(result));
                    }
                    else
                    {
                        Toast.makeText(getBaseContext(),"Invalid Input",
                                Toast.LENGTH_LONG).show();
                    }
                }
                    else if (data.contains("-")){
                        String[] operands = data.split("-");
                        if(operands.length==2) {
                            double operand1 = Double.parseDouble(operands[0]);
                            double operand2 = Double.parseDouble(operands[1]);
                            double result = operand1 - operand2;
                            txtResult.setText(String.valueOf(result));
                    }
                        else{
                            Toast.makeText(getBaseContext(),"Invalid Input",
                                    Toast.LENGTH_LONG).show();
                        }

                }
            }
                catch(Exception e) {
                    Toast.makeText(getBaseContext(),"Invalid Input",
                            Toast.LENGTH_LONG).show();
                }
        }
            if(v.equals(btn_Add))
                txtResult.append("+");
            if(v.equals(btn_Sub))
                txtResult.append("-");
            if(v.equals(btn_Mul))
                txtResult.append("*");
            if(v.equals(btn_Div))
                txtResult.append("/");
    }
}
