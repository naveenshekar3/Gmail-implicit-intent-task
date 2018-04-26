package com.example.root.gmailimplicitintenttask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    private EditText to_etv;
    private EditText subject_etv;
    private EditText message_etv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        to_etv=(EditText)findViewById(R.id.to_etv);
        subject_etv=(EditText)findViewById(R.id.subject_etv);
        message_etv=(EditText)findViewById(R.id.message_etv);

    }

    public void send(View view)
    {
        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL,to_etv.getText().toString());
        intent.putExtra(Intent.EXTRA_SUBJECT,subject_etv.getText().toString());
        intent.putExtra(Intent.EXTRA_TEXT,message_etv.getText().toString());
        intent.setType("text/plain");
        startActivity(intent);
    }
}
