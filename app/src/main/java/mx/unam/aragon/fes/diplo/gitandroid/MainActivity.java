package mx.unam.aragon.fes.diplo.gitandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private  Button boton, boton2;
    private TextView txtVista, txtVista2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton = findViewById(R.id.button);
        boton2 = findViewById(R.id.button2);
        txtVista = findViewById(R.id.textView);


        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtVista.setText("Bienvenido a Github");
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtVista.setText("Bienvenido al Diplomado Android");
            }
        });
    }



}
