package com.esthere.gettaxi2.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.esthere.gettaxi2.R;
import com.esthere.gettaxi2.model.datasource.Globals;
import com.esthere.gettaxi2.model.entities.Driver;

public class SignUpActivity extends AppCompatActivity {

    EditText fName, lName, id, phone, email, creditCard, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        fName=findViewById(R.id.firstName);
        lName=findViewById(R.id.lastName);
        id=findViewById(R.id.idDriver);
        phone=findViewById(R.id.phone);
        email=findViewById(R.id.email);
        creditCard=findViewById(R.id.creditCard);
        password=findViewById(R.id.password);
    }

    public void signupClicked(View view) {
        String fNameText=fName.getText().toString();
        String lNameText=lName.getText().toString();
        String idText=id.getText().toString();
        String phoneText=phone.getText().toString();
        String emailText=email.getText().toString();
        String creditCardText=creditCard.getText().toString();
        String passwordText=password.getText().toString();
        Driver driver1=new Driver(fNameText,lNameText,idText,phoneText,emailText,creditCardText,passwordText);
        Globals.backend.addDriver(driver1);

        Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
