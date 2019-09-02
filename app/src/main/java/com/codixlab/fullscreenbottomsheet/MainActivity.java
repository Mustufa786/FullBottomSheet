package com.codixlab.fullscreenbottomsheet;

import android.content.res.TypedArray;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.codixlab.fullscreenbottomsheet.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }


    public List<People> getPeopleData() {
        List<People> list = new ArrayList<>();

        TypedArray images_arr = getResources().obtainTypedArray(R.array.people_images);
        String[] names = getResources().getStringArray(R.array.people_names);


        for (int i = 0; i < images_arr.length(); i++) {

            People people = new People();
            people.setName(names[i]);
            people.setImage(images_arr.getResourceId(i, -1));
            list.add(people);
        }

        Collections.shuffle(list);


        return list;
    }
}
