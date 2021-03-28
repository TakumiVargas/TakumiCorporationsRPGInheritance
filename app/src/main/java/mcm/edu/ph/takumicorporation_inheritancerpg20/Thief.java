package mcm.edu.ph.takumicorporation_inheritancerpg20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Thief extends AppCompatActivity {
    TextView textdisplay,a,b,c,d,e,f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thief);
        textdisplay = findViewById(R.id.txtDMGThief);
        textdisplay.setText("500 ~ 900");
        a = findViewById(R.id.txtHPThief);
        a.setText("950");
        b = findViewById(R.id.txtMPThief);
        b.setText("500");
        c = findViewById(R.id.txtDEFThief);
        c.setText("60");
        d = findViewById(R.id.txtEvasionThief);
        d.setText("70%");
        e = findViewById(R.id.txtLuckThief);
        e.setText("75%");
        f = findViewById(R.id.txtAccuracyThief);
        f.setText("100%");

    }
}