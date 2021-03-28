package mcm.edu.ph.takumicorporation_inheritancerpg20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Warrior extends AppCompatActivity {
    TextView textdisplay,a,b,c,d,e,f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warrior);
        textdisplay = findViewById(R.id.txtDMGWarrior);
        textdisplay.setText("650 ~ 1500");
        a = findViewById(R.id.txtHPWarrior);
        a.setText("3000");
        b = findViewById(R.id.txtMPWarrior);
        b.setText("500");
        c = findViewById(R.id.txtDEFWarrior);
        c.setText("150");
        d = findViewById(R.id.txtEvasionWarrior);
        d.setText("20%");
        e = findViewById(R.id.txtLuckWarrior);
        e.setText("35%");
        f = findViewById(R.id.txtAccuracyWarrior);
        f.setText("80%");

    }
}