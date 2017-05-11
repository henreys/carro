package com.altamar.miguelangel.concesionario;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Reportar extends AppCompatActivity {

    private ListView ls;
    private Resources res;
    private String[] opc;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportar);

        ls=(ListView)findViewById(R.id.lstInformes);
        res=this.getResources();
        opc=res.getStringArray(R.array.Informes_array);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,opc);
        ls.setAdapter(adapter);

        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        i = new Intent(Reportar.this, Informe_1.class);
                        startActivity(i);
                        break;
                    case 1:
                        i = new Intent(Reportar.this, Informe_2.class);
                        startActivity(i);
                        break;
                    case 2:
                        i = new Intent(Reportar.this, Informe_3.class);
                        startActivity(i);
                        break;
                    case 3:
                        i = new Intent(Reportar.this, Informe_4.class);
                        startActivity(i);
                        break;
                    case 4:
                        i = new Intent(Reportar.this, Informe_5.class);
                        startActivity(i);
                        break;
                    case 5:
                        i = new Intent(Reportar.this, Informe_6.class);
                        startActivity(i);
                        break;
                }
            }
        });
    }

    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_reportar, menu);
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
