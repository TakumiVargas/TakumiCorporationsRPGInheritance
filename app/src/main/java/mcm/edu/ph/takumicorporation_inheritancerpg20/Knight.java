package mcm.edu.ph.takumicorporation_inheritancerpg20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Knight extends AppCompatActivity {
    TextView textdisplay,a,b,c,d,e,f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knight);
        textdisplay = findViewById(R.id.txtDMGKnight);
        textdisplay.setText("450 ~ 900");
        a = findViewById(R.id.txtHPKnight);
        a.setText("1500");
        b = findViewById(R.id.txtMPKnight);
        b.setText("250");
        c = findViewById(R.id.txtDEFKnight);
        c.setText("370");
        d = findViewById(R.id.txtEvasionKnight);
        d.setText("20%");
        e = findViewById(R.id.txtLuckKnight);
        e.setText("10%");
        f = findViewById(R.id.txtAccuracyKnight);
        f.setText("100%");

    }
}