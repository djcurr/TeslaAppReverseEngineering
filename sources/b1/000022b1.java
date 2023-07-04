package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzfb extends zzjv implements zzlh {
    private zzfb() {
        super(zzfc.zzf());
    }

    public final int zza() {
        return ((zzfc) this.zza).zzb();
    }

    public final zzfa zzb(int i11) {
        return ((zzfc) this.zza).zzd(i11);
    }

    public final zzfb zzc() {
        if (this.zzb) {
            zzaC();
            this.zzb = false;
        }
        zzfc.zzn((zzfc) this.zza);
        return this;
    }

    public final zzfb zzd(int i11, zzez zzezVar) {
        if (this.zzb) {
            zzaC();
            this.zzb = false;
        }
        zzfc.zzm((zzfc) this.zza, i11, (zzfa) zzezVar.zzay());
        return this;
    }

    public final List zze() {
        return Collections.unmodifiableList(((zzfc) this.zza).zzi());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfb(zzey zzeyVar) {
        super(zzfc.zzf());
    }
}