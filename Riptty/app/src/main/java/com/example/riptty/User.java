package com.example.riptty;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class User {
    String text;
    int drawable;

    public User(String text,int drawable) {
        this.text = text;
        this.drawable = drawable;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }



    public String gettext() {
        return text;
    }

    public void settext(String usertext) {
        this.text = usertext;
    }
}
