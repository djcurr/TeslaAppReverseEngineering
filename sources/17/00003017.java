package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzn implements zzq {
    private final Executor zza;
    private final Object zzb = new Object();
    private OnSuccessListener zzc;

    public zzn(Executor executor, OnSuccessListener onSuccessListener) {
        this.zza = executor;
        this.zzc = onSuccessListener;
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzc() {
        synchronized (this.zzb) {
            this.zzc = null;
        }
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzd(Task task) {
        if (task.isSuccessful()) {
            synchronized (this.zzb) {
                if (this.zzc == null) {
                    return;
                }
                this.zza.execute(new zzm(this, task));
            }
        }
    }
}