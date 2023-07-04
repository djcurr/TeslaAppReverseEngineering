package com.google.android.libraries.places.internal;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzmf {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzmf(java.lang.String r10, char[] r11) {
        /*
            r9 = this;
            r0 = 128(0x80, float:1.794E-43)
            byte[] r1 = new byte[r0]
            r2 = -1
            java.util.Arrays.fill(r1, r2)
            r3 = 0
            r4 = r3
        La:
            int r5 = r11.length
            if (r4 >= r5) goto L2b
            char r5 = r11[r4]
            r6 = 1
            if (r5 >= r0) goto L14
            r7 = r6
            goto L15
        L14:
            r7 = r3
        L15:
            java.lang.String r8 = "Non-ASCII character: %s"
            com.google.android.libraries.places.internal.zzig.zzf(r7, r8, r5)
            r7 = r1[r5]
            if (r7 != r2) goto L1f
            goto L20
        L1f:
            r6 = r3
        L20:
            java.lang.String r7 = "Duplicate character: %s"
            com.google.android.libraries.places.internal.zzig.zzf(r6, r7, r5)
            byte r6 = (byte) r4
            r1[r5] = r6
            int r4 = r4 + 1
            goto La
        L2b:
            r9.<init>(r10, r11, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmf.<init>(java.lang.String, char[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ char[] zzc(zzmf zzmfVar) {
        return zzmfVar.zzf;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzmf) {
            zzmf zzmfVar = (zzmf) obj;
            boolean z11 = zzmfVar.zzh;
            if (Arrays.equals(this.zzf, zzmfVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + 1237;
    }

    public final String toString() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final char zza(int i11) {
        return this.zzf[i11];
    }

    public final boolean zzb(char c11) {
        return c11 < 128 && this.zzg[c11] != -1;
    }

    private zzmf(String str, char[] cArr, byte[] bArr, boolean z11) {
        this.zze = str;
        Objects.requireNonNull(cArr);
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int zzb = zzacl.zzb(length, RoundingMode.UNNECESSARY);
            this.zzb = zzb;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(zzb);
            int i11 = 1 << (3 - numberOfTrailingZeros);
            this.zzc = i11;
            this.zzd = zzb >> numberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i11];
            for (int i12 = 0; i12 < this.zzd; i12++) {
                zArr[zzacl.zza(i12 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = false;
        } catch (ArithmeticException e11) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e11);
        }
    }
}