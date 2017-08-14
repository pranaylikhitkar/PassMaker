package com.pranay.passmaker;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.id.input;

public class rot_13 extends AppCompatActivity {

    public String rot13(View view){
        EditText rot_in = (EditText) findViewById(R.id.rot_in);
        String input = rot_in.getText().toString();
        StringBuilder sb = new StringBuilder();
        for(int  i = 0 ; i < input.length() ;i++){
            char c = input.charAt(i);
            if       (c >= 'a' && c <= 'm') c += 13;
            else if  (c >= 'A' && c <= 'M') c += 13;
            else if  (c >= 'n' && c <= 'z') c -= 13;
            else if  (c >= 'N' && c <= 'Z') c -= 13;
            sb.append(c);
        }
        String output = sb.toString();
        Log.i("info",output);
        TextView rout = (TextView) findViewById(R.id.rot_out);
        rout.setText(output);
        return output;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rot_13);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

}
