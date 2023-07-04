package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
final class zzgh extends zzgq {
    private AutocompleteActivityMode zza;
    private zziy zzb;
    private zzgp zzc;
    private String zzd;
    private String zze;
    private LocationBias zzf;
    private LocationRestriction zzg;
    private zziy zzh;
    private TypeFilter zzi;
    private zziy zzj;
    private int zzk;
    private int zzl;
    private byte zzm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgh() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgh(zzgr zzgrVar, zzgg zzggVar) {
        this.zza = zzgrVar.zzh();
        this.zzb = zzgrVar.zzj();
        this.zzc = zzgrVar.zzf();
        this.zzd = zzgrVar.zzm();
        this.zze = zzgrVar.zzl();
        this.zzf = zzgrVar.zzc();
        this.zzg = zzgrVar.zzd();
        this.zzh = zzgrVar.zzi();
        this.zzi = zzgrVar.zze();
        this.zzj = zzgrVar.zzk();
        this.zzk = zzgrVar.zza();
        this.zzl = zzgrVar.zzb();
        this.zzm = (byte) 3;
    }

    @Override // com.google.android.libraries.places.internal.zzgq
    public final zzgq zza(List list) {
        this.zzh = zziy.zzk(list);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzgq
    public final zzgq zzb(String str) {
        this.zze = str;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzgq
    public final zzgq zzc(String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzgq
    public final zzgq zzd(LocationBias locationBias) {
        this.zzf = locationBias;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzgq
    public final zzgq zze(LocationRestriction locationRestriction) {
        this.zzg = locationRestriction;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzgq
    public final zzgq zzf(AutocompleteActivityMode autocompleteActivityMode) {
        Objects.requireNonNull(autocompleteActivityMode, "Null mode");
        this.zza = autocompleteActivityMode;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzgq
    public final zzgq zzg(zzgp zzgpVar) {
        Objects.requireNonNull(zzgpVar, "Null origin");
        this.zzc = zzgpVar;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzgq
    public final zzgq zzh(List list) {
        this.zzb = zziy.zzk(list);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzgq
    public final zzgq zzi(int i11) {
        this.zzk = i11;
        this.zzm = (byte) (this.zzm | 1);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzgq
    public final zzgq zzj(int i11) {
        this.zzl = i11;
        this.zzm = (byte) (this.zzm | 2);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzgq
    public final zzgq zzk(TypeFilter typeFilter) {
        this.zzi = typeFilter;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzgq
    public final zzgq zzl(List list) {
        this.zzj = zziy.zzk(list);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzgq
    public final zzgr zzm() {
        AutocompleteActivityMode autocompleteActivityMode;
        zziy zziyVar;
        zzgp zzgpVar;
        zziy zziyVar2;
        zziy zziyVar3;
        if (this.zzm == 3 && (autocompleteActivityMode = this.zza) != null && (zziyVar = this.zzb) != null && (zzgpVar = this.zzc) != null && (zziyVar2 = this.zzh) != null && (zziyVar3 = this.zzj) != null) {
            return new zzgk(autocompleteActivityMode, zziyVar, zzgpVar, this.zzd, this.zze, this.zzf, this.zzg, zziyVar2, this.zzi, zziyVar3, this.zzk, this.zzl);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" mode");
        }
        if (this.zzb == null) {
            sb2.append(" placeFields");
        }
        if (this.zzc == null) {
            sb2.append(" origin");
        }
        if (this.zzh == null) {
            sb2.append(" countries");
        }
        if (this.zzj == null) {
            sb2.append(" typesFilter");
        }
        if ((this.zzm & 1) == 0) {
            sb2.append(" primaryColor");
        }
        if ((this.zzm & 2) == 0) {
            sb2.append(" primaryColorDark");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}