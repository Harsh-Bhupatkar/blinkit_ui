package com.example.blinkit_clone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class product extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.styleBack));
        TextView textView = findViewById(R.id.textStrike);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        TextView textView1 = findViewById(R.id.textStrike2);
        textView1.setPaintFlags(textView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        TextView textView2 = findViewById(R.id.textStrike3);
        textView2.setPaintFlags(textView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

        ImageView img=findViewById(R.id.back);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(product.this,MainActivity.class);
                startActivity(i);
            }
        });


    }
}