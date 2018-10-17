package com.moraprojects.ligaixtlahuacan;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;
import com.hitomi.cmlibrary.OnMenuStatusChangeListener;


public class MainActivity extends AppCompatActivity {

CircleMenu circleMenu;
String color = "#a3bbcc";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        circleMenu = (CircleMenu) findViewById(R.id.circle_menu);

        circleMenu.setMainMenu(Color.parseColor("#6B7782"), R.drawable.ic_menu, R.drawable.ic_close);
        circleMenu.addSubMenu(Color.parseColor(color), R.drawable.ic_tabla)
                .addSubMenu(Color.parseColor(color), R.drawable.ic_goleadores)
                .addSubMenu(Color.parseColor(color), R.drawable.ic_calendario)
                .addSubMenu(Color.parseColor(color), R.drawable.ic_localizacion)
                .addSubMenu(Color.parseColor(color), R.drawable.ic_contacto);


        circleMenu.setOnMenuSelectedListener(new OnMenuSelectedListener() {

                                                 @Override
                                                 public void onMenuSelected(int index) {
                                                     switch (index) {
                                                         case 0:
                                                             Toast.makeText(MainActivity.this, "Elegiste tabla general", Toast.LENGTH_SHORT).show();
                                                             break;
                                                         case 1:
                                                             Toast.makeText(MainActivity.this, "Elegiste Goleadores", Toast.LENGTH_SHORT).show();
                                                             break;
                                                         case 2:
                                                             Toast.makeText(MainActivity.this, "Elegiste Calendario", Toast.LENGTH_SHORT).show();
                                                             break;
                                                         case 3:
                                                             Toast.makeText(MainActivity.this, "Elegiste Ubicaciones", Toast.LENGTH_SHORT).show();
                                                             break;
                                                         case 4:
                                                             Toast.makeText(MainActivity.this, "Elegiste Contacto", Toast.LENGTH_SHORT).show();
                                                             break;
                                                     }
                                                 }
                                             }
        );



         circleMenu.setOnMenuStatusChangeListener(new OnMenuStatusChangeListener() {

             @Override
             public void onMenuOpened() {
                 Toast.makeText(MainActivity.this, "BIENVENIDO!", Toast.LENGTH_SHORT).show();
             }

             @Override
             public void onMenuClosed() {
                 Toast.makeText(MainActivity.this, "Menu cerrado", Toast.LENGTH_SHORT).show();
             }

         }
        );
    }//OnCreate

        @Override
        public void onBackPressed() {
            if (circleMenu.isOpened())
                circleMenu.closeMenu();
            else
                finish();
        }

    }



