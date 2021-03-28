package mcm.edu.ph.takumicorporation_inheritancerpg20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Hunter extends AppCompatActivity {
    TextView textdisplay,a,b,c,d,e,f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hunter);
        textdisplay = findViewById(R.id.txtDMGHunter);
        textdisplay.setText("500 ~ 1120");
        a = findViewById(R.id.txtHPHunter);
        a.setText("1050");
        b = findViewById(R.id.txtMPHunter);
        b.setText("450");
        c = findViewById(R.id.txtDEFHunter);
        c.setText("100");
        d = findViewById(R.id.txtEvasionHunter);
        d.setText("50%");
        e = findViewById(R.id.txtLuckHunter);
        e.setText("40%");
        f = findViewById(R.id.txtAccuracyHunter);
        f.setText("100%");

    }
}