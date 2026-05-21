package com.example.bjornrcp;  // ATENÇÃO: bjornrcp (com j)

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE = 1;
    private ArrayList<String> dados;
    private ArrayAdapter<String> adapter;
    private ListView lista;
    private Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Conectar as views
        lista = findViewById(R.id.lista);
        btnAdd = findViewById(R.id.btnAdd);

        // Inicializar lista
        dados = new ArrayList<>();

        // Dados iniciais
        dados.add("Joao - Plastico - 120kg");
        dados.add("Maria - Papel - 80kg");

        // Configurar adapter
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dados);
        lista.setAdapter(adapter);

        // Botão adicionar
        btnAdd.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AddColetaActivity.class);
            startActivityForResult(intent, REQUEST_CODE);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK) {
            String novaColeta = data.getStringExtra("coleta");
            if (novaColeta != null) {
                dados.add(novaColeta);
                adapter.notifyDataSetChanged();
            }
        }
    }
}