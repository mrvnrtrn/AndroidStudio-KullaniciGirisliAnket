package com.example.ceylann.kullanicigirisanket;


public class Veritasima {
        private static String yas1;
        private static String cinsiyet1;
        private static String metin1;
        private static String metin2;

        public Veritasima(String yas,String cinsiyet,String mt1,String mt2){

            yascins(yas,cinsiyet);
            metinfonk(mt1,mt2);


        }
        public void yascins(String yas,String cinsiyet){
            yas1=yas;
            cinsiyet1=cinsiyet;
        }
        public static String yas(){
            return yas1;
        }
        public static String cins()
        {
            return cinsiyet1;
        }
        public void metinfonk(String mt,String mt2){
            metin1=mt;
            metin2=mt2;
        }
        public static String oyun(){

            return metin1;
        }
        public static String oyunsure(){
            return metin2;
        }
    }




