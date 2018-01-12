package com.examples.konversi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class ActivityLima extends Activity {
	private Spinner sp;
	 private EditText edt_awal, edt_1, edt_2, edt_3, edt_4;
	 private String[] list={"m", "Inch", "Feet", "Mile"};
	 Double awal, m, inch, feet, mile;
	 ArrayAdapter adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lima);
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
			 m = awal;
			 inch = 39.3701 * awal;
			 feet = 3.28084 * awal;
			 mile = 0.000621371 * awal;
	
			 edt_1.setText(String.valueOf(m));
			 edt_2.setText(String.valueOf(inch));
			 edt_3.setText(String.valueOf(feet));
			 edt_4.setText(String.valueOf(mile));
		 }else if(satuan.equals("1")){
			 m = 0.0254 * awal;
			 inch = awal;
			 feet = 0.0833333 * awal;
			 mile = 1.5783e-5 * awal;
	
			 edt_1.setText(String.valueOf(m));
			 edt_2.setText(String.valueOf(inch));
			 edt_3.setText(String.valueOf(feet));
			 edt_4.setText(String.valueOf(mile));
		 }else if(satuan.equals("2")){
			 m = 0.3048 * awal;
			 inch = 12 * awal;
			 feet = awal;
			 mile = 0.000189394 * awal;
	
			 edt_1.setText(String.valueOf(m));
			 edt_2.setText(String.valueOf(inch));
			 edt_3.setText(String.valueOf(feet));
			 edt_4.setText(String.valueOf(mile));
		 }else if(satuan.equals("3")){
			 m = 1609.34 * awal;
			 inch = 63360 * awal;
			 feet = 1000 * awal;
			 mile = awal;
	
			 edt_1.setText(String.valueOf(m));
			 edt_2.setText(String.valueOf(inch));
			 edt_3.setText(String.valueOf(feet));
			 edt_4.setText(String.valueOf(mile));
		 }
		 }
}
