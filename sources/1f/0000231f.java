package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzjd extends zzjg {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjd(byte[] bArr, int i11, int i12) {
        super(null);
        Objects.requireNonNull(bArr, "buffer");
        int length = bArr.length;
        if (((length - i12) | i12) >= 0) {
            this.zzb = bArr;
            this.zzd = 0;
            this.zzc = i12;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i12)));
    }

    @Override // com.google.android.gms.internal.measurement.zzjg
    public final int zza() {
        return this.zzc - this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzjg
    public final void zzb(byte b11) {
        try {
            byte[] bArr = this.zzb;
            int i11 = this.zzd;
            this.zzd = i11 + 1;
            bArr[i11] = b11;
        } catch (IndexOutOfBoundsException e11) {
            throw new zzje(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e11);
        }
    }

    public final void zzc(byte[] bArr, int i11, int i12) {
        try {
            System.arraycopy(bArr, 0, this.zzb, this.zzd, i12);
            this.zzd += i12;
        } catch (IndexOutOfBoundsException e11) {
            throw new zzje(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i12)), e11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjg
    public final void zzd(int i11, boolean z11) {
        zzq(i11 << 3);
        zzb(z11 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.zzjg
    public final void zze(int i11, zziy zziyVar) {
        zzq((i11 << 3) | 2);
        zzq(zziyVar.zzd());
        zziyVar.zzh(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzjg
    public final void zzf(int i11, int i12) {
        zzq((i11 << 3) | 5);
        zzg(i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzjg
    public final void zzg(int i11) {
        try {
            byte[] bArr = this.zzb;
            int i12 = this.zzd;
            int i13 = i12 + 1;
            this.zzd = i13;
            bArr[i12] = (byte) (i11 & 255);
            int i14 = i13 + 1;
            this.zzd = i14;
            bArr[i13] = (byte) ((i11 >> 8) & 255);
            int i15 = i14 + 1;
            this.zzd = i15;
            bArr[i14] = (byte) ((i11 >> 16) & 255);
            this.zzd = i15 + 1;
            bArr[i15] = (byte) ((i11 >> 24) & 255);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzje(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjg
    public final void zzh(int i11, long j11) {
        zzq((i11 << 3) | 1);
        zzi(j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzjg
    public final void zzi(long j11) {
        try {
            byte[] bArr = this.zzb;
            int i11 = this.zzd;
            int i12 = i11 + 1;
            this.zzd = i12;
            bArr[i11] = (byte) (((int) j11) & 255);
            int i13 = i12 + 1;
            this.zzd = i13;
            bArr[i12] = (byte) (((int) (j11 >> 8)) & 255);
            int i14 = i13 + 1;
            this.zzd = i14;
            bArr[i13] = (byte) (((int) (j11 >> 16)) & 255);
            int i15 = i14 + 1;
            this.zzd = i15;
            bArr[i14] = (byte) (((int) (j11 >> 24)) & 255);
            int i16 = i15 + 1;
            this.zzd = i16;
            bArr[i15] = (byte) (((int) (j11 >> 32)) & 255);
            int i17 = i16 + 1;
            this.zzd = i17;
            bArr[i16] = (byte) (((int) (j11 >> 40)) & 255);
            int i18 = i17 + 1;
            this.zzd = i18;
            bArr[i17] = (byte) (((int) (j11 >> 48)) & 255);
            this.zzd = i18 + 1;
            bArr[i18] = (byte) (((int) (j11 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzje(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjg
    public final void zzj(int i11, int i12) {
        zzq(i11 << 3);
        zzk(i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzjg
    public final void zzk(int i11) {
        if (i11 >= 0) {
            zzq(i11);
        } else {
            zzs(i11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjg
    public final void zzl(byte[] bArr, int i11, int i12) {
        zzc(bArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzjg
    public final void zzm(int i11, String str) {
        zzq((i11 << 3) | 2);
        zzn(str);
    }

    public final void zzn(String str) {
        int i11 = this.zzd;
        try {
            int zzA = zzjg.zzA(str.length() * 3);
            int zzA2 = zzjg.zzA(str.length());
            if (zzA2 == zzA) {
                int i12 = i11 + zzA2;
                this.zzd = i12;
                int zzb = zzmx.zzb(str, this.zzb, i12, this.zzc - i12);
                this.zzd = i11;
                zzq((zzb - i11) - zzA2);
                this.zzd = zzb;
                return;
            }
            zzq(zzmx.zzc(str));
            byte[] bArr = this.zzb;
            int i13 = this.zzd;
            this.zzd = zzmx.zzb(str, bArr, i13, this.zzc - i13);
        } catch (zzmw e11) {
            this.zzd = i11;
            zzE(str, e11);
        } catch (IndexOutOfBoundsException e12) {
            throw new zzje(e12);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjg
    public final void zzo(int i11, int i12) {
        zzq((i11 << 3) | i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzjg
    public final void zzp(int i11, int i12) {
        zzq(i11 << 3);
        zzq(i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzjg
    public final void zzq(int i11) {
        boolean z11;
        z11 = zzjg.zzc;
        if (z11) {
            int i12 = zzij.zza;
        }
        while ((i11 & (-128)) != 0) {
            try {
                byte[] bArr = this.zzb;
                int i13 = this.zzd;
                this.zzd = i13 + 1;
                bArr[i13] = (byte) ((i11 & 127) | 128);
                i11 >>>= 7;
            } catch (IndexOutOfBoundsException e11) {
                throw new zzje(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e11);
            }
        }
        byte[] bArr2 = this.zzb;
        int i14 = this.zzd;
        this.zzd = i14 + 1;
        bArr2[i14] = (byte) i11;
    }

    @Override // com.google.android.gms.internal.measurement.zzjg
    public final void zzr(int i11, long j11) {
        zzq(i11 << 3);
        zzs(j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzjg
    public final void zzs(long j11) {
        boolean z11;
        z11 = zzjg.zzc;
        if (z11 && this.zzc - this.zzd >= 10) {
            while ((j11 & (-128)) != 0) {
                byte[] bArr = this.zzb;
                int i11 = this.zzd;
                this.zzd = i11 + 1;
                zzms.zzn(bArr, i11, (byte) ((((int) j11) & 127) | 128));
                j11 >>>= 7;
            }
            byte[] bArr2 = this.zzb;
            int i12 = this.zzd;
            this.zzd = i12 + 1;
            zzms.zzn(bArr2, i12, (byte) j11);
            return;
        }
        while ((j11 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.zzb;
                int i13 = this.zzd;
                this.zzd = i13 + 1;
                bArr3[i13] = (byte) ((((int) j11) & 127) | 128);
                j11 >>>= 7;
            } catch (IndexOutOfBoundsException e11) {
                throw new zzje(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e11);
            }
        }
        byte[] bArr4 = this.zzb;
        int i14 = this.zzd;
        this.zzd = i14 + 1;
        bArr4[i14] = (byte) j11;
    }
}