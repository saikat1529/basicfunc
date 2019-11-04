package com.saikat.basicfunc;

import android.content.Context;
import android.widget.Toast;

public class BaseUtil {

    Context context;

    public BaseUtil(Context context){
        this.context = context;
    }

    public void showToast(String message){
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

}
