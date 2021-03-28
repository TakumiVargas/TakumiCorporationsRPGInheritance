package mcm.edu.ph.takumicorporation_inheritancerpg20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Automaton extends AppCompatActivity {
    TextView textdisplay,a,b,c,d,e,f,g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_automaton);
        textdisplay = findViewById(R.id.txtDMGAuto);
        textdisplay.setText("85 ~ 135");
        a = findViewById(R.id.txtHPAuto);
        a.setText("600");
        b = findViewById(R.id.txtMPAuto);
        b.setText("50");
        c = findViewById(R.id.txtDEFAuto);
        c.setText("20");
        d = findViewById(R.id.txtTypeAuto);
        d.setText("Machine");
        e = findViewById(R.id.txtElementAuto);
        e.setText("Unknown");
        f = findViewById(R.id.txtEvasionAuto);
        f.setText("40%");
        g = findViewById(R.id.txtParryAuto);
        g.setText("90%");

    }
}