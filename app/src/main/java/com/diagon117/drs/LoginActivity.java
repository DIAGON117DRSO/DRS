package com.diagon117.seriesplay117;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    //Metodo el boton iniciar
    public void iniciar_sesion (View view){
        Intent iniciar_sesion = new Intent(this, Iniciar.class);
        startActivity(iniciar_sesion);
    }

    //Metodo el boton Register
    public void Register (View view){
        Intent Register = new Intent(this, Register.class);
        startActivity(Register);
    }
}