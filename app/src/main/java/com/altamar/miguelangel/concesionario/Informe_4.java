package com.altamar.miguelangel.concesionario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class Informe_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informe_4);

        ListView listaCarros = (ListView)findViewById(R.id.listCarrosModelos);
        ArrayList<Carro> carroArrayList = Datos.getCarros();
        ArrayList<Carro> resultadosArrayList = new ArrayList<>();

        for (int i = 0; i < carroArrayList.size(); i++) {
            int modelo = Integer.parseInt(carroArrayList.get(i).getModelo());
            if (modelo >= 2010 && modelo <= 2015){
                resultadosArrayList.add(carroArrayList.get(i));
            }
        }

        AdaptadorCarro AdaptadorCarro = new AdaptadorCarro(this, resultadosArrayList);
        listaCarros.setAdapter(AdaptadorCarro);
    }

    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_informe_4, menu);
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
