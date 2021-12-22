package com.example.learn;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Hello", "In onCreate");

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String idNumber = editText.getText().toString().trim();

                String dob = idNumber.substring(0, 6);

                int gender = Integer.parseInt(Character.toString(idNumber.charAt(6)));

                String genderType;
                if (gender < 5) {
                    genderType = "Female";
                } else {
                    genderType = "Male";
                }
                int citizen= Integer.parseInt(Character.toString(idNumber.charAt(10)));

                String citizenShip;
                if(citizen == 0){
                    citizenShip= "SA Citizen";
                    }
                else{
                    citizenShip = "Permanent Resident";
                }

                String text = "Date of Birth is: "+ dob + "\n"
                        + "Gender of the individual is: "+ genderType + "\n"
                        + "Citizenship of the individual is: " + citizenShip ;

                textView.setText(text);
            }
        });

    }

}