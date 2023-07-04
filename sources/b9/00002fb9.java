package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.adyen.checkout.components.model.payments.request.Address;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@KeepForSdk
@SafeParcelable.Class(creator = "ExperimentTokensCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public class ExperimentTokens extends AbstractSafeParcelable {
    private static final byte[][] zzn;
    private static final ExperimentTokens zzo;
    @SafeParcelable.Field(id = 2)
    private final String zzp;
    @SafeParcelable.Field(id = 3)
    private final byte[] zzq;
    @SafeParcelable.Field(id = 4)
    private final byte[][] zzr;
    @SafeParcelable.Field(id = 5)
    private final byte[][] zzs;
    @SafeParcelable.Field(id = 6)
    private final byte[][] zzt;
    @SafeParcelable.Field(id = 7)
    private final byte[][] zzu;
    @SafeParcelable.Field(id = 8)
    private final int[] zzv;
    @SafeParcelable.Field(id = 9)
    private final byte[][] zzw;
    @KeepForSdk
    public static final Parcelable.Creator<ExperimentTokens> CREATOR = new zzh();
    private static final zza zzx = new zzd();
    private static final zza zzy = new zze();
    private static final zza zzz = new zzf();
    private static final zza zzaa = new zzg();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public interface zza {
    }

    static {
        byte[][] bArr = new byte[0];
        zzn = bArr;
        zzo = new ExperimentTokens("", null, bArr, bArr, bArr, bArr, null, null);
    }

    @SafeParcelable.Constructor
    public ExperimentTokens(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) byte[] bArr, @SafeParcelable.Param(id = 4) byte[][] bArr2, @SafeParcelable.Param(id = 5) byte[][] bArr3, @SafeParcelable.Param(id = 6) byte[][] bArr4, @SafeParcelable.Param(id = 7) byte[][] bArr5, @SafeParcelable.Param(id = 8) int[] iArr, @SafeParcelable.Param(id = 9) byte[][] bArr6) {
        this.zzp = str;
        this.zzq = bArr;
        this.zzr = bArr2;
        this.zzs = bArr3;
        this.zzt = bArr4;
        this.zzu = bArr5;
        this.zzv = iArr;
        this.zzw = bArr6;
    }

    private static List<Integer> zza(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i11 : iArr) {
            arrayList.add(Integer.valueOf(i11));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static List<String> zza(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte[] bArr2 : bArr) {
            arrayList.add(Base64.encodeToString(bArr2, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static void zza(StringBuilder sb2, String str, byte[][] bArr) {
        String str2;
        sb2.append(str);
        sb2.append("=");
        if (bArr == null) {
            str2 = Address.ADDRESS_NULL_PLACEHOLDER;
        } else {
            sb2.append("(");
            int length = bArr.length;
            boolean z11 = true;
            int i11 = 0;
            while (i11 < length) {
                byte[] bArr2 = bArr[i11];
                if (!z11) {
                    sb2.append(", ");
                }
                sb2.append("'");
                sb2.append(Base64.encodeToString(bArr2, 3));
                sb2.append("'");
                i11++;
                z11 = false;
            }
            str2 = ")";
        }
        sb2.append(str2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ExperimentTokens) {
            ExperimentTokens experimentTokens = (ExperimentTokens) obj;
            if (zzn.equals(this.zzp, experimentTokens.zzp) && Arrays.equals(this.zzq, experimentTokens.zzq) && zzn.equals(zza(this.zzr), zza(experimentTokens.zzr)) && zzn.equals(zza(this.zzs), zza(experimentTokens.zzs)) && zzn.equals(zza(this.zzt), zza(experimentTokens.zzt)) && zzn.equals(zza(this.zzu), zza(experimentTokens.zzu)) && zzn.equals(zza(this.zzv), zza(experimentTokens.zzv)) && zzn.equals(zza(this.zzw), zza(experimentTokens.zzw))) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String sb2;
        StringBuilder sb3 = new StringBuilder("ExperimentTokens");
        sb3.append("(");
        String str = this.zzp;
        if (str == null) {
            sb2 = Address.ADDRESS_NULL_PLACEHOLDER;
        } else {
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 2);
            sb4.append("'");
            sb4.append(str);
            sb4.append("'");
            sb2 = sb4.toString();
        }
        sb3.append(sb2);
        sb3.append(", ");
        byte[] bArr = this.zzq;
        sb3.append("direct");
        sb3.append("=");
        if (bArr == null) {
            sb3.append(Address.ADDRESS_NULL_PLACEHOLDER);
        } else {
            sb3.append("'");
            sb3.append(Base64.encodeToString(bArr, 3));
            sb3.append("'");
        }
        sb3.append(", ");
        zza(sb3, "GAIA", this.zzr);
        sb3.append(", ");
        zza(sb3, "PSEUDO", this.zzs);
        sb3.append(", ");
        zza(sb3, "ALWAYS", this.zzt);
        sb3.append(", ");
        zza(sb3, "OTHER", this.zzu);
        sb3.append(", ");
        int[] iArr = this.zzv;
        sb3.append("weak");
        sb3.append("=");
        if (iArr == null) {
            sb3.append(Address.ADDRESS_NULL_PLACEHOLDER);
        } else {
            sb3.append("(");
            int length = iArr.length;
            boolean z11 = true;
            int i11 = 0;
            while (i11 < length) {
                int i12 = iArr[i11];
                if (!z11) {
                    sb3.append(", ");
                }
                sb3.append(i12);
                i11++;
                z11 = false;
            }
            sb3.append(")");
        }
        sb3.append(", ");
        zza(sb3, "directs", this.zzw);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzp, false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.zzq, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 4, this.zzr, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 5, this.zzs, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 6, this.zzt, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 7, this.zzu, false);
        SafeParcelWriter.writeIntArray(parcel, 8, this.zzv, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 9, this.zzw, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}