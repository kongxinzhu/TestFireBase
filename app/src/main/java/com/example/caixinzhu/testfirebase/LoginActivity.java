package com.example.caixinzhu.testfirebase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {
    private static String TAG = LoginActivity.class.getSimpleName();

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private String email;
    private String password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//        setmAuthListener();
    }

    public void setmAuth() {
        mAuth = FirebaseAuth.getInstance();
    }

//    public void setmAuthListener() {
//        setmAuth();
//        mAuthListener = new FirebaseAuth.AuthStateListener() {
//            @Override
//            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
//                FirebaseUser user = firebaseAuth.getCurrentUser();
//                if (user != null) {
//                    // User is signed in
//                    Log.d(TAG, "onAuthStateChanged:signed_in:" + user.getUid());
//                } else {
//                    // User is signed out
//                    Log.d(TAG, "onAuthStateChanged:signed_out");
//                }
//
//            }
//        };
//    }


//    public void ClickLogin() {
//        EditText ETEmail = (EditText) findViewById(R.id.et_login_email);
//        email = ETEmail.getText().toString();
//
//        EditText ETPassword = (EditText) findViewById(R.id.et_login_password);
//        password = ETPassword.getText().toString();
//        mAuth.signInWithEmailAndPassword(email, password)
//                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        Log.d(TAG, "signInWithEmail:onComplete:" + task.isSuccessful());
//
//                        // If sign in fails, display a message to the user. If sign in succeeds
//                        // the auth state listener will be notified and logic to handle the
//                        // signed in user can be handled in the listener.
//                        if (!task.isSuccessful()) {
//                            Log.w(TAG, "signInWithEmail:failed", task.getException());
//                            Toast.makeText(LoginActivity.this, "Log in failed",
//                                    Toast.LENGTH_SHORT).show();
//                        } else {
//                            startActivity(new Intent(LoginActivity.this, MainActivity.class));
//                        }
//
//                    }
//                });
//    }




    public void ClickRegister() {
        startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
    }
}
