package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzay extends com.google.android.gms.location.zzbh {
    private final ListenerHolder zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzay(ListenerHolder listenerHolder) {
        this.zza = listenerHolder;
    }

    public final synchronized void zzc() {
        this.zza.clear();
    }

    @Override // com.google.android.gms.location.zzbi
    public final void zzd(LocationAvailability locationAvailability) {
        this.zza.notifyListener(new zzax(this, locationAvailability));
    }

    @Override // com.google.android.gms.location.zzbi
    public final void zze(LocationResult locationResult) {
        this.zza.notifyListener(new zzaw(this, locationResult));
    }
}