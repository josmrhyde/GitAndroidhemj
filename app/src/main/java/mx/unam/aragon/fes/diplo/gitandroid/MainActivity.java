package mx.unam.aragon.fes.diplo.gitandroid;

import android.app.LauncherActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private  Button boton, boton2;
    private TextView txtVista;
    String alumno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton = findViewById(R.id.button);
        boton2 = findViewById(R.id.button2);
        txtVista = findViewById(R.id.textView);
        alumno = (String) txtVista.getText();


        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtVista.setText("Bienvenido a Github "+alumno);
                Toast.makeText(MainActivity.this,"Se cambio el mensaje en el textView con el botón Github", Toast.LENGTH_SHORT).show();
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtVista.setText("Bienvenido al Diplomado Android "+alumno);
                Toast.makeText(MainActivity.this,"Se cambio el mensaje en el textView con el botón Diplomado", Toast.LENGTH_SHORT).show();
            }
        });
    }



}
