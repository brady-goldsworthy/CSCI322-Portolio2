package com.example.inclass_2_11;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

//This class does nothing but didn't want to delete and maybe break stuff

public class HelpScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_help_screen);
    }

    public void goBack(View v) {
        Intent backIntent = new Intent(HelpScreen.this, MainActivity.class);

        startActivity(backIntent);
    }

}
