package es.jujoru.ejemplodialogs;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void dialogAlerta(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        DialogAlerta dialogo = new DialogAlerta();
        dialogo.show(fragmentManager, "dialogAlerta");
    }

    public void dialogConfiramcion(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        DialogConfirmacion dialogo = new DialogConfirmacion();
        dialogo.show(fragmentManager, "dialogConfirmacino");
    }

    public void dialogSeleccion(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();

        DialogSeleccion dialogo = new DialogSeleccion();
        dialogo.show(fragmentManager, "dialogSeleccion");
    }
    public void dialogSeleccionRadio(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        DialogSeleccionRadio dialogo = new DialogSeleccionRadio();

        dialogo.show(fragmentManager, "dialogSeleccion");
    }
    public void dialogMultiSeleccion(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        DialogMultiSeleccion dialogo = new DialogMultiSeleccion();

        dialogo.show(fragmentManager, "dialogMultiSeleccion");
    }

    public void dialogPersonalizado(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        DialogPersonalizado dialogo = new DialogPersonalizado();

        dialogo.show(fragmentManager, "dialogPersonalizado");
    }
}
