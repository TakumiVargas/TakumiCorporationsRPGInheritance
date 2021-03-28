package mcm.edu.ph.takumicorporation_inheritancerpg20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Healer extends AppCompatActivity {
    TextView textdisplay,a,b,c,d,e,f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healer);
        textdisplay = findViewById(R.id.txtDMGHealer);
        textdisplay.setText("50 ~ 500");
        a = findViewById(R.id.txtHPHealer);
        a.setText("1500");
        b = findViewById(R.id.txtMPHealer);
        b.setText("2000");
        c = findViewById(R.id.txtDEFHealer);
        c.setText("75");
        d = findViewById(R.id.txtEvasionHealer);
        d.setText("5%");
        e = findViewById(R.id.txtLuckHealer);
        e.setText("50%");
        f = findViewById(R.id.txtAccuracyHealer);
        f.setText("100%");

    }
}