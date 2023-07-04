package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "BarcodeParcelCreator")
/* loaded from: classes3.dex */
public final class zzpr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpr> CREATOR = new zzps();
    @SafeParcelable.Field(getter = "getFormat", id = 1)
    private final int zza;
    @SafeParcelable.Field(getter = "getDisplayValue", id = 2)
    private final String zzb;
    @SafeParcelable.Field(getter = "getRawValue", id = 3)
    private final String zzc;
    @SafeParcelable.Field(getter = "getRawBytes", id = 4)
    private final byte[] zzd;
    @SafeParcelable.Field(getter = "getCornerPoints", id = 5)
    private final Point[] zze;
    @SafeParcelable.Field(getter = "getValueType", id = 6)
    private final int zzf;
    @SafeParcelable.Field(getter = "getEmailParcel", id = 7)
    private final zzpk zzg;
    @SafeParcelable.Field(getter = "getPhoneParcel", id = 8)
    private final zzpn zzh;
    @SafeParcelable.Field(getter = "getSmsParcel", id = 9)
    private final zzpo zzi;
    @SafeParcelable.Field(getter = "getWiFiParcel", id = 10)
    private final zzpq zzj;
    @SafeParcelable.Field(getter = "getUrlBookmarkParcel", id = 11)
    private final zzpp zzk;
    @SafeParcelable.Field(getter = "getGeoPointParcel", id = 12)
    private final zzpl zzl;
    @SafeParcelable.Field(getter = "getCalendarEventParcel", id = 13)
    private final zzph zzm;
    @SafeParcelable.Field(getter = "getContactInfoParcel", id = 14)
    private final zzpi zzn;
    @SafeParcelable.Field(getter = "getDriverLicenseParcel", id = 15)
    private final zzpj zzo;

    @SafeParcelable.Constructor
    public zzpr(@SafeParcelable.Param(id = 1) int i11, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) byte[] bArr, @SafeParcelable.Param(id = 5) Point[] pointArr, @SafeParcelable.Param(id = 6) int i12, @SafeParcelable.Param(id = 7) zzpk zzpkVar, @SafeParcelable.Param(id = 8) zzpn zzpnVar, @SafeParcelable.Param(id = 9) zzpo zzpoVar, @SafeParcelable.Param(id = 10) zzpq zzpqVar, @SafeParcelable.Param(id = 11) zzpp zzppVar, @SafeParcelable.Param(id = 12) zzpl zzplVar, @SafeParcelable.Param(id = 13) zzph zzphVar, @SafeParcelable.Param(id = 14) zzpi zzpiVar, @SafeParcelable.Param(id = 15) zzpj zzpjVar) {
        this.zza = i11;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bArr;
        this.zze = pointArr;
        this.zzf = i12;
        this.zzg = zzpkVar;
        this.zzh = zzpnVar;
        this.zzi = zzpoVar;
        this.zzj = zzpqVar;
        this.zzk = zzppVar;
        this.zzl = zzplVar;
        this.zzm = zzphVar;
        this.zzn = zzpiVar;
        this.zzo = zzpjVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.zze, i11, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzg, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzh, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.zzi, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzj, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzk, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzl, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 13, this.zzm, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzn, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 15, this.zzo, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzf;
    }

    public final zzph zzc() {
        return this.zzm;
    }

    public final zzpi zzd() {
        return this.zzn;
    }

    public final zzpj zze() {
        return this.zzo;
    }

    public final zzpk zzf() {
        return this.zzg;
    }

    public final zzpl zzg() {
        return this.zzl;
    }

    public final zzpn zzh() {
        return this.zzh;
    }

    public final zzpo zzi() {
        return this.zzi;
    }

    public final zzpp zzj() {
        return this.zzk;
    }

    public final zzpq zzk() {
        return this.zzj;
    }

    public final String zzl() {
        return this.zzb;
    }

    public final String zzm() {
        return this.zzc;
    }

    public final byte[] zzn() {
        return this.zzd;
    }

    public final Point[] zzo() {
        return this.zze;
    }
}