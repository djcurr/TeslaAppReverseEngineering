package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.Place;

/* loaded from: classes3.dex */
final class zzgn extends zzgt {
    private final String zza;
    private final zziy zzb;
    private final Place zzc;
    private final AutocompletePrediction zzd;
    private final Status zze;
    private final int zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgn(int i11, String str, zziy zziyVar, Place place, AutocompletePrediction autocompletePrediction, Status status, zzgm zzgmVar) {
        this.zzf = i11;
        this.zza = str;
        this.zzb = zziyVar;
        this.zzc = place;
        this.zzd = autocompletePrediction;
        this.zze = status;
    }

    public final boolean equals(Object obj) {
        String str;
        zziy zziyVar;
        Place place;
        AutocompletePrediction autocompletePrediction;
        Status status;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgt) {
            zzgt zzgtVar = (zzgt) obj;
            if (this.zzf == zzgtVar.zzf() && ((str = this.zza) != null ? str.equals(zzgtVar.zze()) : zzgtVar.zze() == null) && ((zziyVar = this.zzb) != null ? zziyVar.equals(zzgtVar.zzd()) : zzgtVar.zzd() == null) && ((place = this.zzc) != null ? place.equals(zzgtVar.zzc()) : zzgtVar.zzc() == null) && ((autocompletePrediction = this.zzd) != null ? autocompletePrediction.equals(zzgtVar.zzb()) : zzgtVar.zzb() == null) && ((status = this.zze) != null ? status.equals(zzgtVar.zza()) : zzgtVar.zza() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11 = (this.zzf ^ 1000003) * 1000003;
        String str = this.zza;
        int hashCode = (i11 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        zziy zziyVar = this.zzb;
        int hashCode2 = (hashCode ^ (zziyVar == null ? 0 : zziyVar.hashCode())) * 1000003;
        Place place = this.zzc;
        int hashCode3 = (hashCode2 ^ (place == null ? 0 : place.hashCode())) * 1000003;
        AutocompletePrediction autocompletePrediction = this.zzd;
        int hashCode4 = (hashCode3 ^ (autocompletePrediction == null ? 0 : autocompletePrediction.hashCode())) * 1000003;
        Status status = this.zze;
        return hashCode4 ^ (status != null ? status.hashCode() : 0);
    }

    public final String toString() {
        String str;
        switch (this.zzf) {
            case 1:
                str = "START";
                break;
            case 2:
                str = "RESET";
                break;
            case 3:
                str = "LOADING";
                break;
            case 4:
                str = "TRY_AGAIN_PROGRESS_LOADING";
                break;
            case 5:
                str = "SUCCESS_PREDICTIONS";
                break;
            case 6:
                str = "FAILURE_NO_PREDICTIONS";
                break;
            case 7:
                str = "FAILURE_PREDICTIONS";
                break;
            case 8:
                str = "SUCCESS_SELECTION";
                break;
            case 9:
                str = "FAILURE_SELECTION";
                break;
            default:
                str = "FAILURE_UNRESOLVABLE";
                break;
        }
        String str2 = this.zza;
        String valueOf = String.valueOf(this.zzb);
        String valueOf2 = String.valueOf(this.zzc);
        String valueOf3 = String.valueOf(this.zzd);
        String valueOf4 = String.valueOf(this.zze);
        return "AutocompleteState{type=" + str + ", query=" + str2 + ", predictions=" + valueOf + ", place=" + valueOf2 + ", prediction=" + valueOf3 + ", status=" + valueOf4 + "}";
    }

    @Override // com.google.android.libraries.places.internal.zzgt
    public final Status zza() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.internal.zzgt
    public final AutocompletePrediction zzb() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.internal.zzgt
    public final Place zzc() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzgt
    public final zziy zzd() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzgt
    public final String zze() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzgt
    public final int zzf() {
        return this.zzf;
    }
}