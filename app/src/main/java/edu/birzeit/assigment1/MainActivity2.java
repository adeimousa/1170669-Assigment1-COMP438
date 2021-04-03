package edu.birzeit.assigment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView nameView;
    TextView emailView;
    TextView phoneView;
//    TextView dobView;
    TextView countryView;
    TextView humanView;
    RatingBar ratingView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String email = intent.getStringExtra("email");
        String phone = intent.getStringExtra("phone");
//        String dob = intent.getStringExtra("dob");
//        String password = intent.getStringExtra("password");
        String country = intent.getStringExtra("country");
        boolean isHuman = intent.getBooleanExtra("human", true);
        float rating = intent.getFloatExtra("rating", 0);
        nameView = findViewById(R.id.nameView);
        emailView = findViewById(R.id.emailView);
        phoneView = findViewById(R.id.phoneView);
//        dobView = findViewById(R.id.dobView);
        countryView = findViewById(R.id.countryView);
        humanView = findViewById(R.id.humanView);
        ratingView = findViewById(R.id.ratingView);
        nameView.setText(name);
        emailView.setText(email);
        phoneView.setText(phone);
//        dobView.setText(dob);
        countryView.setText(country);
        humanView.setText("Is Human: " + isHuman );
        ratingView.setRating(rating);
        ratingView.setIsIndicator(true);
    }
}