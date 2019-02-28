package com.example.android.cherryhill;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class ShulFragment extends Fragment {

    ListView listView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.general_list_fragment, container,
                false);

        //Use custom adapter to display the list of data from the data class
        listView = view.findViewById(R.id.listview);
        CustomListAdapter adapter = new CustomListAdapter(getContext(), R.layout.list_item, CherryHillData.getShulList());
        listView.setAdapter(adapter);

        return view;

    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //Set toolbar with fragment title
        getActivity().setTitle(R.string.shuls);
    }
}
