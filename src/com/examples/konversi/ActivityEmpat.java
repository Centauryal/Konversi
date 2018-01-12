package com.examples.konversi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class ActivityEmpat extends Activity {
	private Spinner sp;
	 private EditText edt_awal, edt_1, edt_2, edt_3, edt_4;
	 private String[] list={"Kwintal", "Ton", "Ons", "Pounds"};
	 Double awal, kwintal, ton, ons, pounds;
	 ArrayAdapter adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_empat);
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
			 kwintal = awal;
			 ton = 0.1 * awal;
			 ons = 1000 * awal;
			 pounds = 200 * awal;
	
			 edt_1.setText(String.valueOf(kwintal));
			 edt_2.setText(String.valueOf(ton));
			 edt_3.setText(String.valueOf(ons));
			 edt_4.setText(String.valueOf(pounds));
		 }else if(satuan.equals("1")){
			 kwintal = 10 * awal;
			 ton = awal;
			 ons = 10000 * awal;
			 pounds = 2000 * awal;

			 edt_1.setText(String.valueOf(kwintal));
			 edt_2.setText(String.valueOf(ton));
			 edt_3.setText(String.valueOf(ons));
			 edt_4.setText(String.valueOf(pounds));
		 }else if(satuan.equals("2")){
			 kwintal = 0.001 *awal;
			 ton = 0.0001 * awal;
			 ons =  awal;
			 pounds = 0.2 * awal;

			 edt_1.setText(String.valueOf(kwintal));
			 edt_2.setText(String.valueOf(ton));
			 edt_3.setText(String.valueOf(ons));
			 edt_4.setText(String.valueOf(pounds));
		 }else if(satuan.equals("3")){
			 kwintal = 0.005 * awal;
			 ton = 0.0005 * awal;
			 ons = 5 * awal;
			 pounds = awal;

			 edt_1.setText(String.valueOf(kwintal));
			 edt_2.setText(String.valueOf(ton));
			 edt_3.setText(String.valueOf(ons));
			 edt_4.setText(String.valueOf(pounds));
		 }
		 }
}
