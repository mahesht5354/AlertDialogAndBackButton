package com.example.alertdialogandbackbutton;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed() {
        showAlert2();  
    }

    public void showAlert(View view) {
        showAlert2();
    }

    public void showAlert2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("This is Simple Title");
        builder.setMessage("This is message");
        builder.setIcon(R.drawable.ic_baseline_android_24);
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "No is pressed", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNeutralButton("Cancel", null);

        builder.show();

    }
}