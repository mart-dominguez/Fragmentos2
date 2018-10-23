package ar.edu.utn.frsf.isi.dam.fragmentos2;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CambiarTitulo {

    RecyclerView myLv;
    private Button btn1;
    private Button btn2;
    private Button btnEditFrg2;
    private TextView tituloMain;
    private Fragmento1 frg1;
    private Fragmento2 frg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frg1 = new Fragmento1();
        frg2 = new Fragmento2();

        tituloMain= (TextView) findViewById(R.id.tituloMain);
        btn1 = (Button) findViewById(R.id.btnFrg1);
        btn2 = (Button) findViewById(R.id.btnFrg2);
        btnEditFrg2= (Button) findViewById(R.id.btnEditFrg2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                elegirFragmento(1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                elegirFragmento(2);
            }
        });

        btnEditFrg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(frg2.isVisible()){
                    frg2.cambiar(" d");
                }
            }
        });
    }

        Fragment f = null;
        switch (i){
            case 1:
                f = frg1;
                break;
            case 2:
                f = frg2;
                break;
        }

        FragmentManager mngFrg = getSupportFragmentManager();
        mngFrg.beginTransaction()
                .replace(R.id.frgContainer,f)
                .addToBackStack(null)
                .commit();    private void elegirFragmento(Integer i){


        @Override
    public void cambiarTitulo(String s) {
        this.tituloMain.setTextColor(Color.RED);
        this.tituloMain.setText(s);
    }
}
