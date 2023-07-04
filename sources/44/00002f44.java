package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhm implements zzkx {
    final /* synthetic */ zzhy zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhm(zzhy zzhyVar) {
        this.zza = zzhyVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzkx
    public final void zza(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.zza.zzF("auto", "_err", bundle, str);
        } else {
            this.zza.zzD("auto", "_err", bundle);
        }
    }
}