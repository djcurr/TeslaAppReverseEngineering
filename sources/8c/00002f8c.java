package com.google.android.gms.measurement.internal;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkd {
    private final Clock zza;
    private long zzb;

    public zzkd(Clock clock) {
        Preconditions.checkNotNull(clock);
        this.zza = clock;
    }

    public final void zza() {
        this.zzb = 0L;
    }

    public final void zzb() {
        this.zzb = this.zza.elapsedRealtime();
    }

    public final boolean zzc(long j11) {
        return this.zzb == 0 || this.zza.elapsedRealtime() - this.zzb >= CoreConstants.MILLIS_IN_ONE_HOUR;
    }
}