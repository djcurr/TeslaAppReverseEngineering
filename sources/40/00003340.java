package com.google.android.libraries.places.internal;

import android.os.Parcelable;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class zzgr implements Parcelable {
    public static zzgq zzn(AutocompleteActivityMode autocompleteActivityMode, List list, zzgp zzgpVar) {
        zzgh zzghVar = new zzgh();
        zzghVar.zza(new ArrayList());
        zzghVar.zzl(new ArrayList());
        zzghVar.zzf(autocompleteActivityMode);
        zzghVar.zzh(list);
        zzghVar.zzg(zzgpVar);
        zzghVar.zzi(0);
        zzghVar.zzj(0);
        return zzghVar;
    }

    public abstract int zza();

    public abstract int zzb();

    public abstract LocationBias zzc();

    public abstract LocationRestriction zzd();

    @Deprecated
    public abstract TypeFilter zze();

    public abstract zzgp zzf();

    public abstract zzgq zzg();

    public abstract AutocompleteActivityMode zzh();

    public abstract zziy zzi();

    public abstract zziy zzj();

    public abstract zziy zzk();

    public abstract String zzl();

    public abstract String zzm();
}