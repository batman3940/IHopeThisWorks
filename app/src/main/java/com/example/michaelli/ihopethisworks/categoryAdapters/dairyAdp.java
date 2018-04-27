package com.example.michaelli.ihopethisworks.categoryAdapters;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.content.Intent;

import com.example.michaelli.ihopethisworks.R;

public class dairyAdp extends BaseAdapter {
    private Context mContext;

    // Constructor
    public dairyAdp(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }
    

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;


        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(375, 375));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        }
        else
        {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // Keep all Images in array
    public Integer[] mThumbIds = {
            R.drawable.butter, R.drawable.ice_cream,

    };
        public Integer[] cream = {
            R.drawable.ice_cream,

    };



    public String[] two = {
           //Butter
            "Butter may be stored for 1-2 days in room temperature \n Can last 1-2 months if stored in a refrigerator on the date of purchase",
            //Ice cream
            "cartos \n cats \n dog","drugos",("elepant" + '\n' +
            "dog"), "cat"
    };
    public String[] three = {
            "staves","cartos","drugos",("elepant" + '\n' +
            "dog"), "cat", "dog"
    };

}