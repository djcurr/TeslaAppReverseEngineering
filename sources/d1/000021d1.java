package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class zzba extends zzaj {
    private final BaseImplementation.ResultHolder zza;

    public zzba(BaseImplementation.ResultHolder resultHolder) {
        Preconditions.checkArgument(resultHolder != null, "listener can't be null.");
        this.zza = resultHolder;
    }

    private final void zze(int i11) {
        BaseImplementation.ResultHolder resultHolder = this.zza;
        if (i11 != 0 && (i11 < 1000 || i11 >= 1006)) {
            i11 = 13;
        }
        resultHolder.setResult(new Status(i11));
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzb(int i11, String[] strArr) {
        zze(i11);
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzc(int i11, PendingIntent pendingIntent) {
        zze(i11);
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzd(int i11, String[] strArr) {
        zze(i11);
    }
}