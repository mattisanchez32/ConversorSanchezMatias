package com.example.conversorsanchezmatias;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    EditText etDolar,et2,et3;
    RadioButton rb1,rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etDolar=(EditText) findViewById(R.id.etDolares);
        et2=(EditText) findViewById(R.id.etEuros);
        rb1=(RadioButton) findViewById(R.id.rbDolar);
        rb2=(RadioButton) findViewById(R.id.rbEuro);
        et3=(EditText) findViewById(R.id.tvValorConversion);
        rb1.setChecked(true);

    }

    public void convertir(View v){
        if(rb1.isChecked()){
            if(etDolar!=null){
                String cantidad = etDolar.getText().toString();
                double numero = Double.parseDouble(cantidad);
                et3.setText(String.valueOf(numero*0.91));
            }
        }else{
            if(rb2.isChecked()){
                if(et2!=null){
                    String cantidad = et2.getText().toString();
                    double numero = Double.parseDouble(cantidad);
                    et3.setText(String.valueOf(numero*1.10));
                }
            }
        }
    }

    public void butonDolares(View v){
        etDolar.setEnabled(true);
        et2.setEnabled(false);
        etDolar.setText("");
        et2.setText("");
        et3.setText("");
        etDolar.requestFocus();
    }

    public void  butonEuro(View v){
        et2.setEnabled(true);
        etDolar.setEnabled(false);
        et2.setText("");
        et3.setText("");
        etDolar.setText("");
        et2.requestFocus();
    }






}

