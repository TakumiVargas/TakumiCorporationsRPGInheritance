package mcm.edu.ph.takumicorporation_inheritancerpg20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Mage extends AppCompatActivity {
    TextView textdisplay,a,b,c,d,e,f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mage2);
        Button btn1 = findViewById(R.id.btnHealer);
        Button btn2 = findViewById(R.id.btnNecro);
        textdisplay = findViewById(R.id.txtMageDMG);
        textdisplay.setText("50 ~ 100");
        a = findViewById(R.id.txtHPMage);
        a.setText("460");
        b = findViewById(R.id.txtMPMage);
        b.setText("200");
        c = findViewById(R.id.txtDEFMage);
        c.setText("35");
        d = findViewById(R.id.txtEvasionMage);
        d.setText("10%");
        e = findViewById(R.id.txtLuckMage);
        e.setText("20%");
        f = findViewById(R.id.txtAccuracyMage);
        f.setText("80%");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(Mage.this,Healer.class);
                startActivity(int1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(Mage.this,Necromancer.class);
                startActivity(int2);
            }
        });
    }
}