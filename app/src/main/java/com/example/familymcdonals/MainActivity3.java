package com.example.familymcdonals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
Button youtube,map,home,exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void abriryoutube(View view)
    {
        Intent a=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=-colBB5EvI8"));
        startActivity(a);
    }

    public void mapa(View view)
    {
        Intent a=new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.projectzomboid.com/#11087x9138x9"));
        startActivity(a);
    }

    public void homes(View view)
    {
        Intent a=new Intent(this, MainActivity.class);
        startActivity(a);
    }
    public void goes(View view)
    {
        System.exit(0);
    }
}