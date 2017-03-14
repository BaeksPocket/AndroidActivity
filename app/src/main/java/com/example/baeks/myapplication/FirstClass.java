package com.example.baeks.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Vector;

public class FirstClass extends AppCompatActivity {
    Vector<Button> btnV = new Vector<Button>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_class);


        btnV.add((Button)findViewById(R.id.button));
        btnV.add((Button)findViewById(R.id.button2));
        btnV.add((Button)findViewById(R.id.button3));
        btnV.add((Button)findViewById(R.id.button4));


        for(int i=0; i<btnV.size(); i++) {
            btnV.get(i).setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    String str = ((Button) v).getText().toString();
                    if(str.equals("Button4")){
                        if(btnV.get(0).getText().equals("BUTTON ONE")){
                            btnV.get(0).setText("BUTTON1");
                        }
                        else {
                            btnV.get(0).setText("BUTTON ONE");
                        }
                    }
                    else {
                        //Button button = (Button) findViewById(R.id.button);
                        Toast.makeText(getBaseContext(), str + " Clicked", Toast.LENGTH_LONG).show();
                    }
                }


            });
        }
    }

}
