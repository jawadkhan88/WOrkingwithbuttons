package com.example.workingwithbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onclickgraphics(View v)
    {
        Intent i = new Intent(this,graphicsparams.class);
        startActivity(i);
    }
    public void onclickGraphics(View v)
    {
      Intent i=new Intent(this, graphics2.class);
      startActivity(i);
    }
}
