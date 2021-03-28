package mcm.edu.ph.takumicorporation_inheritancerpg20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Necromancer extends AppCompatActivity {
    TextView textdisplay,a,b,c,d,e,f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_necromancer);
        textdisplay = findViewById(R.id.txtDMGNecro);
        textdisplay.setText("250 ~ 800");
        a = findViewById(R.id.txtHPNecro);
        a.setText("900");
        b = findViewById(R.id.txtMPNecro);
        b.setText("2500");
        c = findViewById(R.id.txtDEFNecro);
        c.setText("68");
        d = findViewById(R.id.txtEvasionNecro);
        d.setText("10%");
        e = findViewById(R.id.txtLuckNecro);
        e.setText("50%");
        f = findViewById(R.id.txtAccuracyNecro);
        f.setText("75%");

    }
}