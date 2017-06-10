package com.example.caixinzhu.testfirebase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;

public class RegisterActivity extends AppCompatActivity {
    private static String TAG =  RegisterActivity.class.getSimpleName();

    private FirebaseAuth mAuth;
    private DatabaseReference mUserRefDatabase;

    private String email;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
//
//        setAuth();
//        SetUserRefDatabase();

    }
//
//    public void setAuth() {
//        mAuth = FirebaseAuth.getInstance();
//    }
//
//
//    public void SetUserRefDatabase() {
//        mUserRefDatabase = FirebaseDatabase.getInstance().getReference().child("users");
//    }
//
//    public void Register(){
//        EditText ETemail = (EditText) findViewById(R.id.et_register_email);
//        email = ETemail.getText().toString();
//
//        EditText ETpassword = (EditText) findViewById(R.id.et_register_password);
//        password = ETpassword.getText().toString();
//        mAuth.createUserWithEmailAndPassword(email, password)
//            .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//                @Override
//                public void onComplete(@NonNull Task<AuthResult> task) {
//                    Log.d(TAG, "createUserWithEmail:onComplete:" + task.isSuccessful());
//
//                    if (!task.isSuccessful()) {
//                        Toast.makeText(RegisterActivity.this, "Register failed",
//                                Toast.LENGTH_SHORT).show();
//                    } else {
//                        onAuthSuccess(task.getResult().getUser());
//
//                    }
//                }
//            });
//
//    }
//    private void onAuthSuccess(FirebaseUser user) {
//        createNewUser(user.getUid());
//        goToMainActivity();
//    }
//
//    private void createNewUser(String userId){
//        User user = buildNewUser();
//        mUserRefDatabase.child(userId).setValue(user);
//    }
//
//    public void goToMainActivity() {
//        startActivity(new Intent(RegisterActivity.this, MainActivity.class));
//    }
//
//    private User buildNewUser() {
//        return new User(email, password);
//    }
//
//    public void CancelRegister(){
//        finish();
//    }
}
