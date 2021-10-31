package com.example.makanan;

import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;

        import androidx.annotation.NonNull;
        import androidx.recyclerview.widget.RecyclerView;

        import java.util.ArrayList;

public class MakananAdapter extends
        RecyclerView.Adapter<MakananAdapter.MakananViewHolder>{
    private ArrayList<Data> dataList;
    public MakananAdapter(ArrayList<Data> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public MakananAdapter.MakananViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_makanan, parent, false);
        return new MakananViewHolder(view);
    }
    public void onBindViewHolder(MakananViewHolder holder, int position) {
        holder.Foto.setImageResource(dataList.get(position).getFoto());
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtBahan.setText(dataList.get(position).getBahan());
        holder.txtHarga.setText(dataList.get(position).getHarga());
    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class MakananViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtBahan, txtHarga;
        private ImageView Foto;
        public MakananViewHolder(View itemView) {
            super(itemView);
            Foto = (ImageView) itemView.findViewById(R.id.foto);
            txtNama = (TextView)itemView.findViewById(R.id.txt_nama);
            txtBahan = (TextView) itemView.findViewById(R.id.txt_bahan);
            txtHarga = (TextView) itemView.findViewById(R.id.txt_harga);
        }
    }
}

