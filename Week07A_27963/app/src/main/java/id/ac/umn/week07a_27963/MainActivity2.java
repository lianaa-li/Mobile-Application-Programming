package id.ac.umn.week07a_27963;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity2 extends AppCompatActivity {
    RecyclerView rvDaftarVideo;
    DaftarVideoAdapter mAdapter;
    LinkedList<SumberVideo> daftarVideo = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        isiDaftarVideo();
        rvDaftarVideo = (RecyclerView) findViewById(R.id.recyclerView);
        mAdapter = new DaftarVideoAdapter(this, daftarVideo);
        rvDaftarVideo.setAdapter(mAdapter);
        rvDaftarVideo.setLayoutManager(new LinearLayoutManager(this));
    }

    public void isiDaftarVideo(){
        daftarVideo.add(new SumberVideo("Mini Cooper Drag",
                "Drag Race Mini Cooper dengan Honda Civic hatchback",
                "android.resource://" +getPackageName() + "/"+
                        R.raw.mini01));
        daftarVideo.add(new SumberVideo("Porsche 918",
                "Menikmati mobil sport Porsche 918 Spyder",
                "android.resource://" +getPackageName() + "/"+
                        R.raw.porsche918));
        daftarVideo.add(new SumberVideo("Drift H2H",
                "Head to Head Drifting hasil cuplikan dari film The Fast and The Furious",
                "android.resource://" +getPackageName() + "/"+
                        R.raw.drift01));
        daftarVideo.add(new SumberVideo("Kejar-kejaran",
                "Kejar-kejaran di jalanan hasil cuplikan dari film The Fast and The Furious ",
                "android.resource://" +getPackageName() + "/"+
                        R.raw.drift02));
        daftarVideo.add(new SumberVideo("Mini Cooper Drag Race",
                "Drag Race Mini Cooper dengan Ford Fiesta hatchback",
                "android.resource://" +getPackageName() + "/"+
                        R.raw.mini02));
    }
}