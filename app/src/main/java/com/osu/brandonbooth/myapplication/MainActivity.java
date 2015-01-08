package com.osu.brandonbooth.myapplication;

import java.util.ArrayList;
import android.app.SearchManager;
import android.os.AsyncTask;
import android.view.MenuInflater;
import android.widget.SearchView;
import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.widget.DrawerLayout;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //allow button to go to next screen.
        Button fiveS = (Button) findViewById(R.id.fiveS);

        fiveS.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(MainActivity.this, FiveSActivity.class);
                startActivity(intent);
            }
        });


        //allow button to go to next screen.
        Button timestudy = (Button) findViewById(R.id.timestudy);

        timestudy.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(MainActivity.this, TimeStudyActivity.class);
                startActivity(intent);
            }
        });




        setTitle("OSU CIS Mobile App");
        getSupportActionBar().setIcon(R.drawable.ic_launcher);
        getSupportActionBar().setHomeButtonEnabled(true);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


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
