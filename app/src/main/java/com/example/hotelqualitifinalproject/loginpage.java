package com.example.hotelqualitifinalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;

public class loginpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        TextView registerbutton =(TextView) findViewById(R.id.registerButton);

        String text = "Não possui uma conta? Registre-se aqui!";

        SpannableString ss = new SpannableString(text);

        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {
                Intent intent = new Intent(loginpage.this, RegisterPage.class);
                startActivity(intent);
            }
        };
        ss.setSpan(clickableSpan, 22, 38, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        registerbutton.setText(ss);
        registerbutton.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void reservationButton (View v) {
        Intent intent = new Intent(this, ReservationOptions.class);
        startActivity(intent);
    }
}
