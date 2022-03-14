package com.example.formulriodecadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void OnBtnClick (View view) {
        TextView txtNome = findViewById(R.id.txtNome);
        TextView txtEmail = findViewById(R.id.txtEmail);
        TextView txtIdade = findViewById(R.id.txtIdade);

        EditText editNome = findViewById(R.id.editNome);
        EditText editEmail = findViewById(R.id.editEmail);
        EditText editIdade = findViewById(R.id.editIdade);

        txtNome.setText(editNome.getText().toString());
        txtEmail.setText(editEmail.getText().toString());
        txtIdade.setText(editIdade.getText().toString());
    }
}