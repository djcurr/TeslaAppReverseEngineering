package com.google.android.gms.internal.clearcut;

import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class zzbi extends zzbh {
    protected final byte[] zzfp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbi(byte[] bArr) {
        this.zzfp = bArr;
    }

    @Override // com.google.android.gms.internal.clearcut.zzbb
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzbb) && size() == ((zzbb) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (obj instanceof zzbi) {
                zzbi zzbiVar = (zzbi) obj;
                int zzab = zzab();
                int zzab2 = zzbiVar.zzab();
                if (zzab == 0 || zzab2 == 0 || zzab == zzab2) {
                    return zza(zzbiVar, 0, size());
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.clearcut.zzbb
    public int size() {
        return this.zzfp.length;
    }

    @Override // com.google.android.gms.internal.clearcut.zzbb
    protected final int zza(int i11, int i12, int i13) {
        return zzci.zza(i11, this.zzfp, zzac(), i13);
    }

    @Override // com.google.android.gms.internal.clearcut.zzbb
    public final zzbb zza(int i11, int i12) {
        int zzb = zzbb.zzb(0, i12, size());
        return zzb == 0 ? zzbb.zzfi : new zzbe(this.zzfp, zzac(), zzb);
    }

    @Override // com.google.android.gms.internal.clearcut.zzbb
    protected final String zza(Charset charset) {
        return new String(this.zzfp, zzac(), size(), charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.clearcut.zzbb
    public final void zza(zzba zzbaVar) {
        zzbaVar.zza(this.zzfp, zzac(), size());
    }

    @Override // com.google.android.gms.internal.clearcut.zzbh
    final boolean zza(zzbb zzbbVar, int i11, int i12) {
        if (i12 > zzbbVar.size()) {
            int size = size();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i12);
            sb2.append(size);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i12 > zzbbVar.size()) {
            int size2 = zzbbVar.size();
            StringBuilder sb3 = new StringBuilder(59);
            sb3.append("Ran off end of other: 0, ");
            sb3.append(i12);
            sb3.append(", ");
            sb3.append(size2);
            throw new IllegalArgumentException(sb3.toString());
        } else if (zzbbVar instanceof zzbi) {
            zzbi zzbiVar = (zzbi) zzbbVar;
            byte[] bArr = this.zzfp;
            byte[] bArr2 = zzbiVar.zzfp;
            int zzac = zzac() + i12;
            int zzac2 = zzac();
            int zzac3 = zzbiVar.zzac();
            while (zzac2 < zzac) {
                if (bArr[zzac2] != bArr2[zzac3]) {
                    return false;
                }
                zzac2++;
                zzac3++;
            }
            return true;
        } else {
            return zzbbVar.zza(0, i12).equals(zza(0, i12));
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzbb
    public final boolean zzaa() {
        int zzac = zzac();
        return zzff.zze(this.zzfp, zzac, size() + zzac);
    }

    protected int zzac() {
        return 0;
    }

    @Override // com.google.android.gms.internal.clearcut.zzbb
    public byte zzj(int i11) {
        return this.zzfp[i11];
    }
}