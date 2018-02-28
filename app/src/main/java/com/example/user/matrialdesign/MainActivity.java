package com.example.user.matrialdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
toolbar=findViewById(R.id.toolbar);
  setSupportActionBar(toolbar);
  toolbar.setTitle("Martial Design Tutorial ");
    toolbar.setNavigationIcon(R.drawable.back);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String mess="";
        switch(item.getItemId()){
            case R.id.search:
                mess="Search";
                break;
            case R.id.delete:
                mess="delete";
                break;
            case R.id.setting:
                mess="setting";
                break;
            case R.id.bluetooth:
                mess="bluetooth";
                break;
        }
        Toast.makeText(getApplicationContext(),mess+ "  Clicked",Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }
}
