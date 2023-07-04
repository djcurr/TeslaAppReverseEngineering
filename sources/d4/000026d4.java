package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzoi implements zzop {
    final List zza;

    public zzoi(Context context, zzoh zzohVar) {
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        if (zzohVar.zzc()) {
            arrayList.add(new zzoy(context, zzohVar));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzop
    public final void zza(zzof zzofVar) {
        for (zzop zzopVar : this.zza) {
            zzopVar.zza(zzofVar);
        }
    }
}