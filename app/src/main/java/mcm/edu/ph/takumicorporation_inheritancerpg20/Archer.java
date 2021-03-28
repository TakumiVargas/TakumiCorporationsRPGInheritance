package mcm.edu.ph.takumicorporation_inheritancerpg20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Archer extends AppCompatActivity {
    TextView textdisplay,a,b,c,d,e,f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_archer);
        Button btn1 = findViewById(R.id.btnHunter);
        Button btn2 = findViewById(R.id.btnMarksman);
        textdisplay = findViewById(R.id.txtArcherDMG);
        textdisplay.setText("60 ~ 125");
        a = findViewById(R.id.txtHPArcher);
        a.setText("500");
        b = findViewById(R.id.txtMPArcher);
        b.setText("100");
        c = findViewById(R.id.txtDEFArcher);
        c.setText("25");
        d = findViewById(R.id.txtEvasionArcher);
        d.setText("50%");
        e = findViewById(R.id.txtLuckArcher);
        e.setText("20%");
        f = findViewById(R.id.txtAccuracyArcher);
        f.setText("100%");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(Archer.this, Hunter.class);
                startActivity(int1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(Archer.this,Marksman.class);
                startActivity(int2);
            }
        });

    }
}