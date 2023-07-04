package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.CancellationToken;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class zzdf {
    private final zzft zza;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzdf(zzft zzftVar) {
        this.zza = zzftVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final CancellationToken zza() {
        return this.zza.getCancellationToken();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzft zzb() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String zzc();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Map zzd();
}