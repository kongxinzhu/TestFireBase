package com.example.caixinzhu.testfirebase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ProfileActivity extends AppCompatActivity {

    private String firstname;
    private String lastname;
    private String displayname;
    private String email;
    private String password;
    DatabaseReference users;
    FirebaseUser mCurrentUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Button submit = (Button) findViewById(R.id.bt_profile_submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText ETFirst = (EditText) findViewById(R.id.et_profile_firstname);
                firstname = ETFirst.getText().toString();

                EditText ETLast = (EditText) findViewById(R.id.et_profile_lastname);
                lastname = ETLast.getText().toString();

                EditText ETDisplayname = (EditText) findViewById(R.id.et_profile_displayname);
                displayname = ETDisplayname.getText().toString();

                EditText ETEmail = (EditText) findViewById(R.id.et_profile_email);
                email = ETEmail.getText().toString();

                EditText ETPassword = (EditText) findViewById(R.id.et_profile_password);
                password = ETPassword.getText().toString();
                User user = new User(displayname, email, firstname,lastname,password);
                writeToFireBase(user);

            }
        });
    }

    public void setmCurrentUser() {
        mCurrentUser = FirebaseAuth.getInstance().getCurrentUser();
    }

    public void setDatabaseReference() {
        DatabaseReference tables = FirebaseDatabase.getInstance().getReference();
        users = tables.child("users");
    }


    public void writeToFireBase(User user) {
        setDatabaseReference();
        users.push().setValue(user);
    }
}
