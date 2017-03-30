package com.example.cecyt9.examen1_app_arenas_carrillo_ricardoxochipilli_6im7;

/**
 * Created by CECyT9 on 30/03/2017.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class actividad_2 extends Activity{

    Double Numero;
    TextView idNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_2);
        idNombre = (TextView) findViewById(R.id.idNombre);
        Bundle recibe = new Bundle();
        recibe = this.getIntent().getExtras();
        Numero = recibe.getDouble("Numero");
        idNombre.setText("Arenas Carrillo Ricardo Xochipilli, resultado: " + "\n" +
                 Numero.toString()
        );
    }

    public void Correo(View correo)
    {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto: Resultado Examen 1");
        intent.putExtra(Intent.EXTRA_TEXT, "Contenido del correo: Arenas Carrillo Ricardo Xochipilli, resultado: " + Numero );
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "eoropezag@ipn.mx"} );
        startActivity(intent);
    }

}
