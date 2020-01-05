package com.example.ceylann.kullanicigirisanket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;



public class MainActivity extends AppCompatActivity {
    String kullanici="",sifre="";
    Button giris,kayit;
    EditText ad,k_sifre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      giris=findViewById(R.id.girisbtn);
      kayit=findViewById(R.id.kayit_olbtn);
      ad=findViewById(R.id.k_adi);
      k_sifre=findViewById(R.id.sifre);



      giris.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              String adi=ad.getText().toString();
              String sifresi=k_sifre.getText().toString();
              try{
                  Intent intent=getIntent();
                  kullanici=intent.getStringExtra("k_adi");

                  sifre=intent.getStringExtra("sifre");

              }
              catch(Exception e){

              }
              if(adi.equals("") && sifresi.equals("")){
                  Intent gecis=new Intent(MainActivity.this,Main2Activity.class);
                  startActivity(gecis);
              }

            else if(adi.equals(kullanici) && sifresi.equals(sifre)){
                  Intent gecis=new Intent(MainActivity.this,Anketsayfa1.class);
                  startActivity(gecis);

              }
              else{
                  Toast.makeText(getApplicationContext(),"Hata",Toast.LENGTH_SHORT).show();
                  ad.setText("");
                  k_sifre.setText("");
              }
          }
      });


      kayit.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent gecis=new Intent(MainActivity.this,Main2Activity.class);
              startActivity(gecis);
          }
      });
    }
}
