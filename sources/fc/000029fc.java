package com.google.android.gms.internal.mlkit_vision_face;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzv {
    private final String zza;
    private final zzu zzb;
    private zzu zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzv(String str, zzs zzsVar) {
        zzu zzuVar = new zzu(null);
        this.zzb = zzuVar;
        this.zzc = zzuVar;
        this.zza = str;
    }

    private final zzv zze(String str, Object obj) {
        zzt zztVar = new zzt(null);
        this.zzc.zzc = zztVar;
        this.zzc = zztVar;
        zztVar.zzb = obj;
        zztVar.zza = str;
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append(CoreConstants.CURLY_LEFT);
        zzu zzuVar = this.zzb.zzc;
        String str = "";
        while (zzuVar != null) {
            Object obj = zzuVar.zzb;
            sb2.append(str);
            String str2 = zzuVar.zza;
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
            zzuVar = zzuVar.zzc;
            str = ", ";
        }
        sb2.append(CoreConstants.CURLY_RIGHT);
        return sb2.toString();
    }

    public final zzv zza(String str, float f11) {
        zze(str, String.valueOf(f11));
        return this;
    }

    public final zzv zzb(String str, int i11) {
        zze(str, String.valueOf(i11));
        return this;
    }

    public final zzv zzc(String str, Object obj) {
        zzu zzuVar = new zzu(null);
        this.zzc.zzc = zzuVar;
        this.zzc = zzuVar;
        zzuVar.zzb = obj;
        zzuVar.zza = str;
        return this;
    }

    public final zzv zzd(String str, boolean z11) {
        zze("trackingEnabled", String.valueOf(z11));
        return this;
    }
}