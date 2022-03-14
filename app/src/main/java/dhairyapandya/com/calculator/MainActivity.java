package dhairyapandya.com.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etFirstValue ,etSecondValue;
    TextView tvAns;
    ImageButton add;
    ImageButton subtract;
    ImageButton divide;
    ImageButton multiply;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFirstValue = findViewById(R.id.editTextNumberDecimal);
        etSecondValue = findViewById(R.id.editTextNumberDecimal2);
        tvAns = findViewById(R.id.editTextNumberDecimal3);
        add = findViewById(R.id.plus);
        subtract = findViewById(R.id.minus);
        multiply = findViewById(R.id.multipication);
        divide = findViewById(R.id.division);

                add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int first_value , second_value , final_answer;
                first_value=Integer.parseInt(etFirstValue.getText().toString());
                second_value=Integer.parseInt(etSecondValue.getText().toString());
                final_answer= first_value + second_value ;
                tvAns.setText("= " + final_answer);
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int first_value , second_value , final_answer;
                first_value=Integer.parseInt(etFirstValue.getText().toString());
                second_value=Integer.parseInt(etSecondValue.getText().toString());
                final_answer= first_value - second_value ;
                tvAns.setText("= " + final_answer);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int first_value , second_value , final_answer;
                first_value=Integer.parseInt(etFirstValue.getText().toString());
                second_value=Integer.parseInt(etSecondValue.getText().toString());
                final_answer= first_value * second_value ;
                tvAns.setText("= " + final_answer);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int first_value , second_value , final_answer;
                first_value=Integer.parseInt(etFirstValue.getText().toString());
                second_value=Integer.parseInt(etSecondValue.getText().toString());
                final_answer= first_value / second_value ;
                tvAns.setText("= " + final_answer);
            }
        });

    }
}