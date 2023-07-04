package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zzgi extends zzgr {
    private final AutocompleteActivityMode zza;
    private final zziy zzb;
    private final zzgp zzc;
    private final String zzd;
    private final String zze;
    private final LocationBias zzf;
    private final LocationRestriction zzg;
    private final zziy zzh;
    private final TypeFilter zzi;
    private final zziy zzj;
    private final int zzk;
    private final int zzl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgi(AutocompleteActivityMode autocompleteActivityMode, zziy zziyVar, zzgp zzgpVar, String str, String str2, LocationBias locationBias, LocationRestriction locationRestriction, zziy zziyVar2, TypeFilter typeFilter, zziy zziyVar3, int i11, int i12) {
        Objects.requireNonNull(autocompleteActivityMode, "Null mode");
        this.zza = autocompleteActivityMode;
        Objects.requireNonNull(zziyVar, "Null placeFields");
        this.zzb = zziyVar;
        Objects.requireNonNull(zzgpVar, "Null origin");
        this.zzc = zzgpVar;
        this.zzd = str;
        this.zze = str2;
        this.zzf = locationBias;
        this.zzg = locationRestriction;
        Objects.requireNonNull(zziyVar2, "Null countries");
        this.zzh = zziyVar2;
        this.zzi = typeFilter;
        Objects.requireNonNull(zziyVar3, "Null typesFilter");
        this.zzj = zziyVar3;
        this.zzk = i11;
        this.zzl = i12;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        LocationBias locationBias;
        LocationRestriction locationRestriction;
        TypeFilter typeFilter;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgr) {
            zzgr zzgrVar = (zzgr) obj;
            if (this.zza.equals(zzgrVar.zzh()) && this.zzb.equals(zzgrVar.zzj()) && this.zzc.equals(zzgrVar.zzf()) && ((str = this.zzd) != null ? str.equals(zzgrVar.zzm()) : zzgrVar.zzm() == null) && ((str2 = this.zze) != null ? str2.equals(zzgrVar.zzl()) : zzgrVar.zzl() == null) && ((locationBias = this.zzf) != null ? locationBias.equals(zzgrVar.zzc()) : zzgrVar.zzc() == null) && ((locationRestriction = this.zzg) != null ? locationRestriction.equals(zzgrVar.zzd()) : zzgrVar.zzd() == null) && this.zzh.equals(zzgrVar.zzi()) && ((typeFilter = this.zzi) != null ? typeFilter.equals(zzgrVar.zze()) : zzgrVar.zze() == null) && this.zzj.equals(zzgrVar.zzk()) && this.zzk == zzgrVar.zza() && this.zzl == zzgrVar.zzb()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode()) * 1000003;
        String str = this.zzd;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.zze;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        LocationBias locationBias = this.zzf;
        int hashCode4 = (hashCode3 ^ (locationBias == null ? 0 : locationBias.hashCode())) * 1000003;
        LocationRestriction locationRestriction = this.zzg;
        int hashCode5 = (((hashCode4 ^ (locationRestriction == null ? 0 : locationRestriction.hashCode())) * 1000003) ^ this.zzh.hashCode()) * 1000003;
        TypeFilter typeFilter = this.zzi;
        return ((((((hashCode5 ^ (typeFilter != null ? typeFilter.hashCode() : 0)) * 1000003) ^ this.zzj.hashCode()) * 1000003) ^ this.zzk) * 1000003) ^ this.zzl;
    }

    public final String toString() {
        String obj = this.zza.toString();
        String obj2 = this.zzb.toString();
        String obj3 = this.zzc.toString();
        String str = this.zzd;
        String str2 = this.zze;
        String valueOf = String.valueOf(this.zzf);
        String valueOf2 = String.valueOf(this.zzg);
        String obj4 = this.zzh.toString();
        String valueOf3 = String.valueOf(this.zzi);
        String obj5 = this.zzj.toString();
        int i11 = this.zzk;
        int i12 = this.zzl;
        return "AutocompleteOptions{mode=" + obj + ", placeFields=" + obj2 + ", origin=" + obj3 + ", initialQuery=" + str + ", hint=" + str2 + ", locationBias=" + valueOf + ", locationRestriction=" + valueOf2 + ", countries=" + obj4 + ", typeFilter=" + valueOf3 + ", typesFilter=" + obj5 + ", primaryColor=" + i11 + ", primaryColorDark=" + i12 + "}";
    }

    @Override // com.google.android.libraries.places.internal.zzgr
    public final int zza() {
        return this.zzk;
    }

    @Override // com.google.android.libraries.places.internal.zzgr
    public final int zzb() {
        return this.zzl;
    }

    @Override // com.google.android.libraries.places.internal.zzgr
    public final LocationBias zzc() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.internal.zzgr
    public final LocationRestriction zzd() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.internal.zzgr
    @Deprecated
    public final TypeFilter zze() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.internal.zzgr
    public final zzgp zzf() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzgr
    public final zzgq zzg() {
        return new zzgh(this, null);
    }

    @Override // com.google.android.libraries.places.internal.zzgr
    public final AutocompleteActivityMode zzh() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzgr
    public final zziy zzi() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.internal.zzgr
    public final zziy zzj() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzgr
    public final zziy zzk() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.internal.zzgr
    public final String zzl() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.internal.zzgr
    public final String zzm() {
        return this.zzd;
    }
}