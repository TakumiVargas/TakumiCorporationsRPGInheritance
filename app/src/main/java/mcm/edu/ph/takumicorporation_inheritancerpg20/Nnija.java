package mcm.edu.ph.takumicorporation_inheritancerpg20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Nnija extends AppCompatActivity {
    TextView textdisplay,a,b,c,d,e,f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nnija);
        textdisplay = findViewById(R.id.txtDMGNinja);
        textdisplay.setText("1000 ~ 1500");
        a = findViewById(R.id.txtHPNinja);
        a.setText("900");
        b = findViewById(R.id.txtMPNinja);
        b.setText("200");
        c = findViewById(R.id.txtDEFNinja);
        c.setText("70");
        d = findViewById(R.id.txtEvasionNinja);
        d.setText("75%");
        e = findViewById(R.id.txtLuckNinja);
        e.setText("50%");
        f = findViewById(R.id.txtAccuracyNinja);
        f.setText("100%");

    }
}