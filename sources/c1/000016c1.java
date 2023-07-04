package com.facebook.imagepipeline.nativecode;

import android.os.Build;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f11302a;

    public static synchronized void a() {
        synchronized (d.class) {
            if (!f11302a) {
                if (Build.VERSION.SDK_INT <= 16) {
                    try {
                        yg.a.e("fb_jpegturbo", 1);
                    } catch (UnsatisfiedLinkError unused) {
                    }
                }
                yg.a.d("native-imagetranscoder");
                f11302a = true;
            }
        }
    }
}