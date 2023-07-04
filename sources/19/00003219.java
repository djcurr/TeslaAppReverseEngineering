package com.google.android.libraries.places.internal;

import java.nio.charset.Charset;
import java.util.Objects;

/* loaded from: classes3.dex */
public class zzaea extends zzadz {
    protected final byte[] zza;

    public zzaea(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    @Override // com.google.android.libraries.places.internal.zzaed
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzaed) && zzd() == ((zzaed) obj).zzd()) {
            if (zzd() == 0) {
                return true;
            }
            if (obj instanceof zzaea) {
                zzaea zzaeaVar = (zzaea) obj;
                int zzk = zzk();
                int zzk2 = zzaeaVar.zzk();
                if (zzk == 0 || zzk2 == 0 || zzk == zzk2) {
                    int zzd = zzd();
                    if (zzd <= zzaeaVar.zzd()) {
                        if (zzd <= zzaeaVar.zzd()) {
                            byte[] bArr = this.zza;
                            byte[] bArr2 = zzaeaVar.zza;
                            zzaeaVar.zzc();
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
                        throw new IllegalArgumentException("Ran off end of other: 0, " + zzd + ", " + zzaeaVar.zzd());
                    }
                    throw new IllegalArgumentException("Length too large: " + zzd + zzd());
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzaed
    public byte zza(int i11) {
        return this.zza[i11];
    }

    @Override // com.google.android.libraries.places.internal.zzaed
    public byte zzb(int i11) {
        return this.zza[i11];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.libraries.places.internal.zzaed
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.libraries.places.internal.zzaed
    protected final int zze(int i11, int i12, int i13) {
        return zzafh.zzd(i11, this.zza, 0, i13);
    }

    @Override // com.google.android.libraries.places.internal.zzaed
    public final zzaed zzf(int i11, int i12) {
        zzaed.zzj(0, i12, zzd());
        return i12 == 0 ? zzaed.zzb : new zzadx(this.zza, 0, i12);
    }

    @Override // com.google.android.libraries.places.internal.zzaed
    protected final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.libraries.places.internal.zzaed
    public final void zzh(zzadt zzadtVar) {
        ((zzaei) zzadtVar).zzc(this.zza, 0, zzd());
    }

    @Override // com.google.android.libraries.places.internal.zzaed
    public final boolean zzi() {
        return zzahw.zze(this.zza, 0, zzd());
    }
}