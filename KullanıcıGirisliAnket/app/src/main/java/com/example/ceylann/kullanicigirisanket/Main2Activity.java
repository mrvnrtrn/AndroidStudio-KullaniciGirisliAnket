package com.example.ceylann.kullanicigirisanket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
EditText kullanici,sifre1,sifre2;
Button kayit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        kullanici=findViewById(R.id.kayit_kullanici);
        sifre1=findViewById(R.id.kayit_sifre1);
        sifre2=findViewById(R.id.kayit_sifre2);
        kayit =findViewById(R.id.kayit_btn);


        kayit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=sifre1.getText().toString();
                String s2=sifre2.getText().toString();
                String k=kullanici.getText().toString();

                if(s1.equals(s2) && !s2.equals("") && !k.equals("")){
                    Intent intent=new Intent(Main2Activity.this,MainActivity.class);
                    intent.putExtra("k_adi",k);
                    intent.putExtra("sifre",s1);
                    Toast.makeText(getApplicationContext(),"Kayıt Başarılı",Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }else{

                    Toast.makeText(getApplicationContext(),"Hata",Toast.LENGTH_SHORT).show();
                    kullanici.setText("");
                    sifre1.setText("");
                    sifre2.setText("");

                }
                }
        });




    }
}
