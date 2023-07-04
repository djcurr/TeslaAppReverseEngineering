package com.google.android.gms.internal.mlkit_common;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzw {
    private final String zza;
    private final zzv zzb;
    private zzv zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzw(String str, zzt zztVar) {
        zzv zzvVar = new zzv(null);
        this.zzb = zzvVar;
        this.zzc = zzvVar;
        Objects.requireNonNull(str);
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append(CoreConstants.CURLY_LEFT);
        zzv zzvVar = this.zzb.zzc;
        String str = "";
        while (zzvVar != null) {
            Object obj = zzvVar.zzb;
            sb2.append(str);
            String str2 = zzvVar.zza;
            if (str2 != null) {
                sb2.append(str2);
                sb2.append('=');
            }
            if (obj != null && obj.getClass().isArray()) {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            } else {
                sb2.append(obj);
            }
            zzvVar = zzvVar.zzc;
            str = ", ";
        }
        sb2.append(CoreConstants.CURLY_RIGHT);
        return sb2.toString();
    }

    public final zzw zza(String str, Object obj) {
        zzv zzvVar = new zzv(null);
        this.zzc.zzc = zzvVar;
        this.zzc = zzvVar;
        zzvVar.zzb = obj;
        zzvVar.zza = str;
        return this;
    }

    public final zzw zzb(String str, boolean z11) {
        String valueOf = String.valueOf(z11);
        zzu zzuVar = new zzu(null);
        this.zzc.zzc = zzuVar;
        this.zzc = zzuVar;
        zzuVar.zzb = valueOf;
        zzuVar.zza = "isManifestFile";
        return this;
    }
}