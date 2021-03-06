package com.joelcastro.introduccionandroid;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.buttonEnterMain);
        final EditText tusuario = (EditText) findViewById(R.id.textUserMain);
        final EditText tpass = (EditText) findViewById(R.id.textPassMain);


        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UserTypeActivity.class);
                startActivity(intent);
            }
        });


        tusuario.addTextChangedListener(new TextWatcher() {
                @Override
                public void afterTextChanged(Editable s) {
                    // TODO Auto-generated method stub
                }

                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                    // TODO Auto-generated method stub
                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    if((tpass.getText().length()>0)&&(tusuario.getText().length()>0))
                    {
                        button.setEnabled(true);
                    }
                    else
                    {
                        button.setEnabled(false);
                    }

                }
            }
            );


        tpass.addTextChangedListener(new TextWatcher() {
                @Override
                public void afterTextChanged(Editable s) {
                    // TODO Auto-generated method stub
                }

                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                    // TODO Auto-generated method stub
                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    if((tpass.getText().length()>0)&&(tusuario.getText().length()>0))
                    {
                        button.setEnabled(true);
                    }
                    else
                    {
                        button.setEnabled(false);
                    }

                }
            }
            );



        }
};
