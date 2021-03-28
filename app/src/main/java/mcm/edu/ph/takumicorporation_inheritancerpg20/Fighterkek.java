package mcm.edu.ph.takumicorporation_inheritancerpg20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Fighterkek extends AppCompatActivity {
    TextView textdisplay,a,b,c,d,e,f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fighterkek);
        Button btn1 = findViewById(R.id.btnKnight);
        Button btn2 = findViewById(R.id.btnWarrior);
        textdisplay = findViewById(R.id.txtFighterDMG);
        textdisplay.setText("50 ~ 100");
        a = findViewById(R.id.txtHP);
        a.setText("500");
        b = findViewById(R.id.txtMP);
        b.setText("100");
        c = findViewById(R.id.txtDEF);
        c.setText("50");
        d = findViewById(R.id.txtEvasion);
        d.setText("10%");
        e = findViewById(R.id.txtLuck);
        e.setText("10%");
        f = findViewById(R.id.txtAccuracy);
        f.setText("100%");



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(Fighterkek.this,Knight.class);
                startActivity(int1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(Fighterkek.this,Warrior.class);
                startActivity(int2);
            }
        });
    }
}