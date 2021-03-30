package com.erenduran.retrofitjava;

import com.google.gson.annotations.SerializedName;

public class CryptoModel {
    //model oluşturuldu
    //@SerializedName() db içindeki ismi çekiyor
    @SerializedName("currency")
    String currency;
    @SerializedName("price")
    String price;


}
