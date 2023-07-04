package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class zzgt {
    public static zzgt zzg() {
        return zzr(3).zzf();
    }

    public static zzgt zzh(String str) {
        Objects.requireNonNull(str);
        zzgs zzr = zzr(6);
        zzr.zzd(str);
        return zzr.zzf();
    }

    public static zzgt zzi(String str, Status status) {
        Objects.requireNonNull(str);
        Objects.requireNonNull(status);
        zzgs zzr = zzr(7);
        zzr.zzd(str);
        zzr.zze(status);
        return zzr.zzf();
    }

    public static zzgt zzj(List list) {
        Objects.requireNonNull(list);
        zzgs zzr = zzr(5);
        zzr.zzc(list);
        return zzr.zzf();
    }

    public static zzgt zzk() {
        return zzr(2).zzf();
    }

    public static zzgt zzl() {
        zzgs zzr = zzr(10);
        zzr.zze(new Status(16));
        return zzr.zzf();
    }

    public static zzgt zzm(AutocompletePrediction autocompletePrediction, Status status) {
        Objects.requireNonNull(status);
        zzgs zzr = zzr(9);
        zzr.zzb(autocompletePrediction);
        zzr.zze(status);
        return zzr.zzf();
    }

    public static zzgt zzn(Place place) {
        Objects.requireNonNull(place);
        zzgs zzr = zzr(8);
        zzr.zza(place);
        return zzr.zzf();
    }

    public static zzgt zzo() {
        return zzr(1).zzf();
    }

    public static zzgt zzp() {
        return zzr(4).zzf();
    }

    public static zzgt zzq(Status status) {
        Objects.requireNonNull(status);
        zzgs zzr = zzr(10);
        zzr.zze(status);
        return zzr.zzf();
    }

    private static zzgs zzr(int i11) {
        zzgl zzglVar = new zzgl();
        zzglVar.zzg(i11);
        return zzglVar;
    }

    public abstract Status zza();

    public abstract AutocompletePrediction zzb();

    public abstract Place zzc();

    public abstract zziy zzd();

    public abstract String zze();

    public abstract int zzf();
}