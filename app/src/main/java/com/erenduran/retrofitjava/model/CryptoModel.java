package com.erenduran.retrofitjava.model;

import com.google.gson.annotations.SerializedName;

public class CryptoModel {
    //model oluşturuldu
    //@SerializedName() db içindeki ismi çekiyor
    @SerializedName("currency")
   public String currency;
    @SerializedName("price")
   public String price;


}
