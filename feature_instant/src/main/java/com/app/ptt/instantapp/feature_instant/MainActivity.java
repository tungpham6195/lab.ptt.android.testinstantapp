package com.app.ptt.instantapp.feature_instant;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.app.ptt.instantapp.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_loginFb).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(findViewById(R.id.btn_loginFb), getString(R.string.login_with_facebook), Snackbar.LENGTH_SHORT);
                snackbar.show();
                Intent i_facebook=new Intent(MainActivity.this, LoginActivity.class);
                i_facebook.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i_facebook);
            }
        });
        findViewById(R.id.btn_loginGM).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(findViewById(R.id.btn_loginGM), getString(R.string.login_with_gmail), Snackbar.LENGTH_SHORT);
                snackbar.show();
                Intent i_gmail=new Intent(MainActivity.this, LoginActivity.class);
                i_gmail.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i_gmail);
            }
        });
    }
}
