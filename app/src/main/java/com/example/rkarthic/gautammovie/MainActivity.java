package com.example.rkarthic.gautammovie;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Calendar;

public class MainActivity extends Activity implements
        View.OnClickListener{

    ImageView ivBgMatrix;
    Button btnDatePicker;
    EditText txtDate;
    private int mYear, mMonth, mDay;

    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivBgMatrix = (ImageView) findViewById(R.id.ivBgMatrix);
        AnimationDrawable bgAnimation = (AnimationDrawable) ivBgMatrix.getBackground();
        bgAnimation.start();

        btnDatePicker = (Button) findViewById(R.id.btn_date);
        txtDate = (EditText) findViewById(R.id.in_date);

        btnDatePicker.setOnClickListener(this);
        imageButton = (ImageButton)findViewById(R.id.ibFingerPrint);

        imageButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        // Get Current Date
        if(v.getId() == R.id.btn_date) {
            final Calendar c = Calendar.getInstance();
            mYear = c.get(Calendar.YEAR);
            mMonth = c.get(Calendar.MONTH);
            mDay = c.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datePickerDialog = new DatePickerDialog(
                    this, new mDateSetListener(), mYear, mMonth, mDay);

            datePickerDialog.show();
        }
        else if(v.getId() == R.id.ibFingerPrint)
        {
            Intent i = new Intent(MainActivity.this, ClimaxPage.class);
            startActivity(i);
        }
    }



    class mDateSetListener implements DatePickerDialog.OnDateSetListener {

        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {
            // TODO Auto-generated method stub
            // getCalender();
            int mYear = year;
            int mMonth = monthOfYear;
            int mDay = dayOfMonth;
            txtDate.setText(new StringBuilder()
                    // Month is 0 based so add 1
                    .append("    ").append(mMonth + 1).append("/").append(mDay).append("/")
                    .append(mYear).append(" "));
            System.out.println(txtDate.getText().toString());


        }
    }
}
    

