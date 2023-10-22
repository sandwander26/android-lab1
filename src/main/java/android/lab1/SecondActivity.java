package android.lab1;

import androidx.constraintlayout.widget.ConstraintLayout;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

public class SecondActivity extends Activity {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.second_activity);

        String colour = getIntent().getStringExtra("colour");
        ConstraintLayout constraintLayout = findViewById(R.id.second_layout);

        switch (colour) {
            case "RED" -> constraintLayout.setBackgroundColor(Color.RED);
            case "BLUE" -> constraintLayout.setBackgroundColor(Color.BLUE);
            case "GREEN" -> constraintLayout.setBackgroundColor(Color.GREEN);
        }
    }
}