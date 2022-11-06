/**
 * 
 */
package com.example.sitichamidah5g;

import com.example.sitichamidah5g.*;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.app.Activity;
import android.content.Intent;
import android.widget.Button;

public class Home extends Activity {
	EditText nama,nim,kelas,tgl_lahir;
	Button btnSimpan, btnBatal;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);//layout yang diload
        
        // Inisialisasi Variable
        nama = (EditText)findViewById(R.id.TxtNama);
        nim = (EditText)findViewById(R.id.TxtNIM);
        kelas = (EditText)findViewById(R.id.TxtKelas);
        tgl_lahir = (EditText)findViewById(R.id.TxtTglLahir);
        btnBatal = (Button)findViewById(R.id.btnBatal);
        btnSimpan = (Button)findViewById(R.id.btnSimpan);
        
        // Aksi Button Batal
        btnBatal.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				nama.setText(null);
				nim.setText(null);
				kelas.setText(null);
				tgl_lahir.setText(null);
			}
		});
        
        //Aksi button simpan
        btnSimpan.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String inputnama = String.valueOf(nama.getText().toString());
				String inputnim = String.valueOf(nim.getText().toString());
				String inputkelas = String.valueOf(kelas.getText().toString());
				String inputtgl_lahir = String.valueOf(tgl_lahir.getText().toString());
				
				//Pindah halaman dan mengirimkan data
				Intent i = new Intent(getApplicationContext(),Profile.class);
				i.putExtra("NamaLengkap", inputnama);
				i.putExtra("NIMMhs", inputnim);
				i.putExtra("KelasMhs", inputkelas);
				i.putExtra("TglLhrMhs", inputtgl_lahir);
				startActivity(i);
			}
		});
    }
}
