package com.diagon117.seriesplay117;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    private EditText etn, etp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        etn = (EditText) findViewById(R.id.TextNombre);
        etp = (EditText) findViewById(R.id.TextApellido);
        etn = (EditText) findViewById(R.id.TextEmail2);
        etp = (EditText) findViewById(R.id.TextPassword2);

    }

    //metodo para el boton
    public void REGISTER(View view) {

        String nombre = etn.getText().toString();
        String apellido = etp.getText().toString();
        String email = etn.getText().toString();
        String password = etp.getText().toString();


        if (nombre.length() == 0){
            Toast.makeText(this, "ingresa su email", Toast.LENGTH_SHORT).show();
        }
        if (apellido.length() == 0){
            Toast.makeText(this, "ingresa su contraseña", Toast.LENGTH_SHORT).show();
        }
        if (email.length() == 0){
            Toast.makeText(this, "ingresa su email", Toast.LENGTH_SHORT).show();
        }
        if (password.length() == 0){
            Toast.makeText(this, "ingresa su contraseña", Toast.LENGTH_SHORT).show();
        }
        if (nombre.length() != 0 && apellido.length() != 0 && email.length() != 0 && password.length() != 0){
            Toast.makeText(this, "REGISTRANDOSE EN SERIESPLAY117", Toast.LENGTH_SHORT).show();
            Intent iniciar_sesion = new Intent(this, Contenido_HD.class);
            startActivity(iniciar_sesion);
        }

    }
}