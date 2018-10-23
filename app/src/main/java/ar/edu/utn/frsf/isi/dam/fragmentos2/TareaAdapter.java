package ar.edu.utn.frsf.isi.dam.fragmentos2;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by martdominguez on 05/10/17.
 */

public class TareaAdapter extends RecyclerView.Adapter<TareaViewHolder> {

    private List<Tarea> lista;

    public TareaAdapter(List<Tarea> lista){
        this.lista = lista;
    }

    @Override
    public TareaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.lista_layout, parent, false);
        TareaViewHolder t = new TareaViewHolder(itemView);
        return t;
    }

    @Override
    public void onBindViewHolder(TareaViewHolder holder, int position) {
        holder.setearDatos(this.lista.get(position));
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }
}
