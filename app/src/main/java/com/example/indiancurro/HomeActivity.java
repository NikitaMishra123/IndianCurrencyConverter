package com.example.indiancurro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class HomeActivity extends AppCompatActivity {

    Button euro, pound, dollar, yen, dinar, bitcoin, rubel, ausdollar, candollar,Won,Nairas,TurkeyLira;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        euro = findViewById(R.id.Euro);
        pound = findViewById(R.id.Pound);
        dollar = findViewById(R.id.Dollar);
        yen = findViewById(R.id.Yen);
        dinar = findViewById(R.id.Dinar);
        bitcoin = findViewById(R.id.Bitcoin);
        rubel = findViewById(R.id.Rubel);
        ausdollar = findViewById(R.id.Ausdollar);
        candollar = findViewById(R.id.Candollar);
        TurkeyLira=findViewById(R.id.turkeylira);
        Nairas=findViewById(R.id.nairas);
        Won=findViewById(R.id.won);


        editText = findViewById(R.id.edit);
        textView = findViewById(R.id.textView);

        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)) {
                    editText.setError("Empty User Input");
                } else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 78.52;



                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));

                }
            }
        });


        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)) {
                    editText.setError("Empty User Input");
                } else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 78.52;


                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));

                }
            }
        });


        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String y = editText.getText().toString();

                if (TextUtils.isEmpty(y)) {
                    editText.setError("Empty user input");
                } else {
                    double n, k;
                    n = Double.parseDouble(y);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 70.76;

                    DecimalFormat numberformat = new DecimalFormat("#0.00");
                    textView.setText("" + numberformat.format(k));
                }
            }
        });


        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)) {
                    editText.setError("Empty User Input");
                } else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.65;


                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));

                }
            }
        });


        dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)) {
                    editText.setError("Empty User Input");
                } else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 233.06;


                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));

                }
            }
        });


        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)) {
                    editText.setError("Empty User Input");
                } else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n *509229.76;


                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));

                }
            }
        });


        rubel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)) {
                    editText.setError("Empty User Input");
                } else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 1.11;


                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));

                }
            }
        });


        ausdollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)) {
                    editText.setError("Empty User Input");
                } else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 48.55;


                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));

                }
            }
        });


        candollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)) {
                    editText.setError("Empty User Input");
                } else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n *53.66;


                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));

                }
            }
        });

        TurkeyLira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)) {
                    editText.setError("Empty User Input");
                } else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n *12.011;


                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));

                }


            }
        });

        Nairas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)) {
                    editText.setError("Empty User Input");
                } else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n *0.20;


                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));

                }

            }
        });

        Won.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)) {
                    editText.setError("Empty User Input");
                } else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n *0.061;


                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));

                }
            }
        });

    }
}
