package com.example.myfirstapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = (Button) findViewById(R.id.addbtn); //Finds the button from the activity_main.xml file
        addBtn.setOnClickListener(new View.OnClickListener(){ //When the app is running it will check to see when the button is clicked and then perfrom the action associated with it
            @Override
            public void onClick(View view){ //The code for the click event goes inside here
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText); //Gets the string from the text box and stores it in the variable
                EditText secondNumEditText = (EditText) findViewById(R.id.SecondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                int num1 = Integer.parseInt(firstNumEditText.getText().toString()); //Gets the information from the text box and converts it to a string and it is converted again to an integer
                int num2 = Integer.parseInt(secondNumEditText.getText().toString());
                int result = num1 + num2;
                resultTextView.setText(result + "");
            }
        });
    }
}
