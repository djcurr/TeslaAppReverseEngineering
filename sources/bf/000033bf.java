package com.google.android.libraries.places.internal;

import java.util.Set;
import java.util.logging.Level;

/* loaded from: classes3.dex */
public final class zzlh implements zzlb {
    private final String zza;
    private final Level zzb;
    private final Set zzc;
    private final zzkr zzd;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzlh() {
        /*
            r8 = this;
            java.util.logging.Level r4 = java.util.logging.Level.ALL
            java.util.Set r6 = com.google.android.libraries.places.internal.zzlk.zzc()
            com.google.android.libraries.places.internal.zzkr r7 = com.google.android.libraries.places.internal.zzlk.zzb()
            java.lang.String r1 = ""
            r2 = 1
            r3 = 0
            r5 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzlh.<init>():void");
    }

    private zzlh(String str, boolean z11, boolean z12, Level level, boolean z13, Set set, zzkr zzkrVar) {
        this.zza = "";
        this.zzb = level;
        this.zzc = set;
        this.zzd = zzkrVar;
    }

    @Override // com.google.android.libraries.places.internal.zzlb
    public final zzkg zza(String str) {
        return new zzlk(this.zza, str, true, false, this.zzb, this.zzc, this.zzd, null);
    }

    public final zzlh zzb(boolean z11) {
        return new zzlh(this.zza, true, false, Level.OFF, false, this.zzc, this.zzd);
    }
}