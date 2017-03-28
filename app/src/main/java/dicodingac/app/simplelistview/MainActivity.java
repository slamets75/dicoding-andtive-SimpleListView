package dicodingac.app.simplelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView lvItem;
    private String[] footBallClubs = new String[]{
            "Juventus", "Manchester United", "Liverpool",
            "Bayern Munchen", "Real Madrid", "Ajax Amsterdam",
            "Barcelona", "AS Roma", "Chelsea", "AC Milan",
            "Manchester City", "Persija", "Persib"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvItem = (ListView) findViewById(R.id.lv_item);
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, footBallClubs
        );

        lvItem.setAdapter(adapter);

        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Pilihan Mu : "+footBallClubs[i], Toast.LENGTH_LONG).show();
            }
        });
    }
}

