package com.ckuandroid.wielookienkowa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void wyslij(View view) {
        Intent intentOkno2 = new Intent(this, Okno2.class);
        EditText doWysylki = (EditText) findViewById(R.id.do_wysylki);
        String doWysylkiStr = doWysylki.getText().toString();
        intentOkno2.putExtra("wiadomosc", doWysylkiStr);
        startActivity(intentOkno2);
    }
}