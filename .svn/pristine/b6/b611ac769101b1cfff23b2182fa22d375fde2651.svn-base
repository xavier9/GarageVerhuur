package com.ehb.xavier.garageverhuur.GarageActions;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.ehb.xavier.garageverhuur.Adapter.PersoonAdapter;
import com.ehb.xavier.garageverhuur.R;
import com.ehb.xavier.garageverhuur.classes.DatabaseHelper;
import com.ehb.xavier.garageverhuur.classes.Garage;

import java.util.ArrayList;


/**
 * A placeholder fragment containing a simple view.
 */
public class GarageGetFragment extends ListFragment implements
        AdapterView.OnItemClickListener{

    DatabaseHelper cdb;
    private boolean mIsTwoPaneLayout;

    private PersoonAdapter mAdapter;
    Communicator com;
    public GarageGetFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mIsTwoPaneLayout = getResources().getBoolean(R.bool.dual_pane);
        cdb = new DatabaseHelper(getActivity());
        //Log.e("Adressen : ", cdb.getAdresData().size()+"");
       //if(!cdb.getPersoonData().equals(null)) {

        ArrayList<Garage>gen = cdb.getGarageData();
        for(Garage g : gen){
            Log.e("Garage",g.toString());
        }
            mAdapter = new PersoonAdapter(getActivity(), cdb.getGarageData());
            setListAdapter(mAdapter);
        Intent intent = getActivity().getIntent();
        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);
            doMySearch(query);
        }
//        getListView().setOnItemClickListener(this);
        //}


    }

    private void doMySearch(String query) {
        mAdapter = new PersoonAdapter(getActivity(), cdb.getGarageBy(query));
        setListAdapter(mAdapter);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        com = (Communicator) getActivity();
        setListAdapter(mAdapter);
        getListView().setOnItemClickListener(this);



    }


    @Override
    public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
        v.setSelected(true);
        v.setPressed(true);

        Garage con = mAdapter.getItem(position);
        Log.e("Con", con.toString());
        // Creates a contact lookup Uri from contact ID and lookup_key
        //final Contact uri = con;

        //);
        if (mIsTwoPaneLayout) {
        com.respond( mAdapter.getItem(position));



            getListView().setItemChecked(position, true);
        }else{
            Intent i = new Intent(this.getActivity(), GarageDetailActivity.class);
            i.putExtra("detailid", mAdapter.getItem(position).getID());
            startActivity(i);
        }
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Log.e("On clilk: ", mAdapter.getItem(position).toString());
    }


}
