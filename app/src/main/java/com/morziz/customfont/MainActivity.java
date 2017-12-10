package com.morziz.customfont;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


   /*  <style name="CustomFont" parent="TextAppearance.AppCompat.Title">
    <item name="android:fontFamily">@font/ubuntu</item>
     </style>*/

 //   implementation 'com.android.support:support-compat:26.0.1'


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView1);
        Typeface typeface = ResourcesCompat.getFont(this, R.font.burnstown_dam);
        textView.setTypeface(typeface);

    }
}
