package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzaz extends zzar {
    static final zzar zza = new zzaz(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzaz(Object obj, Object[] objArr, int i11) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    public static zzaz zzg(int i11, Object[] objArr, zzaq zzaqVar) {
        short[] sArr;
        char c11;
        char c12;
        byte[] bArr;
        byte[] bArr2;
        int i12 = i11;
        Object[] objArr2 = objArr;
        if (i12 == 0) {
            return (zzaz) zza;
        }
        Object obj = null;
        int i13 = 1;
        if (i12 == 1) {
            Object obj2 = objArr2[0];
            obj2.getClass();
            Object obj3 = objArr2[1];
            obj3.getClass();
            zzaf.zza(obj2, obj3);
            return new zzaz(null, objArr2, 1);
        }
        zzac.zzb(i12, objArr2.length >> 1, "index");
        int max = Math.max(i12, 2);
        int i14 = 1073741824;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            i14 = highestOneBit + highestOneBit;
            while (i14 * 0.7d < max) {
                i14 += i14;
            }
        } else if (max >= 1073741824) {
            throw new IllegalArgumentException("collection too large");
        }
        if (i12 == 1) {
            Object obj4 = objArr2[0];
            obj4.getClass();
            Object obj5 = objArr2[1];
            obj5.getClass();
            zzaf.zza(obj4, obj5);
            c11 = 1;
            c12 = 2;
        } else {
            int i15 = i14 - 1;
            char c13 = 65535;
            if (i14 <= 128) {
                byte[] bArr3 = new byte[i14];
                Arrays.fill(bArr3, (byte) -1);
                int i16 = 0;
                int i17 = 0;
                while (i16 < i12) {
                    int i18 = i16 + i16;
                    int i19 = i17 + i17;
                    Object obj6 = objArr2[i18];
                    obj6.getClass();
                    Object obj7 = objArr2[i18 ^ i13];
                    obj7.getClass();
                    zzaf.zza(obj6, obj7);
                    int zza2 = zzah.zza(obj6.hashCode());
                    while (true) {
                        int i21 = zza2 & i15;
                        int i22 = bArr3[i21] & 255;
                        if (i22 == 255) {
                            bArr3[i21] = (byte) i19;
                            if (i17 < i16) {
                                objArr2[i19] = obj6;
                                objArr2[i19 ^ 1] = obj7;
                            }
                            i17++;
                        } else if (obj6.equals(objArr2[i22])) {
                            int i23 = i22 ^ 1;
                            Object obj8 = objArr2[i23];
                            obj8.getClass();
                            zzap zzapVar = new zzap(obj6, obj7, obj8);
                            objArr2[i23] = obj7;
                            obj = zzapVar;
                            break;
                        } else {
                            zza2 = i21 + 1;
                        }
                    }
                    i16++;
                    i13 = 1;
                }
                if (i17 == i12) {
                    bArr = bArr3;
                } else {
                    bArr2 = new Object[]{bArr3, Integer.valueOf(i17), obj};
                    c12 = 2;
                    c11 = 1;
                    obj = bArr2;
                }
            } else if (i14 <= 32768) {
                sArr = new short[i14];
                Arrays.fill(sArr, (short) -1);
                int i24 = 0;
                for (int i25 = 0; i25 < i12; i25++) {
                    int i26 = i25 + i25;
                    int i27 = i24 + i24;
                    Object obj9 = objArr2[i26];
                    obj9.getClass();
                    Object obj10 = objArr2[i26 ^ 1];
                    obj10.getClass();
                    zzaf.zza(obj9, obj10);
                    int zza3 = zzah.zza(obj9.hashCode());
                    while (true) {
                        int i28 = zza3 & i15;
                        char c14 = (char) sArr[i28];
                        if (c14 == 65535) {
                            sArr[i28] = (short) i27;
                            if (i24 < i25) {
                                objArr2[i27] = obj9;
                                objArr2[i27 ^ 1] = obj10;
                            }
                            i24++;
                        } else if (obj9.equals(objArr2[c14])) {
                            int i29 = c14 ^ 1;
                            Object obj11 = objArr2[i29];
                            obj11.getClass();
                            zzap zzapVar2 = new zzap(obj9, obj10, obj11);
                            objArr2[i29] = obj10;
                            obj = zzapVar2;
                            break;
                        } else {
                            zza3 = i28 + 1;
                        }
                    }
                }
                if (i24 != i12) {
                    c12 = 2;
                    obj = new Object[]{sArr, Integer.valueOf(i24), obj};
                    c11 = 1;
                }
                bArr = sArr;
            } else {
                int i31 = 1;
                sArr = new int[i14];
                Arrays.fill((int[]) sArr, -1);
                int i32 = 0;
                int i33 = 0;
                while (i32 < i12) {
                    int i34 = i32 + i32;
                    int i35 = i33 + i33;
                    Object obj12 = objArr2[i34];
                    obj12.getClass();
                    Object obj13 = objArr2[i34 ^ i31];
                    obj13.getClass();
                    zzaf.zza(obj12, obj13);
                    int zza4 = zzah.zza(obj12.hashCode());
                    while (true) {
                        int i36 = zza4 & i15;
                        ?? r15 = sArr[i36];
                        if (r15 == c13) {
                            sArr[i36] = i35;
                            if (i33 < i32) {
                                objArr2[i35] = obj12;
                                objArr2[i35 ^ 1] = obj13;
                            }
                            i33++;
                        } else if (obj12.equals(objArr2[r15])) {
                            int i37 = r15 ^ 1;
                            Object obj14 = objArr2[i37];
                            obj14.getClass();
                            zzap zzapVar3 = new zzap(obj12, obj13, obj14);
                            objArr2[i37] = obj13;
                            obj = zzapVar3;
                            break;
                        } else {
                            zza4 = i36 + 1;
                            c13 = 65535;
                        }
                    }
                    i32++;
                    i31 = 1;
                    c13 = 65535;
                }
                if (i33 != i12) {
                    c11 = 1;
                    c12 = 2;
                    obj = new Object[]{sArr, Integer.valueOf(i33), obj};
                }
                bArr = sArr;
            }
            c12 = 2;
            bArr2 = bArr;
            c11 = 1;
            obj = bArr2;
        }
        if (obj instanceof Object[]) {
            Object[] objArr3 = (Object[]) obj;
            zzap zzapVar4 = (zzap) objArr3[c12];
            if (zzaqVar != null) {
                zzaqVar.zzc = zzapVar4;
                Object obj15 = objArr3[0];
                int intValue = ((Integer) objArr3[c11]).intValue();
                objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
                obj = obj15;
                i12 = intValue;
            } else {
                throw zzapVar4.zza();
            }
        }
        return new zzaz(obj, objArr2, i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.mlkit_common.zzar, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.zzc
            java.lang.Object[] r1 = r9.zzb
            int r2 = r9.zzd
            r3 = 0
            if (r10 != 0) goto Lc
        L9:
            r10 = r3
            goto L9c
        Lc:
            r4 = 1
            if (r2 != r4) goto L22
            r0 = 0
            r0 = r1[r0]
            r0.getClass()
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L9
            r10 = r1[r4]
            r10.getClass()
            goto L9c
        L22:
            if (r0 != 0) goto L25
            goto L9
        L25:
            boolean r2 = r0 instanceof byte[]
            r5 = -1
            if (r2 == 0) goto L51
            r2 = r0
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            int r6 = r0 + (-1)
            int r0 = r10.hashCode()
            int r0 = com.google.android.gms.internal.mlkit_common.zzah.zza(r0)
        L38:
            r0 = r0 & r6
            r5 = r2[r0]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L9
        L41:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L9c
        L4e:
            int r0 = r0 + 1
            goto L38
        L51:
            boolean r2 = r0 instanceof short[]
            if (r2 == 0) goto L7d
            r2 = r0
            short[] r2 = (short[]) r2
            int r0 = r2.length
            int r6 = r0 + (-1)
            int r0 = r10.hashCode()
            int r0 = com.google.android.gms.internal.mlkit_common.zzah.zza(r0)
        L63:
            r0 = r0 & r6
            short r5 = r2[r0]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L9
        L6d:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L9c
        L7a:
            int r0 = r0 + 1
            goto L63
        L7d:
            int[] r0 = (int[]) r0
            int r2 = r0.length
            int r2 = r2 + r5
            int r6 = r10.hashCode()
            int r6 = com.google.android.gms.internal.mlkit_common.zzah.zza(r6)
        L89:
            r6 = r6 & r2
            r7 = r0[r6]
            if (r7 != r5) goto L90
            goto L9
        L90:
            r8 = r1[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r1[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r3
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_common.zzaz.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzar
    final zzak zza() {
        return new zzay(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzar
    final zzas zzd() {
        return new zzaw(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzar
    final zzas zze() {
        return new zzax(this, new zzay(this.zzb, 0, this.zzd));
    }
}