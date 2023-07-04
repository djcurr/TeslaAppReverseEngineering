package com.google.android.gms.internal.vision;

import java.nio.charset.Charset;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class zzex extends zzew {
    protected final byte[] zzse;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzex(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zzse = bArr;
    }

    @Override // com.google.android.gms.internal.vision.zzeo
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzeo) && size() == ((zzeo) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (obj instanceof zzex) {
                zzex zzexVar = (zzex) obj;
                int zzdm = zzdm();
                int zzdm2 = zzexVar.zzdm();
                if (zzdm == 0 || zzdm2 == 0 || zzdm == zzdm2) {
                    return zza(zzexVar, 0, size());
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.vision.zzeo
    public int size() {
        return this.zzse.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.vision.zzeo
    public void zza(byte[] bArr, int i11, int i12, int i13) {
        System.arraycopy(this.zzse, 0, bArr, 0, i13);
    }

    @Override // com.google.android.gms.internal.vision.zzeo
    public byte zzai(int i11) {
        return this.zzse[i11];
    }

    @Override // com.google.android.gms.internal.vision.zzeo
    public final zzeo zzc(int i11, int i12) {
        int zzb = zzeo.zzb(0, i12, size());
        if (zzb == 0) {
            return zzeo.zzrx;
        }
        return new zzes(this.zzse, zzdn(), zzb);
    }

    @Override // com.google.android.gms.internal.vision.zzeo
    public final boolean zzdl() {
        int zzdn = zzdn();
        return zziw.zzg(this.zzse, zzdn, size() + zzdn);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int zzdn() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.vision.zzeo
    public final void zza(zzen zzenVar) {
        zzenVar.zza(this.zzse, zzdn(), size());
    }

    @Override // com.google.android.gms.internal.vision.zzeo
    protected final String zza(Charset charset) {
        return new String(this.zzse, zzdn(), size(), charset);
    }

    @Override // com.google.android.gms.internal.vision.zzew
    final boolean zza(zzeo zzeoVar, int i11, int i12) {
        if (i12 <= zzeoVar.size()) {
            if (i12 <= zzeoVar.size()) {
                if (zzeoVar instanceof zzex) {
                    zzex zzexVar = (zzex) zzeoVar;
                    byte[] bArr = this.zzse;
                    byte[] bArr2 = zzexVar.zzse;
                    int zzdn = zzdn() + i12;
                    int zzdn2 = zzdn();
                    int zzdn3 = zzexVar.zzdn();
                    while (zzdn2 < zzdn) {
                        if (bArr[zzdn2] != bArr2[zzdn3]) {
                            return false;
                        }
                        zzdn2++;
                        zzdn3++;
                    }
                    return true;
                }
                return zzeoVar.zzc(0, i12).equals(zzc(0, i12));
            }
            int size = zzeoVar.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i12);
            sb2.append(", ");
            sb2.append(size);
            throw new IllegalArgumentException(sb2.toString());
        }
        int size2 = size();
        StringBuilder sb3 = new StringBuilder(40);
        sb3.append("Length too large: ");
        sb3.append(i12);
        sb3.append(size2);
        throw new IllegalArgumentException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.vision.zzeo
    protected final int zza(int i11, int i12, int i13) {
        return zzga.zza(i11, this.zzse, zzdn(), i13);
    }
}