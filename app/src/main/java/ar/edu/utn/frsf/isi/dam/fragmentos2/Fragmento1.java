package ar.edu.utn.frsf.isi.dam.fragmentos2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragmento1 extends Fragment {

    private RecyclerView myRecicList;

    public Fragmento1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragmento1, container, false);
        List<Tarea> lista = iniciar();
        TareaAdapter tadapter = new TareaAdapter(lista);
        myRecicList = (RecyclerView) v.findViewById(R.id.myRecicList);
        myRecicList.setAdapter(tadapter);
        LinearLayoutManager l1 = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        myRecicList.setLayoutManager(l1);
        return v;
    }

    private List<Tarea> iniciar(){
        Random r = new Random();
        List<Tarea> lista = new ArrayList<>();
        for(int i =0;i<50;i++){
            Tarea t = new Tarea("Tarea "+i,r.nextBoolean(),1+r.nextInt(5));
            lista.add(t);
        }
        return lista;
    }

}
