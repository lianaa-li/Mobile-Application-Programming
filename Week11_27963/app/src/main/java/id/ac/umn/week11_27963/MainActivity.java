package id.ac.umn.week11_27963;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvPostlist;
    PostAdapter adapter;

    ArrayList<PostModel> posts;

    netInterface netInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPostlist = findViewById(R.id.rvPostList);
        rvPostlist.setLayoutManager(new LinearLayoutManager(this));

        netInterface = retrofitConfig.getClient().create(netInterface.class);
        getPosts();
    }

    public void getPosts(){
        Call<ArrayList<PostModel>> postModelCall = netInterface.getPosts();
        postModelCall.enqueue(new Callback<ArrayList<PostModel>>() {
            @Override
            public void onResponse(Call<ArrayList<PostModel>> call, Response<ArrayList<PostModel>> response) {
                posts = response.body();

                adapter = new PostAdapter(posts);
                rvPostlist.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<ArrayList<PostModel>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Internet not available", Toast.LENGTH_LONG).show();
            }
        });
    }
}