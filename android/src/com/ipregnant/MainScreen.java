package com.ipregnant;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainScreen extends Activity {

	Button peeButton;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        
        ImageView img = (ImageView)findViewById(R.id.stickImage);
    	img.setImageResource(R.drawable.pregancy_test);
        
        peeButton = (Button) findViewById(R.id.peeButton);
        peeButton.setText("Begin Pee Analysis");
        peeButton.setOnClickListener(peeButtonHandler);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main_screen, menu);
        return true;
    }
    
    View.OnClickListener peeButtonHandler = new View.OnClickListener() {
        public void onClick(View v) {
        	peeButton.setVisibility(View.GONE);
        	ImageView img = (ImageView)findViewById(R.id.stickImage);
        	img.setImageResource(R.drawable.ic_launcher);
        }
    };
    
    
    
}
