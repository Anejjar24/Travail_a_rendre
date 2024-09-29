package com.example.androidproj1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondMainActivity extends AppCompatActivity {
    private TextView name,email,phone,city,address,gender;
    private String fullName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second_main);
        /*
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

         */
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        city = findViewById(R.id.city);
        address = findViewById(R.id.address);
        gender = findViewById(R.id.gender);


        fullName=this.getIntent().getStringExtra("lastName")+" "+this.getIntent().getStringExtra("firstName");
        name.setText("Name : "+fullName);
        email.setText("Email : "+this.getIntent().getStringExtra("email"));
        phone.setText("Phone Number : "+this.getIntent().getStringExtra("phone"));
        city.setText("City : "+this.getIntent().getStringExtra("city"));
        address.setText("Address : "+this.getIntent().getStringExtra("address"));
        gender.setText("Gender : "+this.getIntent().getStringExtra("gender"));
    }
}