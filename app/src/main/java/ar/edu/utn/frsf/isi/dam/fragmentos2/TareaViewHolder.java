package ar.edu.utn.frsf.isi.dam.fragmentos2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.TextView;

/**
 * Created by martdominguez on 05/10/17.
 */

public class TareaViewHolder extends RecyclerView.ViewHolder {

    SwitchCompat terminada;
    TextView titulo;
    TextView prioidad;

    public TareaViewHolder(View itemView) {
        super(itemView);
        titulo = (TextView) itemView.findViewById(R.id.lblTituloTarea);
        prioidad = (TextView) itemView.findViewById(R.id.lblPrioridad);
        terminada = (SwitchCompat) itemView.findViewById(R.id.terminada);
    }

    public void setearDatos(Tarea t){
        this.titulo.setText(t.getTitulo());
        this.prioidad.setText("Importancia "+t.getPrioridad());
        this.terminada.setChecked(t.getHecha());
    }
}
