package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.models.Users;

import java.time.Instant;

public class AuthActivity extends AppCompatActivity {

    Button btnLogin;
    EditText txtUser;
    EditText txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        btnLogin = findViewById(R.id.btnLogin);
        txtUser = findViewById(R.id.txtUser);
        txtPassword=findViewById(R.id.txtPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (Users.passwordIsValid(txtUser.getText().toString(),txtPassword.getText().toString())){
                   Intent o=new Intent();
               }
                if ( txtUser.getText().toString().equals("alcachofa") && txtPassword.getText().toString().equals("123456")) {
                    Intent o = new Intent(AuthActivity.this,
                            MainActivity.class);
                    startActivity(o);
                }
            }
        });

    }
}
