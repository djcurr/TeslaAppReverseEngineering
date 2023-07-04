package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a0;
import com.google.crypto.tink.shaded.protobuf.r1;
import com.google.crypto.tink.shaded.protobuf.y;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class e {

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16252a;

        static {
            int[] iArr = new int[r1.b.values().length];
            f16252a = iArr;
            try {
                iArr[r1.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16252a[r1.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16252a[r1.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16252a[r1.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16252a[r1.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16252a[r1.b.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16252a[r1.b.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16252a[r1.b.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16252a[r1.b.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16252a[r1.b.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f16252a[r1.b.BOOL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f16252a[r1.b.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f16252a[r1.b.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f16252a[r1.b.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f16252a[r1.b.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f16252a[r1.b.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f16252a[r1.b.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f16252a[r1.b.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        public int f16253a;

        /* renamed from: b */
        public long f16254b;

        /* renamed from: c */
        public Object f16255c;

        /* renamed from: d */
        public final p f16256d;

        public b(p pVar) {
            Objects.requireNonNull(pVar);
            this.f16256d = pVar;
        }
    }

    public static int A(int i11, byte[] bArr, int i12, int i13, a0.i<?> iVar, b bVar) {
        z zVar = (z) iVar;
        int I = I(bArr, i12, bVar);
        zVar.addInt(j.b(bVar.f16253a));
        while (I < i13) {
            int I2 = I(bArr, I, bVar);
            if (i11 != bVar.f16253a) {
                break;
            }
            I = I(bArr, I2, bVar);
            zVar.addInt(j.b(bVar.f16253a));
        }
        return I;
    }

    public static int B(int i11, byte[] bArr, int i12, int i13, a0.i<?> iVar, b bVar) {
        h0 h0Var = (h0) iVar;
        int L = L(bArr, i12, bVar);
        h0Var.addLong(j.c(bVar.f16254b));
        while (L < i13) {
            int I = I(bArr, L, bVar);
            if (i11 != bVar.f16253a) {
                break;
            }
            L = L(bArr, I, bVar);
            h0Var.addLong(j.c(bVar.f16254b));
        }
        return L;
    }

    public static int C(byte[] bArr, int i11, b bVar) {
        int I = I(bArr, i11, bVar);
        int i12 = bVar.f16253a;
        if (i12 >= 0) {
            if (i12 == 0) {
                bVar.f16255c = "";
                return I;
            }
            bVar.f16255c = new String(bArr, I, i12, a0.f16230a);
            return I + i12;
        }
        throw InvalidProtocolBufferException.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x001a -> B:37:0x001b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int D(int r4, byte[] r5, int r6, int r7, com.google.crypto.tink.shaded.protobuf.a0.i<?> r8, com.google.crypto.tink.shaded.protobuf.e.b r9) {
        /*
            int r6 = I(r5, r6, r9)
            int r0 = r9.f16253a
            if (r0 < 0) goto L45
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
            r8.add(r1)
            goto L1b
        L10:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.crypto.tink.shaded.protobuf.a0.f16230a
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
        L1a:
            int r6 = r6 + r0
        L1b:
            if (r6 >= r7) goto L44
            int r0 = I(r5, r6, r9)
            int r2 = r9.f16253a
            if (r4 == r2) goto L26
            goto L44
        L26:
            int r6 = I(r5, r0, r9)
            int r0 = r9.f16253a
            if (r0 < 0) goto L3f
            if (r0 != 0) goto L34
            r8.add(r1)
            goto L1b
        L34:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.crypto.tink.shaded.protobuf.a0.f16230a
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
            goto L1a
        L3f:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r4 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.f()
            throw r4
        L44:
            return r6
        L45:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r4 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.f()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.e.D(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.a0$i, com.google.crypto.tink.shaded.protobuf.e$b):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0022 -> B:47:0x0023). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int E(int r5, byte[] r6, int r7, int r8, com.google.crypto.tink.shaded.protobuf.a0.i<?> r9, com.google.crypto.tink.shaded.protobuf.e.b r10) {
        /*
            int r7 = I(r6, r7, r10)
            int r0 = r10.f16253a
            if (r0 < 0) goto L5f
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
            r9.add(r1)
            goto L23
        L10:
            int r2 = r7 + r0
            boolean r3 = com.google.crypto.tink.shaded.protobuf.q1.n(r6, r7, r2)
            if (r3 == 0) goto L5a
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.a0.f16230a
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
        L22:
            r7 = r2
        L23:
            if (r7 >= r8) goto L59
            int r0 = I(r6, r7, r10)
            int r2 = r10.f16253a
            if (r5 == r2) goto L2e
            goto L59
        L2e:
            int r7 = I(r6, r0, r10)
            int r0 = r10.f16253a
            if (r0 < 0) goto L54
            if (r0 != 0) goto L3c
            r9.add(r1)
            goto L23
        L3c:
            int r2 = r7 + r0
            boolean r3 = com.google.crypto.tink.shaded.protobuf.q1.n(r6, r7, r2)
            if (r3 == 0) goto L4f
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.a0.f16230a
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
            goto L22
        L4f:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r5 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.c()
            throw r5
        L54:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r5 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.f()
            throw r5
        L59:
            return r7
        L5a:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r5 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.c()
            throw r5
        L5f:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r5 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.f()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.e.E(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.a0$i, com.google.crypto.tink.shaded.protobuf.e$b):int");
    }

    public static int F(byte[] bArr, int i11, b bVar) {
        int I = I(bArr, i11, bVar);
        int i12 = bVar.f16253a;
        if (i12 >= 0) {
            if (i12 == 0) {
                bVar.f16255c = "";
                return I;
            }
            bVar.f16255c = q1.e(bArr, I, i12);
            return I + i12;
        }
        throw InvalidProtocolBufferException.f();
    }

    public static int G(int i11, byte[] bArr, int i12, int i13, m1 m1Var, b bVar) {
        if (r1.a(i11) != 0) {
            int b11 = r1.b(i11);
            if (b11 == 0) {
                int L = L(bArr, i12, bVar);
                m1Var.n(i11, Long.valueOf(bVar.f16254b));
                return L;
            } else if (b11 == 1) {
                m1Var.n(i11, Long.valueOf(j(bArr, i12)));
                return i12 + 8;
            } else if (b11 == 2) {
                int I = I(bArr, i12, bVar);
                int i14 = bVar.f16253a;
                if (i14 >= 0) {
                    if (i14 <= bArr.length - I) {
                        if (i14 == 0) {
                            m1Var.n(i11, i.f16278b);
                        } else {
                            m1Var.n(i11, i.h(bArr, I, i14));
                        }
                        return I + i14;
                    }
                    throw InvalidProtocolBufferException.j();
                }
                throw InvalidProtocolBufferException.f();
            } else if (b11 != 3) {
                if (b11 == 5) {
                    m1Var.n(i11, Integer.valueOf(h(bArr, i12)));
                    return i12 + 4;
                }
                throw InvalidProtocolBufferException.b();
            } else {
                m1 l11 = m1.l();
                int i15 = (i11 & (-8)) | 4;
                int i16 = 0;
                while (true) {
                    if (i12 >= i13) {
                        break;
                    }
                    int I2 = I(bArr, i12, bVar);
                    int i17 = bVar.f16253a;
                    if (i17 == i15) {
                        i16 = i17;
                        i12 = I2;
                        break;
                    }
                    i16 = i17;
                    i12 = G(i17, bArr, I2, i13, l11, bVar);
                }
                if (i12 <= i13 && i16 == i15) {
                    m1Var.n(i11, l11);
                    return i12;
                }
                throw InvalidProtocolBufferException.g();
            }
        }
        throw InvalidProtocolBufferException.b();
    }

    public static int H(int i11, byte[] bArr, int i12, b bVar) {
        int i13 = i11 & 127;
        int i14 = i12 + 1;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            bVar.f16253a = i13 | (b11 << 7);
            return i14;
        }
        int i15 = i13 | ((b11 & Byte.MAX_VALUE) << 7);
        int i16 = i14 + 1;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            bVar.f16253a = i15 | (b12 << 14);
            return i16;
        }
        int i17 = i15 | ((b12 & Byte.MAX_VALUE) << 14);
        int i18 = i16 + 1;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            bVar.f16253a = i17 | (b13 << 21);
            return i18;
        }
        int i19 = i17 | ((b13 & Byte.MAX_VALUE) << 21);
        int i21 = i18 + 1;
        byte b14 = bArr[i18];
        if (b14 >= 0) {
            bVar.f16253a = i19 | (b14 << 28);
            return i21;
        }
        int i22 = i19 | ((b14 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i23 = i21 + 1;
            if (bArr[i21] >= 0) {
                bVar.f16253a = i22;
                return i23;
            }
            i21 = i23;
        }
    }

    public static int I(byte[] bArr, int i11, b bVar) {
        int i12 = i11 + 1;
        byte b11 = bArr[i11];
        if (b11 >= 0) {
            bVar.f16253a = b11;
            return i12;
        }
        return H(b11, bArr, i12, bVar);
    }

    public static int J(int i11, byte[] bArr, int i12, int i13, a0.i<?> iVar, b bVar) {
        z zVar = (z) iVar;
        int I = I(bArr, i12, bVar);
        zVar.addInt(bVar.f16253a);
        while (I < i13) {
            int I2 = I(bArr, I, bVar);
            if (i11 != bVar.f16253a) {
                break;
            }
            I = I(bArr, I2, bVar);
            zVar.addInt(bVar.f16253a);
        }
        return I;
    }

    static int K(long j11, byte[] bArr, int i11, b bVar) {
        int i12 = i11 + 1;
        byte b11 = bArr[i11];
        long j12 = (j11 & 127) | ((b11 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b11 < 0) {
            int i14 = i12 + 1;
            byte b12 = bArr[i12];
            i13 += 7;
            j12 |= (b12 & Byte.MAX_VALUE) << i13;
            i12 = i14;
            b11 = b12;
        }
        bVar.f16254b = j12;
        return i12;
    }

    public static int L(byte[] bArr, int i11, b bVar) {
        int i12 = i11 + 1;
        long j11 = bArr[i11];
        if (j11 >= 0) {
            bVar.f16254b = j11;
            return i12;
        }
        return K(j11, bArr, i12, bVar);
    }

    public static int M(int i11, byte[] bArr, int i12, int i13, a0.i<?> iVar, b bVar) {
        h0 h0Var = (h0) iVar;
        int L = L(bArr, i12, bVar);
        h0Var.addLong(bVar.f16254b);
        while (L < i13) {
            int I = I(bArr, L, bVar);
            if (i11 != bVar.f16253a) {
                break;
            }
            L = L(bArr, I, bVar);
            h0Var.addLong(bVar.f16254b);
        }
        return L;
    }

    public static int N(int i11, byte[] bArr, int i12, int i13, b bVar) {
        if (r1.a(i11) != 0) {
            int b11 = r1.b(i11);
            if (b11 != 0) {
                if (b11 != 1) {
                    if (b11 != 2) {
                        if (b11 != 3) {
                            if (b11 == 5) {
                                return i12 + 4;
                            }
                            throw InvalidProtocolBufferException.b();
                        }
                        int i14 = (i11 & (-8)) | 4;
                        int i15 = 0;
                        while (i12 < i13) {
                            i12 = I(bArr, i12, bVar);
                            i15 = bVar.f16253a;
                            if (i15 == i14) {
                                break;
                            }
                            i12 = N(i15, bArr, i12, i13, bVar);
                        }
                        if (i12 > i13 || i15 != i14) {
                            throw InvalidProtocolBufferException.g();
                        }
                        return i12;
                    }
                    return I(bArr, i12, bVar) + bVar.f16253a;
                }
                return i12 + 8;
            }
            return L(bArr, i12, bVar);
        }
        throw InvalidProtocolBufferException.b();
    }

    public static int a(int i11, byte[] bArr, int i12, int i13, a0.i<?> iVar, b bVar) {
        g gVar = (g) iVar;
        int L = L(bArr, i12, bVar);
        gVar.addBoolean(bVar.f16254b != 0);
        while (L < i13) {
            int I = I(bArr, L, bVar);
            if (i11 != bVar.f16253a) {
                break;
            }
            L = L(bArr, I, bVar);
            gVar.addBoolean(bVar.f16254b != 0);
        }
        return L;
    }

    public static int b(byte[] bArr, int i11, b bVar) {
        int I = I(bArr, i11, bVar);
        int i12 = bVar.f16253a;
        if (i12 >= 0) {
            if (i12 <= bArr.length - I) {
                if (i12 == 0) {
                    bVar.f16255c = i.f16278b;
                    return I;
                }
                bVar.f16255c = i.h(bArr, I, i12);
                return I + i12;
            }
            throw InvalidProtocolBufferException.j();
        }
        throw InvalidProtocolBufferException.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x001b -> B:46:0x001c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(int r2, byte[] r3, int r4, int r5, com.google.crypto.tink.shaded.protobuf.a0.i<?> r6, com.google.crypto.tink.shaded.protobuf.e.b r7) {
        /*
            int r4 = I(r3, r4, r7)
            int r0 = r7.f16253a
            if (r0 < 0) goto L53
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L4e
            if (r0 != 0) goto L14
            com.google.crypto.tink.shaded.protobuf.i r0 = com.google.crypto.tink.shaded.protobuf.i.f16278b
            r6.add(r0)
            goto L1c
        L14:
            com.google.crypto.tink.shaded.protobuf.i r1 = com.google.crypto.tink.shaded.protobuf.i.h(r3, r4, r0)
            r6.add(r1)
        L1b:
            int r4 = r4 + r0
        L1c:
            if (r4 >= r5) goto L4d
            int r0 = I(r3, r4, r7)
            int r1 = r7.f16253a
            if (r2 == r1) goto L27
            goto L4d
        L27:
            int r4 = I(r3, r0, r7)
            int r0 = r7.f16253a
            if (r0 < 0) goto L48
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L43
            if (r0 != 0) goto L3b
            com.google.crypto.tink.shaded.protobuf.i r0 = com.google.crypto.tink.shaded.protobuf.i.f16278b
            r6.add(r0)
            goto L1c
        L3b:
            com.google.crypto.tink.shaded.protobuf.i r1 = com.google.crypto.tink.shaded.protobuf.i.h(r3, r4, r0)
            r6.add(r1)
            goto L1b
        L43:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.j()
            throw r2
        L48:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.f()
            throw r2
        L4d:
            return r4
        L4e:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.j()
            throw r2
        L53:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.f()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.e.c(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.a0$i, com.google.crypto.tink.shaded.protobuf.e$b):int");
    }

    public static double d(byte[] bArr, int i11) {
        return Double.longBitsToDouble(j(bArr, i11));
    }

    public static int e(int i11, byte[] bArr, int i12, int i13, a0.i<?> iVar, b bVar) {
        m mVar = (m) iVar;
        mVar.addDouble(d(bArr, i12));
        int i14 = i12 + 8;
        while (i14 < i13) {
            int I = I(bArr, i14, bVar);
            if (i11 != bVar.f16253a) {
                break;
            }
            mVar.addDouble(d(bArr, I));
            i14 = I + 8;
        }
        return i14;
    }

    static int f(int i11, byte[] bArr, int i12, int i13, y.c<?, ?> cVar, y.e<?, ?> eVar, l1<m1, m1> l1Var, b bVar) {
        Object i14;
        u<y.d> uVar = cVar.extensions;
        int i15 = i11 >>> 3;
        if (eVar.f16431b.isRepeated() && eVar.f16431b.isPacked()) {
            switch (a.f16252a[eVar.a().ordinal()]) {
                case 1:
                    m mVar = new m();
                    int s11 = s(bArr, i12, mVar, bVar);
                    uVar.w(eVar.f16431b, mVar);
                    return s11;
                case 2:
                    w wVar = new w();
                    int v11 = v(bArr, i12, wVar, bVar);
                    uVar.w(eVar.f16431b, wVar);
                    return v11;
                case 3:
                case 4:
                    h0 h0Var = new h0();
                    int z11 = z(bArr, i12, h0Var, bVar);
                    uVar.w(eVar.f16431b, h0Var);
                    return z11;
                case 5:
                case 6:
                    z zVar = new z();
                    int y11 = y(bArr, i12, zVar, bVar);
                    uVar.w(eVar.f16431b, zVar);
                    return y11;
                case 7:
                case 8:
                    h0 h0Var2 = new h0();
                    int u11 = u(bArr, i12, h0Var2, bVar);
                    uVar.w(eVar.f16431b, h0Var2);
                    return u11;
                case 9:
                case 10:
                    z zVar2 = new z();
                    int t11 = t(bArr, i12, zVar2, bVar);
                    uVar.w(eVar.f16431b, zVar2);
                    return t11;
                case 11:
                    g gVar = new g();
                    int r11 = r(bArr, i12, gVar, bVar);
                    uVar.w(eVar.f16431b, gVar);
                    return r11;
                case 12:
                    z zVar3 = new z();
                    int w11 = w(bArr, i12, zVar3, bVar);
                    uVar.w(eVar.f16431b, zVar3);
                    return w11;
                case 13:
                    h0 h0Var3 = new h0();
                    int x11 = x(bArr, i12, h0Var3, bVar);
                    uVar.w(eVar.f16431b, h0Var3);
                    return x11;
                case 14:
                    z zVar4 = new z();
                    int y12 = y(bArr, i12, zVar4, bVar);
                    m1 m1Var = cVar.unknownFields;
                    m1 m1Var2 = (m1) h1.z(i15, zVar4, eVar.f16431b.b(), m1Var != m1.e() ? m1Var : null, l1Var);
                    if (m1Var2 != null) {
                        cVar.unknownFields = m1Var2;
                    }
                    uVar.w(eVar.f16431b, zVar4);
                    return y12;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f16431b.getLiteType());
            }
        }
        if (eVar.a() == r1.b.ENUM) {
            i12 = I(bArr, i12, bVar);
            if (eVar.f16431b.b().findValueByNumber(bVar.f16253a) == null) {
                m1 m1Var3 = cVar.unknownFields;
                if (m1Var3 == m1.e()) {
                    m1Var3 = m1.l();
                    cVar.unknownFields = m1Var3;
                }
                h1.L(i15, bVar.f16253a, m1Var3, l1Var);
                return i12;
            }
            r2 = Integer.valueOf(bVar.f16253a);
        } else {
            switch (a.f16252a[eVar.a().ordinal()]) {
                case 1:
                    r2 = Double.valueOf(d(bArr, i12));
                    i12 += 8;
                    break;
                case 2:
                    r2 = Float.valueOf(l(bArr, i12));
                    i12 += 4;
                    break;
                case 3:
                case 4:
                    i12 = L(bArr, i12, bVar);
                    r2 = Long.valueOf(bVar.f16254b);
                    break;
                case 5:
                case 6:
                    i12 = I(bArr, i12, bVar);
                    r2 = Integer.valueOf(bVar.f16253a);
                    break;
                case 7:
                case 8:
                    r2 = Long.valueOf(j(bArr, i12));
                    i12 += 8;
                    break;
                case 9:
                case 10:
                    r2 = Integer.valueOf(h(bArr, i12));
                    i12 += 4;
                    break;
                case 11:
                    i12 = L(bArr, i12, bVar);
                    r2 = Boolean.valueOf(bVar.f16254b != 0);
                    break;
                case 12:
                    i12 = I(bArr, i12, bVar);
                    r2 = Integer.valueOf(j.b(bVar.f16253a));
                    break;
                case 13:
                    i12 = L(bArr, i12, bVar);
                    r2 = Long.valueOf(j.c(bVar.f16254b));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i12 = b(bArr, i12, bVar);
                    r2 = bVar.f16255c;
                    break;
                case 16:
                    i12 = C(bArr, i12, bVar);
                    r2 = bVar.f16255c;
                    break;
                case 17:
                    i12 = n(b1.a().d(eVar.b().getClass()), bArr, i12, i13, (i15 << 3) | 4, bVar);
                    r2 = bVar.f16255c;
                    break;
                case 18:
                    i12 = p(b1.a().d(eVar.b().getClass()), bArr, i12, i13, bVar);
                    r2 = bVar.f16255c;
                    break;
            }
        }
        if (eVar.d()) {
            uVar.a(eVar.f16431b, r2);
        } else {
            int i16 = a.f16252a[eVar.a().ordinal()];
            if ((i16 == 17 || i16 == 18) && (i14 = uVar.i(eVar.f16431b)) != null) {
                r2 = a0.h(i14, r2);
            }
            uVar.w(eVar.f16431b, r2);
        }
        return i12;
    }

    public static int g(int i11, byte[] bArr, int i12, int i13, Object obj, q0 q0Var, l1<m1, m1> l1Var, b bVar) {
        y.e a11 = bVar.f16256d.a(q0Var, i11 >>> 3);
        if (a11 == null) {
            return G(i11, bArr, i12, i13, t0.o(obj), bVar);
        }
        y.c cVar = (y.c) obj;
        cVar.C();
        return f(i11, bArr, i12, i13, cVar, a11, l1Var, bVar);
    }

    public static int h(byte[] bArr, int i11) {
        return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    public static int i(int i11, byte[] bArr, int i12, int i13, a0.i<?> iVar, b bVar) {
        z zVar = (z) iVar;
        zVar.addInt(h(bArr, i12));
        int i14 = i12 + 4;
        while (i14 < i13) {
            int I = I(bArr, i14, bVar);
            if (i11 != bVar.f16253a) {
                break;
            }
            zVar.addInt(h(bArr, I));
            i14 = I + 4;
        }
        return i14;
    }

    public static long j(byte[] bArr, int i11) {
        return ((bArr[i11 + 7] & 255) << 56) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((bArr[i11 + 6] & 255) << 48);
    }

    public static int k(int i11, byte[] bArr, int i12, int i13, a0.i<?> iVar, b bVar) {
        h0 h0Var = (h0) iVar;
        h0Var.addLong(j(bArr, i12));
        int i14 = i12 + 8;
        while (i14 < i13) {
            int I = I(bArr, i14, bVar);
            if (i11 != bVar.f16253a) {
                break;
            }
            h0Var.addLong(j(bArr, I));
            i14 = I + 8;
        }
        return i14;
    }

    public static float l(byte[] bArr, int i11) {
        return Float.intBitsToFloat(h(bArr, i11));
    }

    public static int m(int i11, byte[] bArr, int i12, int i13, a0.i<?> iVar, b bVar) {
        w wVar = (w) iVar;
        wVar.addFloat(l(bArr, i12));
        int i14 = i12 + 4;
        while (i14 < i13) {
            int I = I(bArr, i14, bVar);
            if (i11 != bVar.f16253a) {
                break;
            }
            wVar.addFloat(l(bArr, I));
            i14 = I + 4;
        }
        return i14;
    }

    public static int n(f1 f1Var, byte[] bArr, int i11, int i12, int i13, b bVar) {
        t0 t0Var = (t0) f1Var;
        Object newInstance = t0Var.newInstance();
        int V = t0Var.V(newInstance, bArr, i11, i12, i13, bVar);
        t0Var.makeImmutable(newInstance);
        bVar.f16255c = newInstance;
        return V;
    }

    public static int o(f1 f1Var, int i11, byte[] bArr, int i12, int i13, a0.i<?> iVar, b bVar) {
        int i14 = (i11 & (-8)) | 4;
        int n11 = n(f1Var, bArr, i12, i13, i14, bVar);
        iVar.add(bVar.f16255c);
        while (n11 < i13) {
            int I = I(bArr, n11, bVar);
            if (i11 != bVar.f16253a) {
                break;
            }
            n11 = n(f1Var, bArr, I, i13, i14, bVar);
            iVar.add(bVar.f16255c);
        }
        return n11;
    }

    public static int p(f1 f1Var, byte[] bArr, int i11, int i12, b bVar) {
        int i13 = i11 + 1;
        int i14 = bArr[i11];
        if (i14 < 0) {
            i13 = H(i14, bArr, i13, bVar);
            i14 = bVar.f16253a;
        }
        int i15 = i13;
        if (i14 >= 0 && i14 <= i12 - i15) {
            Object newInstance = f1Var.newInstance();
            int i16 = i14 + i15;
            f1Var.a(newInstance, bArr, i15, i16, bVar);
            f1Var.makeImmutable(newInstance);
            bVar.f16255c = newInstance;
            return i16;
        }
        throw InvalidProtocolBufferException.j();
    }

    public static int q(f1<?> f1Var, int i11, byte[] bArr, int i12, int i13, a0.i<?> iVar, b bVar) {
        int p11 = p(f1Var, bArr, i12, i13, bVar);
        iVar.add(bVar.f16255c);
        while (p11 < i13) {
            int I = I(bArr, p11, bVar);
            if (i11 != bVar.f16253a) {
                break;
            }
            p11 = p(f1Var, bArr, I, i13, bVar);
            iVar.add(bVar.f16255c);
        }
        return p11;
    }

    public static int r(byte[] bArr, int i11, a0.i<?> iVar, b bVar) {
        g gVar = (g) iVar;
        int I = I(bArr, i11, bVar);
        int i12 = bVar.f16253a + I;
        while (I < i12) {
            I = L(bArr, I, bVar);
            gVar.addBoolean(bVar.f16254b != 0);
        }
        if (I == i12) {
            return I;
        }
        throw InvalidProtocolBufferException.j();
    }

    public static int s(byte[] bArr, int i11, a0.i<?> iVar, b bVar) {
        m mVar = (m) iVar;
        int I = I(bArr, i11, bVar);
        int i12 = bVar.f16253a + I;
        while (I < i12) {
            mVar.addDouble(d(bArr, I));
            I += 8;
        }
        if (I == i12) {
            return I;
        }
        throw InvalidProtocolBufferException.j();
    }

    public static int t(byte[] bArr, int i11, a0.i<?> iVar, b bVar) {
        z zVar = (z) iVar;
        int I = I(bArr, i11, bVar);
        int i12 = bVar.f16253a + I;
        while (I < i12) {
            zVar.addInt(h(bArr, I));
            I += 4;
        }
        if (I == i12) {
            return I;
        }
        throw InvalidProtocolBufferException.j();
    }

    public static int u(byte[] bArr, int i11, a0.i<?> iVar, b bVar) {
        h0 h0Var = (h0) iVar;
        int I = I(bArr, i11, bVar);
        int i12 = bVar.f16253a + I;
        while (I < i12) {
            h0Var.addLong(j(bArr, I));
            I += 8;
        }
        if (I == i12) {
            return I;
        }
        throw InvalidProtocolBufferException.j();
    }

    public static int v(byte[] bArr, int i11, a0.i<?> iVar, b bVar) {
        w wVar = (w) iVar;
        int I = I(bArr, i11, bVar);
        int i12 = bVar.f16253a + I;
        while (I < i12) {
            wVar.addFloat(l(bArr, I));
            I += 4;
        }
        if (I == i12) {
            return I;
        }
        throw InvalidProtocolBufferException.j();
    }

    public static int w(byte[] bArr, int i11, a0.i<?> iVar, b bVar) {
        z zVar = (z) iVar;
        int I = I(bArr, i11, bVar);
        int i12 = bVar.f16253a + I;
        while (I < i12) {
            I = I(bArr, I, bVar);
            zVar.addInt(j.b(bVar.f16253a));
        }
        if (I == i12) {
            return I;
        }
        throw InvalidProtocolBufferException.j();
    }

    public static int x(byte[] bArr, int i11, a0.i<?> iVar, b bVar) {
        h0 h0Var = (h0) iVar;
        int I = I(bArr, i11, bVar);
        int i12 = bVar.f16253a + I;
        while (I < i12) {
            I = L(bArr, I, bVar);
            h0Var.addLong(j.c(bVar.f16254b));
        }
        if (I == i12) {
            return I;
        }
        throw InvalidProtocolBufferException.j();
    }

    public static int y(byte[] bArr, int i11, a0.i<?> iVar, b bVar) {
        z zVar = (z) iVar;
        int I = I(bArr, i11, bVar);
        int i12 = bVar.f16253a + I;
        while (I < i12) {
            I = I(bArr, I, bVar);
            zVar.addInt(bVar.f16253a);
        }
        if (I == i12) {
            return I;
        }
        throw InvalidProtocolBufferException.j();
    }

    public static int z(byte[] bArr, int i11, a0.i<?> iVar, b bVar) {
        h0 h0Var = (h0) iVar;
        int I = I(bArr, i11, bVar);
        int i12 = bVar.f16253a + I;
        while (I < i12) {
            I = L(bArr, I, bVar);
            h0Var.addLong(bVar.f16254b);
        }
        if (I == i12) {
            return I;
        }
        throw InvalidProtocolBufferException.j();
    }
}