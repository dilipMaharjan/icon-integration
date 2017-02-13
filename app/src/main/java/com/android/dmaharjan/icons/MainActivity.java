package com.android.dmaharjan.icons;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mikepenz.fontawesome_typeface_library.FontAwesome;
import com.mikepenz.iconics.IconicsDrawable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new IconicsDrawable(this)
                .icon(FontAwesome.Icon.faw_android)
                .color(Color.RED)
                .sizeDp(24);
        setContentView(R.layout.activity_main);
    }
}
