package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
public class zzkd {
    private final String zza;
    private final Class zzb;
    private final boolean zzc;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzkd(String str, Class cls, boolean z11) {
        this(str, cls, z11, true);
    }

    public static zzkd zza(String str, Class cls) {
        return new zzkd(str, cls, false, false);
    }

    public final String toString() {
        String name = getClass().getName();
        String str = this.zza;
        String name2 = this.zzb.getName();
        return name + "/" + str + "[" + name2 + "]";
    }

    public final boolean zzb() {
        return this.zzc;
    }

    private zzkd(String str, Class cls, boolean z11, boolean z12) {
        zzma.zzb(str);
        this.zza = str;
        this.zzb = cls;
        this.zzc = z11;
        System.identityHashCode(this);
        for (int i11 = 0; i11 < 5; i11++) {
        }
    }
}