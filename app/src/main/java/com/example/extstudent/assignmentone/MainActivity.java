package com.example.extstudent.assignmentone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
/*
 * CSE41246 - Android Java Fundamentals
 * Fall 2019
 * Assignment #1
 * <Fan>, <Elaine>
 */
public class MainActivity extends AppCompatActivity {
    private String firstName;
    private String lastName;

    private TextView firstNameTextView = null;
    private TextView lastNameTextView = null;
    private TextView resultTextView = null;
    private Button submitButton = null;

    private TextView resultText = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Set Variables.
        this.firstNameTextView = (TextView)findViewById(R.id.editTextFirstName);
        this.lastNameTextView = (TextView)findViewById(R.id.editTextLastName);
        //this.resultText = (TextView) findViewById(R.id.textViewResult);
        this.resultTextView = (TextView)findViewById(R.id.textViewResult);
        this.submitButton = (Button)findViewById(R.id.submitButton);




        this.submitButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setUserInfo();
//
//                Log.d("Last Name" , lastName);
                showResults();
            }

        } );
    }

    private void setUserInfo() {
        if(this.firstNameTextView != null) {
            this.firstName = this.firstNameTextView.getText().toString();
            Log.i("First Name:", firstName);
            firstName = this.firstNameTextView.getText().toString();
            lastName = this.lastNameTextView.getText().toString();
        }
    }

    private void showResults() {


        String resultStr = " Hi, nice to meet you, " + firstName + " " + lastName;

        this.resultTextView.setText(resultStr);
    }

}
