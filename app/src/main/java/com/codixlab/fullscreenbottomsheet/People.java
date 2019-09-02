package com.codixlab.fullscreenbottomsheet;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class People extends BaseObservable {

    String name;
    int image;

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Bindable
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
