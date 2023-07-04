package com.google.android.libraries.places.internal;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzfj {
    private final zzff zza;
    private final Map zzb = new HashMap();

    public zzfj(zzff zzffVar) {
        this.zza = zzffVar;
    }

    public final boolean zza(final TaskCompletionSource taskCompletionSource, long j11, String str) {
        if (this.zzb.containsKey(taskCompletionSource)) {
            return false;
        }
        HandlerThread handlerThread = new HandlerThread("timeoutHandlerThread");
        handlerThread.start();
        this.zzb.put(taskCompletionSource, handlerThread);
        return new Handler(handlerThread.getLooper()).postDelayed(new Runnable("Location timeout.") { // from class: com.google.android.libraries.places.internal.zzfg
            public final /* synthetic */ String zzb = "Location timeout.";

            @Override // java.lang.Runnable
            public final void run() {
                TaskCompletionSource.this.trySetException(new ApiException(new Status(15, this.zzb)));
            }
        }, j11);
    }

    public final boolean zzb(TaskCompletionSource taskCompletionSource) {
        HandlerThread handlerThread = (HandlerThread) this.zzb.remove(taskCompletionSource);
        if (handlerThread == null) {
            return false;
        }
        return handlerThread.quit();
    }
}