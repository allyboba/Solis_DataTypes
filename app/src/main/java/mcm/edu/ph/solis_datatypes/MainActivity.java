package mcm.edu.ph.solis_datatypes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView display;
        display = findViewById(R.id.displayTxt);


        String firstName = "Alyannah Martine";
        char middleInitial ='T';
        String lastname = "Solis";
        int myAge = 17;
        float myDreamTVLGrade = 100.0f;
        double myMoney =99999.99;



        display.setText("My name is "+firstName+ " "
                +String.valueOf(middleInitial)+ " "
                +lastname+ "\n and my age is "
                +myAge+ ".\n I want my grade in TVL3 to be "
                +String.valueOf(myDreamTVLGrade));

        boolean amIMarried = false;
    }
}