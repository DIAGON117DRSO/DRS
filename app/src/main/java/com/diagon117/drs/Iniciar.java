package com.diagon117.seriesplay117;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

public class Iniciar extends AppCompatActivity {
    private EditText etn, etp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        etn = (EditText) findViewById(R.id.TextEmail);
        etp = (EditText) findViewById(R.id.TextPassword);

    }

    //metodo para el boton
    public void INICIAR_SESION(View view) {

        String email = etn.getText().toString();
        String password = etp.getText().toString();

        if (email.length() == 0){
            Toast.makeText(this, "ingresa su email", Toast.LENGTH_SHORT).show();
        }
        if (password.length() == 0){
            Toast.makeText(this, "ingresa su contraseña", Toast.LENGTH_SHORT).show();
        }
        if (email.length() != 0 && password.length() != 0){
            Toast.makeText(this, "BIENVENIDOS A SERIESPLAY117", Toast.LENGTH_SHORT).show();
            Intent iniciar_sesion = new Intent(this, Contenido_HD.class);
            startActivity(iniciar_sesion);
        }
    }

}