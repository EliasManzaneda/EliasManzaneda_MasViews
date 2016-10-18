package masviews.example.org.masviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MasViewsActivity extends AppCompatActivity {
    private EditText entrada;
    private TextView salida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mas_views);

        entrada = (EditText)findViewById(R.id.entrada);
        salida = (TextView)findViewById(R.id.salida);
    }


    public void sePulsa(View view){
        try{
            String textoSalida = String.valueOf(Float.parseFloat(entrada.getText().toString())*2.0);
            salida.setText(textoSalida);
        }catch (Exception e){
            Toast.makeText(getApplicationContext(), "Seleccione primero un valor.", Toast.LENGTH_LONG).show();
        }

    }

    public void sePulsa0(View view){
        String textoEntrada = entrada.getText() + (String)view.getTag();
        entrada.setText(textoEntrada);
    }
}
