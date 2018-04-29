package e.collins.socialapptest;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import android.widget.Button;

import com.jgabrielfreitas.core.BlurImageView;

public class MainActivity extends AppCompatActivity {

    BlurImageView myBlurImage;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myBlurImage = (BlurImageView) findViewById(R.id.MyBlurBackground);
        myBlurImage.setBlur(5);

        button = (Button) findViewById(R.id.signon_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, login_screen.class);
                startActivity(intent);
            }
        });
    }
}