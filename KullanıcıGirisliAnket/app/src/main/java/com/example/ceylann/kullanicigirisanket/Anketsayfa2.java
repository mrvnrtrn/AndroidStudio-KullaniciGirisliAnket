package com.example.ceylann.kullanicigirisanket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Anketsayfa2 extends AppCompatActivity {
    Button btn;
    CheckBox c1,c2,c3,c4;

    RadioGroup rg;
    RadioButton rb;

    String msj1="",msj2="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anketsayfa2);

        btn=findViewById(R.id.button2);
        c1=findViewById(R.id.s1c1);
        c2=findViewById(R.id.s1c2);
        c3=findViewById(R.id.s1c3);
        c4=findViewById(R.id.s1c4);
        rg=findViewById(R.id.rg2);
        try{
            Intent intent =getIntent();
            msj1=intent.getStringExtra("yas");
            msj2=intent.getStringExtra("cinsiyet");
        }catch(Exception e){

        }

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int r_id=rg.getCheckedRadioButtonId();
                rb=findViewById(r_id);
                String metin ="";
                String metin2=rb.getText().toString();
                if(c1.isChecked())
                    metin =c1.getText().toString();
                if(c2.isChecked())
                    metin =metin+"\n"+c2.getText().toString();
                if(c3.isChecked())
                    metin =metin+"\n"+c3.getText().toString();
                if(c4.isChecked())
                    metin =metin+"\n"+c4.getText().toString();
                try{
                    Veritasima veri=new Veritasima(msj1,msj2,metin,metin2);

                }catch (Exception e){

                    Toast.makeText(getApplicationContext(),"hata",Toast.LENGTH_LONG).show();

                }
                Intent gonder=new Intent(Anketsayfa2.this,Anketsayfa3.class);
                startActivity(gonder);
            }
        });

    }



    }

