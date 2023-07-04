package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class zzgq {
    public abstract zzgq zza(List list);

    public abstract zzgq zzb(String str);

    public abstract zzgq zzc(String str);

    public abstract zzgq zzd(LocationBias locationBias);

    public abstract zzgq zze(LocationRestriction locationRestriction);

    public abstract zzgq zzf(AutocompleteActivityMode autocompleteActivityMode);

    public abstract zzgq zzg(zzgp zzgpVar);

    public abstract zzgq zzh(List list);

    public abstract zzgq zzi(int i11);

    public abstract zzgq zzj(int i11);

    @Deprecated
    public abstract zzgq zzk(TypeFilter typeFilter);

    public abstract zzgq zzl(List list);

    public abstract zzgr zzm();

    public final zzgq zzn(String str) {
        return zza(str == null ? zziy.zzm() : zziy.zzn(str));
    }
}