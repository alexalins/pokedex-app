package com.example.pokedex.app.util;

import android.content.Context;
import android.widget.Toast;

public abstract class ItemUtil {

    public static void createToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
