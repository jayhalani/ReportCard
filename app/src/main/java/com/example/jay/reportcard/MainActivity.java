package com.example.jay.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String result = "";
        ArrayList<ReportCard> report = new ArrayList<ReportCard>();
        report.add(new ReportCard("Gujarati", 75.0));
        report.add(new ReportCard("Maths", 82.0));
        report.add(new ReportCard("Sanskrit", 79.0));
        report.add(new ReportCard("Science", 89.0));
        report.add(new ReportCard("History", 92.0));

        TextView Subjects = (TextView) findViewById(R.id.ReportTextView);
        for (ReportCard list : report) {
            result += list.toString() + "\n\n";
        }

        Subjects.setText(result);

    }

}
