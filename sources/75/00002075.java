package com.google.android.gms.internal.clearcut;

import com.google.protobuf.ExtensionRegistry;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbs {
    private static final Class<?> zzgl = zzak();

    private static Class<?> zzak() {
        try {
            int i11 = ExtensionRegistry.f17409a;
            return ExtensionRegistry.class;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static zzbt zzal() {
        Class<?> cls = zzgl;
        if (cls != null) {
            try {
                return (zzbt) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
            }
        }
        return zzbt.zzgo;
    }
}