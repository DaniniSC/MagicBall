package com.example.magicball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView ballIV;
    private TextView respuestaTV;

    private String[] respuestaArray = {"Es cierto", "Definitivamente es así", "Sin duda", "Sí definitivamente", "Puede confiar en él", "Como yo lo veo, sí",
            "Lo más probable", "Perspectiva buena", "Sí", "Las señales apuntan a sí", "Respuesta confusa intente de nuevo", "Pregunte de nuevo más tarde",
            "Mejor no decirte ahora", "No puedo predecir ahora", "Concéntrate y pregunta de nuevo", "No cuentes con eso",
            "Mi respuesta es no", "Mis fuentes dicen que no", "Outlook no es tan bueno", "Muy dudoso"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referencia de imagen
        ballIV = findViewById(R.id.boton);
        //referencia texto
        respuestaTV =  findViewById(R.id.respuesta);

        ballIV.setOnClickListener(this);
        Toast.makeText(MainActivity.this, "Buscando tu destino!!", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onClick(View v){
        //creacion metodo switch
        switch (v.getId()){
            case R.id.boton:

               int rand = new Random().nextInt(respuestaArray.length);
               respuestaTV.setText(respuestaArray[rand]);

                break;
        }
    }

}
