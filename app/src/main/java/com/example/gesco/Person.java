package com.example.gesco;

import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Person extends AppCompatActivity {
     String username;
    String usernae;
     String password;
    public int PersonLogin (){
        EditText usernameInput;
        EditText passwordInput;

        String insertUrl = "http://google.com";
        RequestQueue queue;

        usernameInput = (EditText) findViewById(R.id.editTextTextEmailAddress);
        passwordInput = (EditText) findViewById(R.id.editTextNumberPassword);
        this.username = usernameInput.getText().toString();
        this.password = passwordInput.getText().toString();
        return 1;
    }
}
