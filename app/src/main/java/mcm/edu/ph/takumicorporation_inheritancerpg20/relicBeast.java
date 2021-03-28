package mcm.edu.ph.takumicorporation_inheritancerpg20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class relicBeast extends AppCompatActivity {
    TextView textdisplay,a,b,c,d,e,f,g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relic_beast);
        textdisplay = findViewById(R.id.txtDMGRelic);
        textdisplay.setText("100 ~ 160");
        a = findViewById(R.id.txtHPRelic);
        a.setText("900");
        b = findViewById(R.id.txtMPRelic);
        b.setText("50");
        c = findViewById(R.id.txtDEFRelic);
        c.setText("30");
        d = findViewById(R.id.txtTypeRelic);
        d.setText("Beast");
        e = findViewById(R.id.txtElementRelic);
        e.setText("Nature");
        f = findViewById(R.id.txtEvasionRelic);
        f.setText("25%");
        g = findViewById(R.id.txtParryRelic);
        g.setText("200%");
    }
}