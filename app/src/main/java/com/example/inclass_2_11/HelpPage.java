package com.example.inclass_2_11;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/*
    Brady Goldsworthy z1816747
              and
      Justin Dupre z1835941

    Portfolio 4
    2/20/19
 */

public class HelpPage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_page);
    }

    //back button
    public void goBack(View v) {
        Intent backIntent = new Intent(HelpPage.this, MainActivity.class);
        startActivity(backIntent);
    }

}
