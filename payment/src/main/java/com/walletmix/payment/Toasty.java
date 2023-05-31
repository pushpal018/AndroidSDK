package com.walletmix.payment;

import android.content.Context;
import android.widget.Toast;

public class Toasty {

    public static void showToast(Context context){

        Toast.makeText(context, "Show Toast From My library", Toast.LENGTH_SHORT).show();
    }
}
