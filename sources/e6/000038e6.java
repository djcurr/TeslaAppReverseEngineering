package com.google.firebase.crashlytics.ndk;

import android.util.Log;

/* loaded from: classes3.dex */
public class CrashpadMain {
    public static native void crashpadMain(String[] strArr);

    public static void main(String[] strArr) {
        try {
            String str = strArr[1];
            Log.d("FirebaseCrashlytics", "Path to shared objects is " + str);
            System.load(str + "libcrashlytics-handler.so");
            crashpadMain(strArr);
        } catch (UnsatisfiedLinkError e11) {
            throw new RuntimeException(e11);
        }
    }
}