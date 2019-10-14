package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class TestActivity extends AppCompatActivity {
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        radioGroup=findViewById(R.id.radiogroup);



        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                if (i == R.id.btnandroid){
                    Toast.makeText(TestActivity.this, "Android", Toast.LENGTH_SHORT).show();
                }
                if (i == R.id.btnapi){
                    Toast.makeText(TestActivity.this, "Web Api", Toast.LENGTH_SHORT).show();
                }
                if (i == R.id.btniot){
                    Toast.makeText(TestActivity.this, "IOT", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}




/*android final project marking scheme

1 vcs, branching, merging
2 design
3 programming logic
4 data persistency
5 testing, wearable and sensors
 */
