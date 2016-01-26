package com.ehb.xavier.garageverhuur.Adapter;

/**
 * Created by xavier on 29/05/2015.
 */
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.ehb.xavier.garageverhuur.R;
import com.ehb.xavier.garageverhuur.classes.DatabaseHelper;
import com.ehb.xavier.garageverhuur.classes.Garage;
import com.ehb.xavier.garageverhuur.classes.Verhuurd;

import java.util.ArrayList;
import java.util.List;

public class PersoonAdapter extends ArrayAdapter<Garage> {
    DatabaseHelper cdb = new DatabaseHelper(getContext());
    private final List<Garage> list;
    private final Activity context;

    public PersoonAdapter(Activity context, List<Garage> list) {
        super(context, R.layout.list_get_garage_item, list);
        this.context = context;
        this.list = list;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = null;
        if (convertView == null) {
            LayoutInflater inflator = context.getLayoutInflater();
            view = inflator.inflate(R.layout.list_get_garage_item, null);
            final ViewHolder viewHolder = new ViewHolder();
            viewHolder.text = (TextView) view.findViewById(R.id.Adresitem);

            view.setTag(viewHolder);

        } else {
            view = convertView;

        }
        ArrayList<Verhuurd> verhuurders = cdb.getVerhuurdByGarageID(list.get(position).getID());
        ViewHolder holder = (ViewHolder) view.getTag();
        if(verhuurders.size() != 0){
        if(cdb.getVerhuurdByGarageID(list.get(position).getID()) != null) {
            holder.text.setText(list.get(position).toString()+"\n"+"Verhuurd "+"Ja");
        }else{
            holder.text.setText(list.get(position).toString()+"\n"+"Verhuurd "+"Neen");
        }}else{
            holder.text.setText(list.get(position).toString()+"\n"+"Verhuurd "+"Neen");
        }

        return view;
    }

    private class ViewHolder {
        protected TextView text;

    }
}