package com.amirmohammed.seniorframgnets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class WhatsAppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whats_app);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout, new ChatsFragment())
                .commit();

        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }

    public void showCustomDialog() {
        getSupportFragmentManager()
                .beginTransaction()
                .add(new CustomDialogFragment(), "CustomDialog")
                .commit();

//        getSupportFragmentManager().findFragmentByTag("CustomDialog")
    }

    public void showChats(View view) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout, new ChatsFragment())
                .commit();
    }

    public void showStatus(View view) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout, new StatusFragment())
                .commit();
    }

    public void showCalls(View view) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout, new CallsFragment())
                .commit();
    }

}