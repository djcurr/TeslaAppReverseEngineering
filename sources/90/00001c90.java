package com.google.android.exoplayer2.ui;

import ak.k0;
import android.graphics.Color;

/* loaded from: classes3.dex */
final class b {
    public static String a(String str) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str).length());
        sb2.append(".");
        sb2.append(str);
        sb2.append(",.");
        sb2.append(str);
        sb2.append(" *");
        return sb2.toString();
    }

    public static String b(int i11) {
        return k0.D("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i11)), Integer.valueOf(Color.green(i11)), Integer.valueOf(Color.blue(i11)), Double.valueOf(Color.alpha(i11) / 255.0d));
    }
}