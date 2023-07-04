package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
public final class zzma {
    public static Object zza(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str.concat(" must not be null"));
    }

    public static String zzb(String str) {
        if (!str.isEmpty()) {
            if (zzc(str.charAt(0))) {
                for (int i11 = 1; i11 < str.length(); i11++) {
                    char charAt = str.charAt(i11);
                    if (!zzc(charAt) && ((charAt < '0' || charAt > '9') && charAt != '_')) {
                        throw new IllegalArgumentException("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
                    }
                }
                return str;
            }
            throw new IllegalArgumentException("identifier must start with an ASCII letter: ".concat(str));
        }
        throw new IllegalArgumentException("identifier must not be empty");
    }

    private static boolean zzc(char c11) {
        if (c11 < 'a' || c11 > 'z') {
            return c11 >= 'A' && c11 <= 'Z';
        }
        return true;
    }
}