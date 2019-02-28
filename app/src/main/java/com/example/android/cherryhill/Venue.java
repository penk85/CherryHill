package com.example.android.cherryhill;


//Generic class to store Shuls, Schools, and possibly restaurants. Displays, name, address, website,
// and photo resource.
public class Venue {
    private String mName;
    private String mAddress;
    private String mWebsite;
    private int mPhotoRes;

    public Venue(String name, String address, String website, int photoRes) {
        mName = name;
        mAddress = address;
        mWebsite = website;
        mPhotoRes = photoRes;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }

    public String getWebsite() {
        return mWebsite;
    }

    public void setWebsite(String website) {
        mWebsite = website;
    }

    public int getPhotoRes() {
        return mPhotoRes;
    }

    public void setPhotoRes(int photoRes) {
        mPhotoRes = photoRes;
    }
}
