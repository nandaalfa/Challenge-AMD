package com.example.projek1mad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class btnActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn);

        Button button = findViewById(R.id.butonbeli);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.butonbeli:
                Toast.makeText(this, "Ditambah ke keranjang", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
