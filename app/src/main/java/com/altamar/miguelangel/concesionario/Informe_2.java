package com.altamar.miguelangel.concesionario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Informe_2 extends AppCompatActivity {

    private ArrayList<Carro> carroArrayList;
    private TextView kiaText, chevroletText, renaultText;
    int kia = 0, chevrolet = 0, renault = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informe_2);

        carroArrayList = Datos.getCarros();

        for (int i = 0; i < carroArrayList.size(); i++) {
            if(carroArrayList.get(i).getMarca().equals("Kia")){
                kia++;
            }else if (carroArrayList.get(i).getMarca().equals("Chevrolet")){
                chevrolet++;
            }else {
                renault++;
            }
        }

        kiaText = (TextView)findViewById(R.id.txtCarrosKia);
        chevroletText = (TextView)findViewById(R.id.txtCarrosChevrolet);
        renaultText = (TextView)findViewById(R.id.txtCarrosRenault);

        kiaText.setText(String.valueOf(kia));
        chevroletText.setText(String.valueOf(chevrolet));
        renaultText.setText(String.valueOf(renault));
    }

    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_informe_2, menu);
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
