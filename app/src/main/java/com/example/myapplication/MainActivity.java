package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
    private EditText editText;
    private Button button;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Убедитесь, что layout называется activity_main.xml
        editText = findViewById(R.id.editTextText2);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        button.setOnClickListener(v -> {
            String input = editText.getText().toString();

            if (input.length() != 1 || !Character.isUpperCase(input.charAt(0)) || !Character.isLetter(input.charAt(0))) {
                textView.setText("Введите латинскую прописную букву.");
                return;
            }

            char character = input.charAt(0);
            if (character == 'L' || character == 'M' || character == 'K' || character == 'D') {
                textView.setText("Это согласные буквы.");
            } else {
                textView.setText("Возможно, это гласные буквы.");
            }
        });
    }
}
