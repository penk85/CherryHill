package com.example.android.cherryhill;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    // The navigation view variable vis public to allow it to be referenced inside the fragments.
    public NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //set the homepage and trigger it to display through onNavigationItemSelected method.
        // menuItem.setSelected(true) was not giving the correct result.
        MenuItem menuItem = navigationView.getMenu().findItem(R.id.nav_home);
        menuItem.setChecked(true);

        onNavigationItemSelected(menuItem);
    }

    //Navigation drawer functionality
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Fragment fragment = null;
        if (id == R.id.nav_eruv) {
            //navigate to eruv fragment
            fragment = new EruvFragment();
        } else if (id == R.id.nav_home) {
            fragment = new HomeFragment();
        } else if (id == R.id.nav_shuls) {
            //navigate to shul list fragment
            fragment = new ShulFragment();
        } else if (id == R.id.nav_schools) {
            //navigate to school list fragment
            fragment = new SchoolFragment();
        } else if (id == R.id.nav_website) {
            fragment = new WebsiteFragment();
        }else if (id == R.id.nav_restaurants) {
            fragment = new RestaurantFragment();
        }

            //replacing the fragment
        if (fragment != null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.frame_content_main, fragment);
            ft.commit();
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
