package com.google.android.gms.internal.gcm;

import java.util.Objects;

/* loaded from: classes3.dex */
final class zzu extends zzr {
    private final zzs zzdw = new zzs();

    @Override // com.google.android.gms.internal.gcm.zzr
    public final void zzd(Throwable th2, Throwable th3) {
        if (th3 != th2) {
            Objects.requireNonNull(th3, "The suppressed exception cannot be null.");
            this.zzdw.zzd(th2, true).add(th3);
            return;
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", th3);
    }
}