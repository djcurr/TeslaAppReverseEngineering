package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@ShowFirstParty
@SafeParcelable.Class(creator = "ActivityRecognitionRequestCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes3.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();
    @SafeParcelable.Field(getter = "getIntervalMillis", id = 1)
    private final long zza;
    @SafeParcelable.Field(getter = "getTriggerUpdate", id = 2)
    private final boolean zzb;
    @SafeParcelable.Field(getter = "getWorkSource", id = 3)
    private final WorkSource zzc;
    @SafeParcelable.Field(getter = "getTag", id = 4)
    private final String zzd;
    @SafeParcelable.Field(getter = "getNondefaultActivities", id = 5)
    private final int[] zze;
    @SafeParcelable.Field(getter = "getRequestSensorData", id = 6)
    private final boolean zzf;
    @SafeParcelable.Field(getter = "getAccountName", id = 7)
    private final String zzg;
    @SafeParcelable.Field(defaultValueUnchecked = "ActivityRecognitionRequest.DEFAULT_MAX_REPORT_LATENCY_MILLIS", getter = "getMaxReportLatencyMillis", id = 8)
    private final long zzh;
    @SafeParcelable.Field(getter = "getContextAttributionTag", id = 9)
    private String zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzl(@SafeParcelable.Param(id = 1) long j11, @SafeParcelable.Param(id = 2) boolean z11, @SafeParcelable.Param(id = 3) WorkSource workSource, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) int[] iArr, @SafeParcelable.Param(id = 6) boolean z12, @SafeParcelable.Param(id = 7) String str2, @SafeParcelable.Param(id = 8) long j12, @SafeParcelable.Param(id = 9) String str3) {
        this.zza = j11;
        this.zzb = z11;
        this.zzc = workSource;
        this.zzd = str;
        this.zze = iArr;
        this.zzf = z12;
        this.zzg = str2;
        this.zzh = j12;
        this.zzi = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.zza);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i11, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeIntArray(parcel, 5, this.zze, false);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzf);
        SafeParcelWriter.writeString(parcel, 7, this.zzg, false);
        SafeParcelWriter.writeLong(parcel, 8, this.zzh);
        SafeParcelWriter.writeString(parcel, 9, this.zzi, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzl zza(String str) {
        this.zzi = str;
        return this;
    }
}