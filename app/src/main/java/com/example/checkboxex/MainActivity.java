package com.example.checkboxex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox c1,c2,c3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=findViewById(R.id.checkBox);
        c2=findViewById(R.id.checkBox2);
        c3=findViewById(R.id.checkBox3);

    }

    public void cal(View view) {

if (view.getId()==R.id.button){
int amount=0;
    StringBuffer s=new StringBuffer();


    if (c1.isChecked()){
        int dosa=60;
        amount=amount+dosa;
        s.append("Dosa Price::").append(dosa).append("\n");
        Toast.makeText(this, "Dosa is ordered!!!", Toast.LENGTH_SHORT).show();

    }

    if (c2.isChecked()){
        int idly=13;
        amount+=idly;
        s.append("Idly Price::").append(idly).append("\n");
        Toast.makeText(this, "Idly is ordered!!!", Toast.LENGTH_SHORT).show();
    }
    if (c3.isChecked()){

        int vada=7;
        amount+=vada;
        s.append("Vada Price::").append(vada).append("\n");
        Toast.makeText(this, "Vada is ordered!!!", Toast.LENGTH_SHORT).show();
    }


    if (amount==0){
        Toast.makeText(this, "No ordered!!!", Toast.LENGTH_SHORT).show();
    }else {
          s.append("\n Total bill::").append(amount);
        Toast.makeText(this, "Your bill amount::"+s, Toast.LENGTH_SHORT).show();
    }



    Bundle b=new Bundle();
    b.putString("hotel",String.valueOf(s));
    Intent i=new Intent(MainActivity.this,Main2Activity.class);
    i.putExtras(b);
    startActivity(i);


    }

    }
}
