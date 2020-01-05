package com.example.ceylann.kullanicigirisanket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Anketsayfa1 extends AppCompatActivity {
    EditText yas;
    RadioButton rb;
    RadioGroup rg;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anketsayfa1);
        yas=findViewById(R.id.yas);
        rg=findViewById(R.id.rg1);

        btn=findViewById(R.id.button);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id=rg.getCheckedRadioButtonId();
                rb=findViewById(id);
                final String yass=yas.getText().toString(), rrr=rb.getText().toString();

                Intent gonderme=new Intent(Anketsayfa1.this,Anketsayfa2.class);
                gonderme.putExtra("yas",yass);
                gonderme.putExtra("cinsiyet",rrr);
                startActivity(gonderme);
            }
        });
    }
    }

