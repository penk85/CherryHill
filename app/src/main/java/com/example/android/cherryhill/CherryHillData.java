package com.example.android.cherryhill;

import java.util.ArrayList;

//Class to store data relating to the appp

public final class CherryHillData {

    private CherryHillData() {
    }

    //List of shuls to be displayed in the Shul Fragment
    public static ArrayList<Venue> getShulList() {
        ArrayList<Venue> shuls = new ArrayList<Venue>();
        shuls.add(new Venue("Congregation Sons of Israel of Cherry Hill", "720 Cooper Landing Road\n" +
                "Cherry Hill, NJ, 08002", "http://www.sonsofisraelnj.com/", R.drawable.logosonsofisrael));
        shuls.add(new Venue("Chabad in Cherry Hill", "1925 Kresson Road\n" +
                "Cherry Hill, NJ, 08003", "https://www.thechabadcenter.org/", R.drawable.ic_location_city_black_24dp));
        shuls.add(new Venue("Torah Links of South Jersey", "1092 Springdale Road\n" +
                "Cherry Hill, NJ, 08003", "https://www.tlsnj.org/", R.drawable.tlnj));
        shuls.add(new Venue("Young Israel of Cherry Hill", "817 Cooper Landing Road\n" +
                "Cherry Hill, NJ, 08002", "https://www.yicherryhill.com/", R.drawable.yich));
        return shuls;
    }

    //List of resturants to be displayed in the Restaurant Fragment
    public static ArrayList<Venue> getRestaurantList() {
        ArrayList<Venue> restaurants = new ArrayList<Venue>();
        restaurants.add(new Venue("Cherry Grill", "1301 Marlton Pike East\n" +
                "Cherry Hill, NJ 08034", "http://www.cherrygrill.com/", R.drawable.cherrygrill));
        restaurants.add(new Venue("Estis Bestys Vegetarian", "2442 Route 38 W\n" +
                "Cherry Hill, NJ 08002", "https://www.estisbestysvegetarian.com/", R.drawable.estysbesties));
        restaurants.add(new Venue("Short Hills Deli", "486 E Evesham Rd., +\n" +
               "Cherry Hill, NJ 08003", "http://www.shorthillsdeli.com/", R.drawable.shorthills));
        return restaurants;
    }

    //List of schools to be displayed in  School Fragment
    public static ArrayList<Venue> getSchoolList() {
        ArrayList<Venue> schools = new ArrayList<Venue>();
        schools.add(new Venue("Politz Day School", "720 Cooper Landing Road\n" +
                "Cherry Hill, NJ, 08002", "https://www.politz.org/", R.drawable.caskey_konig_logo));
        schools.add(new Venue("Mesivta Bais Dovid", "31 Maple Avenue\n" +
                "Cherry Hill, NJ, 08002", "https://ftiyeshiva.org/", R.drawable.ftiy));
        schools.add(new Venue("Politz Hebrew Academy", "9225 Old Bustleton Ave\n" +
                "Philadelphia, PA, 19115", "http://politzhebrewacademy.org/", R.drawable.politzacad));
        schools.add(new Venue("Kosloff Torah Academy High School for Girls", "50 Montgomery Avenue\n" +
                "Bala Cynwyd, PA, 19004", "https://www.ktahs.org/", R.drawable.kosloff));
        schools.add(new Venue("Kohelet Yeshiva High School", "223 North Highland Avenue\n" +
                "Merion Station, PA, 19066", "https://www.koheletyeshiva.org/", R.drawable.ic_school_black_24dp));
        schools.add(new Venue("Talmudical Yeshiva", "6063 Drexel Road\n" +
                "Philadelphia, PA, 19131", " ", R.drawable.ic_school_black_24dp));
        schools.add(new Venue("The Mesivta High School of Greater Philadelphia", "314 Levering Mill Road\n" +
                "Bala Cynwyd, PA, 19004", "https://www.themesivta.org", R.drawable.mesivta));
        schools.add(new Venue("Gan Chabad Preschool", "314 Levering Mill Road\n" +
                "Bala Cynwyd, PA, 19004", "https://www.themesivta.org", R.drawable.ic_school_black_24dp));
        schools.add(new Venue("Kohelet Yeshiva Lab School", "612 Montgomery Avenue\n" +
                "Narberth, PA, 19072", "https://www.koheletyeshiva.org", R.drawable.ic_school_black_24dp));
        schools.add(new Venue("Torah Academy of Greater Philadelphia", "742 Argyle Rd\n" +
                "Wynnewood, PA, 19096", "https://taphila.org", R.drawable.cta_logo_250x90));
        schools.add(new Venue("Cheder Chabad Philadelphia", "276 S Bryn Mawr Ave\n" +
                "Bryn Mawr, PA, 19010", "https://chederphiladelphia.org", R.drawable.ic_school_black_24dp));

        return schools;
    }

    //List of link to Websites for Website Fragment
    public static ArrayList<String> getWebsiteList() {
        ArrayList<String> websites = new ArrayList<>();
        websites.add("http://www.checkoutcherryhill.com");
        websites.add("https://www.facebook.com/CheckOutCherryHill");
        websites.add("https://www.ou.org/communities/xUtt0woOYP/cherry-hill-nj-united-states");
        return websites;
    }
}
