package mx.unam.aragon.fes.diplo.gitandroid;

import android.app.LauncherActivity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    private  Button boton, boton2, cargaImagen;
    private TextView txtVista;
    String alumno;
    private ImageView img;
    private Bitmap imgDescargar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton = findViewById(R.id.button);
        boton2 = findViewById(R.id.button2);
        txtVista = findViewById(R.id.textView);
        alumno = (String) txtVista.getText();
        img = findViewById(R.id.imageView);
        cargaImagen = findViewById(R.id.button3);


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

        cargaImagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://vignette.wikia.nocookie.net/toontown/images/7/73/Pumpkin_Head.jpg";
                try {
                    new DescargarImagen().execute(new URL(url));
                }catch (MalformedURLException e){
                    e.printStackTrace();
                }
            }
        });
    }

    class DescargarImagen extends AsyncTask<URL,Integer,Bitmap>{
        @Override
        protected Bitmap doInBackground(URL... urls){
            try {
                imgDescargar = BitmapFactory.decodeStream(urls[0].openConnection().getInputStream());
            }catch (Exception e){
                android.util.Log.e("Error en Internet",e.toString());
            }
            return imgDescargar;
        }

        @Override
        protected void onPostExecute(Bitmap bitmap){
            img.setImageBitmap(imgDescargar);
            super.onPostExecute(bitmap);
        }
    }



}
