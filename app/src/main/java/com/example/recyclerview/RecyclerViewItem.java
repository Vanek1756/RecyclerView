package com.example.recyclerview;

public class RecyclerViewItem {

    private final int imageResource;
    private final String text1;
    private final String text2;

    public RecyclerViewItem(int imageResource, String text1, String text2) {
        this.imageResource = imageResource;
        this.text1 = text1;
        this.text2 = text2;
    }

    public int getImageResource() {
        return imageResource;
    }


    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }


}
