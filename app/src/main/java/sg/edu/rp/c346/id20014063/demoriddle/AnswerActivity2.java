package sg.edu.rp.c346.id20014063.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {
    TextView tvAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);

        tvAnswer = findViewById(R.id.tvAnswer);
        Intent intentReceieved = getIntent();
        String QuestionSelected = intentReceieved.getStringExtra("Question");
        tvAnswer.setText(QuestionSelected + " answer is gone");
    }
}