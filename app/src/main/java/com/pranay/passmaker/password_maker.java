package com.pranay.passmaker;

import android.app.Application;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.*;
import java.util.Arrays;

public class password_maker extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_password_maker);

            final EditText entertext=(EditText)findViewById(R.id.stringIn);
            final TextView finalpss=(TextView)findViewById(R.id.passOut);

            Button  create=(Button)findViewById(R.id.make);

            create.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String stringtext=entertext.getText().toString();
                    String finalstr="";
                    char[] ch={'!','@','#','$','%','&','*','(',')'};
                    String insert="";
                    for(int i=0;i<stringtext.length();i++){


                        if(i%2==0)   {
                            finalstr=finalstr+  Character.toUpperCase(stringtext.charAt(i));
                        }

                        else         {finalstr=finalstr+  Character.toLowerCase(stringtext.charAt(i));}


                    }
                    StringBuilder sb=new StringBuilder(finalstr);

                    for(int i=0;i<finalstr.length();i++) {

                        sb.insert((i + 1) + i, ch[i%9]);
                        insert = sb.toString();
                    }
                    insert=  new StringBuilder(insert).reverse().toString();
                    finalpss.setText(insert);

                }
                
            });

        }
    }

