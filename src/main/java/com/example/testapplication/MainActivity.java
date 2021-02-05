package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    Calendar CL0, CL1;
    TextView TV0, TV1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CL0 = Calendar.getInstance();
        TV0 = findViewById(R.id.showSpace);
        TV1 = findViewById(R.id.showSpace2);

        TV0.setText(CalendarToString(CL0));
    }

    public void buttonOnClick(View v){
        CL1 = Calendar.getInstance();

        SimpleDateFormat sdf = new SimpleDateFormat("M/d HH:mm:ss");

        TV0.setText(CalendarToString(CL0));
        TV1.setText(sdf.format(CL1.getTime()));

        //CL1.clear();
    }

    public String CalendarToString(Calendar cl){
        return cl.get(Calendar.MONTH)+1 + "/" + cl.get(Calendar.DATE) + " "
                + cl.get(Calendar.HOUR_OF_DAY) + ":" + cl.get(Calendar.MINUTE) + ":" + cl.get(Calendar.SECOND);
    }
}