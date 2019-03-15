package com.example.labo2e1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button click;
    private TextView resp;
    private EditText user;
    private EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click = findViewById(R.id.btn_click);
        resp = findViewById(R.id.lbl_response);
        user = findViewById(R.id.txt_user);
        pass = findViewById(R.id.txt_pass);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resp.setText(user.getText());
            }
        });

        click.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                resp.setText(pass.getText());
                return true;
            }

        });
    }
}
