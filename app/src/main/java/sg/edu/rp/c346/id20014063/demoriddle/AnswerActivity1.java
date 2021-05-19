package sg.edu.rp.c346.id20014063.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity1 extends AppCompatActivity {
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);

        tvAnswer = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        String questionSelected = intentReceived.getStringExtra("Question");
        if (questionSelected.equalsIgnoreCase("q1")) {
            tvAnswer.setText(questionSelected + " answer is: Queue");
        } else {
            tvAnswer.setText(questionSelected + " answer is: Gone");
        }
    }
}