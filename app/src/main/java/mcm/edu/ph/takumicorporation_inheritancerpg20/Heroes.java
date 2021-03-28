package mcm.edu.ph.takumicorporation_inheritancerpg20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Heroes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroes);

        Button btn1 =  findViewById(R.id.btnFighter);
        Button btn2 =  findViewById(R.id.btnAssassin);
        Button btn3 =  findViewById(R.id.btnMage);
        Button btn4 =  findViewById(R.id.btnArcher);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(Heroes.this,Fighterkek.class);
                startActivity(int1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(Heroes.this,Assassin.class);
                startActivity(int2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(Heroes.this,Mage.class);
                startActivity(int3);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4 = new Intent(Heroes.this,Archer.class);
                startActivity(int4);
            }
        });

    }
}