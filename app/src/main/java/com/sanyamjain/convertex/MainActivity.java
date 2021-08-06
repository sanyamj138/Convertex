package com.sanyamjain.convertex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    public void btnClick(View view)
//    {
//        EditText dollarAmount = (EditText) findViewById(R.id.dollarAmount);
//        String dollars = dollarAmount.getText().toString();
//        Double doubleDollars = Double.parseDouble(dollars);
//        Double doubleINR = 74.4 * doubleDollars;
//        String toastText = doubleDollars + " $" + " = " + doubleINR.toString() + " Rs";
//        Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();
//    }

    private Button button;
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView3);
        editText = findViewById(R.id.dollarAmount);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Converting...", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                float dollar = Integer.parseInt(s);
                double rupee = 74.43 * dollar;
                textView.setText(String.format(dollar + " $ = " + rupee + " Rs"));
            }
        });
    }
}
