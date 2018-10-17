package com.moraprojects.ligaixtlahuacan;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class MainActivity extends AppCompatActivity {

    String arrayNombre[]= {"Tabla","Calendario","Goleadores","Campos","Contacto"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CircleMenu circleMenu = (CircleMenu)findViewById(R.id.circle_menu);
        circleMenu.setMainMenu(Color.parseColor("#999B9B"),R.drawable.ic_menu,R.drawable.ic_close)
                .addSubMenu(Color.parseColor("FFFFFF"),R.drawable.ic_tabla)
                .addSubMenu(Color.parseColor("#9CA6AE"),R.drawable.ic_goleadores)
                .addSubMenu(Color.parseColor("FFFFFF"),R.drawable.calendario)
                .addSubMenu(Color.parseColor("FFFFFF"),R.drawable.ic_localizacion)
                .addSubMenu(Color.parseColor("FFFFFF"),R.drawable.ic_contacto)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int index) {
                        Toast.makeText(MainActivity.this,"Elegiste " + arrayNombre[index], Toast.LENGTH_SHORT);
                    }
                });
    }
}
