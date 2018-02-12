package es.jujoru.ejemplodialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by NINO on 12/02/2018.
 */

public class DialogPersonalizado extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        final View viewLayout = inflater.inflate(R.layout.dialog_personalizado,null);
        builder.setView(viewLayout)
                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        EditText etDialog = (EditText) viewLayout.findViewById(R.id.dpEtNombre);
                        String valor = etDialog.getText().toString();
                        Toast.makeText(getActivity(), "Valor: " + valor, Toast.LENGTH_SHORT).show();

                        dialog.cancel();
                    }
                });

        return builder.create();
    }
}
