package com.osu.brandonbooth.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.nfc.Tag;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;


public class FiveSActivity extends ActionBarActivity {

    private CheckBox checkBox1;

    private SharedPreferences prefs;

    private String prefName = "MyPref";

    private boolean checkBox1_isChecked;

    private static final String CHECKBOX1_STATE = "checkBox1_State";



//    @Override
//    protected void OnResume()
//    {
//        prefs = getSharedPreferences(prefName, MODE_PRIVATE);
//        SharedPreferences.Editor editor = prefs.edit();
//        editor.putBoolean(CHECKBOX1_STATE, checkBox1_isChecked);
//    }


    @Override
    protected void onPause()
    {
        super.onPause();

        if(checkBox1.isChecked())
        {
            checkBox1_isChecked = true;
        }
            else
        {
            checkBox1_isChecked = false;
        }

        prefs = getSharedPreferences(prefName, MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean(CHECKBOX1_STATE, checkBox1_isChecked);
        editor.apply();

        }




    @Override
    protected void onResume(){
        super.onResume();
        prefs = getSharedPreferences(prefName, MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean(CHECKBOX1_STATE, checkBox1_isChecked);
        editor.apply();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_s);



        Toast.makeText(
                FiveSActivity.this,
                "Checkbox1 checked: ",
                Toast.LENGTH_SHORT).show();

        final CheckBox ch1 = (CheckBox) findViewById(R.id.checkBox1);
        final CheckBox ch2 = (CheckBox) findViewById(R.id.checkBox2);
        final CheckBox ch3 = (CheckBox) findViewById(R.id.checkBox3);
        final CheckBox ch4 = (CheckBox) findViewById(R.id.checkBox4);
        final CheckBox ch5 = (CheckBox) findViewById(R.id.checkBox5);
        final CheckBox ch6 = (CheckBox) findViewById(R.id.checkBox6);
        final CheckBox ch7 = (CheckBox) findViewById(R.id.checkBox7);
        final CheckBox ch8 = (CheckBox) findViewById(R.id.checkBox8);
        final CheckBox ch9 = (CheckBox) findViewById(R.id.checkBox9);
        final CheckBox ch10 = (CheckBox) findViewById(R.id.checkBox10);
        final CheckBox ch11 = (CheckBox) findViewById(R.id.checkBox11);
        final CheckBox ch12 = (CheckBox) findViewById(R.id.checkBox12);
        final CheckBox ch13 = (CheckBox) findViewById(R.id.checkBox13);
        final CheckBox ch14 = (CheckBox) findViewById(R.id.checkBox14);
        final CheckBox ch15 = (CheckBox) findViewById(R.id.checkBox15);

        Button displayBtn = (Button) findViewById(R.id.button3);
        displayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int oldValue = 0;

                String newLine = System.getProperty("line.separator");

                if(ch1.isChecked())
                {
                    oldValue = oldValue +1;
                }
                if(ch2.isChecked())
                {
                    oldValue = oldValue +1;
                }
                if(ch3.isChecked())
                {
                    oldValue = oldValue +1;
                }
                if(ch4.isChecked())
                {
                    oldValue = oldValue +1;
                }
                if(ch5.isChecked())
                {
                    oldValue = oldValue +1;
                }
                if(ch6.isChecked())
                {
                    oldValue = oldValue +1;
                }
                if(ch7.isChecked())
                {
                    oldValue = oldValue +1;
                }
                if(ch8.isChecked())
                {
                    oldValue = oldValue +1;
                }
                if(ch9.isChecked())
                {
                    oldValue = oldValue +1;
                }
                if(ch10.isChecked())
                {
                    oldValue = oldValue +1;
                }
                if(ch11.isChecked())
                {
                    oldValue = oldValue +1;
                }
                if(ch12.isChecked())
                {
                    oldValue = oldValue +1;
                }
                if(ch13.isChecked())
                {
                    oldValue = oldValue +1;
                }
                if(ch14.isChecked())
                {
                    oldValue = oldValue +1;
                }
                if(ch15.isChecked())
                {
                    oldValue = oldValue +1;
                }

                Toast.makeText(
                        FiveSActivity.this,
                        "Checkbox1 checked: " + ch1.isChecked() + newLine
                                + "Checkbox2 checked:" + ch1.isChecked()+ newLine
                                + "Checkbox3 checked:" + ch2.isChecked()+ newLine
                                + "Checkbox3 checked:" + ch3.isChecked()+ newLine
                                + "Checkbox4 checked:" + ch4.isChecked()+ newLine
                                + "Checkbox5 checked:" + ch5.isChecked()+ newLine
                                + "Checkbox6 checked:" + ch6.isChecked()+ newLine
                                + "Checkbox7 checked:" + ch7.isChecked()+ newLine
                                + "Checkbox8 checked:" + ch8.isChecked()+ newLine
                                + "Checkbox9 checked:" + ch9.isChecked()+ newLine
                                + "Checkbox10 checked:" + ch10.isChecked()+ newLine
                                + "Checkbox11 checked:" + ch11.isChecked()+ newLine
                                + "Checkbox12 checked:" + ch12.isChecked()+ newLine
                                + "Checkbox13 checked:" + ch13.isChecked()+ newLine
                                + "Checkbox14 checked:" + ch14.isChecked()+ newLine
                                + "Checkbox15 checked:" + ch15.isChecked()+ newLine,
                        Toast.LENGTH_SHORT).show();

                final TextView mTextView = (TextView) findViewById(R.id.numchecked);
                mTextView.setText("oldValue");

                final TextView txtValue = (TextView) findViewById(R.id.numchecked);
                txtValue.setText(Integer.toString(oldValue));




            }
        });


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_five, menu);
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
