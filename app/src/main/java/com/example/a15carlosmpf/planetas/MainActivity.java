package com.example.a15carlosmpf.planetas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private MyArrayAdapter adapter;
    private ListView lvAnimales;
    private String[] listaAnimales;
    private Integer[] listaIdFotos;
    private String[] listaDescripciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvAnimales= (ListView)findViewById(R.id.lvAnimales);

        listaAnimales=getResources().getStringArray(R.array.animales);

        listaDescripciones=getResources().getStringArray(R.array.descripciones);

        listaIdFotos=new Integer[8];
        listaIdFotos[0]=R.drawable.aguila;
        listaIdFotos[1]=R.drawable.ballena;
        listaIdFotos[2]=R.drawable.caballo;
        listaIdFotos[3]=R.drawable.canario;
        listaIdFotos[4]=R.drawable.delfin;
        listaIdFotos[5]=R.drawable.gato;
        listaIdFotos[6]=R.drawable.perro;
        listaIdFotos[7]=R.drawable.vaca;



        adapter= new MyArrayAdapter(MainActivity.this,listaAnimales,listaDescripciones, listaIdFotos);
        lvAnimales.setAdapter(adapter);

        lvAnimales.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Elección: " + parent.getItemAtPosition(i), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
