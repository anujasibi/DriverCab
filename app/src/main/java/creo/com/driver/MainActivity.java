package creo.com.driver;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.ncorti.slidetoact.SlideToActView;

public class MainActivity extends AppCompatActivity {

    TextView text,textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // SlideToActView sta = (SlideToActView) findViewById(R.id.example);
        text=findViewById(R.id.textn1);
        textView=findViewById(R.id.text2);


        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Login.class));
                Animatoo.animateSwipeRight(MainActivity.this);
            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, registernew.class));
                Animatoo.animateSlideLeft(MainActivity.this);

            }
        });
    }
}
