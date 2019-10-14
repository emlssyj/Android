package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main2Activity extends AppCompatActivity {
    private ListView listView;
    private SimpleAdapter simpleAdapter;
    private List<Map<String,Object>> dataList;


    private static final String[] commonFunList = new String[]{
            "微积分",
            "线性代数",
            "操作系统",
            "程序设计综合实践",
            "乒乓球"    };

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView = (ListView) findViewById(R.id.listView_fun);
        listView.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,commonFunList));

        listView.setOnItemClickListener(

                new AdapterView.OnItemClickListener() {

                    @Override

                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                        Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                        startActivity(intent);
                    }

                }

        );







    }


}