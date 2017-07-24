package com.example.shenron.delhitour;


public class Word {

    private String mPlace;

    private String mIntroDescription;

    private int mImageResourceId;



    public Word(String place, String desc, int image)
    {
        mPlace = place;
        mIntroDescription = desc;
        mImageResourceId = image;
    }

    public String getmPlace()
    {
        return mPlace;
    }
    public String getmIntroDescription()
    {
        return mIntroDescription;
    }
    public int getmImageResourceId()
    {
        return mImageResourceId;
    }
}
