package com.example.android.rickandmortyquiz;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String correctAnswer1 = "Rick";
    String correctAnswer4 = "14";
    String correctAnswer6 = "Sarah Chalke";
    String correctAnswer8 = "2013";
    int verdictFor1 = 0;
    int verdictFor2 = 0;
    int verdictFor3 = 0;
    int verdictFor4 = 0;
    int verdictFor5 = 0;
    int verdictFor6 = 0;
    int verdictFor7 = 0;
    int verdictFor8 = 0;
    int verdictFor9 = 0;
    int verdictFor10 = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * This method is called when the submit button is pressed
     */
    public void submitAnswers(View view) {
        /**
         * Calling the methods that check the answers.
         */
        checkAnswer1(view);
        checkAnswer2(view);
        checkAnswer3(view);
        checkAnswer4(view);
        checkAnswer5(view);
        checkAnswer6(view);
        checkAnswer7(view);
        checkAnswer8(view);
        checkAnswer9(view);
        checkAnswer10(view);

        /**
         * If the answer is correct the verdict is 1 else it's 0. Therefore, adding up the variables to obtain the number of correct answers.
         */
        int numberOfCorrectAnswers = verdictFor1 + verdictFor2 + verdictFor3 + verdictFor4 + verdictFor5 + verdictFor6 + verdictFor7 + verdictFor7 +verdictFor8 + verdictFor9 + verdictFor10;
        Toast.makeText(this, "You have answered correctly " + numberOfCorrectAnswers + " out of 10 questions!", Toast.LENGTH_LONG).show();
    }
    /**
     * The answer for question 1 is checked here
     */
    public void checkAnswer1 (View view){
        EditText editText1 = (EditText) findViewById(R.id.answer_1);
        String inputAnswer1 = editText1.getText().toString();
        if (correctAnswer1.equals(inputAnswer1)) {
            verdictFor1 = 1;
        } else {
            verdictFor1 = 0;
        }
    }
    /**
     * The answer for question 2 is checked here
     */
    public void checkAnswer2 (View view){
        CheckBox checkStatusMorty = (CheckBox) findViewById(R.id.morty_checkbox);
        boolean checkedMorty = checkStatusMorty.isChecked();
        CheckBox checkStatusBeth = (CheckBox) findViewById(R.id.beth_checkbox);
        boolean checkedBeth = checkStatusBeth.isChecked();
        CheckBox checkStatusSummer = (CheckBox) findViewById(R.id.summer_checkbox);
        boolean checkedSummer = checkStatusSummer.isChecked();
        CheckBox checkStatusJerry = (CheckBox) findViewById(R.id.jerry_checkbox);
        boolean checkedJerry = checkStatusJerry.isChecked();
        if ((checkedMorty) && (checkedBeth) && (checkedSummer) && (checkedJerry)){
            verdictFor2 = 1;
        } else {
            verdictFor2 = 0;
        }
    }
    /**
     * The answer for question 3 is checked here
     */
    public void checkAnswer3 (View view){
        RadioButton checkRadioStatus = (RadioButton) findViewById(R.id.can_do_radio_button);
        boolean radioIsChecked = checkRadioStatus.isChecked();
        if (radioIsChecked){
            verdictFor3 = 1;
        } else {
            verdictFor3 = 0;
        }
    }
    /**
     * The answer for question 4 is answered here
     */
    public void checkAnswer4 (View view){
        EditText editText1 = (EditText) findViewById(R.id.answer_4);
        String inputAnswer4 = editText1.getText().toString();
        if (correctAnswer4.equals(inputAnswer4)) {
            verdictFor4 = 1;
        } else {
            verdictFor4 = 0;
        }
    }
    /**
     * The answer for question 5 is checked here
     */
    public void checkAnswer5 (View view){
        RadioButton checkRadioStatus = (RadioButton) findViewById(R.id.yes_radio_button);
        boolean radioIsChecked = checkRadioStatus.isChecked();
        if (radioIsChecked){
            verdictFor5 = 1;
        } else {
            verdictFor5 = 0;
        }
    }
    /**
     * The answer for question 6 is answered here
     */
    public void checkAnswer6 (View view){
        EditText editText = (EditText) findViewById(R.id.answer_6);
        String inputAnswer6 = editText.getText().toString();
        if (correctAnswer6.equals(inputAnswer6)) {
            verdictFor6 = 1;
        } else {
            verdictFor6 = 0;
        }
    }
    /**
     * The answer for question 7 is checked here
     */
    public void checkAnswer7 (View view){
        RadioButton checkRadioStatus = (RadioButton) findViewById(R.id.three_radio_button);
        boolean radioIsChecked = checkRadioStatus.isChecked();
        if (radioIsChecked){
            verdictFor7 = 1;
        } else {
            verdictFor7 = 0;
        }
    }
    /**
     * The answer for question 8 is answered here
     */
    public void checkAnswer8 (View view){
        EditText editText = (EditText) findViewById(R.id.answer_8);
        String inputAnswer8 = editText.getText().toString();
        if (correctAnswer8.equals(inputAnswer8)) {
            verdictFor8 = 1;
        } else {
            verdictFor8 = 0;
        }
    }
    /**
     * The answer for question 9 is checked here
     */
    public void checkAnswer9 (View view){
        CheckBox checkStatusJustin = (CheckBox) findViewById(R.id.justin_checkbox);
        boolean checkedJustin = checkStatusJustin.isChecked();
        CheckBox checkStatusDan = (CheckBox) findViewById(R.id.dan_checkbox);
        boolean checkedDan = checkStatusDan.isChecked();
        CheckBox checkStatusSarah = (CheckBox) findViewById(R.id.sarah_checkbox);
        boolean checkedSarah = checkStatusSarah.isChecked();
        CheckBox checkStatusMatt = (CheckBox) findViewById(R.id.matt_checkbox);
        boolean checkedMatt = checkStatusMatt.isChecked();
        if ((checkedJustin) && (checkedDan) && (!checkedSarah) && (!checkedMatt)){
            verdictFor9 = 1;
        } else {
            verdictFor9 = 0;
        }
    }
    /**
     * The answer for question 10 is checked here
     */
    public void checkAnswer10 (View view){
        RadioButton checkRadioStatus = (RadioButton) findViewById(R.id.pain_radio_button);
        boolean radioIsChecked = checkRadioStatus.isChecked();
        if (radioIsChecked){
            verdictFor10 = 1;
        } else {
            verdictFor10 = 0;
        }
    }

    public void resetApp (View view){
        Intent MainActivity = getBaseContext().getPackageManager()
                .getLaunchIntentForPackage( getBaseContext().getPackageName() );
        MainActivity.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(MainActivity);
    }




    public void demandHint1 (View view){
        Toast.makeText(this, "You really felt the need for a hint, huh? Well, it certainly isn't Birdperson!", Toast.LENGTH_LONG).show();
    }
    public void demandHint2 (View view){
        Toast.makeText(this, "I can't believe you don't know this one!", Toast.LENGTH_LONG).show();
    }
    public void demandHint3 (View view){
        Toast.makeText(this, "C'mon Mr. Smartie Pants, two of them are clearly NOT the answer, just word-play!", Toast.LENGTH_LONG).show();
    }
    public void demandHint4 (View view){
        Toast.makeText(this, "Also, the exact number of lines in a sonnet or the number of days in a fortnight.", Toast.LENGTH_LONG).show();
    }
    public void demandHint5 (View view){
        Toast.makeText(this, "Think like a Jerry, think wrong!", Toast.LENGTH_LONG).show();
    }
    public void demandHint6 (View view){
        Toast.makeText(this, "She starred in Scrubs as a blue-eyed, blonde doctor.", Toast.LENGTH_LONG).show();
    }
    public void demandHint7 (View view){
        Toast.makeText(this, "How many colors does Romania's flag has?", Toast.LENGTH_LONG).show();
    }
    public void demandHint8 (View view){
        Toast.makeText(this, "Pay attention to the last question!", Toast.LENGTH_LONG).show();
    }
    public void demandHint9 (View view){
        Toast.makeText(this, "There's only two creators.", Toast.LENGTH_LONG).show();
    }
    public void demandHint10 (View view){
        Toast.makeText(this, "Duck, duck, GOOSE!", Toast.LENGTH_LONG).show();
    }

}
