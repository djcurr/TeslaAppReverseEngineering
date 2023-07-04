package com.google.android.libraries.places.internal;

import ch.qos.logback.core.joran.action.Action;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzkm {
    private static final zzkq zza = new zzkj();
    private static final zzkp zzb = new zzkk();
    private final zzkq zze;
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private zzkp zzf = null;

    public final zzkm zza(zzkp zzkpVar) {
        this.zzf = zzkpVar;
        return this;
    }

    public final zzkr zzd() {
        return new zzko(this, null);
    }

    public final void zzg(zzkd zzkdVar) {
        zzma.zza(zzkdVar, Action.KEY_ATTRIBUTE);
        if (zzkdVar.zzb()) {
            zzkp zzkpVar = zzb;
            zzma.zza(zzkdVar, Action.KEY_ATTRIBUTE);
            if (zzkdVar.zzb()) {
                this.zzc.remove(zzkdVar);
                this.zzd.put(zzkdVar, zzkpVar);
                return;
            }
            throw new IllegalArgumentException("key must be repeating");
        }
        zzkq zzkqVar = zza;
        zzma.zza(zzkdVar, Action.KEY_ATTRIBUTE);
        this.zzd.remove(zzkdVar);
        this.zzc.put(zzkdVar, zzkqVar);
    }
}