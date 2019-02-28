package com.example.android.cherryhill;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class HomeFragment extends Fragment {
    //set up views from xml
    private TextView eruvTV;
    private TextView shulTV;
    private TextView schoolTV;
    private TextView websiteTV;
    private TextView restaurantTV;
    //define the onclick listener to be used for all the navigation buttons. The if statements inside
    //the onclicklistener sets which the menuitem it represents and
    // implements the navigation method from the main activity.
    private View.OnClickListener navigationListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //Getting a reference to the MainActivity, which hosts this fragment,
            // in order to call its methods. Calling an existing method for navigating fragments
            // seemed more efficient than repeating the Activity code inside one of its fragments.
            // Also it allows for highlighting the current selection on the navigation drawer window,
            // which wouldn't be done with simply calling and replacing fragments.

            MainActivity mainActivity = (MainActivity) getActivity();
            MenuItem menuItem = null;
            //Condition to only complete if mainactivity not null to avoid nullpointerexception
            if (v == eruvTV && mainActivity != null) {
                menuItem = mainActivity.navigationView.getMenu().findItem(R.id.nav_eruv);
            } else if (v == shulTV && mainActivity != null) {
                menuItem = mainActivity.navigationView.getMenu().findItem(R.id.nav_shuls);
            } else if (v == schoolTV && mainActivity != null) {
                menuItem = mainActivity.navigationView.getMenu().findItem(R.id.nav_schools);
            } else if (v == websiteTV && mainActivity != null) {
                menuItem = mainActivity.navigationView.getMenu().findItem(R.id.nav_website);
            }else if (v == restaurantTV && mainActivity != null) {
                menuItem = mainActivity.navigationView.getMenu().findItem(R.id.nav_restaurants);
            }
            if (menuItem != null) {
                //This calls the menu navigation method from the main activity hosting this fragment.
                // However, it does not show the current menu as highlighted on the menu display,
                // hence MenuItem.setChecked(true) was added to do this.
                // MenuItem.setChecked(true) does not trigger the menu item selected listener,
                // so both commands are necessary.
                mainActivity.onNavigationItemSelected(menuItem);
                menuItem.setChecked(true);
            }
        }
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment, container,
                false);
        //Activating the textviews to function as navigation buttons
        eruvTV = view.findViewById(R.id.eruv_tv);
        eruvTV.setOnClickListener(navigationListener);
        shulTV = view.findViewById(R.id.shul_tv);
        shulTV.setOnClickListener(navigationListener);
        schoolTV = view.findViewById(R.id.school_tv);
        schoolTV.setOnClickListener(navigationListener);
        websiteTV = view.findViewById(R.id.websites_tv);
        websiteTV.setOnClickListener(navigationListener);
        restaurantTV = view.findViewById(R.id.restaurant_tv);
        restaurantTV.setOnClickListener(navigationListener);
        //returning our layout file
        return view;

    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //Set fragment title in toolbar
        getActivity().setTitle("Home");
    }

}

