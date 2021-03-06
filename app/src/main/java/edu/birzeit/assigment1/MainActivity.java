package edu.birzeit.assigment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText firstName;
    EditText lastName;
    EditText email;
    EditText phone;
//    EditText dob;
    EditText password;
    Spinner country;
    Switch human;
    RatingBar rating;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSpinnerData();
    }

    private void getSpinnerData() {
        this.country = findViewById(R.id.spinner);
        ArrayList<String> contries = new ArrayList<String>();
        contries.add("Palestine");
        contries.add("Jordan");
        contries.add("UAE");
        contries.add("Syria");
        contries.add("Egypt");
        contries.add("Lebanon");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, contries);
        country.setAdapter(arrayAdapter);
    }


    public void signUp(View view) {
        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
//        dob = findViewById(R.id.dob);
        password = findViewById(R.id.password);
        human = findViewById(R.id.humanView);
        rating = findViewById(R.id.ratingView);
        Intent intent = new Intent(this, MainActivity2.class);
        String name = firstName.getText().toString() + " " +lastName.getText().toString();
        String email = this.email.getText().toString();
        String phone = this.phone.getText().toString();
//        String dob = this.dob.getText().toString();
        String password = this.password.getText().toString();
        String country = this.country.getSelectedItem().toString();
        boolean human = this.human.isChecked();
        float rating = this.rating.getRating();
        intent.putExtra("name",name );
        intent.putExtra("email",email );
        intent.putExtra("phone",phone );
//        intent.putExtra("dob",dob );
        intent.putExtra("password",password );
        intent.putExtra("country",country );
        intent.putExtra("human",human );
        intent.putExtra("rating",rating );
        startActivity(intent);
    }
}