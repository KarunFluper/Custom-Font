package com.morziz.customfont;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


   /*  <style name="CustomFont" parent="TextAppearance.AppCompat.Title">
    <item name="android:fontFamily">@font/ubuntu</item>
     </style>*/

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.textView1);
        Typeface typeface = getResources().getFont(R.font.grafik_text);
        textView.setTypeface(typeface);

    }
}
