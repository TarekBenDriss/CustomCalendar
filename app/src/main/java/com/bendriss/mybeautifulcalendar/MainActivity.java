package com.bendriss.mybeautifulcalendar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.bendriss.customcalendar.CustomCalendar;
import com.bendriss.customcalendar.DoubleCustomCalendar;

public class MainActivity extends AppCompatActivity {

    private CustomCalendar singleCalendar;
    private DoubleCustomCalendar doubleCalendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_calendar);

        singleCalendar = findViewById(R.id.calendar1);
        doubleCalendar = findViewById(R.id.calendar2);
        singleCalendar.setActivity(this);
        doubleCalendar.setActivity(this);

        Button b = findViewById(R.id.change);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (singleCalendar.getVisibility()==View.VISIBLE)
                {
                    doubleCalendar.setVisibility(View.VISIBLE);
                    singleCalendar.setVisibility(View.INVISIBLE);
                }
                else
                {
                    doubleCalendar.setVisibility(View.INVISIBLE);
                    singleCalendar.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}