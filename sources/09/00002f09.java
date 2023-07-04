package com.google.android.gms.measurement.internal;

import androidx.collection.e;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfh extends e {
    final /* synthetic */ zzfk zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfh(zzfk zzfkVar, int i11) {
        super(20);
        this.zza = zzfkVar;
    }

    @Override // androidx.collection.e
    protected final /* bridge */ /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        return zzfk.zzd(this.zza, str);
    }
}