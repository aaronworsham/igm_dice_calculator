package com.gm.diceroller.views;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;


/**
 * Created by aaronworsham on 8/15/16.
 */
public class DiceLongListener implements View.OnLongClickListener  {

    Context mContext;

    public DiceLongListener(Context context){
        this.mContext = context;
    }

    @Override
    public boolean onLongClick(View v){
        Log.i("LONG PRESS", "LONG PRESS");
        Intent intent = new Intent(this.mContext, DicePoolActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        this.mContext.startActivity(intent);
        return true;

    }
}
