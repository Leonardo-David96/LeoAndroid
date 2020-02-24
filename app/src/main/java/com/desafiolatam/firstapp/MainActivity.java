package com.desafiolatam.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView miImagen = findViewById(R.id.miImagen);

        Picasso.get().load("https://desafiolatam.com/assets/home/logo-academia-bla-790873cdf66b0e681dfbe640ace8a602f5330bec301c409744c358330e823ae3.png").into(miImagen);

        Button mibotoncito = findViewById(R.id.button01);

        mibotoncito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Usuario ingresado con exito", Toast.LENGTH_SHORT).show();

               // intentExample();

            }
        });
    }
        private void intentExample () {
            Intent intent = new Intent(this, Main2Activity.class);
            startActivity(intent);
        }
    }


