package com.example.mytrackerappfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RouteActivity extends AppCompatActivity {

    Button btnMotijheel,btnUttara, btnMirpur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_route );

        btnMirpur = findViewById( R.id.btnMirpur );
        btnMotijheel = findViewById( R.id.btnMotijheel );
        btnUttara = findViewById( R.id.btnUttara );



        btnUttara.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RouteActivity.this, RouteMotijheelActivity.class));
            }
        } );

        btnMotijheel.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(RouteActivity.this,RouteUttaraActivity.class) );
            }
        } );

        btnMirpur.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(RouteActivity.this,RouteMirpurActivity.class) );
            }
        } );
    }


}
