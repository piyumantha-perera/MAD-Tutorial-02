package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    Button btn;
    EditText n1,n2;
    String s1,s2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btn=findViewById(R.id.button);
        n1=findViewById(R.id.editText);
        n2=findViewById(R.id.editText2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                s1=n1.getText().toString();
                s2=n2.getText().toString();

                Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
                intent.putExtra("value1",s1);
                intent.putExtra("value2",s2);
                startActivity(intent);
            }
        });


    }
}
