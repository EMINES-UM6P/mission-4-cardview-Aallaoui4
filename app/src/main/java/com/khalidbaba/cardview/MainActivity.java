package com.khalidbaba.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private List<Product> cities = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ajouterVilles();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
          recyclerView.setLayoutManager(new LinearLayoutManager(this));


        recyclerView.setAdapter(new MyAdapter(cities));
    }

    private void ajouterVilles() {
        cities.add(new Product("LG","https://www.androidcentral.com/sites/androidcentral.com/files/styles/larger/public/article_images/2017/09/lg-v30-review-5.jpg"));
        cities.add(new Product("Nexus","https://www.android.com/static/2016/img/phones/phone-1_1x.jpg"));
        cities.add(new Product("Samsung","https://cdn2.techadvisor.co.uk/cmsdata/features/3265117/best_android_phones_thumb800.jpg"));
        cities.add(new Product("One+","https://images.idgesg.net/images/article/2018/01/android-phone-hub-100747307-orig.jpg"));
        cities.add(new Product("Nokia","https://cdn.vox-cdn.com/thumbor/ByqVVjwOd_DDZRIR_3vg-YP76Dc=/0x0:1980x1320/1200x800/filters:focal(832x502:1148x818)/cdn.vox-cdn.com/uploads/chorus_image/image/55869703/nokia8.0.jpg"));
        cities.add(new Product("Huawei","https://lh3.googleusercontent.com/RRQywA_cdvvZgXe-Nk2OsQgKhDzNI2ZXtfTJ-hJ98qbuOUEsY78V9qUU2OZwQz84ev8=h900"));
    }
}
