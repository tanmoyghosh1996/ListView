package com.example.root.listviewexample;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lv1;
    String []arrName = {"abc","pqr", "stu","vwx","mno"};
    String []arrSalary = {"500","600","700","800","900"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv1=(ListView)findViewById(R.id.lv1);
        lv1.setAdapter(new CustomAdapter());
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //Toast.makeText(MainActivity.this, arrName[i], Toast.LENGTH_SHORT).show();
                Intent k=new Intent(MainActivity.this, activity_result.class);
                k.putExtra("name", arrName[i]+" "+arrSalary[i]);
                startActivity(k);
            }
        });
    }

    public class CustomAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return arrName.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater inf = getLayoutInflater();
            View v = inf.inflate(R.layout.listview_row, viewGroup,false);
            TextView tv_nm=(TextView)v.findViewById(R.id.tv_nm);
            TextView tv_sal=(TextView)v.findViewById(R.id.tv_sal);
            tv_nm.setText(arrName[i]);
            tv_sal.setText(arrSalary[i]);
            return v;
        }
    }
}
