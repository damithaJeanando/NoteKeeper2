package com.example.notekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinnerCourses = (Spinner) findViewById(R.id.spinner_course);

        List<CourseInfo> courses = DataManager.getInstance().getCourses();
        ArrayAdapter<CourseInfo> adapterCourses = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item);
        adapterCourses.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerCourses.setAdapter(adapterCourses);

        
    }
}
