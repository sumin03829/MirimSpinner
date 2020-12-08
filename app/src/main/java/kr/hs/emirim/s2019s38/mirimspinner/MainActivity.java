package kr.hs.emirim.s2019s38.mirimspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    int[] imgRes= {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,
            R.drawable.h,R.drawable.i,R.drawable.j};
    String[] posterTitle={"벼랑 위의 포뇨","이웃집 토토로","추억의 마니","붉은돼지","바람계곡의 나우시카",
            "센과 치히로의 행방불명","하울의 움직이는 성","귀를 기울이면",
            "마녀배달부 키키"};
    ImageView imgv=findViewById(R.id.img);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner1=findViewById(R.id.spacer1);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,posterTitle);
        spinner1.setAdapter(adapter);

        spinner1.setOnItemSelectedListener(setItemListener);
    }

    AdapterView.OnItemSelectedListener setItemListener=new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            imgv.setImageResource(imgRes[position]);
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };

}