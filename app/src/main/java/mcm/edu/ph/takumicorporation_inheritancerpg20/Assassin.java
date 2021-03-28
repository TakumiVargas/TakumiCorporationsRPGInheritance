package mcm.edu.ph.takumicorporation_inheritancerpg20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Assassin extends AppCompatActivity {
    TextView textdisplay,a,b,c,d,e,f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assassin);
        Button btn1 = findViewById(R.id.btnNinja);
        Button btn2 = findViewById(R.id.btnThief);
        textdisplay = findViewById(R.id.txtAssassinDMG);
        textdisplay.setText("75 ~ 125");
        a = findViewById(R.id.txtHPAssassin);
        a.setText("400");
        b = findViewById(R.id.txtMPAssassin);
        b.setText("200");
        c = findViewById(R.id.txtDEFAssassin);
        c.setText("20");
        d = findViewById(R.id.txtEvasionAssassin);
        d.setText("60%");
        e = findViewById(R.id.txtLuckAssassin);
        e.setText("10%");
        f = findViewById(R.id.txtAccuracyAssassin);
        f.setText("100%");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(Assassin.this, Nnija.class);
                startActivity(int1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(Assassin.this,Thief.class);
                startActivity(int2);
            }
        });
    }
}