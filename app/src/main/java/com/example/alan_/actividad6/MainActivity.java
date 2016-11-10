package com.example.alan_.actividad6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import static android.R.attr.id;
import static android.app.ProgressDialog.show;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.im_ajustes:
                Toast.makeText(getApplicationContext(),"Ajustes", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.im_buscar:
                Toast.makeText(getApplicationContext(),"Buscar", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.im_fav:
                Toast.makeText(getApplicationContext(),"Favoritos", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.im_pf:
                Toast.makeText(getApplicationContext(),"Preguntas frecuentes", Toast.LENGTH_SHORT).show();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}