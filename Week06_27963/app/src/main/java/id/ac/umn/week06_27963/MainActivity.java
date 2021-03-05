package id.ac.umn.week06_27963;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn_1, btn_2, btn_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_1 = findViewById(R.id.btnSatu);
        btn_2 = findViewById(R.id.btnDua);
        btn_3 = findViewById(R.id.btnTiga);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSatu = new Intent(MainActivity.this, ActivityPertama.class);
                startActivityForResult(intentSatu, 1);
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDua = new Intent(MainActivity.this, ActivityKedua.class);
                startActivityForResult(intentDua, 1);
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTiga = new Intent(MainActivity.this, ActivityKetiga.class);
                startActivityForResult(intentTiga, 1);
            }
        });
    }

}