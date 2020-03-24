package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    Button b1,b2,b3,b4;
    EditText e1,e2;
    TextView ans;
    String val1, val2;
    Integer a,b;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        b1 = findViewById(R.id.button2);
        b2 = findViewById(R.id.button3);
        b3 = findViewById(R.id.button4);
        b4 = findViewById(R.id.button5);

        ans = findViewById(R.id.textView5);
        e1 = findViewById(R.id.editText3);
        e2 = findViewById(R.id.editText4);

        val1 = intent.getStringExtra("Value1");
        val2 = intent.getStringExtra("Value2");


        e1.setText(val1);
        e2.setText(val2);

        a = Integer.parseInt(val1);
        b = Integer.parseInt(val2);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(a+"+"+b + "=" + String.valueOf(a+b));

                Context context = getApplicationContext();

                CharSequence message = "Add two numbers";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);
                toast.setGravity(Gravity.TOP, 0, 200);
                toast.show();

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(a+"-"+b +"="+ String.valueOf(a-b));

                Context context = getApplicationContext();

                CharSequence message = "Subtract two numbers";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);
                toast.setGravity(Gravity.TOP, 0, 200);
                toast.show();

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(a+"*"+b +"="+ String.valueOf(a*b));

                Context context = getApplicationContext();

                CharSequence message = "Multiply two numbers";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);
                toast.setGravity(Gravity.TOP, 0, 200);
                toast.show();

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(a+"/"+b +"="+ String.valueOf(a/b));

                Context context = getApplicationContext();

                CharSequence message = "Devide two numbers";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);
                toast.setGravity(Gravity.TOP, 0, 200);
                toast.show();
            }
        });






    }
}
