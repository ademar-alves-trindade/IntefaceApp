package br.com.ademar.intefaceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText txtnum1;
    private EditText txtnum2;
    private TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnum1 = (EditText) findViewById(R.id.editNum1);
        txtnum2 = findViewById(R.id.editNum2);
        tvResult = findViewById(R.id.ResultadoView);
    }

    public void Calcular(View view) {

        int valor1 = Integer.parseInt(txtnum1.getText().toString());



    }
}