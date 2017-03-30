package com.example.cecyt9.examen1_app_arenas_carrillo_ricardoxochipilli_6im7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    EditText txtCantidad;
    Double resultado;
    Double txtNumero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtCantidad = (EditText) findViewById(R.id.txtCantidad);

    }

    public void Convertir(View v){

        if(txtCantidad.getText().toString().equals("")){

            Toast toast =  Toast.makeText(getApplicationContext(), "Campos vacios", Toast.LENGTH_SHORT);
            toast.show();

        }
        else {

            Intent envia = new Intent(this, actividad_2.class);
            Bundle datos = new Bundle();
            txtNumero = Double.parseDouble(txtCantidad.getText().toString());
            resultado = (txtNumero / 15);
            datos.putDouble("Numero", resultado);
            envia.putExtras(datos);
            finish();
            startActivity(envia);

        }
    }
}

