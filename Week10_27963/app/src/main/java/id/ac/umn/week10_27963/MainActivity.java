package id.ac.umn.week10_27963;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aktivitasSatu = new Intent(MainActivity.this, AsyncTaskActivity.class);
                startActivityForResult(aktivitasSatu, 1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aktivitasDua = new Intent(MainActivity.this, AsyncTaskLoaderActivity.class);
                startActivityForResult(aktivitasDua, 1);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aktivitasTiga = new Intent(MainActivity.this, ServiceActivity.class);
                startActivityForResult(aktivitasTiga, 1);
            }
        });
    }
}