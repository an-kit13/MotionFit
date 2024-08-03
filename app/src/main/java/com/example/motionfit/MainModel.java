package com.example.motionfit;

public class MainModel {

    String description;
    Long nofsets,wgtpset;

    MainModel(){


    }

    public MainModel(String description, Long nofsets, Long wgtpset) {
        this.description = description;
        this.nofsets = nofsets;
        this.wgtpset = wgtpset;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getNofsets() {
        return nofsets;
    }

    public void setNofsets(Long nofsets) {
        this.nofsets = nofsets;
    }

    public long getWgtpset() {
        return wgtpset;
    }

    public void setWgtpset(Long wgtpset) {
        this.wgtpset = wgtpset;
    }
}
