package mcm.edu.ph.takumicorporation_inheritancerpg20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class geoslime extends AppCompatActivity {
    TextView textdisplay,a,b,c,d,e,f,g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geoslime);
        textdisplay = findViewById(R.id.txtDMGgeo);
        textdisplay.setText("50 ~ 90");
        a = findViewById(R.id.txtHPGeo);
        a.setText("150");
        b = findViewById(R.id.txtMPGeo);
        b.setText("0");
        c = findViewById(R.id.txtDEFGeo);
        c.setText("20");
        d = findViewById(R.id.txtTypeGeo);
        d.setText("Slime");
        e = findViewById(R.id.txtElementGeo);
        e.setText("Geo");
        f = findViewById(R.id.txtEvasionGeo);
        f.setText("20%");
        g = findViewById(R.id.txtParryGeo);
        g.setText("100%");
    }
}