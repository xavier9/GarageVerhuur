package com.ehb.xavier.garageverhuur.GarageActions;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ehb.xavier.garageverhuur.R;
import com.ehb.xavier.garageverhuur.classes.Adres;
import com.ehb.xavier.garageverhuur.classes.DatabaseHelper;
import com.ehb.xavier.garageverhuur.classes.Garage;

import java.text.SimpleDateFormat;

/**
 * A placeholder fragment containing a simple view.
 */
public class GarageDetailFragment extends Fragment  {
    // Whether or not this fragment is showing in a two pane layout
    Garage garage;
    DatabaseHelper dbh;

    // Used to store references to key view
    public static GarageDetailFragment newInstance() {
        // Create new instance of this fragment
        final GarageDetailFragment fragment = new GarageDetailFragment();

        // Create and populate the args bundle
        final Bundle args = new Bundle();

        //Log.e("test", contactUri.toString());

        //contact = contactUri;

        // Assign the args bundle to the new fragment
        fragment.setArguments(args);
        //Contact c = this.setContac(contact);
        // Inflates the main layout to be used by this fragment

        //TextView name = (TextView) detailView.findViewById(R.id.contact_name);
        //name.setText(c.getFirstname()+ " " + c.getLastname());
        // Return fragment
        return fragment;
    }

    public Garage getDate(){
        if(garage != null){
            return garage;
        }else{
            return null;
        }
        //return garage;
    }

    public void chanceData(Garage g) {
        Log.e("garage", g.toString());

        TextView grootte = (TextView) getActivity().findViewById(R.id.groote);
        grootte.setVisibility(View.VISIBLE);
        TextView prijs = (TextView) getActivity().findViewById(R.id.prijss);
        prijs.setVisibility(View.VISIBLE);
        TextView start = (TextView) getActivity().findViewById(R.id.startd);
        start.setVisibility(View.VISIBLE);
        TextView end= (TextView) getActivity().findViewById(R.id.endd);
        end.setVisibility(View.VISIBLE);
        TextView adres = (TextView) getActivity().findViewById(R.id.adres);
        adres.setVisibility(View.VISIBLE);
        TextView mogel = (TextView) getActivity().findViewById(R.id.mogelijk);
        mogel.setVisibility(View.VISIBLE);

        TextView grote = (TextView) getActivity().findViewById(R.id.grootte);
        grote.setVisibility(View.VISIBLE);
        grote.setText(g.getGroote());
        TextView pri = (TextView) getActivity().findViewById(R.id.prijs);
        pri.setVisibility(View.VISIBLE);
        pri.setText(g.getPrijs() + "");
        TextView sta = (TextView) getActivity().findViewById(R.id.startda);
        sta.setVisibility(View.VISIBLE);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sta.setText(sdf.format(g.getStartdate()) + "");
        TextView ende = (TextView) getActivity().findViewById(R.id.endda);
        ende.setVisibility(View.VISIBLE);
        ende.setText(sdf.format(g.getEnddate()) + "");
        TextView ad = (TextView) getActivity().findViewById(R.id.adress);
        ad.setVisibility(View.VISIBLE);
        Adres adr = dbh.getAdresByID(g.getAdresID().getID());
        ad.setText(adr.toString() + "");
        TextView mogelijk = (TextView) getActivity().findViewById(R.id.mogelijkh);
        mogelijk.setVisibility(View.VISIBLE);
        mogelijk.setText(g.getMogelijkhijd() + "");

    }

    public GarageDetailFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        /** Inflating the layout for this fragment **/
        View v = inflater.inflate(R.layout.fragment_detail, container);
        dbh = new DatabaseHelper(getActivity());
        return v;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        // If not being created from a previous state

    }

    /**
     * When the Fragment is being saved in order to change activity state, save the
     * currently-selected contact.
     */
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // Saves the contact Uri

    }


}
