package edu.birzeit.assigment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView nameView;
    TextView emailView;
    TextView phoneView;
    TextView dobView;
    TextView countryView;
    TextView passwordView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String email = intent.getStringExtra("email");
        String phone = intent.getStringExtra("phone");
        String dob = intent.getStringExtra("dob");
        String password = intent.getStringExtra("password");
        String country = intent.getStringExtra("country");
        nameView = findViewById(R.id.nameView);
        emailView = findViewById(R.id.emailView);
        phoneView = findViewById(R.id.phoneView);
        dobView = findViewById(R.id.dobView);
        passwordView = findViewById(R.id.passwordView);
        countryView = findViewById(R.id.countryView);
        nameView.setText(name);
        emailView.setText(email);
        phoneView.setText(phone);
        dobView.setText(dob);
        countryView.setText(country);
        passwordView.setText(password);
    }
}