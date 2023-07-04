package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
final class zzmh extends zzmi {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzmh(java.lang.String r2, java.lang.String r3, java.lang.Character r4) {
        /*
            r1 = this;
            com.google.android.libraries.places.internal.zzmf r0 = new com.google.android.libraries.places.internal.zzmf
            char[] r3 = r3.toCharArray()
            r0.<init>(r2, r3)
            r1.<init>(r0, r4)
            char[] r2 = com.google.android.libraries.places.internal.zzmf.zzc(r0)
            int r2 = r2.length
            r3 = 64
            if (r2 != r3) goto L17
            r2 = 1
            goto L18
        L17:
            r2 = 0
        L18:
            com.google.android.libraries.places.internal.zzig.zzd(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmh.<init>(java.lang.String, java.lang.String, java.lang.Character):void");
    }

    @Override // com.google.android.libraries.places.internal.zzmi, com.google.android.libraries.places.internal.zzmj
    final void zza(Appendable appendable, byte[] bArr, int i11, int i12) {
        int i13 = 0;
        zzig.zzg(0, i12, bArr.length);
        int i14 = i12;
        while (i14 >= 3) {
            int i15 = i13 + 1;
            int i16 = i15 + 1;
            int i17 = ((bArr[i13] & 255) << 16) | ((bArr[i15] & 255) << 8) | (bArr[i16] & 255);
            appendable.append(this.zzb.zza(i17 >>> 18));
            appendable.append(this.zzb.zza((i17 >>> 12) & 63));
            appendable.append(this.zzb.zza((i17 >>> 6) & 63));
            appendable.append(this.zzb.zza(i17 & 63));
            i14 -= 3;
            i13 = i16 + 1;
        }
        if (i13 < i12) {
            zzc(appendable, bArr, i13, i12 - i13);
        }
    }
}