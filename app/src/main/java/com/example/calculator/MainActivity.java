package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
	private EditText firstTextEdit;
	private EditText secondTextEdit;
	private Button divisionButton;
	private Button multiplicationButton;
	private Button subtractionButton;
	private Button additionButton;
	private TextView textView;
	private int result;
	private int firstTxtEdit;
	private int secondTxtEdit;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		textView = findViewById(R.id.result);
		
		divisionButton = findViewById(R.id.division);
		subtractionButton = findViewById(R.id.subtraction);
		multiplicationButton = findViewById(R.id.multiplication);
		additionButton = findViewById(R.id.addition);
		
		firstTextEdit = findViewById(R.id.first_number_input);
		secondTextEdit = findViewById(R.id.second_number_input);
		
		divisionButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try {
					firstTxtEdit = Integer.parseInt(firstTextEdit.getText().toString());
				}catch (NumberFormatException e){}
				try {
					secondTxtEdit = Integer.parseInt(secondTextEdit.getText().toString());
				}catch (NumberFormatException e){}
				if (secondTxtEdit != 0){
					result = (firstTxtEdit / secondTxtEdit);
					textView.setText(String.valueOf(result));
				}
				else
					Toast.makeText(getApplicationContext(), "Ошибка, при делениии на ноль", Toast.LENGTH_LONG).show();
			}
		});
		additionButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try {
					firstTxtEdit = Integer.parseInt(firstTextEdit.getText().toString());
				}catch (NumberFormatException e){}
				try {
					secondTxtEdit = Integer.parseInt(secondTextEdit.getText().toString());
				}catch (NumberFormatException e){}
				result = firstTxtEdit + secondTxtEdit;
				textView.setText(String.valueOf(result));
			}
		});
		multiplicationButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try {
					firstTxtEdit = Integer.parseInt(firstTextEdit.getText().toString());
				}catch (NumberFormatException e){}
				try {
					secondTxtEdit = Integer.parseInt(secondTextEdit.getText().toString());
				}catch (NumberFormatException e){}
				result = firstTxtEdit * secondTxtEdit;
				textView.setText(String.valueOf(result));
			}
		});
		subtractionButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try {
					firstTxtEdit = Integer.parseInt(firstTextEdit.getText().toString());
				}catch (NumberFormatException e){}
				try {
					secondTxtEdit = Integer.parseInt(secondTextEdit.getText().toString());
				}catch (NumberFormatException e){}
				result = firstTxtEdit - secondTxtEdit;
				textView.setText(String.valueOf(result));
			}
		});
	}
}