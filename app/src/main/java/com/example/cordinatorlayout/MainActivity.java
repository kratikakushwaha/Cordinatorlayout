package com.example.cordinatorlayout;

import android.content.Intent;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button button1;
    private CoordinatorLayout coordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   coordinatorLayout=findViewById(R.id.coordinatorLayout);
   button1=findViewById(R.id.btn2);
     button=findViewById(R.id.btn);

     button1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             startActivity(new Intent(MainActivity.this,appbar.class));
         }
     });
    button.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
        Snackbar.make(coordinatorLayout,"snack bar",Snackbar.LENGTH_LONG).setAction("close", new View.OnClickListener() {
               @Override
                public void onClick(View v) {
                }
            }).show();         }
        });

 }
}
