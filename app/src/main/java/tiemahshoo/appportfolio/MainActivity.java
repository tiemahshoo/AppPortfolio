package tiemahshoo.appportfolio;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnStreamer = (Button) findViewById(R.id.btn_streamer);
        Button btnReader = (Button) findViewById(R.id.btn_reader);
        Button btnBigger = (Button) findViewById(R.id.btn_bigger);
        Button btnLibrary = (Button) findViewById(R.id.btn_library);
        Button btnScores = (Button) findViewById(R.id.btn_scores);
        Button btnCapstone = (Button) findViewById(R.id.btn_capstone);

        btnStreamer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "This Button will lead to my Streamer App"
                        , Toast.LENGTH_SHORT).show();
            }
        });

        btnReader.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "This Button will lead to my Reader App"
                        , Toast.LENGTH_SHORT).show();
            }
        });

        btnBigger.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "This Button will lead to my Bigger App"
                        , Toast.LENGTH_SHORT).show();
            }
        });

        btnLibrary.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "This Button will lead to my Library App"
                        , Toast.LENGTH_SHORT).show();
            }
        });

        btnScores.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "This Button will lead to my Scores App"
                        , Toast.LENGTH_SHORT).show();
            }
        });

        btnCapstone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "This Button will lead to my Capstone App"
                        , Toast.LENGTH_SHORT).show();
            }
        });
    }
}
