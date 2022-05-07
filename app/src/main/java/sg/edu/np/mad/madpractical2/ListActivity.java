package sg.edu.np.mad.madpractical2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ImageView buttonImg = findViewById(R.id.ListImage);
        buttonImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alert= new AlertDialog.Builder(ListActivity.this);

                alert.setTitle("Profile");
                alert.setMessage("MADness");
                alert.setPositiveButton("View", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Random random = new Random();
                        Integer RInt = random.nextInt();
                        Intent  myIntent= new Intent(ListActivity.this, MainActivity.class);
                        Bundle intContent = new Bundle();
                        intContent.putInt("Int",RInt);
                        myIntent.putExtras(intContent);
                        startActivity(myIntent);
                    }
                });
                alert.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(ListActivity.this, ":(", Toast.LENGTH_SHORT).show();
                    }
                });
                alert.show();
            }
        });
    }
}