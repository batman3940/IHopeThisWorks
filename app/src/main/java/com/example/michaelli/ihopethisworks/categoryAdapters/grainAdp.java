package com.example.michaelli.ihopethisworks.categoryAdapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.michaelli.ihopethisworks.R;

public class grainAdp extends BaseAdapter {
    private Context mContext;
int recievesub = 0;
    // Constructor
    public grainAdp(Context c, int subCategory) {
        mContext = c;
        recievesub = subCategory;
    }

    public int getCount() {
        Integer[] category = allgrain;
        switch (recievesub){
            case 0:category = allgrain;
                break;
            case 1:category = dessertsGr;
                break;
            case 2:category = baked;
                break;
            case 3:category = oatsandcereal;
                break;
        }
        return category.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View container;
        ImageView imageView;
        TextView tV;

        if (convertView == null) {

            container = new View(mContext);
            container = inflater.inflate(R.layout.grid_organize, null);

            tV = container.findViewById(R.id.grid_text);
            imageView = container.findViewById(R.id.grid_image);

            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);

            tV.setText("placeholder");

            switch (recievesub){
                case 0: imageView.setImageResource(allgrain[position]);
                    break;
                case 1: imageView.setImageResource(dessertsGr[position]);
                    break;
                case 2: imageView.setImageResource(baked[position]);
                    break;
                case 3: imageView.setImageResource(oatsandcereal[position]);
                    break;

            }
        }
        else
        {
            container = (View) convertView;
        }

        return container;
    }

    // Keep all Images in array
    public Integer[] allgrain = {
            R.drawable.cupcake, R.drawable.a, R.drawable.b,
    };
    public Integer[] dessertsGr = {
            R.drawable.a, R.drawable.b, R.drawable.cupcake
    };
    public Integer[] baked = {
            R.drawable.a, R.drawable.b,
    };
    public Integer[] oatsandcereal = {
            R.drawable.a, R.drawable.b,
    };


    public String[] two = {
           "drugs","cartos \n cats \n dog","drugos",("elepant" + '\n' +
            "dog"), "cat", "dog"
    };
    public String[] three = {
            "staves","cartos","drugos",("elepant" + '\n' +
            "dog"), "cat", "dog"
    };

}