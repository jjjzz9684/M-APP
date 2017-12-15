package com.example.hnsle.m_app;

import android.graphics.drawable.Drawable;

/**
 * Created by hansol on 2017-12-13.
 */

public class ListViewItemMt {
    private Drawable iconDrawable;
    private String mtName;
    private String date;
    private String routeDist;
    private String time;

    //걍 다 겟셋
    public void setIconDrawable(Drawable iconDrawable) {
        this.iconDrawable = iconDrawable;
    }

    public void setMtName(String mtName) {
        this.mtName = mtName;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setRouteDist(String routeDist) {
        this.routeDist = routeDist;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Drawable getIconDrawable() {
        return iconDrawable;
    }

    public String getMtName() {
        return mtName;
    }

    public String getDate() {
        return date;
    }

    public String getRouteDist() {
        return routeDist;
    }

    public String getTime() {
        return time;
    }
}
