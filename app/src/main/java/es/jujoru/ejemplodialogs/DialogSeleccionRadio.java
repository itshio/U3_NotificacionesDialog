package es.jujoru.ejemplodialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

/**
 * Created by NINO on 12/02/2018.
 */

public class DialogSeleccionRadio extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        final String[] items = {"Facil", "Dificil", "Leyenda"};

        AlertDialog.Builder builder =
                new AlertDialog.Builder(getActivity());

        builder.setTitle("Selecciona una opcion")
                .setCancelable(true) //Si es false no se puede cancelar.
                .setSingleChoiceItems(items, -1,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int item) {
                                Toast.makeText(getActivity(), "Opción elegida: " + items[item], Toast.LENGTH_SHORT).show();
                            }
                        });

        return builder.create();
    }
}