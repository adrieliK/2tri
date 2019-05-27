package com.example.aluno.a2tri;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button sobre;
    private Button lab1;
    private Button lab2;
    private ImageButton lab3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sobre= (Button) findViewById(R.id.buttonSobre);
        sobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Indo para outra tela!", Toast.LENGTH_SHORT).show();

                // comando para chamar outra tela
                startActivity(new Intent(MainActivity.this, SobreActivity.class ));
            }
        });

        lab1= (Button) findViewById(R.id.buttonLab1);
        lab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Indo para outra tela!", Toast.LENGTH_SHORT).show();

                // comando para chamar outra tela
                startActivity(new Intent(MainActivity.this, Lab1Activity.class ));
            }
        });
        lab2= (Button) findViewById(R.id.buttonLab2);
        lab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Indo para outra tela!", Toast.LENGTH_SHORT).show();

                // comando para chamar outra tela
                startActivity(new Intent(MainActivity.this, lab2Activity.class ));
            }
        });

        lab3= (Button) findViewById(R.id.buttonLab3);
        lab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Indo para outra tela!", Toast.LENGTH_SHORT).show();

                // comando para chamar outra tela
                startActivity(new Intent(MainActivity.this, lab3Activity.class ));
            }
        });
    }
}
