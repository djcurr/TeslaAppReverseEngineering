package com.google.android.gms.internal.mlkit_vision_common;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzku implements zzky {
    final List zza;

    public zzku(Context context, zzkt zzktVar) {
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        if (zzktVar.zzc()) {
            arrayList.add(new zzlf(context, zzktVar));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzky
    public final void zza(zzkr zzkrVar) {
        for (zzky zzkyVar : this.zza) {
            zzkyVar.zza(zzkrVar);
        }
    }
}