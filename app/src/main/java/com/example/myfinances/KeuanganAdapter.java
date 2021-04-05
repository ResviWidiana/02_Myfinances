package com.example.myfinances;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class KeuanganAdapter extends RecyclerView.Adapter<KeuanganAdapter.KeuanganViewHolder>{

    private ArrayList<Keuangan> listKeuangan;

    public KeuanganAdapter(ArrayList<Keuangan> listKeuangan) {
        this.listKeuangan = listKeuangan;
    }

    @NonNull
    @Override
    public KeuanganAdapter.KeuanganViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_keuangan, parent, false);
        return new KeuanganViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KeuanganAdapter.KeuanganViewHolder holder, int position) {
        holder.tvNamaTransaksi.setText(listKeuangan.get(position).getNamaTransaksi());
        holder.tvJenisTransaksi.setText(listKeuangan.get(position).getJenisTransaksi());
        holder.tvTanggal.setText(listKeuangan.get(position).getTanggal());
        holder.tvJumlah.setText(listKeuangan.get(position).getJumlah());
    }

    @Override
    public int getItemCount() {
        return (listKeuangan!= null) ?  listKeuangan.size() : 0 ;
    }

    public class KeuanganViewHolder extends RecyclerView.ViewHolder{

        private TextView tvNamaTransaksi, tvJenisTransaksi, tvTanggal, tvJumlah;
        public KeuanganViewHolder (View view){
            super(view);
            tvNamaTransaksi = view.findViewById(R.id.tv_namaTransaksi);
            tvJenisTransaksi = view.findViewById(R.id.tv_jenisTransaksi);
            tvTanggal = view.findViewById(R.id.tv_tanggal);
            tvJumlah = view.findViewById(R.id.tv_jumlah);
        }
    }
}
