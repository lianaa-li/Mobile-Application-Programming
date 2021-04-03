package id.ac.umn.week08_27963;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonSatu, buttonDua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSatu = findViewById(R.id.button_satu);
        buttonDua = findViewById(R.id.button_dua);

        buttonSatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aktivitasSatu = new Intent(MainActivity.this, FirstActivity.class);
                startActivityForResult(aktivitasSatu, 1);
            }
        });

        buttonDua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aktivitasDua = new Intent(MainActivity.this, SecondActivity.class);
                startActivityForResult(aktivitasDua, 1);
            }
        });
    }
}