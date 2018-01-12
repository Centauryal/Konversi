package com.examples.konversi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class ActivityEnam extends Activity {
	private Spinner sp;
	 private EditText edt_awal, edt_1, edt_2, edt_3, edt_4;
	 private String[] list={"liter", "dm^3", "m^3", "ml"};
	 Double awal, liter, dm3, m3, ml;
	 ArrayAdapter adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_enam);
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
			 liter = awal;
			 dm3 = liter;
			 m3 = 0.001 * awal;
			 ml = 1000 * awal;
	
			 edt_1.setText(String.valueOf(liter));
			 edt_2.setText(String.valueOf(dm3));
			 edt_3.setText(String.valueOf(m3));
			 edt_4.setText(String.valueOf(ml));
		 }else if(satuan.equals("1")){
			 liter = dm3;
			 dm3 = awal;
			 m3 = 0.001 * awal;
			 ml = 1000 * awal;
	
			 edt_1.setText(String.valueOf(liter));
			 edt_2.setText(String.valueOf(dm3));
			 edt_3.setText(String.valueOf(m3));
			 edt_4.setText(String.valueOf(ml));
		 }else if(satuan.equals("2")){
			 liter = dm3;
			 dm3 = 1000 * awal;
			 m3 = awal;
			 ml = 1000000 * awal;
	
			 edt_1.setText(String.valueOf(liter));
			 edt_2.setText(String.valueOf(dm3));
			 edt_3.setText(String.valueOf(m3));
			 edt_4.setText(String.valueOf(ml));
		 }else if(satuan.equals("3")){
			 liter = 0.001 * awal;
			 dm3 = liter;
			 m3 = 0.000001 * awal;
			 ml = awal;
	
			 edt_1.setText(String.valueOf(liter));
			 edt_2.setText(String.valueOf(dm3));
			 edt_3.setText(String.valueOf(m3));
			 edt_4.setText(String.valueOf(ml));
		 }
		 }
}
