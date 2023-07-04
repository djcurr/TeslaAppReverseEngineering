package com.google.android.gms.internal.vision;

/* loaded from: classes3.dex */
final class zzhp {
    private static final zzhn zzzu = zzgk();
    private static final zzhn zzzv = new zzho();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzhn zzgi() {
        return zzzu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzhn zzgj() {
        return zzzv;
    }

    private static zzhn zzgk() {
        try {
            return (zzhn) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}