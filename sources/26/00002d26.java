package com.google.android.gms.location;

import com.google.android.gms.common.api.internal.RemoteCall;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zzaw implements RemoteCall {
    private boolean zza = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(boolean z11) {
        this.zza = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzb() {
        return this.zza;
    }
}