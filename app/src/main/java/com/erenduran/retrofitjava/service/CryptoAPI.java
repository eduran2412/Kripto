package com.erenduran.retrofitjava.service;

import com.erenduran.retrofitjava.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {


    //URL BASE--> https://api.nomics.com/v1/
    //GET İÇİN KULLANILAN EK --> prices?key=09b342bbcce01a8f095f65ba8f174f2a

    @GET("prices?key=09b342bbcce01a8f095f65ba8f174f2a")  // bu adrese bir get isteği yolla sonra
    // Observable; gözlemlenebilir bir obje oluşturulacak ve bu obje yayın yapacak
    Observable<List<CryptoModel>> getData();



   // Call<List<CryptoModel>> getData();                  // bir call yap bu call da asynchronous yapılacak
                                                       // ve bana bir liste içinde kripto modelleri gelecek
}