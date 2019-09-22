package com.example.projek1mad;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import static com.example.projek1mad.R.id.gambarnasgor;

public class Menu extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ImageButton gambarnasgor  = findViewById(R.id.gambarnasgor);
        gambarnasgor.setOnClickListener(this);

        ImageButton gambarmiegoreng = findViewById(R.id.gambarmiegoreng);
        gambarmiegoreng.setOnClickListener(this);

        ImageButton kuecubitjpg = findViewById(R.id.kuecubitjpg);
        kuecubitjpg.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case gambarnasgor:
                Intent intent = new Intent(Menu.this, btnActivity.class);
                startActivity(intent);
                break;

            case R.id.gambarmiegoreng:
                Intent intent2 = new Intent(Menu.this, MieGoreng.class);
                startActivity(intent2);
                break;

            case R.id.kuecubitjpg:
                Intent intent3 = new Intent(Menu.this, KueCubit.class);
                startActivity(intent3);
                break;
        }
    }
}