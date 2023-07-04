package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;

/* loaded from: classes3.dex */
abstract class zzhe {
    private Task zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzhe(zzhd zzhdVar) {
    }

    public abstract CancellationTokenSource zza();

    public final Task zzc() {
        return this.zza;
    }

    public final void zzd(Task task) {
        this.zza = task;
    }
}