package com.esthere.gettaxi2.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.esthere.gettaxi2.R;
import com.esthere.gettaxi2.model.datasource.Globals;
import com.esthere.gettaxi2.model.entities.Driver;

public class LoginActivity extends Activity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login);
//    }

    EditText email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
    }

    private boolean isEmailValid(String email) {
        return email.contains("@");
    }

    public void buttonClicked(View view) {
        View focusView = null;
        boolean cancel = false;

        String emailText = email.getText().toString();
        String passwordText = password.getText().toString();
        Driver driver = new Driver(emailText, passwordText);
        if (TextUtils.isEmpty(emailText)) {
            email.setError(getString(R.string.error_field_required));
            focusView = email;
            cancel = true;
        } else if (!isEmailValid(emailText)) {
            email.setError(getString(R.string.error_invalid_email));
            focusView = email;
            cancel = true;
        }
        if (TextUtils.isEmpty(passwordText)) {
            password.setError("This field is required");
            focusView = password;
            cancel = true;
        }
        if (cancel) {
            // There was an error; don't attempt login and focus the first
            // form field with an error.
            focusView.requestFocus();
        }
        if (Globals.backend.Login(driver)) {
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, R.string.FAIL_LOGIN, Toast.LENGTH_SHORT).show();
        }
    }
}
