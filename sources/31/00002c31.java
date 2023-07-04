package com.google.android.gms.internal.vision;

import com.google.protobuf.ExtensionRegistry;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfj {
    private static final Class<?> zzte = zzee();

    private static Class<?> zzee() {
        try {
            int i11 = ExtensionRegistry.f17409a;
            return ExtensionRegistry.class;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static zzfk zzef() {
        if (zzte != null) {
            try {
                return zzp("newInstance");
            } catch (Exception unused) {
            }
        }
        return new zzfk();
    }

    public static zzfk zzeg() {
        if (zzte != null) {
            try {
                return zzp("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return zzfk.zzti;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.vision.zzfk zzeh() {
        /*
            java.lang.Class<?> r0 = com.google.android.gms.internal.vision.zzfj.zzte
            if (r0 == 0) goto Lb
            java.lang.String r0 = "loadGeneratedRegistry"
            com.google.android.gms.internal.vision.zzfk r0 = zzp(r0)     // Catch: java.lang.Exception -> Lb
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto L12
            com.google.android.gms.internal.vision.zzfk r0 = com.google.android.gms.internal.vision.zzfk.zzeh()
        L12:
            if (r0 != 0) goto L18
            com.google.android.gms.internal.vision.zzfk r0 = zzeg()
        L18:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzfj.zzeh():com.google.android.gms.internal.vision.zzfk");
    }

    private static final zzfk zzp(String str) {
        return (zzfk) zzte.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }
}