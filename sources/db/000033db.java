package com.google.android.libraries.places.internal;

import java.math.RoundingMode;

/* loaded from: classes3.dex */
public class zzmi extends zzmj {
    final zzmf zzb;
    final Character zzc;

    public zzmi(zzmf zzmfVar, Character ch2) {
        this.zzb = zzmfVar;
        if (ch2 == null || !zzmfVar.zzb(ch2.charValue())) {
            this.zzc = ch2;
            return;
        }
        throw new IllegalArgumentException(zzil.zza("Padding character %s was already in alphabet", ch2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzmi) {
            zzmi zzmiVar = (zzmi) obj;
            if (this.zzb.equals(zzmiVar.zzb)) {
                Character ch2 = this.zzc;
                Character ch3 = zzmiVar.zzc;
                if (ch2 == ch3) {
                    return true;
                }
                if (ch2 != null && ch2.equals(ch3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode();
        Character ch2 = this.zzc;
        return hashCode ^ (ch2 == null ? 0 : ch2.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        sb2.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(this.zzc);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzmj
    void zza(Appendable appendable, byte[] bArr, int i11, int i12) {
        int i13 = 0;
        zzig.zzg(0, i12, bArr.length);
        while (i13 < i12) {
            zzc(appendable, bArr, i13, Math.min(this.zzb.zzd, i12 - i13));
            i13 += this.zzb.zzd;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzmj
    final int zzb(int i11) {
        zzmf zzmfVar = this.zzb;
        return zzmfVar.zzc * zzacl.zza(i11, zzmfVar.zzd, RoundingMode.CEILING);
    }

    public final void zzc(Appendable appendable, byte[] bArr, int i11, int i12) {
        zzig.zzg(i11, i11 + i12, bArr.length);
        int i13 = 0;
        zzig.zzd(i12 <= this.zzb.zzd);
        long j11 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            j11 = (j11 | (bArr[i11 + i14] & 255)) << 8;
        }
        int i15 = ((i12 + 1) * 8) - this.zzb.zzb;
        while (i13 < i12 * 8) {
            zzmf zzmfVar = this.zzb;
            appendable.append(zzmfVar.zza(((int) (j11 >>> (i15 - i13))) & zzmfVar.zza));
            i13 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i13 < this.zzb.zzd * 8) {
                appendable.append(this.zzc.charValue());
                i13 += this.zzb.zzb;
            }
        }
    }

    public zzmi(String str, String str2, Character ch2) {
        this(new zzmf(str, str2.toCharArray()), ch2);
    }
}