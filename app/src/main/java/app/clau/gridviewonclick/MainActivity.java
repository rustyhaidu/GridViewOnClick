package app.clau.gridviewonclick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MyRecyclerViewAdapter.ItemClickListener {

    int[] data;
    String[] arrayOfLyrics;
    MyRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // data to populate the RecyclerView with
        // String[] data = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48"};

        data = createIntData(300);
        createArrayOfLyrics(300);

        // set up the RecyclerView
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvNumbers);
        int numberOfColumns = 6;
        recyclerView.setLayoutManager(new GridLayoutManager(this, numberOfColumns));
        adapter = new MyRecyclerViewAdapter(this, data);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        Log.i("TAG", "You clicked number " + adapter.getItem(position) + ", which is at         cell position " + position);
        Toast.makeText(this,
                "You clicked number " + adapter.getItem(position) + ",which is at cell position " + position,
                Toast.LENGTH_LONG).show();

        Intent intent = new Intent();
        intent.setClass(MainActivity.this, SongLyrics.class);

        String lyrics = arrayOfLyrics[position];
        intent.putExtra("position", lyrics);

        startActivity(intent);
    }

    private int[] createIntData(int gridViewLength) {

        data = new int[gridViewLength];
        for (int i = 0; i < gridViewLength; i++) {
            data[i] = i;
        }

        return data;

    }

    private String[] createArrayOfLyrics(int numberOfSongs) {

        arrayOfLyrics = new String[numberOfSongs];

        for (int i = 0; i < numberOfSongs; i++) {
            arrayOfLyrics[i] = "Lyrics\n" + "{[" + i + "]}" +
                    "Ay \n" +
                    "Fonsi \n" +
                    "DY \n" +
                    "Oh\n" +
                    "Oh no, oh no\n" +
                    "Oh yeah\n" +
                    "Diridiri, dirididi Daddy \n" +
                    "Go\n" +
                    "Sí, sabes que ya llevo un rato mirándote \n" +
                    "Tengo que bailar contigo hoy (DY) \n" +
                    "Vi que tu mirada ya estaba llamándome \n" +
                    "Muéstrame el camino que yo voy (Oh)\n" +
                    "Tú, tú eres el imán y yo soy el metal \n" +
                    "Me voy acercando y voy armando el plan \n" +
                    "Solo con pensarlo se acelera el pulso (Oh yeah)\n" +
                    "Ya, ya me está gustando más de lo normal \n" +
                    "Todos mis sentidos van pidiendo más \n" +
                    "Esto hay que tomarlo sin ningún apuro\n" +
                    "Despacito \n" +
                    "Quiero respirar tu cuello despacito \n" +
                    "Deja que te diga cosas al oído \n" +
                    "Para que te acuerdes si no estás conmigo\n" +
                    "Despacito \n" +
                    "Quiero desnudarte a besos despacito \n" +
                    "Firmo en las paredes de tu laberinto \n" +
                    "Y hacer de tu cuerpo todo un manuscrito (sube, sube, sube)\n" +
                    "(Sube, sube)\n" +
                    "Quiero ver bailar tu pelo \n" +
                    "Quiero ser tu ritmo \n" +
                    "Que le enseñes a mi boca \n" +
                    "Tus lugares favoritos (favoritos, favoritos baby)\n" +
                    "Déjame sobrepasar tus zonas de peligro \n" +
                    "Hasta provocar tus gritos \n" +
                    "Y que olvides tu apellido (Diridiri, dirididi Daddy)\n" +
                    "Si te pido un beso ven dámelo \n" +
                    "Yo sé que estás pensándolo \n" +
                    "Llevo tiempo intentándolo \n" +
                    "Mami, esto es dando y dándolo \n" +
                    "Sabes que tu corazón conmigo te hace bom, bom \n" +
                    "Sabes que esa beba está buscando de mi bom, bom \n" +
                    "Ven prueba de mi boca para ver cómo te sabe \n" +
                    "Quiero, quiero, quiero ver cuánto amor a ti te cabe \n" +
                    "Yo no tengo prisa, yo me quiero dar el viaje \n" +
                    "Empecemos lento, después salvaje\n" +
                    "Pasito a pasito, suave suavecito \n" +
                    "Nos vamos pegando poquito a poquito \n" +
                    "Cuando tú me besas con esa destreza \n" +
                    "Veo que eres malicia con delicadeza\n" +
                    "Pasito a pasito, suave suavecito \n" +
                    "Nos vamos pegando, poquito a poquito \n" +
                    "Y es que esa belleza es un rompecabezas \n" +
                    "Pero pa montarlo aquí tengo la pieza\n" +
                    "Despacito \n" +
                    "Quiero respirar tu cuello despacito \n" +
                    "Deja que te diga cosas al oído \n" +
                    "Para que te acuerdes si no estás conmigo\n" +
                    "Despacito \n" +
                    "Quiero desnudarte a besos despacito \n" +
                    "Firmo en las paredes de tu laberinto \n" +
                    "Y hacer de tu cuerpo todo un manuscrito (sube, sube, sube)\n" +
                    "(Sube, sube)\n" +
                    "Quiero ver bailar tu pelo \n" +
                    "Quiero ser tu ritmo \n" +
                    "Que le enseñes a mi boca \n" +
                    "Tus lugares favoritos (favoritos, favoritos baby)\n" +
                    "Déjame sobrepasar tus zonas de peligro \n" +
                    "Hasta provocar tus gritos \n" +
                    "Y que olvides tu apellido\n" +
                    "Despacito \n" +
                    "Vamos a hacerlo en una playa en Puerto Rico \n" +
                    "Hasta que las olas griten \"¡ay, bendito!\" \n" +
                    "Para que mi sello se quede contigo\n" +
                    "Pasito a pasito, suave suavecito \n" +
                    "Nos vamos pegando, poquito a poquito \n" +
                    "Que le enseñes a mi boca \n" +
                    "Tus lugares favoritos (favoritos, favoritos baby)\n" +
                    "Pasito a pasito, suave suavecito \n" +
                    "Nos vamos pegando, poquito a poquito \n" +
                    "Hasta provocar tus gritos \n" +
                    "Y que olvides tu apellido (DY)\n" +
                    "Despacito";
        }

        return arrayOfLyrics;

    }

}