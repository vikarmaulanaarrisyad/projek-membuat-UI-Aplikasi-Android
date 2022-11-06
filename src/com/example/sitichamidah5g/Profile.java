package com.example.sitichamidah5g;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;


public class Profile extends Activity {
	TextView txtNama, txtNIM, txtKelas,txtTglLahir;
	
	
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);//layout yang diload
        
        
        txtNama = (TextView)findViewById(R.id.viewNama);
        txtNIM = (TextView)findViewById(R.id.TextNim);
        
        
        
     // i.getExtras()/getString = Digunakan untuk menerima pesan yang dikirim saat pindah halaman.
        Intent i = getIntent();
        txtNama.setText(i.getExtras().getString("NamaLengkap"));
        txtNIM.setText(i.getExtras().getString("NIMMhs"));
    }
}
