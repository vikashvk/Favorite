package com.example.application.goat;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Great extends AppCompatActivity {
    String arr[]={"Eminem","Spider-Man","Batman","Logan"};
    ListView listView;
    int[] imageView={R.drawable.em,R.drawable.sm,R.drawable.bm,R.drawable.wv};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.great);
        CustomAdapter ca=new CustomAdapter(Great.this,arr,imageView);
        listView=(ListView)findViewById(R.id.svw);
        listView.setAdapter(ca);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String itemKyah=(String) listView.getItemAtPosition(position);
                Toast.makeText(Great.this,itemKyah,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
class CustomAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String arr[];
    private int[] imageView;

    public CustomAdapter(@NonNull Context context, String[] arr, int[] imageView) {
        super(context,R.layout.great,arr);
        this.context = context;
        this.arr = arr;
        this.imageView = imageView;
    }

    @Override
    public View getView(int position,View view, @NonNull ViewGroup parent) {
        LayoutInflater inflater=(LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView=inflater.inflate(R.layout.eminem,null,true);
        TextView txtvw=(TextView)rowView.findViewById(R.id.tv);
        ImageView imgvw=(ImageView)rowView.findViewById(R.id.iv);
        txtvw.setText(arr[position]);
        imgvw.setImageResource(imageView[position]);
        return rowView;
    }
}
