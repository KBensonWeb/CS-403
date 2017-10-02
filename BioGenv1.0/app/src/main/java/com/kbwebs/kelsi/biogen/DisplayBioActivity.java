package com.kbwebs.kelsi.biogen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayBioActivity extends Activity {
    public static final String EXTRA_TEXT = "bio";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_bio);


        Intent intent = getIntent();
        String bioText = intent.getStringExtra("EXTRA_TEXT");
        TextView bioView = (TextView)findViewById(R.id.bioView);
        bioView.setText(bioText);
    }
}
