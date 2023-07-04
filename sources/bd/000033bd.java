package com.google.android.libraries.places.internal;

import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
final class zzlf extends zzkz {
    private static final AtomicReference zza = new AtomicReference();
    private static final AtomicLong zzb = new AtomicLong();
    private static final ConcurrentLinkedQueue zzc = new ConcurrentLinkedQueue();
    private volatile zzkg zzd;

    private zzlf(String str) {
        super(str);
        String str2 = Build.FINGERPRINT;
        boolean z11 = true;
        boolean z12 = str2 == null || "robolectric".equals(str2);
        String str3 = Build.HARDWARE;
        boolean z13 = "goldfish".equals(str3) || "ranchu".equals(str3);
        String str4 = Build.TYPE;
        if (!"eng".equals(str4) && !"userdebug".equals(str4)) {
            z11 = false;
        }
        if (z12 || z13) {
            this.zzd = new zzla().zza(zza());
        } else if (z11) {
            this.zzd = new zzlh().zzb(false).zza(zza());
        } else {
            this.zzd = null;
        }
    }

    public static zzkg zzb(String str) {
        AtomicReference atomicReference = zza;
        if (atomicReference.get() != null) {
            return ((zzlb) atomicReference.get()).zza(str);
        }
        zzlf zzlfVar = new zzlf(str.replace(CoreConstants.DOLLAR, CoreConstants.DOT));
        zzld.zza.offer(zzlfVar);
        if (atomicReference.get() != null) {
            while (true) {
                zzlf zzlfVar2 = (zzlf) zzld.zza.poll();
                if (zzlfVar2 == null) {
                    break;
                }
                zzlfVar2.zzd = ((zzlb) zza.get()).zza(zzlfVar2.zza());
            }
            if (((zzle) zzc.poll()) != null) {
                zzb.getAndDecrement();
                throw null;
            }
        }
        return zzlfVar;
    }
}