package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Objects;

/* loaded from: classes3.dex */
final class zzat {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i11, String str) {
        if (i11 >= 0) {
            return i11;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzb(Object obj, Object obj2) {
        if (obj == null) {
            Objects.toString(obj2);
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        } else if (obj2 != null) {
        } else {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
    }
}