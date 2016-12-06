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

import org.w3c.dom.Text;

public class Item5Adapter extends ArrayAdapter<String>
{
    private final Activity context;
    private final String[] itemName;
    private final Integer[] imgID;
    private final String[] itemDesc;
    private final String[] itemContact;

    public Item5Adapter(Activity context, String[] itemName, Integer[] imgID, String[] itemDesc,
                        String[] itemContact)
    {
        super(context, R.layout.item5list, itemName);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.itemName=itemName;
        this.imgID=imgID;
        this.itemDesc=itemDesc;
        this.itemContact=itemContact;
    }

    public View getView(int position,View view,ViewGroup parent)
    {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.item5list, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.image);
        TextView extratxt = (TextView) rowView.findViewById(R.id.textview1);
        TextView extratxt2 = (TextView) rowView.findViewById(R.id.textview2);

        txtTitle.setText(itemName[position]);
        imageView.setImageResource(imgID[position]);
        extratxt.setText(itemDesc[position]);
        extratxt2.setText(itemContact[position]);
        return rowView;
    }

}
