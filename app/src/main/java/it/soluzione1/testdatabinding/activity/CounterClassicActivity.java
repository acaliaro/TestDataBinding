package it.soluzione1.testdatabinding.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import it.soluzione1.testdatabinding.R;

public class CounterClassicActivity extends AppCompatActivity {

    private int _result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter_classic);

        Button button = findViewById(R.id.button_increment);
        TextView textView = findViewById(R.id.text_view_result);
        textView.setText(String.valueOf(_result));

        button.setOnClickListener(view -> {
            _result++;
            textView.setText(String.valueOf(_result));
        });
    }
}
