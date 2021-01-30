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
        usernameInput = (EditText) findViewById(R.id.editTextTextEmailAddress);
        passwordInput = (EditText) findViewById(R.id.editTextNumberPassword);
        this.username = usernameInput.getText().toString();
        this.password = passwordInput.getText().toString();

        RequestQueue queue = Volley.newRequestQueue(this);
        String url ="http://myserveraddress";

        StringRequest strRequest = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>()
                {
                    @Override
                    public void onResponse(String response)
                    {
                        Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
                    }
                },
                new Response.ErrorListener()
                {
                    @Override
                    public void onErrorResponse(VolleyError error)
                    {
                        Toast.makeText(getApplicationContext(), error.toString(), Toast.LENGTH_SHORT).show();
                    }
                })
        {
            @Override
            protected Map<String, String> getParams()
            {
                Map<String, String> params = new HashMap<String, String>();
                params.put("tag", "test");
                return params;
            }
        };
        queue.add(strRequest);
        return 1;
    }
}
