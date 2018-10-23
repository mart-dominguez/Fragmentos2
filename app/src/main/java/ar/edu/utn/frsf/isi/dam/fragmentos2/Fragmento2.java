package ar.edu.utn.frsf.isi.dam.fragmentos2;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragmento2 extends Fragment {

    Button btn2;
    TextView texto;
    private CambiarTitulo cambiarTituloListener;

    public Fragmento2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View laVistaNueva =inflater.inflate(R.layout.fragment_fragmento2, container, false);
        btn2 = (Button) laVistaNueva.findViewById(R.id.btnActionFg2);
        texto = (TextView) laVistaNueva.findViewById(R.id.textoFg2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragmento2.this.cambiarTituloListener.cambiarTitulo(" Click desde fragmento 2");
            }
        });
        return laVistaNueva;
    }

    public void cambiar(String texto){
        this.texto.setText(texto.toUpperCase());
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof  CambiarTitulo){
            this.cambiarTituloListener = (CambiarTitulo) context;
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        this.cambiarTituloListener=null;
    }
}
