package com.example.gesco;

import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.Map;

public class Person extends AppCompatActivity {
    String username;
    String password;
    public int PersonLogin (){
        EditText usernameInput;
        EditText passwordInput;

        String url = "http://google.com";
        RequestQueue queue = Volley.newRequestQueue(Person.this);
        StringRequest stringrequest = new StringRequest(Request.Method.Post, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

            }, new Response.ErrorListener(){

            }
        }){
            protected Map<String,String> getParams(){

            }
            protected Map<String,String>
        }

        usernameInput = (EditText) findViewById(R.id.editTextTextEmailAddress);
        passwordInput = (EditText) findViewById(R.id.editTextNumberPassword);
        this.username = usernameInput.getText().toString();
        this.password = passwordInput.getText().toString();
        return 1;
    }
}
