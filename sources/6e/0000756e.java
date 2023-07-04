package ik;

import android.os.Build;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final int f30447a;

    static {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 21) {
            f30447a = 2;
        } else if (i11 >= 18) {
            f30447a = 1;
        } else {
            f30447a = 0;
        }
    }
}