package com.example.gpcorser.bitsandpizzas;

/**
 * Created by Niklas on 12/1/2016.
 */

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Item5Adapter extends ArrayAdapter<String>
{
    private final Activity context;
    private final String[] itemName;
    private final Integer[] imgID;

    public Item5Adapter(Activity context, String[] itemName, Integer[] imgID)
    {
        super(context, R.layout.item5list, itemName);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.itemName=itemName;
        this.imgID=imgID;
    }

    public View getView(int position,View view,ViewGroup parent)
    {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.item5list, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView extratxt = (TextView) rowView.findViewById(R.id.textview1);

        txtTitle.setText(itemName[position]);
        imageView.setImageResource(imgID[position]);
        extratxt.setText("Description "+itemName[position]);
        return rowView;
    }

}
