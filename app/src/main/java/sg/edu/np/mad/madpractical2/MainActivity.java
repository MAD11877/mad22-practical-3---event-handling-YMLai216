package sg.edu.np.mad.madpractical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = "Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent receiving = getIntent();
        Integer intValue = receiving.getIntExtra("Int", 0);
        TextView intro = findViewById(R.id.Intro);
        intro.setText("MAD "+ intValue);
    }
    User test = new User();

    public void fb(View view){
        Button btn = findViewById(R.id.Follow);
        if (test.followed){
            test.followed = false;
            btn.setText("Unfollow");
            Toast.makeText(MainActivity.this, "Followed", Toast.LENGTH_SHORT).show();

        }
        else {
            test.followed = true;
            btn.setText("Follow");
        }
    }

    public void mb(View v){
        Intent msgIntent = new Intent(MainActivity.this, MessageGroup.class);
        startActivity(msgIntent);
    }
}