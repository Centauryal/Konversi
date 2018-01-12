package com.examples.konversi;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View.OnClickListener;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.Toast;
import android.view.View;
import android.media.MediaPlayer;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends Activity {
	MediaPlayer audioBackgroundku;
	CheckBox chk1;
	
	ListView listw;
	 String[] itemname ={
	 "Konversi Suhu",
	 "Konversi Luas",
	 "Konvesi Berat",
	 "Konvesi Panjang",
	 "Konvesi Volume",
	 "About"
	 };
	 
	 Integer[] imgid={
	 R.drawable.ic4,
	 R.drawable.ic5,
	 R.drawable.ic6,
	 R.drawable.ic7,
	 R.drawable.ic2,
	 R.drawable.ic8,
	 };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Memanggil file my_sound pada folder raw
        audioBackgroundku = MediaPlayer.create(this, R.raw.sound);
        //Set looping ke true untuk mengulang audio jika telah selesai
        audioBackgroundku.setLooping(true);
        //Set volume audio agar berbunyi
        audioBackgroundku.setVolume(1,1);
        //Memulai audio
        audioBackgroundku.start();
        
        chk1 = (CheckBox)findViewById(R.id.checkBox1);
        chk1.setOnClickListener(new OnClickListener() {
    	
        	@Override
            public void onClick(View v) {
        	if (chk1.isChecked())
        	{
    		audioBackgroundku.setVolume(0,0);
        	} 	else {
    		audioBackgroundku.setVolume(1,1);
    		}
        }
       });
        
        CustomListAdapter adapter=new CustomListAdapter(this, itemname, imgid);
        listw=(ListView)findViewById(R.id.list);
        listw.setAdapter(adapter);
        listw.setOnItemClickListener(new OnItemClickListener() {
        	
        	@Override
        	 public void onItemClick(AdapterView<?> parent, View view,
        	 int position, long id) {
				// TODO Auto-generated method stub
        		
        		
        		Intent i = null;
        		if(position==0)
        		{
        			i = new Intent(MainActivity.this, ActivityDua.class);
        			startActivity(i);
        			
        		}
        		else if(position==1)
        		{
        			i = new Intent(MainActivity.this, ActivityTiga.class);
        			startActivity(i);
        			
        		}
        		else if(position==2) 
        		{
        			i = new Intent(MainActivity.this, ActivityEmpat.class);
        			startActivity(i);
        			
        		}
        		else if(position==3) 
        		{
        			i = new Intent(MainActivity.this, ActivityLima.class);
        			startActivity(i);
        			
        		}
        		else if(position==4) 
        		{
        			i = new Intent(MainActivity.this, ActivityEnam.class);
        			startActivity(i);
        			
        		}
        		else if(position==5) 
        		{
        			i = new Intent(MainActivity.this, ActivityAbout.class);
        			startActivity(i);
        			
        		}
        	 String Slecteditem= itemname[+position];
        	 Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();
        	 
        	 }
			
			
        	 });
        	 
    }
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
