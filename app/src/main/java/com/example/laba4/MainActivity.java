package com.example.laba4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);

        View.OnClickListener myButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView img = (ImageView)findViewById(R.id.animationView);
                img.setBackgroundResource(R.drawable.rabbit_animation);
                AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();
                frameAnimation.setOneShot(false);
                if(frameAnimation.isRunning())
                {
                    button.setText("Запустить");
                    frameAnimation.stop();
                }
                else {
                    button.setText("Остановить");
                    frameAnimation.start();
                }
            }
        };

        button.setOnClickListener(myButtonClickListener);
    }
}