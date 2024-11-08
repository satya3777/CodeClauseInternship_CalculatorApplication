package com.example.calc;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button buttonAdd ,buttonSub,buttonMul,buttonClr,buttonDiv;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonEqual;

    TextView textView;
    EditText editText1;

    float value1, value2;
    boolean add, sub, mul, div;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //buttons
        buttonAdd = findViewById(R.id.btnAdd);
        buttonSub = findViewById(R.id.btnSub);
        buttonMul = findViewById(R.id.buttonmul);
        buttonDiv = findViewById(R.id.btnDiv);
        buttonClr = findViewById(R.id.buttonCE);
        buttonEqual = findViewById(R.id.btnEqual);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);


        textView = findViewById(R.id.textView);
        editText1 = findViewById(R.id.editTextText);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        button0.setOnClickListener(v -> editText1.append("0"));
        button1.setOnClickListener(v -> editText1.append("1"));
        button2.setOnClickListener(v -> editText1.append("2"));
        button3.setOnClickListener(v -> editText1.append("3"));
        button4.setOnClickListener(v -> editText1.append("4"));
        button5.setOnClickListener(v -> editText1.append("5"));
        button6.setOnClickListener(v -> editText1.append("6"));
        button7.setOnClickListener(v -> editText1.append("7"));
        button8.setOnClickListener(v -> editText1.append("8"));
        button9.setOnClickListener(v -> editText1.append("9"));


        buttonAdd.setOnClickListener(v -> {
            if (editText1.getText().length() != 0) {
                value1 = Float.parseFloat(editText1.getText().toString());
                add = true;
                editText1.setText(null);
            }
        });

        buttonSub.setOnClickListener(v -> {
            if (editText1.getText().length() != 0) {
                value1 = Float.parseFloat(editText1.getText().toString());
                sub = true;
                editText1.setText(null);
            }
        });

        buttonMul.setOnClickListener(v -> {
            if (editText1.getText().length() != 0) {
                value1 = Float.parseFloat(editText1.getText().toString());
                mul = true;
                editText1.setText(null);
            }
        });

        buttonDiv.setOnClickListener(v -> {
            if (editText1.getText().length() != 0) {
                value1 = Float.parseFloat(editText1.getText().toString());
                div = true;
                editText1.setText(null);
            }
        });

        buttonEqual.setOnClickListener(v -> {
            if (editText1.getText().length() != 0) {
                value2 = Float.parseFloat(editText1.getText().toString());

                if (add) {
                    editText1.setText(value1 + value2 + "");
                    add = false;
                }

                if (sub) {
                    editText1.setText(value1 - value2 + "");
                    sub = false;
                }

                if (mul) {
                    editText1.setText(value1 * value2 + "");
                    mul = false;
                }

                if (div) {
                    editText1.setText(value1 / value2 + "");
                    div = false;
                }
            }
        });

        buttonClr.setOnClickListener(v -> {
            editText1.setText("");
            textView.setText("");
        });
    }
}