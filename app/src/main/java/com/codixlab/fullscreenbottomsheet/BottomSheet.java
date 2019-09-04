package com.codixlab.fullscreenbottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;

import com.codixlab.fullscreenbottomsheet.databinding.LayoutBottomSheetBinding;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BottomSheet extends BottomSheetDialogFragment {


    BottomSheetBehavior bottomSheetBehavior;
    LayoutBottomSheetBinding bi;
    People people;

    public void setPeople(People people) {
        this.people = people;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        BottomSheetDialog bottomSheet = (BottomSheetDialog) super.onCreateDialog(savedInstanceState);
        bi = DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.layout_bottom_sheet, null, false);

        bottomSheet.setContentView(bi.getRoot());



        bi.userImage.setImageResource(people.getImage());
        bi.userName.setText(people.getName());

        hideAppBar();


        return bottomSheet;
    }




    private void hideAppBar() {
        ViewGroup.LayoutParams params = bi.appBarLayout.getLayoutParams();
        params.height = 0;
        bi.appBarLayout.setLayoutParams(params);

    }
}
