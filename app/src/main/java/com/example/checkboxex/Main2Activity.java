package com.example.checkboxex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
TextView bill;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        bill=findViewById(R.id.textView2);

        Bundle b=this.getIntent().getExtras();
        String amount=b.getString("hotel");

        try{
            if (amount!=null){
                bill.setText(amount);
            }

        }catch (NullPointerException e){
            Toast.makeText(this, "You got Exception", Toast.LENGTH_SHORT).show();
        }

    }
}
