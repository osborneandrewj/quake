package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by osbor on 12/2/2016.
 */

public class QuakeAdapter extends ArrayAdapter<Quake> {

    public QuakeAdapter(Context context, ArrayList<Quake> arrayList) {
        super(context, 0, arrayList);
    }

    /**
     * Connect Quake item to xml layout
     *
     * @param position
     * @param convertView
     * @param parent
     * @return complete Quake item for ListView
     */
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is already an existing list item (convertView) that we can reuse,
        // otherwise, inflate a new list item layout
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.quake_item,
                    parent,
                    false
            );
        }

        // Get the item we are to display
        Quake quakeItem = getItem(position);

        // Set the appropriate textfields
        TextView magText = (TextView)listItemView.findViewById(R.id.mag_text_view);
        magText.setText(quakeItem.getMag());

        TextView locationText = (TextView)listItemView.findViewById(R.id.location_text_view);
        locationText.setText(quakeItem.getPlace());

        TextView dateText = (TextView)listItemView.findViewById(R.id.date_text_view);
        dateText.setText(quakeItem.getDate());

        return listItemView;
    }
}
