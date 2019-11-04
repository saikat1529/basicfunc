package com.saikat.basicfunc;

import android.content.Context;
import android.widget.Toast;

public class BaseUtil {

    public static void showToast(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

}
