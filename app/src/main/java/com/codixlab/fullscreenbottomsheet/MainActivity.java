package com.codixlab.fullscreenbottomsheet;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.codixlab.fullscreenbottomsheet.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding bi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_main);

        init();
    }

    private void init() {

        bi.openBottomSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                BottomSheet bottomSheet = new BottomSheet();
                bottomSheet.show(getSupportFragmentManager(),bottomSheet.getTag());
            }
        });
    }


}
