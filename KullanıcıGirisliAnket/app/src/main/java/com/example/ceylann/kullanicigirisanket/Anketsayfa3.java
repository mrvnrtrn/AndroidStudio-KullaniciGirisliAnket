package com.example.ceylann.kullanicigirisanket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Anketsayfa3 extends AppCompatActivity {
    TextView t1,t2,t3,t4;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anketsayfa3);
        t1=findViewById(R.id.yassonuc);
        t2=findViewById(R.id.cinsiyetsonuc);
        t3=findViewById(R.id.aglarsonuc);
        t4=findViewById(R.id.suresonuc);
        btn=findViewById(R.id.cikisbtn);
        try {
            String m1 = Veritasima.yas(), m2 = Veritasima.cins(), m3 = Veritasima.oyun(), m4 = Veritasima.oyunsure();
            t1.setText(m1);
            t2.setText(m2);
            t3.setText(m3);
            t4.setText(m4);
        }
        catch (Exception e){


        }
btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        Intent intent =new Intent(Anketsayfa3.this,MainActivity.class);
        startActivity(intent);
    }
});




    }
}
