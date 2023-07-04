package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzko implements zzkx {
    final /* synthetic */ zzkr zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzko(zzkr zzkrVar) {
        this.zza = zzkrVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzkx
    public final void zza(String str, String str2, Bundle bundle) {
        zzft zzftVar;
        zzft zzftVar2;
        if (!TextUtils.isEmpty(str)) {
            this.zza.zzaz().zzp(new zzkn(this, str, "_err", bundle));
            return;
        }
        zzkr zzkrVar = this.zza;
        zzftVar = zzkrVar.zzn;
        if (zzftVar != null) {
            zzftVar2 = zzkrVar.zzn;
            zzftVar2.zzay().zzd().zzb("AppId not known when logging event", "_err");
        }
    }
}