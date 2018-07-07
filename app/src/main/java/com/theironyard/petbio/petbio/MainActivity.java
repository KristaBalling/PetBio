package com.theironyard.petbio.petbio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView catView;
    private ImageView dogView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        catView = (ImageView) findViewById(R.id.catViewID);
        dogView = (ImageView) findViewById(R.id.dogViewID);

        catView.setOnClickListener(this);
        dogView.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.catViewID:
            //go to second activity
                Toast.makeText(MainActivity.this, "Cat", Toast.LENGTH_LONG).show();
                break;

            case R.id.dogViewID:
             //go to second activity
                Toast.makeText(MainActivity.this, "Dog", Toast.LENGTH_LONG).show();
                break;
        }

    }
}
