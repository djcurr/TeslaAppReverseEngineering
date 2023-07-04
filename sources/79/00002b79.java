package com.google.android.gms.internal.mlkit_vision_text_common;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzny implements zzof {
    final List zza;

    public zzny(Context context, zznx zznxVar) {
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        if (zznxVar.zzc()) {
            arrayList.add(new zzoo(context, zznxVar));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzof
    public final void zza(zznv zznvVar) {
        for (zzof zzofVar : this.zza) {
            zzofVar.zza(zznvVar);
        }
    }
}