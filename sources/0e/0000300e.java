package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class zze implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzf zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zze(zzf zzfVar, Task task) {
        this.zzb = zzfVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzw zzwVar;
        zzw zzwVar2;
        zzw zzwVar3;
        Continuation continuation;
        try {
            continuation = this.zzb.zzb;
            Task task = (Task) continuation.then(this.zza);
            if (task == null) {
                this.zzb.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = TaskExecutors.zza;
            task.addOnSuccessListener(executor, this.zzb);
            task.addOnFailureListener(executor, this.zzb);
            task.addOnCanceledListener(executor, this.zzb);
        } catch (RuntimeExecutionException e11) {
            if (e11.getCause() instanceof Exception) {
                zzwVar3 = this.zzb.zzc;
                zzwVar3.zza((Exception) e11.getCause());
                return;
            }
            zzwVar2 = this.zzb.zzc;
            zzwVar2.zza(e11);
        } catch (Exception e12) {
            zzwVar = this.zzb.zzc;
            zzwVar.zza(e12);
        }
    }
}