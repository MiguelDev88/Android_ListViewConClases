package com.example.a15carlosmpf.planetas;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by a15carlosmpf on 03/02/2017.
 */
public class MyArrayAdapter extends ArrayAdapter<String>{

    private Activity context;
    private List <Animal>animales;
    private Objects[] a;

    public MyArrayAdapter (Activity context,List animales) {
        super(context,R.layout.fila,animales);
        this.context=context;
        this.animales=animales;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //voy a crear mi vista bonita:

        LayoutInflater inflater = context.getLayoutInflater();
        View fila = inflater.inflate(R.layout.fila, null);

        TextView tvAnimal = (TextView)fila.findViewById(R.id.tvAnimal);
        ImageView imgAnimal=(ImageView)fila.findViewById(R.id.imgAnimal);
        TextView tvDescripcion=(TextView)fila.findViewById(R.id.tvDescripcion);

        imgAnimal.setImageResource(animales.get(position).getFoto());
        tvAnimal.setText(animales.get(position).getNombre());
        tvDescripcion.setText(animales.get(position).getDescripcion());


        return fila;
    }
}
