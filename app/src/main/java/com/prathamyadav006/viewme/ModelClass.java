package com.prathamyadav006.viewme;

public class ModelClass {
    private  int imageview ;
    private String textview;



    ModelClass(int imageview, String textview){
        this.textview=textview;
        this.imageview=imageview;
    }

    public int getImageview() {
        return imageview;
    }

    public String getTextview() {
        return textview;
    }

}
