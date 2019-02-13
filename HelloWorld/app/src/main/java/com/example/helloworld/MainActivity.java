package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView m_text;
    private Button m_button;
    private Button but0;
    private Button but1;
    private Button but2;
    private Button but3;
    private Button but4;
    private Button but5;
    private Button but6;
    private Button but7;
    private Button but8;
    private Button but9;
    private Button butsum;
    private Button butminus;
    private Button butmul;
    private Button butdiv;
    private Button buteq;
    private int suma=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m_text=findViewById(R.id.Hello_World);
        m_button=findViewById(R.id.button);
        but2=findViewById(R.id.but2);
        but1=findViewById(R.id.but1);
        butsum=findViewById(R.id.butsum);
        buteq=findViewById(R.id.butequal);

        m_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                m_text.setText("Adios");
            }

        });
        but1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                suma+=1;
            }
        });
        but2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                suma+=2;
            }
        });
        buteq.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                m_text.setText(String.valueOf(suma));
            }

        });



    }
}
