package com.example.bjornrcp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class AddColetaActivity extends AppCompatActivity {

    private EditText edtNome;
    private EditText edtMaterial;
    private EditText edtPeso;
    private Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        edtNome = findViewById(R.id.name);
        edtMaterial = findViewById(R.id.material);
        edtPeso = findViewById(R.id.peso);
        btnSalvar = findViewById(R.id.salvar);

        btnSalvar.setOnClickListener(v -> {
            String resultado = edtNome.getText().toString() + " - " +
                    edtMaterial.getText().toString() + " - " +
                    edtPeso.getText().toString() + "kg";

            Intent intent = new Intent();
            intent.putExtra("coleta", resultado);
            setResult(RESULT_OK, intent);
            finish();
        });
    }
}