package com.dola.mindtwist;

public class NativeBridge {
    static {
        System.loadLibrary("native-lib");
    }

    public native int sum(int a, int b);
}
