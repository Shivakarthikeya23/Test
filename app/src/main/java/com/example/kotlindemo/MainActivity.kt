package com.example.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.button);
        var txt = findViewById<TextView>(R.id.textView);

        var flag = false;
        btn.setOnClickListener(View.OnClickListener {
            if (flag){
                txt.setText("Shiva KArthik")
                flag = false;
            }
            else{
                txt.setText("Hello World");
                flag=true;
            }
        })
    }
}