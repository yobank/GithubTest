package edu.tacoma.wa.githubtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Text button */
    public void displayJSActivity(View view) {
        Intent intent = new Intent(this, JustinSimActivity.class);
        startActivity(intent);
    }
}
