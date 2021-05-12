package com.erenduran.retrofitjava.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.erenduran.retrofitjava.R;
import com.erenduran.retrofitjava.model.CryptoModel;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RowHolder> {

    private ArrayList<CryptoModel> cryptoList;
    private String[] colors={"#a3ff00","#ff00aa","#b4a7d6","#a4c2f4","#8ee5ee","#cd950c","#ee3b3b","#f47932"};

    public RecyclerViewAdapter(ArrayList<CryptoModel> cryptoList) {
        this.cryptoList = cryptoList;
    }

    @NonNull
    @Override
    public RowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {// row layout ile recyclerView i bağlama işlemi
      // inflaterler oluşturulan farklı xml leri sınıfa bağlamayı sağlıyor
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_layout,parent,false);
        return new RowHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RowHolder holder, int position) {
        // görünümleri ViewHolder da tanımlayıp burada bağlama işlemi yapılıyor
        // hangi pozisyonda ne görülsün vs işlemleri sağlanıyor

        holder.bind(cryptoList.get(position),colors,position);

    }

    @Override
    public int getItemCount() { // kaç tane row oluşturulacak onu söylüyoruz kaç tane veri geliyorsa o kadar oluşturacak
        return cryptoList.size();
    }

    public class RowHolder extends RecyclerView.ViewHolder {
        TextView textName;
        TextView textPrice;

        public RowHolder(@NonNull View itemView) {
            super(itemView);

        }
        public void bind(CryptoModel cryptoModel,String[] colors, Integer position) {
            itemView.setBackgroundColor(Color.parseColor(colors[position % 8]));
            textName = itemView.findViewById(R.id.text_name);    // oluşturulan row layouttaki görünümler
            textPrice = itemView.findViewById(R.id.text_price); // ile buradaki değişkenleri bağlama sağlandı
            textName.setText(cryptoModel.currency);
            textPrice.setText(cryptoModel.price);
        }
    }
}
