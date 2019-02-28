package com.example.android.cherryhill;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

// List adapter that can be used for displaying all the locations
public class CustomListAdapter extends ArrayAdapter<Venue> {
    public CustomListAdapter(Context context, int resource, ArrayList<Venue> venues) {
        super(context, resource, venues);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the item located at this position in the list
        Venue currentVenue = getItem(position);

        //Find views and swap them out with the current one on the list
        TextView venueName = listItemView.findViewById(R.id.name);
        venueName.setText(currentVenue.getName());

        TextView venueAddress = listItemView.findViewById(R.id.address);
        venueAddress.setText(currentVenue.getAddress());

        // The website acts as a link through the XML functionality of autoLink rather
        // than using an intent.
        TextView venueLink = listItemView.findViewById(R.id.phone_number);
        venueLink.setText(currentVenue.getWebsite());

        ImageView venuePhoto = listItemView.findViewById(R.id.image);
        venuePhoto.setImageResource(currentVenue.getPhotoRes());

        return listItemView;
    }
}
