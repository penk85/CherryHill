package com.example.android.cherryhill;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class WebsiteFragment extends Fragment {

    ListView listView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.general_list_fragment, container,
                false);

        listView = view.findViewById(R.id.listview);
        WebsiteListAdapter adapter = new WebsiteListAdapter(getContext(), R.layout.website_list_item, CherryHillData.getWebsiteList());
        listView.setAdapter(adapter);


        return view;

    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //change toolbar title
        getActivity().setTitle(R.string.websites);
    }
}
