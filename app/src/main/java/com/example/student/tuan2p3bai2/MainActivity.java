package com.example.student.tuan2p3bai2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
Spinner spiner;
EditText et_ma,et_ten;
Button btnnhap;
ListView list;

    ArrayList<Catalog>catalogArrayList=new ArrayList<Catalog>();
    ArrayAdapter<Catalog> arrayAdapterspiner=null;

    ArrayList<Product> productArrayList=new ArrayList<Product>();
    ArrayAdapter<Product> arrayAdapterlistview=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getwilgetControl();
        datacatalog();
        eventformwiget();
        
    }

    private void eventformwiget() {
    }

    private void datacatalog() {
    }

    private void getwilgetControl() {
    }
}
