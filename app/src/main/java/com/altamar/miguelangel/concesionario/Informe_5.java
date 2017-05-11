package com.altamar.miguelangel.concesionario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class Informe_5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informe_5);

        ListView listaCarro = (ListView)findViewById(R.id.listCarroCostoso);
        ArrayList<Carro> carroArrayList = Datos.getCarros();
        ArrayList<Carro> resultadoArrayList = new ArrayList<>();
        double costoMayor = Double.parseDouble(carroArrayList.get(0).getPrecio());
        resultadoArrayList.add(carroArrayList.get(0));

        for (int i = 0; i < carroArrayList.size(); i++) {
            double costo = Double.parseDouble(carroArrayList.get(i).getPrecio());
            if (costo > costoMayor){
                costoMayor = costo;
                resultadoArrayList.clear();
                resultadoArrayList.add(carroArrayList.get(i));
            }
        }

        AdaptadorCarro AdaptadorCarro = new AdaptadorCarro(this, resultadoArrayList);
        listaCarro.setAdapter(AdaptadorCarro);
    }

    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_informe_5, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    */
}
