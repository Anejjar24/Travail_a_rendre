package com.example.androidproj1;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText firstName;
    private EditText lastName;
    private EditText email;
    private EditText phone;
    private Spinner cities;
    private EditText address;

    private Button send;

    private RadioButton m, f;
    private String gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        firstName = findViewById(R.id.first_name);
        lastName = findViewById(R.id.last_name);
        email = findViewById(R.id.email);
        phone= findViewById(R.id.phone_number);
        address= findViewById(R.id.address);
        cities  = findViewById(R.id.cities);
        m = findViewById(R.id.m);
        f = findViewById(R.id.f);
        send = findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        if(m.isChecked())
                                            gender = "Male";
                                        else if(f.isChecked())
                                            gender = "Female";
                                        Intent intent = new Intent(MainActivity.this, SecondMainActivity.class);
                                        intent.putExtra("firstName", firstName.getText().toString());
                                        intent.putExtra("lastName", lastName.getText().toString());
                                        intent.putExtra("email", email.getText().toString());
                                        intent.putExtra("phone", phone.getText().toString());
                                        intent.putExtra("city", cities.getSelectedItem().toString());
                                        intent.putExtra("address", address.getText().toString());
                                        intent.putExtra("gender", gender);
                                        startActivity(intent);


                                        //Toast.makeText(MainActivity.this, gender+" "+ lastName.getText()+ firstName.getText()+" habite à "+cities.getSelectedItem(), Toast.LENGTH_LONG).show();
                                    }
                                }
        );
    }
}