package com.example.jay.reportcard;

/**
 * Created by Jay on 3/13/2017.
 */

public class ReportCard {

    private String mSubjectName;
    private double mMarks;

    public ReportCard(String SubjectName, double Marks) {

        this.mSubjectName = SubjectName;
        this.mMarks = Marks;

    }

    public String getSubjectName() {
        return mSubjectName;
    }

    public double getMarks() {
        return mMarks;
    }

    public void setName(String SubjectName) {
        this.mSubjectName = SubjectName;
    }

    public void setMarks(double Marks) {
        //this.mMarks = Marks;

        if (mMarks >= 0 && mMarks <= 100.0) {
            this.mMarks = Marks;
        } else {
            this.mMarks = 0.0;
            System.out.println(Marks + " is not a Valid Grade.");
        }
    }

    @Override
    public String toString() {
        return "Subject: " + mSubjectName + " Marks: " + mMarks;
    }

}
