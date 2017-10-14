package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton;
        final ImageView ballImage;
        final int[] ballsList = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };
        final int BALLS_IMAGE_COUNT = 5;

        askButton = (Button) findViewById(R.id.button_ask);
        ballImage = (ImageView) findViewById(R.id.image_ball);

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random generator = new Random();
                int i = generator.nextInt(BALLS_IMAGE_COUNT);

                ballImage.setImageResource(ballsList[i]);
            }
        });
    }
}
