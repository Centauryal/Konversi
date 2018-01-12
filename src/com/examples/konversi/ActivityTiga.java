package com.examples.konversi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class ActivityTiga extends Activity {
	private Spinner sp;
	 private EditText edt_awal, edt_1, edt_2, edt_3, edt_4;
	 private String[] list={"m^2", "Are", "Hektar", "Km^2"};
	 Double awal, m2, are, hektar, km2;
	 ArrayAdapter adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tiga);
		sp=(Spinner) findViewById(R.id.spinner1);
		 edt_awal=(EditText) findViewById(R.id.editText1);
		 edt_1=(EditText) findViewById(R.id.editText2);
		 edt_2=(EditText) findViewById(R.id.editText3);
		 edt_3=(EditText) findViewById(R.id.editText4);
		 edt_4=(EditText) findViewById(R.id.editText5);

		 adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, list);
		 adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		 sp.setAdapter(adapter);
        
	}
	public void Konversi(View v){
		 String satuan = String.valueOf(sp.getSelectedItemPosition());
		 if(edt_awal.getText().toString().equals("")){
		 Toast.makeText(getBaseContext(), "Masukkan nilai awal, default nilai awal = 0 jika tidak dimasukkan nilai awal", Toast.LENGTH_LONG).show();
		 awal = 0.0;
		 }else{
		 awal = Double.parseDouble(edt_awal.getText().toString());
		 }
		 if(satuan.equals("0")){
		 m2 = awal;
		 are = 100 * awal;
		 hektar = 0.0001 * awal;
		 km2 = 0.000001 * awal;

		 edt_1.setText(String.valueOf(m2));
		 edt_2.setText(String.valueOf(are));
		 edt_3.setText(String.valueOf(hektar));
		 edt_4.setText(String.valueOf(km2));
		 }else if(satuan.equals("1")){
		 m2 = 0.01 * awal;
		 are = awal;
		 hektar = 0.000001 * awal;
		 km2 = 0.00000001 * awal;

		 edt_1.setText(String.valueOf(m2));
		 edt_2.setText(String.valueOf(are));
		 edt_3.setText(String.valueOf(hektar));
		 edt_4.setText(String.valueOf(km2));
		 }else if(satuan.equals("2")){
		 m2 = 10000 * awal;
		 are = 1000000 * awal;
		 hektar = awal;
		 km2 = 0.01 * awal;

		 edt_1.setText(String.valueOf(m2));
		 edt_2.setText(String.valueOf(are));
		 edt_3.setText(String.valueOf(hektar));
		 edt_4.setText(String.valueOf(km2));
		 }else if(satuan.equals("3")){
		 m2 = 1000000 * awal;
		 are = 100000000 * awal;
		 hektar = 100 * awal;
		 km2 = awal;

		 edt_1.setText(String.valueOf(m2));
		 edt_2.setText(String.valueOf(are));
		 edt_3.setText(String.valueOf(hektar));
		 edt_4.setText(String.valueOf(km2));
		 }
		 }
}
