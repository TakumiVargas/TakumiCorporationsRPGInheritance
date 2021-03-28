package mcm.edu.ph.takumicorporation_inheritancerpg20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Marksman extends AppCompatActivity {
    TextView textdisplay,a,b,c,d,e,f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marksman);
        textdisplay = findViewById(R.id.txtDMGMM);
        textdisplay.setText("555~ 1250");
        a = findViewById(R.id.txtHPMM);
        a.setText("1500");
        b = findViewById(R.id.txtMPMM);
        b.setText("250");
        c = findViewById(R.id.txtDEFMM);
        c.setText("125");
        d = findViewById(R.id.txtEvasionMM);
        d.setText("60%");
        e = findViewById(R.id.txtLuckMM);
        e.setText("30%");
        f = findViewById(R.id.txtAccuracyMM);
        f.setText("100%");

    }
}