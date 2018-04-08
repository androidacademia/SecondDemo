package constraintdemo.androidacademia.com.seconddemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textViewWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewWelcome = findViewById(R.id.textView);

        Intent intent = getIntent();
        String user=intent.getStringExtra("u");
        String pass = intent.getStringExtra("p");
        String welcomeStr = "Welcome ,"+user+", Password : "+pass;
        textViewWelcome.setText(welcomeStr);
    }
}
