package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfp extends Thread {
    final /* synthetic */ zzfq zza;
    private final Object zzb;
    private final BlockingQueue zzc;
    private boolean zzd = false;

    public zzfp(zzfq zzfqVar, String str, BlockingQueue blockingQueue) {
        this.zza = zzfqVar;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.zzb = new Object();
        this.zzc = blockingQueue;
        setName(str);
    }

    private final void zzb() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        zzfp zzfpVar;
        zzfp zzfpVar2;
        obj = this.zza.zzh;
        synchronized (obj) {
            if (!this.zzd) {
                semaphore = this.zza.zzi;
                semaphore.release();
                obj2 = this.zza.zzh;
                obj2.notifyAll();
                zzfq zzfqVar = this.zza;
                zzfpVar = zzfqVar.zzb;
                if (this == zzfpVar) {
                    zzfqVar.zzb = null;
                } else {
                    zzfpVar2 = zzfqVar.zzc;
                    if (this == zzfpVar2) {
                        zzfqVar.zzc = null;
                    } else {
                        zzfqVar.zzs.zzay().zzd().zza("Current scheduler thread is neither worker nor network");
                    }
                }
                this.zzd = true;
            }
        }
    }

    private final void zzc(InterruptedException interruptedException) {
        this.zza.zzs.zzay().zzk().zzb(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Semaphore semaphore;
        Object obj;
        boolean z11 = false;
        while (!z11) {
            try {
                semaphore = this.zza.zzi;
                semaphore.acquire();
                z11 = true;
            } catch (InterruptedException e11) {
                zzc(e11);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                zzfo zzfoVar = (zzfo) this.zzc.poll();
                if (zzfoVar != null) {
                    Process.setThreadPriority(true != zzfoVar.zza ? 10 : threadPriority);
                    zzfoVar.run();
                } else {
                    synchronized (this.zzb) {
                        if (this.zzc.peek() == null) {
                            zzfq.zzr(this.zza);
                            try {
                                this.zzb.wait(30000L);
                            } catch (InterruptedException e12) {
                                zzc(e12);
                            }
                        }
                    }
                    obj = this.zza.zzh;
                    synchronized (obj) {
                        if (this.zzc.peek() == null) {
                            break;
                        }
                    }
                }
            }
            if (this.zza.zzs.zzf().zzs(null, zzdw.zzae)) {
                zzb();
            }
        } finally {
            zzb();
        }
    }

    public final void zza() {
        synchronized (this.zzb) {
            this.zzb.notifyAll();
        }
    }
}