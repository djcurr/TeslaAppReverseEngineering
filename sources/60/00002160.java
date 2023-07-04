package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.clearcut.zzge;

@SafeParcelable.Class(creator = "PlayLoggerContextCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();
    @SafeParcelable.Field(id = 2)
    private final String packageName;
    @SafeParcelable.Field(defaultValue = "true", id = 7)
    private final boolean zzay;
    @SafeParcelable.Field(id = 10)
    private final int zzaz;
    @SafeParcelable.Field(id = 3)
    private final int zzi;
    @SafeParcelable.Field(id = 8)
    public final String zzj;
    @SafeParcelable.Field(id = 4)
    public final int zzk;
    @SafeParcelable.Field(id = 5)
    private final String zzl;
    @SafeParcelable.Field(id = 6)
    private final String zzm;
    @SafeParcelable.Field(id = 9)
    private final boolean zzn;

    public zzr(String str, int i11, int i12, String str2, String str3, String str4, boolean z11, zzge.zzv.zzb zzbVar) {
        this.packageName = (String) Preconditions.checkNotNull(str);
        this.zzi = i11;
        this.zzk = i12;
        this.zzj = str2;
        this.zzl = str3;
        this.zzm = str4;
        this.zzay = !z11;
        this.zzn = z11;
        this.zzaz = zzbVar.zzc();
    }

    @SafeParcelable.Constructor
    public zzr(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i11, @SafeParcelable.Param(id = 4) int i12, @SafeParcelable.Param(id = 5) String str2, @SafeParcelable.Param(id = 6) String str3, @SafeParcelable.Param(id = 7) boolean z11, @SafeParcelable.Param(id = 8) String str4, @SafeParcelable.Param(id = 9) boolean z12, @SafeParcelable.Param(id = 10) int i13) {
        this.packageName = str;
        this.zzi = i11;
        this.zzk = i12;
        this.zzl = str2;
        this.zzm = str3;
        this.zzay = z11;
        this.zzj = str4;
        this.zzn = z12;
        this.zzaz = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzr) {
            zzr zzrVar = (zzr) obj;
            if (Objects.equal(this.packageName, zzrVar.packageName) && this.zzi == zzrVar.zzi && this.zzk == zzrVar.zzk && Objects.equal(this.zzj, zzrVar.zzj) && Objects.equal(this.zzl, zzrVar.zzl) && Objects.equal(this.zzm, zzrVar.zzm) && this.zzay == zzrVar.zzay && this.zzn == zzrVar.zzn && this.zzaz == zzrVar.zzaz) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.packageName, Integer.valueOf(this.zzi), Integer.valueOf(this.zzk), this.zzj, this.zzl, this.zzm, Boolean.valueOf(this.zzay), Boolean.valueOf(this.zzn), Integer.valueOf(this.zzaz));
    }

    public final String toString() {
        return "PlayLoggerContext[package=" + this.packageName + CoreConstants.COMMA_CHAR + "packageVersionCode=" + this.zzi + CoreConstants.COMMA_CHAR + "logSource=" + this.zzk + CoreConstants.COMMA_CHAR + "logSourceName=" + this.zzj + CoreConstants.COMMA_CHAR + "uploadAccount=" + this.zzl + CoreConstants.COMMA_CHAR + "loggingId=" + this.zzm + CoreConstants.COMMA_CHAR + "logAndroidId=" + this.zzay + CoreConstants.COMMA_CHAR + "isAnonymous=" + this.zzn + CoreConstants.COMMA_CHAR + "qosTier=" + this.zzaz + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.packageName, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzi);
        SafeParcelWriter.writeInt(parcel, 4, this.zzk);
        SafeParcelWriter.writeString(parcel, 5, this.zzl, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzm, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzay);
        SafeParcelWriter.writeString(parcel, 8, this.zzj, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzn);
        SafeParcelWriter.writeInt(parcel, 10, this.zzaz);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}