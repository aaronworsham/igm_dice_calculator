package com.gm.diceroller;

import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by aaronworsham on 7/25/16.
 */
public class RollAdapter extends ArrayAdapter<RollModel>{

    public RollAdapter(Context context, ArrayList data) {
        super(context, 0, data);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        RollModel roll = getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.result_view, parent, false);
        }

        TextView txtRoll = (TextView) convertView.findViewById(R.id.txtRoll);

        txtRoll.setText(roll.roll);

        return convertView;

    }

}
