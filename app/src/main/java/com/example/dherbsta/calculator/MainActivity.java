package com.example.dherbsta.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText operand1;
    private EditText operand2;
    private Button btnAddition;
    private Button btnSubstraction;
    private Button btnDivision;
    private Button btnMultiplication;
    private Button clrButton;
    private TextView txtResult;
    private TextView resultLabel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operand1 = (EditText) findViewById(R.id.firstline);
        operand2 = (EditText) findViewById(R.id.secondline);
        btnAddition = (Button) findViewById(R.id.btnAddition);
        btnSubstraction= (Button) findViewById(R.id.btnSubtraction);
        clrButton= (Button) findViewById(R.id.clearbutton);
        btnDivision = (Button) findViewById(R.id.btnDivision);
        btnMultiplication = (Button) findViewById(R.id.btnMultiplication);
        txtResult = (TextView) findViewById(R.id.txtResult);
        resultLabel = (TextView) findViewById(R.id.textView2);




        txtResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1.setText(txtResult.getText(),TextView.BufferType.EDITABLE);
                operand2.setText("",TextView.BufferType.EDITABLE);
                resultLabel.setVisibility(View.INVISIBLE);
            }
        });

        //clear button
        clrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1.setText("",TextView.BufferType.EDITABLE);
                operand2.setText("",TextView.BufferType.EDITABLE);

            }
        });


        //addition
        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double oper1 =Double.parseDouble(operand1.getText().toString());
                double oper2 =Double.parseDouble(operand2.getText().toString());

                double theResult = oper1 +oper2;
                txtResult.setText(Double.toString(theResult));
            }
        });
//substraction
        btnSubstraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double oper1 =Double.parseDouble(operand1.getText().toString());
                double oper2 =Double.parseDouble(operand2.getText().toString());

                double theResult = oper1 - oper2;
                txtResult.setText(Double.toString(theResult));
            }
        });

//division
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double oper1 =Double.parseDouble(operand1.getText().toString());
                double oper2 =Double.parseDouble(operand2.getText().toString());

                if (oper1 == 0 && oper2==0){
                    txtResult.setText("Can't divide zero by zero fam");
                }
                else {
                    double theResult = oper1 / oper2;
                    txtResult.setText(Double.toString(theResult));
                }
            }
        });

        //multiplication
        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double oper1 =Double.parseDouble(operand1.getText().toString());
                double oper2 =Double.parseDouble(operand2.getText().toString());

                double theResult = oper1 * oper2;
                txtResult.setText(Double.toString(theResult));
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
