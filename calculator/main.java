package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    int number1,number2;
    Float a,b,c,d,e,f;
    EditText t1,t2;
    Button btn;
    TextView tview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
         t1=(EditText) findViewById(R.id.editTextText);
         t2=(EditText) findViewById(R.id.editTextText2);
         tview=(TextView)findViewById(R.id.textView2);
         Button b16=(Button)findViewById(R.id.button16);
         Button b15=(Button)findViewById(R.id.button15);
         Button b11=(Button)findViewById(R.id.button11);
         Button b14=(Button)findViewById(R.id.button14);

         b16.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 a=Float.parseFloat(t1.getText().toString());
                 b=Float.parseFloat(t2.getText().toString());
                 c=a-b;
                 tview.setText(Float.toString(c));

             }
         });

         b15.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 a=Float.parseFloat(t1.getText().toString());
                 b=Float.parseFloat(t2.getText().toString());
                 c=a/b;
                 tview.setText(Float.toString(c));

             }
         });
         b11.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 a=Float.parseFloat(t1.getText().toString());
                 b=Float.parseFloat(t2.getText().toString());
                 c=a+b;
                 tview.setText(Float.toString(c));

             }
         });
         b14.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 a=Float.parseFloat(t1.getText().toString());
                 b=Float.parseFloat(t2.getText().toString());
                 c=a*b;
                 tview.setText(Float.toString(c));

             }
         });

    }
}
