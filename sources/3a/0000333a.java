package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgl extends zzgs {
    private String zza;
    private zziy zzb;
    private Place zzc;
    private AutocompletePrediction zzd;
    private Status zze;
    private int zzf;

    @Override // com.google.android.libraries.places.internal.zzgs
    public final zzgs zza(Place place) {
        this.zzc = place;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzgs
    public final zzgs zzb(AutocompletePrediction autocompletePrediction) {
        this.zzd = autocompletePrediction;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzgs
    public final zzgs zzc(List list) {
        this.zzb = zziy.zzk(list);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzgs
    public final zzgs zzd(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzgs
    public final zzgs zze(Status status) {
        this.zze = status;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzgs
    public final zzgt zzf() {
        int i11 = this.zzf;
        if (i11 != 0) {
            return new zzgn(i11, this.zza, this.zzb, this.zzc, this.zzd, this.zze, null);
        }
        throw new IllegalStateException("Missing required properties: type");
    }

    public final zzgs zzg(int i11) {
        this.zzf = i11;
        return this;
    }
}