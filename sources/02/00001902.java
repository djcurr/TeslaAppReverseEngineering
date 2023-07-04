package com.facebook.react.modules.network;

/* loaded from: classes3.dex */
public class d {
    public static String a(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        boolean z11 = false;
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt <= ' ' || charAt >= 127) {
                z11 = true;
            } else {
                sb2.append(charAt);
            }
        }
        return z11 ? sb2.toString() : str;
    }

    public static String b(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        boolean z11 = false;
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if ((charAt <= 31 || charAt >= 127) && charAt != '\t') {
                z11 = true;
            } else {
                sb2.append(charAt);
            }
        }
        return z11 ? sb2.toString() : str;
    }
}