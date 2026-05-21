package com.example.bjornrcp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView txtDetalhe = findViewById(R.id.txtDetalhe);

        String detalhe = getIntent().getStringExtra("detalhe");
        if (detalhe != null) {
            txtDetalhe.setText(detalhe);
        }
    }
}