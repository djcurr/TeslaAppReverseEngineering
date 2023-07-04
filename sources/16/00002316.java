package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.Objects;

/* loaded from: classes3.dex */
public class zziv extends zziu {
    protected final byte[] zza;

    public zziv(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zziy
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zziy) && zzd() == ((zziy) obj).zzd()) {
            if (zzd() == 0) {
                return true;
            }
            if (obj instanceof zziv) {
                zziv zzivVar = (zziv) obj;
                int zzk = zzk();
                int zzk2 = zzivVar.zzk();
                if (zzk == 0 || zzk2 == 0 || zzk == zzk2) {
                    int zzd = zzd();
                    if (zzd <= zzivVar.zzd()) {
                        if (zzd <= zzivVar.zzd()) {
                            byte[] bArr = this.zza;
                            byte[] bArr2 = zzivVar.zza;
                            zzivVar.zzc();
                            int i11 = 0;
                            int i12 = 0;
                            while (i11 < zzd) {
                                if (bArr[i11] != bArr2[i12]) {
                                    return false;
                                }
                                i11++;
                                i12++;
                            }
                            return true;
                        }
                        int zzd2 = zzivVar.zzd();
                        StringBuilder sb2 = new StringBuilder(59);
                        sb2.append("Ran off end of other: 0, ");
                        sb2.append(zzd);
                        sb2.append(", ");
                        sb2.append(zzd2);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    int zzd3 = zzd();
                    StringBuilder sb3 = new StringBuilder(40);
                    sb3.append("Length too large: ");
                    sb3.append(zzd);
                    sb3.append(zzd3);
                    throw new IllegalArgumentException(sb3.toString());
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zziy
    public byte zza(int i11) {
        return this.zza[i11];
    }

    @Override // com.google.android.gms.internal.measurement.zziy
    public byte zzb(int i11) {
        return this.zza[i11];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zziy
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.measurement.zziy
    protected final int zze(int i11, int i12, int i13) {
        return zzkh.zzd(i11, this.zza, 0, i13);
    }

    @Override // com.google.android.gms.internal.measurement.zziy
    public final zziy zzf(int i11, int i12) {
        int zzj = zziy.zzj(0, i12, zzd());
        return zzj == 0 ? zziy.zzb : new zzis(this.zza, 0, zzj);
    }

    @Override // com.google.android.gms.internal.measurement.zziy
    protected final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.measurement.zziy
    public final void zzh(zzin zzinVar) {
        ((zzjd) zzinVar).zzc(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.measurement.zziy
    public final boolean zzi() {
        return zzmx.zzf(this.zza, 0, zzd());
    }
}