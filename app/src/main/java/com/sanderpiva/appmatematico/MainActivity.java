package com.sanderpiva.appmatematico;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private android.widget.Button btn1;
    private android.widget.Button btn2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getSupportActionBar().hide();
        /*
        btn1 = findViewById(R.id.btnTeoremaPitagoras);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Pitagoras.class);
                startActivity(intent);
            }
        });

        btn2 = findViewById(R.id.btnAreaQuadrado);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Aquadrado.class);
                startActivity(intent);
            }
        });
        */

        //String[] options = {"Seletor de conteúdos matemáticos", "Teorema de Pitagoras", "Área do quadrado", "Seno, Cosseno, Tangente", "Perimetro quadrado"};
        Spinner spinner = findViewById(R.id.spinner);
        //SpinnerAdapter adapter = new SpinnerAdapter(this, options);
        //android developer
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.seletor_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        //android developer
        //spinner.setOnItemSelectedListener(adapter);
        //codigo chat
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        break;
                    case 1:
                        Intent intent1 = new Intent(MainActivity.this, Pitagoras.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(MainActivity.this, Aquadrado.class);
                        startActivity(intent2);
                        break;
                    // Adicione os outros casos conforme a necessidade
                    case 3:
                        Intent intent3 = new Intent(MainActivity.this, SenoCossenoTangente.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(MainActivity.this, PerimetroQuadrado.class);
                        startActivity(intent4);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Não é necessário implementar nada aqui
            }
        });

    }
}