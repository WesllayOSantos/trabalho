package com.example.brunab.projeto.telas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.brunab.projeto.R;

public class    MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void cadastracliente(View view){
        Intent it = new Intent(MainActivity.this,cadastrar_cliente.class);
        startActivity(it);
    }

}
