package com.google.android.gms.internal.vision;

import ch.qos.logback.core.CoreConstants;
import java.util.List;

/* loaded from: classes3.dex */
final class zzcx extends zzcu {
    private final zzcv zzlw = new zzcv();

    @Override // com.google.android.gms.internal.vision.zzcu
    public final void zza(Throwable th2) {
        th2.printStackTrace();
        List<Throwable> zza = this.zzlw.zza(th2, false);
        if (zza == null) {
            return;
        }
        synchronized (zza) {
            for (Throwable th3 : zza) {
                System.err.print(CoreConstants.SUPPRESSED);
                th3.printStackTrace();
            }
        }
    }
}