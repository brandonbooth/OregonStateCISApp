package com.osu.brandonbooth.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Toast;


public class sixsigma extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixsigma);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sixsigma, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.back) {
            startActivity(new Intent(this, MainActivity.class));
            return true;
        }
        if (id == R.id.search) {
            Toast.makeText(getBaseContext(), "Click on the search icon", Toast.LENGTH_LONG).show();
            return true;
        }

        if (id == R.id.help) {
            Toast.makeText(getBaseContext(), "Please contact Brandon Booth at boothbr@onid.oregonstate.edu for help with this application.", Toast.LENGTH_LONG).show();
            return true;
        }

        if (id == R.id.settings) {
            Toast.makeText(getBaseContext(), "There are no settings yet.", Toast.LENGTH_LONG).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
