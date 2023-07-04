package com.google.android.libraries.places.internal;

import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import androidx.lifecycle.viewmodel.CreationExtras;

/* loaded from: classes3.dex */
public final class zzhj implements s0.b {
    private final zzgy zza;
    private final zzho zzb;
    private final zzhp zzc;

    public zzhj(zzgy zzgyVar, zzho zzhoVar, zzhp zzhpVar) {
        this.zza = zzgyVar;
        this.zzb = zzhoVar;
        this.zzc = zzhpVar;
    }

    @Override // androidx.lifecycle.s0.b
    public final p0 create(Class cls) {
        zzig.zze(cls == zzhl.class, "This factory can only be used to instantiate its enclosing class.");
        return new zzhl(this.zza, this.zzb, this.zzc, null);
    }

    public final p0 create(Class cls, CreationExtras creationExtras) {
        return create(cls);
    }
}