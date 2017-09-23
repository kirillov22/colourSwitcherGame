package me.kirillov22.colourswitchergame;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchColour1 (View view) {
        Button btn = (Button)findViewById(R.id.btnColour1);
        btn.setBackgroundColor(Color.parseColor("#80CBC4"));
    }

    public void switchColour2 (View view) {
        Button btn = (Button)findViewById(R.id.btnColour2);
        btn.setBackgroundColor(Color.parseColor("#C5E1A5"));
    }
}
