package android.lab1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.first_activity);
    }

    public void changeBackground(View view) {
        EditText inputField = findViewById(R.id.color_text);
        String possibleColor = inputField.getText().toString().toUpperCase();

        Intent intent = new Intent(this, SecondActivity.class);

        switch (possibleColor) {
            case "RED" -> intent.putExtra("colour", "RED");
            case "BLUE" -> intent.putExtra("colour", "BLUE");
            case "GREEN" -> intent.putExtra("colour", "GREEN");
            default -> {
                TextView errorMessage = findViewById(R.id.error);
                errorMessage.setVisibility(View.VISIBLE);
                return;
            }
        }

        startActivity(intent);
    }
}