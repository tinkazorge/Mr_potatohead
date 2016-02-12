package com.example.tinkazorge.mr_potatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.nose_box:
                //  if checked, make bodypart visible
                if (checked) {
                    ImageView imgView = (ImageView) findViewById(R.id.nose);
                    imgView.setVisibility(View.VISIBLE);
                }
                // if not, make bodypart invisible (so that it disappears again after you made it visible)
                else {
                    ImageView imgView = (ImageView) findViewById(R.id.nose);
                    imgView.setVisibility(View.INVISIBLE);
                }
        }
        switch(view.getId()) {
            case R.id.ears_box:
                if (checked) {
                    ImageView imgView = (ImageView) findViewById(R.id.ears);
                    imgView.setVisibility(View.VISIBLE);
                } else {
                    ImageView imgView = (ImageView) findViewById(R.id.ears);
                    imgView.setVisibility(View.INVISIBLE);
                }
        }
        switch(view.getId()) {
            case R.id.arms_box:
                if (checked) {
                    ImageView imgView = (ImageView) findViewById(R.id.arms);
                    imgView.setVisibility(View.VISIBLE);
                } else {
                    ImageView imgView = (ImageView) findViewById(R.id.arms);
                    imgView.setVisibility(View.INVISIBLE);
                }

        }
        switch(view.getId()) {
            case R.id.mustache_box:
                if (checked) {
                    ImageView imgView = (ImageView) findViewById(R.id.moustache);
                    imgView.setVisibility(View.VISIBLE);
                } else {
                    ImageView imgView = (ImageView) findViewById(R.id.moustache);
                    imgView.setVisibility(View.INVISIBLE);
                }

        }
        switch(view.getId()) {
            case R.id.hat_box:
                if (checked) {
                    ImageView imgView = (ImageView) findViewById(R.id.hat);
                    imgView.setVisibility(View.VISIBLE);
                } else {
                    ImageView imgView = (ImageView) findViewById(R.id.hat);
                    imgView.setVisibility(View.INVISIBLE);
                }

        }
        switch(view.getId()) {
            case R.id.glasses_box:
                if (checked) {
                    ImageView imgView = (ImageView) findViewById(R.id.glasses);
                    imgView.setVisibility(View.VISIBLE);
                } else {
                    ImageView imgView = (ImageView) findViewById(R.id.glasses);
                    imgView.setVisibility(View.INVISIBLE);
                }

        }
        switch(view.getId()) {
            case R.id.shoes_box:
                if (checked) {
                    ImageView imgView = (ImageView) findViewById(R.id.shoes);
                    imgView.setVisibility(View.VISIBLE);
                } else {
                    ImageView imgView = (ImageView) findViewById(R.id.shoes);
                    imgView.setVisibility(View.INVISIBLE);
                }

        }
        switch(view.getId()) {
            case R.id.eyebrows_box:
                if (checked) {
                    ImageView imgView = (ImageView) findViewById(R.id.eyebrows);
                    imgView.setVisibility(View.VISIBLE);
                } else {
                    ImageView imgView = (ImageView) findViewById(R.id.eyebrows);
                    imgView.setVisibility(View.INVISIBLE);
                }

        }
        switch(view.getId()) {
            case R.id.mouth_box:
                if (checked) {
                    ImageView imgView = (ImageView) findViewById(R.id.mouth);
                    imgView.setVisibility(View.VISIBLE);
                } else {
                    ImageView imgView = (ImageView) findViewById(R.id.mouth);
                    imgView.setVisibility(View.INVISIBLE);
                }

        }
        switch(view.getId()) {
            case R.id.eyes_box:
                if (checked) {
                    ImageView imgView = (ImageView) findViewById(R.id.eyes);
                    imgView.setVisibility(View.VISIBLE);
                } else {
                    ImageView imgView = (ImageView) findViewById(R.id.eyes);
                    imgView.setVisibility(View.INVISIBLE);
                }

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
