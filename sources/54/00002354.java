package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class zzlc {
    private static final zzlb zza;
    private static final zzlb zzb;

    static {
        zzlb zzlbVar;
        try {
            zzlbVar = (zzlb) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzlbVar = null;
        }
        zza = zzlbVar;
        zzb = new zzlb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzlb zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzlb zzb() {
        return zzb;
    }
}