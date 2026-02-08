package com.dola.mindtwist;

import android.content.Context;
import android.content.SharedPreferences;

public class GameManager {

    public static void addTime(Context c, int seconds) {
        SharedPreferences sp = c.getSharedPreferences("DATA", Context.MODE_PRIVATE);
        long t = sp.getLong("time", 0);
        sp.edit().putLong("time", t + seconds).apply();
    }
}
