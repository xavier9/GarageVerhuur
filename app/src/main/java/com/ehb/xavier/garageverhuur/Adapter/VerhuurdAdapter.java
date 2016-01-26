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
import com.ehb.xavier.garageverhuur.classes.Verhuurd;

import java.util.List;

public class VerhuurdAdapter extends ArrayAdapter<Verhuurd> {
    DatabaseHelper cdb = new DatabaseHelper(getContext());
    private final List<Verhuurd> list;
    private final Activity context;

    public VerhuurdAdapter(Activity context, List<Verhuurd> list) {
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
        ViewHolder holder = (ViewHolder) view.getTag();
        holder.text.setText(list.get(position).toString());

        return view;
    }

    private class ViewHolder {
        protected TextView text;

    }
}