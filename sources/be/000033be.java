package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* loaded from: classes3.dex */
final class zzlg extends zzll {
    private static final zzlg zza = new zzlg(zzll.zze());
    private final AtomicReference zzb;

    zzlg(zzll zzllVar) {
        this.zzb = new AtomicReference(zzllVar);
    }

    public static final zzlg zzb() {
        return zza;
    }

    @Override // com.google.android.libraries.places.internal.zzll
    public final zzki zza() {
        return ((zzll) this.zzb.get()).zza();
    }

    @Override // com.google.android.libraries.places.internal.zzll
    public final zzly zzc() {
        return ((zzll) this.zzb.get()).zzc();
    }

    @Override // com.google.android.libraries.places.internal.zzll
    public final boolean zzd(String str, Level level, boolean z11) {
        ((zzll) this.zzb.get()).zzd(str, level, z11);
        return false;
    }
}