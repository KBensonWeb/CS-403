package com.kbwebs.kelsi.biogen;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class BioFill extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio_fill);
    }

    public void onCreateBio(View view) {
        EditText fName = (EditText)findViewById(R.id.InFName);
        EditText lName = (EditText)findViewById(R.id.InLName);
        EditText school = (EditText)findViewById(R.id.InSchool);
        EditText gradYear = (EditText)findViewById(R.id.InGradYear);
        Spinner major = (Spinner)findViewById(R.id.InMajor);
        EditText activities = (EditText)findViewById(R.id.InActivities);
        //RadioGridGroup degree = (RadioGridGroup)findViewById(R.id.degree);

        RadioGridGroup degree = (RadioGridGroup)findViewById(R.id.degree);
        String radiovalue = ((RadioButton)findViewById(degree.getCheckedRadioButtonId())).getText().toString();

        String bioText = fName.getText().toString() + " " + lName.getText().toString() + " graduated in "
                + gradYear.getText().toString() + " with a " + radiovalue + " with a concentration in "
                + major.getSelectedItem().toString()+ " from " + school.getText().toString()
                + ". Their favorite activities are " + activities.getText().toString() + ".";

        Intent intent = new Intent(view.getContext(), DisplayBioActivity.class);
        intent.putExtra("EXTRA_TEXT", bioText);
        startActivity(intent);
    }
}
