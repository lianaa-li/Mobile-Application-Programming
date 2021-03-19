package id.ac.umn.uts_27963;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private EditText username, password;
    private Button login;
    private TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = (EditText)findViewById(R.id.etUsername);
        password = (EditText)findViewById(R.id.etPassword);
        login = (Button)findViewById(R.id.btnLoginPage);
        message = (TextView)findViewById(R.id.txtMessage);
        message.setVisibility(View.GONE);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("uasmobile") &&  password.getText().toString().equals("uasmobilegenap")){
                    Intent loginSuccess = new Intent(LoginActivity.this, SongListActivity.class);
                    startActivityForResult(loginSuccess, 1);
                } else {
                    message.setVisibility(View.VISIBLE);
                }
            }
        });
    }

}