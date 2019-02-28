package com.example.android.cherryhill;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

//Custom list adapter for web links. Despite them being stored in simple String lists, I used a
// custom adapter to allow click functionality. I used autoLink in the XML layout.
public class WebsiteListAdapter extends ArrayAdapter<String> {
    public WebsiteListAdapter(Context context, int resource, ArrayList<String> websites) {
        super(context, resource, websites);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View websiteItemView = convertView;
        if (websiteItemView == null) {
            websiteItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.website_list_item, parent, false);
        }

        // Get the site located at this position in the list
        String currentSite = getItem(position);

        TextView websiteTV = websiteItemView.findViewById(R.id.websites_tv);
        websiteTV.setText(currentSite);

        return websiteItemView;
    }
}
