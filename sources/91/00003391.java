package com.google.android.libraries.places.internal;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class zzjr extends zzjb {
    static final zzjb zza = new zzjr(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzjr(Object obj, Object[] objArr, int i11) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v7 */
    public static zzjr zzf(int i11, Object[] objArr, zzja zzjaVar) {
        short[] sArr;
        byte[] bArr;
        Object[] objArr2;
        int i12 = i11;
        Object[] objArr3 = objArr;
        if (i12 == 0) {
            return (zzjr) zza;
        }
        Object obj = null;
        if (i12 == 1) {
            Object obj2 = objArr3[0];
            obj2.getClass();
            Object obj3 = objArr3[1];
            obj3.getClass();
            zzin.zza(obj2, obj3);
            return new zzjr(null, objArr3, 1);
        }
        zzig.zzb(i12, objArr3.length >> 1, "index");
        char c11 = 2;
        int max = Math.max(i12, 2);
        int i13 = 1073741824;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            i13 = highestOneBit + highestOneBit;
            while (i13 * 0.7d < max) {
                i13 += i13;
            }
        } else {
            zzig.zze(max < 1073741824, "collection too large");
        }
        if (i12 == 1) {
            Object obj4 = objArr3[0];
            obj4.getClass();
            Object obj5 = objArr3[1];
            obj5.getClass();
            zzin.zza(obj4, obj5);
        } else {
            int i14 = i13 - 1;
            char c12 = 65535;
            if (i13 <= 128) {
                byte[] bArr2 = new byte[i13];
                Arrays.fill(bArr2, (byte) -1);
                int i15 = 0;
                for (int i16 = 0; i16 < i12; i16++) {
                    int i17 = i16 + i16;
                    int i18 = i15 + i15;
                    Object obj6 = objArr3[i17];
                    obj6.getClass();
                    Object obj7 = objArr3[i17 ^ 1];
                    obj7.getClass();
                    zzin.zza(obj6, obj7);
                    int zza2 = zziu.zza(obj6.hashCode());
                    while (true) {
                        int i19 = zza2 & i14;
                        int i21 = bArr2[i19] & 255;
                        if (i21 == 255) {
                            bArr2[i19] = (byte) i18;
                            if (i15 < i16) {
                                objArr3[i18] = obj6;
                                objArr3[i18 ^ 1] = obj7;
                            }
                            i15++;
                        } else if (obj6.equals(objArr3[i21])) {
                            int i22 = i21 ^ 1;
                            Object obj8 = objArr3[i22];
                            obj8.getClass();
                            zziz zzizVar = new zziz(obj6, obj7, obj8);
                            objArr3[i22] = obj7;
                            obj = zzizVar;
                            break;
                        } else {
                            zza2 = i19 + 1;
                        }
                    }
                }
                if (i15 == i12) {
                    bArr = bArr2;
                    c11 = 2;
                    obj = bArr;
                } else {
                    obj = new Object[]{bArr2, Integer.valueOf(i15), obj};
                    c11 = 2;
                }
            } else if (i13 <= 32768) {
                sArr = new short[i13];
                Arrays.fill(sArr, (short) -1);
                int i23 = 0;
                for (int i24 = 0; i24 < i12; i24++) {
                    int i25 = i24 + i24;
                    int i26 = i23 + i23;
                    Object obj9 = objArr3[i25];
                    obj9.getClass();
                    Object obj10 = objArr3[i25 ^ 1];
                    obj10.getClass();
                    zzin.zza(obj9, obj10);
                    int zza3 = zziu.zza(obj9.hashCode());
                    while (true) {
                        int i27 = zza3 & i14;
                        char c13 = (char) sArr[i27];
                        if (c13 == 65535) {
                            sArr[i27] = (short) i26;
                            if (i23 < i24) {
                                objArr3[i26] = obj9;
                                objArr3[i26 ^ 1] = obj10;
                            }
                            i23++;
                        } else if (obj9.equals(objArr3[c13])) {
                            int i28 = c13 ^ 1;
                            Object obj11 = objArr3[i28];
                            obj11.getClass();
                            zziz zzizVar2 = new zziz(obj9, obj10, obj11);
                            objArr3[i28] = obj10;
                            obj = zzizVar2;
                            break;
                        } else {
                            zza3 = i27 + 1;
                        }
                    }
                }
                if (i23 != i12) {
                    c11 = 2;
                    objArr2 = new Object[]{sArr, Integer.valueOf(i23), obj};
                    obj = objArr2;
                }
                bArr = sArr;
                c11 = 2;
                obj = bArr;
            } else {
                sArr = new int[i13];
                Arrays.fill((int[]) sArr, -1);
                int i29 = 0;
                int i31 = 0;
                while (i29 < i12) {
                    int i32 = i29 + i29;
                    int i33 = i31 + i31;
                    Object obj12 = objArr3[i32];
                    obj12.getClass();
                    Object obj13 = objArr3[i32 ^ 1];
                    obj13.getClass();
                    zzin.zza(obj12, obj13);
                    int zza4 = zziu.zza(obj12.hashCode());
                    while (true) {
                        int i34 = zza4 & i14;
                        ?? r15 = sArr[i34];
                        if (r15 == c12) {
                            sArr[i34] = i33;
                            if (i31 < i29) {
                                objArr3[i33] = obj12;
                                objArr3[i33 ^ 1] = obj13;
                            }
                            i31++;
                        } else if (obj12.equals(objArr3[r15])) {
                            int i35 = r15 ^ 1;
                            Object obj14 = objArr3[i35];
                            obj14.getClass();
                            zziz zzizVar3 = new zziz(obj12, obj13, obj14);
                            objArr3[i35] = obj13;
                            obj = zzizVar3;
                            break;
                        } else {
                            zza4 = i34 + 1;
                            c12 = 65535;
                        }
                    }
                    i29++;
                    c12 = 65535;
                }
                if (i31 != i12) {
                    c11 = 2;
                    objArr2 = new Object[]{sArr, Integer.valueOf(i31), obj};
                    obj = objArr2;
                }
                bArr = sArr;
                c11 = 2;
                obj = bArr;
            }
        }
        if (obj instanceof Object[]) {
            Object[] objArr4 = (Object[]) obj;
            zzjaVar.zzc = (zziz) objArr4[c11];
            Object obj15 = objArr4[0];
            int intValue = ((Integer) objArr4[1]).intValue();
            objArr3 = Arrays.copyOf(objArr3, intValue + intValue);
            obj = obj15;
            i12 = intValue;
        }
        return new zzjr(obj, objArr3, i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f A[RETURN] */
    @Override // com.google.android.libraries.places.internal.zzjb, java.util.Map
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
            int r0 = com.google.android.libraries.places.internal.zziu.zza(r0)
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
            int r0 = com.google.android.libraries.places.internal.zziu.zza(r0)
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
            int r6 = com.google.android.libraries.places.internal.zziu.zza(r6)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzjr.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.internal.zzjb
    final zziv zza() {
        return new zzjq(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.libraries.places.internal.zzjb
    final zzjc zzc() {
        return new zzjo(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.libraries.places.internal.zzjb
    final zzjc zzd() {
        return new zzjp(this, new zzjq(this.zzb, 0, this.zzd));
    }
}