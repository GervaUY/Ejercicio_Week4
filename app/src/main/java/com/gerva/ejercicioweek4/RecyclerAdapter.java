package com.gerva.ejercicioweek4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter <RecyclerAdapter.ViewHolderMascotas> {
    @NonNull
    ArrayList<Mascota> listMascotas;

    public RecyclerAdapter(@NonNull ArrayList<Mascota> listMascotas) {
        this.listMascotas = listMascotas;
    }


    @Override
    public ViewHolderMascotas onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.elmento_lista_mascotas,null,false);
        return new ViewHolderMascotas(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderMascotas holder, int position) {
        holder.nombreMascota.setText(listMascotas.get(position).getNombre());
        holder.foto.setImageResource(listMascotas.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return  listMascotas.size();
    }

    public class ViewHolderMascotas extends RecyclerView.ViewHolder {
        TextView nombreMascota;
        ImageView foto;

        public ViewHolderMascotas(@NonNull View itemView) {
            super(itemView);
            nombreMascota = (TextView) itemView.findViewById(R.id.nombreMascota);
            foto = (ImageView) itemView.findViewById(R.id.fotoMascota);

        }


    }
}
