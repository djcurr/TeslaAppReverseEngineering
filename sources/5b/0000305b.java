package com.google.android.gms.vision.clearcut;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.internal.vision.zzdu;
import com.google.android.gms.vision.L;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Keep
/* loaded from: classes3.dex */
public class DynamiteClearcutLogger {
    private static final ThreadPoolExecutor zzbo = new ThreadPoolExecutor(1, 2, 2, TimeUnit.SECONDS, new LinkedBlockingQueue(10), new ThreadPoolExecutor.DiscardPolicy());
    private zzb zzbp = new zzb(0.03333333333333333d);
    private VisionClearcutLogger zzbq;

    public DynamiteClearcutLogger(Context context) {
        this.zzbq = new VisionClearcutLogger(context);
    }

    public final void zza(int i11, zzdu zzduVar) {
        if (i11 == 3 && !this.zzbp.tryAcquire()) {
            L.zza("Skipping image analysis log due to rate limiting", new Object[0]);
        } else {
            zzbo.execute(new zza(this, i11, zzduVar));
        }
    }
}