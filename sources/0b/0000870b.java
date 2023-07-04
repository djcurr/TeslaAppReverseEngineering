package mq;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final int f38728a;

    /* renamed from: b  reason: collision with root package name */
    final byte[] f38729b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f38730c;

    /* renamed from: d  reason: collision with root package name */
    private final String[] f38731d;

    /* renamed from: e  reason: collision with root package name */
    private final h[] f38732e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f38733f;

    /* renamed from: g  reason: collision with root package name */
    private final int f38734g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public e(byte[] bArr, int i11, boolean z11) {
        int i12;
        this.f38729b = bArr;
        if (z11) {
            if (C(i11 + 6) > 61) {
                throw new IllegalArgumentException("Unsupported class file major version " + ((int) C(i12)));
            }
        }
        int I = I(i11 + 8);
        this.f38730c = new int[I];
        this.f38731d = new String[I];
        int i13 = i11 + 10;
        int i14 = 0;
        boolean z12 = false;
        boolean z13 = false;
        int i15 = 1;
        while (i15 < I) {
            int i16 = i15 + 1;
            int i17 = i13 + 1;
            this.f38730c[i15] = i17;
            int i18 = 3;
            switch (bArr[i13]) {
                case 1:
                    i18 = 3 + I(i17);
                    if (i18 > i14) {
                        i14 = i18;
                    }
                    i15 = i16;
                    break;
                case 2:
                case 13:
                case 14:
                default:
                    throw new IllegalArgumentException();
                case 3:
                case 4:
                case 9:
                case 10:
                case 11:
                case 12:
                    i15 = i16;
                    i18 = 5;
                    break;
                case 5:
                case 6:
                    i18 = 9;
                    i16++;
                    i15 = i16;
                    break;
                case 7:
                case 8:
                case 16:
                case 19:
                case 20:
                    i15 = i16;
                    break;
                case 15:
                    i18 = 4;
                    i15 = i16;
                    break;
                case 17:
                    z12 = true;
                    z13 = true;
                    i15 = i16;
                    i18 = 5;
                    break;
                case 18:
                    z13 = true;
                    i15 = i16;
                    i18 = 5;
                    break;
            }
            i13 += i18;
        }
        this.f38734g = i14;
        this.f38728a = i13;
        this.f38732e = z12 ? new h[I] : null;
        this.f38733f = z13 ? k(i14) : null;
    }

    private void A(s sVar, j jVar, int i11, boolean z11) {
        int i12 = i11 + 1;
        int i13 = this.f38729b[i11] & 255;
        sVar.a(i13, z11);
        char[] cArr = jVar.f38767c;
        for (int i14 = 0; i14 < i13; i14++) {
            int I = I(i12);
            i12 += 2;
            while (true) {
                int i15 = I - 1;
                if (I > 0) {
                    i12 = r(sVar.y(i14, H(i12, cArr), z11), i12 + 2, true, cArr);
                    I = i15;
                }
            }
        }
    }

    private int B(f fVar, j jVar, int i11) {
        int i12;
        j jVar2 = jVar;
        char[] cArr = jVar2.f38767c;
        String H = H(i11, cArr);
        String H2 = H(i11 + 2, cArr);
        int i13 = i11 + 4;
        int I = I(i13);
        int i14 = i13 + 2;
        int i15 = 0;
        c cVar = null;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        String str = null;
        while (true) {
            int i19 = I - 1;
            if (I <= 0) {
                break;
            }
            String H3 = H(i14, cArr);
            int t11 = t(i14 + 2);
            int i21 = i14 + 6;
            if ("Signature".equals(H3)) {
                str = H(i21, cArr);
                i12 = i21;
            } else if ("RuntimeVisibleAnnotations".equals(H3)) {
                i18 = i21;
                i12 = i18;
            } else if ("RuntimeVisibleTypeAnnotations".equals(H3)) {
                i16 = i21;
                i12 = i16;
            } else if ("RuntimeInvisibleAnnotations".equals(H3)) {
                i17 = i21;
                i12 = i17;
            } else if ("RuntimeInvisibleTypeAnnotations".equals(H3)) {
                i15 = i21;
                i12 = i15;
            } else {
                i12 = i21;
                c cVar2 = cVar;
                cVar = j(jVar2.f38765a, H3, i12, t11, cArr, -1, null);
                cVar.f38721c = cVar2;
                i18 = i18;
                i17 = i17;
                i16 = i16;
                i15 = i15;
            }
            i14 = i12 + t11;
            jVar2 = jVar;
            I = i19;
        }
        int i22 = i15;
        c cVar3 = cVar;
        int i23 = i16;
        int i24 = i17;
        int i25 = i18;
        x m11 = fVar.m(H, H2, str);
        if (m11 == null) {
            return i14;
        }
        if (i25 != 0) {
            int I2 = I(i25);
            int i26 = i25 + 2;
            while (true) {
                int i27 = I2 - 1;
                if (I2 <= 0) {
                    break;
                }
                i26 = r(m11.a(H(i26, cArr), true), i26 + 2, true, cArr);
                I2 = i27;
            }
        }
        if (i24 != 0) {
            int I3 = I(i24);
            int i28 = i24 + 2;
            while (true) {
                int i29 = I3 - 1;
                if (I3 <= 0) {
                    break;
                }
                i28 = r(m11.a(H(i28, cArr), false), i28 + 2, true, cArr);
                I3 = i29;
            }
        }
        if (i23 != 0) {
            int I4 = I(i23);
            int i31 = i23 + 2;
            while (true) {
                int i32 = I4 - 1;
                if (I4 <= 0) {
                    break;
                }
                int F = F(jVar, i31);
                i31 = r(m11.d(jVar.f38772h, jVar.f38773i, H(F, cArr), true), F + 2, true, cArr);
                I4 = i32;
            }
        }
        if (i22 != 0) {
            int I5 = I(i22);
            int i33 = i22 + 2;
            while (true) {
                int i34 = I5 - 1;
                if (I5 <= 0) {
                    break;
                }
                int F2 = F(jVar, i33);
                i33 = r(m11.d(jVar.f38772h, jVar.f38773i, H(F2, cArr), false), F2 + 2, true, cArr);
                I5 = i34;
            }
        }
        c cVar4 = cVar3;
        while (cVar4 != null) {
            c cVar5 = cVar4.f38721c;
            cVar4.f38721c = null;
            m11.b(cVar4);
            cVar4 = cVar5;
        }
        m11.c();
        return i14;
    }

    private int D(int i11, boolean z11, boolean z12, j jVar) {
        int i12;
        int i13;
        char[] cArr = jVar.f38767c;
        r[] rVarArr = jVar.f38771g;
        if (z11) {
            i12 = i11 + 1;
            i13 = this.f38729b[i11] & 255;
        } else {
            jVar.f38777m = -1;
            i12 = i11;
            i13 = 255;
        }
        jVar.f38780p = 0;
        if (i13 < 64) {
            jVar.f38778n = 3;
            jVar.f38782r = 0;
        } else if (i13 < 128) {
            i13 -= 64;
            i12 = L(i12, jVar.f38783s, 0, cArr, rVarArr);
            jVar.f38778n = 4;
            jVar.f38782r = 1;
        } else if (i13 >= 247) {
            int I = I(i12);
            i12 += 2;
            if (i13 == 247) {
                i12 = L(i12, jVar.f38783s, 0, cArr, rVarArr);
                jVar.f38778n = 4;
                jVar.f38782r = 1;
            } else if (i13 >= 248 && i13 < 251) {
                jVar.f38778n = 2;
                int i14 = 251 - i13;
                jVar.f38780p = i14;
                jVar.f38779o -= i14;
                jVar.f38782r = 0;
            } else if (i13 == 251) {
                jVar.f38778n = 3;
                jVar.f38782r = 0;
            } else if (i13 < 255) {
                int i15 = i13 - 251;
                int i16 = z12 ? jVar.f38779o : 0;
                int i17 = i15;
                while (i17 > 0) {
                    i12 = L(i12, jVar.f38781q, i16, cArr, rVarArr);
                    i17--;
                    i16++;
                }
                jVar.f38778n = 1;
                jVar.f38780p = i15;
                jVar.f38779o += i15;
                jVar.f38782r = 0;
            } else {
                int I2 = I(i12);
                int i18 = i12 + 2;
                jVar.f38778n = 0;
                jVar.f38780p = I2;
                jVar.f38779o = I2;
                for (int i19 = 0; i19 < I2; i19++) {
                    i18 = L(i18, jVar.f38781q, i19, cArr, rVarArr);
                }
                int I3 = I(i18);
                i12 = i18 + 2;
                jVar.f38782r = I3;
                for (int i21 = 0; i21 < I3; i21++) {
                    i12 = L(i12, jVar.f38783s, i21, cArr, rVarArr);
                }
            }
            i13 = I;
        } else {
            throw new IllegalArgumentException();
        }
        int i22 = jVar.f38777m + i13 + 1;
        jVar.f38777m = i22;
        d(i22, rVarArr);
        return i12;
    }

    private String E(int i11, char[] cArr) {
        return H(this.f38730c[I(i11)], cArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int F(mq.j r10, int r11) {
        /*
            r9 = this;
            int r0 = r9.t(r11)
            int r1 = r0 >>> 24
            r2 = 1
            if (r1 == 0) goto L70
            if (r1 == r2) goto L70
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            switch(r1) {
                case 16: goto L6b;
                case 17: goto L6b;
                case 18: goto L6b;
                case 19: goto L68;
                case 20: goto L68;
                case 21: goto L68;
                case 22: goto L70;
                case 23: goto L6b;
                default: goto L10;
            }
        L10:
            switch(r1) {
                case 64: goto L22;
                case 65: goto L22;
                case 66: goto L6b;
                case 67: goto L20;
                case 68: goto L20;
                case 69: goto L20;
                case 70: goto L20;
                case 71: goto L19;
                case 72: goto L19;
                case 73: goto L19;
                case 74: goto L19;
                case 75: goto L19;
                default: goto L13;
            }
        L13:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>()
            throw r10
        L19:
            r1 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            r0 = r0 & r1
            int r11 = r11 + 4
            goto L75
        L20:
            r0 = r0 & r3
            goto L6d
        L22:
            r0 = r0 & r3
            int r1 = r11 + 1
            int r1 = r9.I(r1)
            int r11 = r11 + 3
            mq.r[] r3 = new mq.r[r1]
            r10.f38774j = r3
            mq.r[] r3 = new mq.r[r1]
            r10.f38775k = r3
            int[] r3 = new int[r1]
            r10.f38776l = r3
            r3 = 0
        L38:
            if (r3 >= r1) goto L75
            int r4 = r9.I(r11)
            int r5 = r11 + 2
            int r5 = r9.I(r5)
            int r6 = r11 + 4
            int r6 = r9.I(r6)
            int r11 = r11 + 6
            mq.r[] r7 = r10.f38774j
            mq.r[] r8 = r10.f38771g
            mq.r r8 = r9.d(r4, r8)
            r7[r3] = r8
            mq.r[] r7 = r10.f38775k
            int r4 = r4 + r5
            mq.r[] r5 = r10.f38771g
            mq.r r4 = r9.d(r4, r5)
            r7[r3] = r4
            int[] r4 = r10.f38776l
            r4[r3] = r6
            int r3 = r3 + 1
            goto L38
        L68:
            r0 = r0 & r3
            int r11 = r11 + r2
            goto L75
        L6b:
            r0 = r0 & (-256(0xffffffffffffff00, float:NaN))
        L6d:
            int r11 = r11 + 3
            goto L75
        L70:
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r0 = r0 & r1
            int r11 = r11 + 2
        L75:
            r10.f38772h = r0
            int r0 = r9.l(r11)
            if (r0 != 0) goto L7f
            r1 = 0
            goto L86
        L7f:
            mq.c0 r1 = new mq.c0
            byte[] r3 = r9.f38729b
            r1.<init>(r3, r11)
        L86:
            r10.f38773i = r1
            int r11 = r11 + r2
            int r0 = r0 * 2
            int r11 = r11 + r0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: mq.e.F(mq.j, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int[] G(mq.s r11, mq.j r12, int r13, boolean r14) {
        /*
            r10 = this;
            char[] r0 = r12.f38767c
            int r1 = r10.I(r13)
            int[] r2 = new int[r1]
            int r13 = r13 + 2
            r3 = 0
        Lb:
            if (r3 >= r1) goto L84
            r2[r3] = r13
            int r4 = r10.t(r13)
            int r5 = r4 >>> 24
            r6 = 23
            if (r5 == r6) goto L4d
            switch(r5) {
                case 16: goto L4d;
                case 17: goto L4d;
                case 18: goto L4d;
                default: goto L1c;
            }
        L1c:
            switch(r5) {
                case 64: goto L28;
                case 65: goto L28;
                case 66: goto L4d;
                case 67: goto L4d;
                case 68: goto L4d;
                case 69: goto L4d;
                case 70: goto L4d;
                case 71: goto L25;
                case 72: goto L25;
                case 73: goto L25;
                case 74: goto L25;
                case 75: goto L25;
                default: goto L1f;
            }
        L1f:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>()
            throw r11
        L25:
            int r13 = r13 + 4
            goto L4f
        L28:
            int r6 = r13 + 1
            int r6 = r10.I(r6)
            int r13 = r13 + 3
        L30:
            int r7 = r6 + (-1)
            if (r6 <= 0) goto L4f
            int r6 = r10.I(r13)
            int r8 = r13 + 2
            int r8 = r10.I(r8)
            int r13 = r13 + 6
            mq.r[] r9 = r12.f38771g
            r10.d(r6, r9)
            int r6 = r6 + r8
            mq.r[] r8 = r12.f38771g
            r10.d(r6, r8)
            r6 = r7
            goto L30
        L4d:
            int r13 = r13 + 3
        L4f:
            int r6 = r10.l(r13)
            r7 = 66
            r8 = 0
            r9 = 1
            if (r5 != r7) goto L78
            if (r6 != 0) goto L5c
            goto L63
        L5c:
            mq.c0 r8 = new mq.c0
            byte[] r5 = r10.f38729b
            r8.<init>(r5, r13)
        L63:
            int r6 = r6 * 2
            int r6 = r6 + r9
            int r13 = r13 + r6
            java.lang.String r5 = r10.H(r13, r0)
            int r13 = r13 + 2
            r4 = r4 & (-256(0xffffffffffffff00, float:NaN))
            mq.a r4 = r11.A(r4, r8, r5, r14)
            int r13 = r10.r(r4, r13, r9, r0)
            goto L81
        L78:
            int r6 = r6 * 2
            int r6 = r6 + 3
            int r13 = r13 + r6
            int r13 = r10.r(r8, r13, r9, r0)
        L81:
            int r3 = r3 + 1
            goto Lb
        L84:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: mq.e.G(mq.s, mq.j, int, boolean):int[]");
    }

    private String J(int i11, int i12, char[] cArr) {
        int i13;
        int i14 = i12 + i11;
        byte[] bArr = this.f38729b;
        int i15 = 0;
        while (i11 < i14) {
            int i16 = i11 + 1;
            byte b11 = bArr[i11];
            if ((b11 & 128) == 0) {
                i13 = i15 + 1;
                cArr[i15] = (char) (b11 & Byte.MAX_VALUE);
            } else if ((b11 & 224) == 192) {
                cArr[i15] = (char) (((b11 & 31) << 6) + (bArr[i16] & 63));
                i15++;
                i11 = i16 + 1;
            } else {
                i13 = i15 + 1;
                int i17 = i16 + 1;
                int i18 = ((b11 & 15) << 12) + ((bArr[i16] & 63) << 6);
                i16 = i17 + 1;
                cArr[i15] = (char) (i18 + (bArr[i17] & 63));
            }
            i11 = i16;
            i15 = i13;
        }
        return new String(cArr, 0, i15);
    }

    private int L(int i11, Object[] objArr, int i12, char[] cArr, r[] rVarArr) {
        int i13 = i11 + 1;
        switch (this.f38729b[i11] & 255) {
            case 0:
                objArr[i12] = w.f38878a;
                return i13;
            case 1:
                objArr[i12] = w.f38879b;
                return i13;
            case 2:
                objArr[i12] = w.f38880c;
                return i13;
            case 3:
                objArr[i12] = w.f38881d;
                return i13;
            case 4:
                objArr[i12] = w.f38882e;
                return i13;
            case 5:
                objArr[i12] = w.f38883f;
                return i13;
            case 6:
                objArr[i12] = w.f38884g;
                return i13;
            case 7:
                objArr[i12] = m(i13, cArr);
                break;
            case 8:
                objArr[i12] = d(I(i13), rVarArr);
                break;
            default:
                throw new IllegalArgumentException();
        }
        return i13 + 2;
    }

    private void b(j jVar) {
        int i11;
        String str = jVar.f38770f;
        Object[] objArr = jVar.f38781q;
        int i12 = 0;
        if ((jVar.f38768d & 8) == 0) {
            if ("<init>".equals(jVar.f38769e)) {
                objArr[0] = w.f38884g;
            } else {
                objArr[0] = m(this.f38728a + 2, jVar.f38767c);
            }
            i12 = 1;
        }
        int i13 = 1;
        while (true) {
            int i14 = i13 + 1;
            char charAt = str.charAt(i13);
            if (charAt == 'F') {
                i11 = i12 + 1;
                objArr[i12] = w.f38880c;
            } else if (charAt != 'L') {
                if (charAt != 'S' && charAt != 'I') {
                    if (charAt == 'J') {
                        i11 = i12 + 1;
                        objArr[i12] = w.f38882e;
                    } else if (charAt != 'Z') {
                        if (charAt != '[') {
                            switch (charAt) {
                                case 'B':
                                case 'C':
                                    break;
                                case 'D':
                                    i11 = i12 + 1;
                                    objArr[i12] = w.f38881d;
                                    break;
                                default:
                                    jVar.f38779o = i12;
                                    return;
                            }
                        } else {
                            while (str.charAt(i14) == '[') {
                                i14++;
                            }
                            if (str.charAt(i14) == 'L') {
                                do {
                                    i14++;
                                } while (str.charAt(i14) != ';');
                                int i15 = i14 + 1;
                                objArr[i12] = str.substring(i13, i15);
                                i13 = i15;
                                i12++;
                            } else {
                                int i152 = i14 + 1;
                                objArr[i12] = str.substring(i13, i152);
                                i13 = i152;
                                i12++;
                            }
                        }
                    }
                }
                i11 = i12 + 1;
                objArr[i12] = w.f38879b;
            } else {
                int i16 = i14;
                while (str.charAt(i16) != ';') {
                    i16++;
                }
                objArr[i12] = str.substring(i14, i16);
                i12++;
                i13 = i16 + 1;
            }
            i12 = i11;
            i13 = i14;
        }
    }

    private void c(int i11, r[] rVarArr) {
        if (rVarArr[i11] == null) {
            r u11 = u(i11, rVarArr);
            u11.f38820a = (short) (u11.f38820a | 1);
        }
    }

    private r d(int i11, r[] rVarArr) {
        r u11 = u(i11, rVarArr);
        u11.f38820a = (short) (u11.f38820a & (-2));
        return u11;
    }

    private int i(int[] iArr, int i11) {
        if (iArr == null || i11 >= iArr.length || l(iArr[i11]) < 67) {
            return -1;
        }
        return I(iArr[i11] + 1);
    }

    private c j(c[] cVarArr, String str, int i11, int i12, char[] cArr, int i13, r[] rVarArr) {
        for (c cVar : cVarArr) {
            if (cVar.f38719a.equals(str)) {
                return cVar.i(this, i11, i12, cArr, i13, rVarArr);
            }
        }
        return new c(str).i(this, i11, i12, null, -1, null);
    }

    private int[] k(int i11) {
        char[] cArr = new char[i11];
        int e11 = e();
        for (int I = I(e11 - 2); I > 0; I--) {
            String H = H(e11, cArr);
            int t11 = t(e11 + 2);
            int i12 = e11 + 6;
            if ("BootstrapMethods".equals(H)) {
                int I2 = I(i12);
                int[] iArr = new int[I2];
                int i13 = i12 + 2;
                for (int i14 = 0; i14 < I2; i14++) {
                    iArr[i14] = i13;
                    i13 += (I(i13 + 2) * 2) + 4;
                }
                return iArr;
            }
            e11 = i12 + t11;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Removed duplicated region for block: B:231:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x07c2 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void n(mq.s r40, mq.j r41, int r42) {
        /*
            Method dump skipped, instructions count: 3368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mq.e.n(mq.s, mq.j, int):void");
    }

    private h p(int i11, char[] cArr) {
        h hVar = this.f38732e[i11];
        if (hVar != null) {
            return hVar;
        }
        int[] iArr = this.f38730c;
        int i12 = iArr[i11];
        int i13 = iArr[I(i12 + 2)];
        String H = H(i13, cArr);
        String H2 = H(i13 + 2, cArr);
        int i14 = this.f38733f[I(i12)];
        p pVar = (p) o(I(i14), cArr);
        int I = I(i14 + 2);
        Object[] objArr = new Object[I];
        int i15 = i14 + 4;
        for (int i16 = 0; i16 < I; i16++) {
            objArr[i16] = o(I(i15), cArr);
            i15 += 2;
        }
        h[] hVarArr = this.f38732e;
        h hVar2 = new h(H, H2, pVar, objArr);
        hVarArr[i11] = hVar2;
        return hVar2;
    }

    private int q(a aVar, int i11, String str, char[] cArr) {
        Object obj;
        int i12 = 0;
        if (aVar == null) {
            int i13 = this.f38729b[i11] & 255;
            if (i13 != 64) {
                if (i13 != 91) {
                    return i13 != 101 ? i11 + 3 : i11 + 5;
                }
                return r(null, i11 + 1, false, cArr);
            }
            return r(null, i11 + 3, true, cArr);
        }
        int i14 = i11 + 1;
        int i15 = this.f38729b[i11] & 255;
        if (i15 != 64) {
            if (i15 != 70) {
                if (i15 == 83) {
                    aVar.a(str, Short.valueOf((short) t(this.f38730c[I(i14)])));
                } else if (i15 == 99) {
                    aVar.a(str, b0.n(H(i14, cArr)));
                } else if (i15 == 101) {
                    aVar.e(str, H(i14, cArr), H(i14 + 2, cArr));
                    return i14 + 4;
                } else if (i15 == 115) {
                    aVar.a(str, H(i14, cArr));
                } else if (i15 != 73 && i15 != 74) {
                    if (i15 == 90) {
                        if (t(this.f38730c[I(i14)]) == 0) {
                            obj = Boolean.FALSE;
                        } else {
                            obj = Boolean.TRUE;
                        }
                        aVar.a(str, obj);
                    } else if (i15 != 91) {
                        switch (i15) {
                            case 66:
                                aVar.a(str, Byte.valueOf((byte) t(this.f38730c[I(i14)])));
                                break;
                            case 67:
                                aVar.a(str, Character.valueOf((char) t(this.f38730c[I(i14)])));
                                break;
                            case 68:
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    } else {
                        int I = I(i14);
                        int i16 = i14 + 2;
                        if (I == 0) {
                            return r(aVar.c(str), i16 - 2, false, cArr);
                        }
                        int i17 = this.f38729b[i16] & 255;
                        if (i17 == 70) {
                            float[] fArr = new float[I];
                            while (i12 < I) {
                                fArr[i12] = Float.intBitsToFloat(t(this.f38730c[I(i16 + 1)]));
                                i16 += 3;
                                i12++;
                            }
                            aVar.a(str, fArr);
                            return i16;
                        } else if (i17 == 83) {
                            short[] sArr = new short[I];
                            while (i12 < I) {
                                sArr[i12] = (short) t(this.f38730c[I(i16 + 1)]);
                                i16 += 3;
                                i12++;
                            }
                            aVar.a(str, sArr);
                            return i16;
                        } else if (i17 == 90) {
                            boolean[] zArr = new boolean[I];
                            for (int i18 = 0; i18 < I; i18++) {
                                zArr[i18] = t(this.f38730c[I(i16 + 1)]) != 0;
                                i16 += 3;
                            }
                            aVar.a(str, zArr);
                            return i16;
                        } else if (i17 == 73) {
                            int[] iArr = new int[I];
                            while (i12 < I) {
                                iArr[i12] = t(this.f38730c[I(i16 + 1)]);
                                i16 += 3;
                                i12++;
                            }
                            aVar.a(str, iArr);
                            return i16;
                        } else if (i17 != 74) {
                            switch (i17) {
                                case 66:
                                    byte[] bArr = new byte[I];
                                    while (i12 < I) {
                                        bArr[i12] = (byte) t(this.f38730c[I(i16 + 1)]);
                                        i16 += 3;
                                        i12++;
                                    }
                                    aVar.a(str, bArr);
                                    return i16;
                                case 67:
                                    char[] cArr2 = new char[I];
                                    while (i12 < I) {
                                        cArr2[i12] = (char) t(this.f38730c[I(i16 + 1)]);
                                        i16 += 3;
                                        i12++;
                                    }
                                    aVar.a(str, cArr2);
                                    return i16;
                                case 68:
                                    double[] dArr = new double[I];
                                    while (i12 < I) {
                                        dArr[i12] = Double.longBitsToDouble(v(this.f38730c[I(i16 + 1)]));
                                        i16 += 3;
                                        i12++;
                                    }
                                    aVar.a(str, dArr);
                                    return i16;
                                default:
                                    return r(aVar.c(str), i16 - 2, false, cArr);
                            }
                        } else {
                            long[] jArr = new long[I];
                            while (i12 < I) {
                                jArr[i12] = v(this.f38730c[I(i16 + 1)]);
                                i16 += 3;
                                i12++;
                            }
                            aVar.a(str, jArr);
                            return i16;
                        }
                    }
                }
                return i14 + 2;
            }
            aVar.a(str, o(I(i14), cArr));
            return i14 + 2;
        }
        return r(aVar.b(str, H(i14, cArr)), i14 + 2, true, cArr);
    }

    private int r(a aVar, int i11, boolean z11, char[] cArr) {
        int I = I(i11);
        int i12 = i11 + 2;
        if (!z11) {
            while (true) {
                int i13 = I - 1;
                if (I <= 0) {
                    break;
                }
                i12 = q(aVar, i12, null, cArr);
                I = i13;
            }
        } else {
            while (true) {
                int i14 = I - 1;
                if (I <= 0) {
                    break;
                }
                i12 = q(aVar, i12 + 2, H(i12, cArr), cArr);
                I = i14;
            }
        }
        if (aVar != null) {
            aVar.d();
        }
        return i12;
    }

    private int s(f fVar, j jVar, int i11) {
        int i12;
        int i13;
        j jVar2 = jVar;
        char[] cArr = jVar2.f38767c;
        int I = I(i11);
        String H = H(i11 + 2, cArr);
        String H2 = H(i11 + 4, cArr);
        int i14 = i11 + 6;
        int I2 = I(i14);
        int i15 = i14 + 2;
        int i16 = I;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i21 = 0;
        c cVar = null;
        String str = null;
        Object obj = null;
        while (true) {
            int i22 = I2 - 1;
            if (I2 <= 0) {
                break;
            }
            String H3 = H(i15, cArr);
            int t11 = t(i15 + 2);
            int i23 = i15 + 6;
            if ("ConstantValue".equals(H3)) {
                int I3 = I(i23);
                obj = I3 == 0 ? null : o(I3, cArr);
            } else if ("Signature".equals(H3)) {
                str = H(i23, cArr);
            } else {
                if ("Deprecated".equals(H3)) {
                    i13 = 131072 | i16;
                } else if ("Synthetic".equals(H3)) {
                    i13 = i16 | 4096;
                } else {
                    if ("RuntimeVisibleAnnotations".equals(H3)) {
                        i21 = i23;
                        i12 = i21;
                    } else if ("RuntimeVisibleTypeAnnotations".equals(H3)) {
                        i18 = i23;
                        i12 = i18;
                    } else if ("RuntimeInvisibleAnnotations".equals(H3)) {
                        i19 = i23;
                        i12 = i19;
                    } else if ("RuntimeInvisibleTypeAnnotations".equals(H3)) {
                        i17 = i23;
                        i12 = i17;
                    } else {
                        i12 = i23;
                        c cVar2 = cVar;
                        cVar = j(jVar2.f38765a, H3, i12, t11, cArr, -1, null);
                        cVar.f38721c = cVar2;
                        i19 = i19;
                        i21 = i21;
                        i17 = i17;
                        i18 = i18;
                    }
                    i15 = i12 + t11;
                    jVar2 = jVar;
                    I2 = i22;
                }
                i16 = i13;
            }
            i12 = i23;
            i15 = i12 + t11;
            jVar2 = jVar;
            I2 = i22;
        }
        c cVar3 = cVar;
        int i24 = i17;
        int i25 = i18;
        int i26 = i19;
        int i27 = i21;
        m e11 = fVar.e(i16, H, H2, str, obj);
        if (e11 == null) {
            return i15;
        }
        if (i27 != 0) {
            int I4 = I(i27);
            int i28 = i27 + 2;
            while (true) {
                int i29 = I4 - 1;
                if (I4 <= 0) {
                    break;
                }
                i28 = r(e11.a(H(i28, cArr), true), i28 + 2, true, cArr);
                I4 = i29;
            }
        }
        if (i26 != 0) {
            int I5 = I(i26);
            int i31 = i26 + 2;
            while (true) {
                int i32 = I5 - 1;
                if (I5 <= 0) {
                    break;
                }
                i31 = r(e11.a(H(i31, cArr), false), i31 + 2, true, cArr);
                I5 = i32;
            }
        }
        if (i25 != 0) {
            int I6 = I(i25);
            int i33 = i25 + 2;
            while (true) {
                int i34 = I6 - 1;
                if (I6 <= 0) {
                    break;
                }
                int F = F(jVar, i33);
                i33 = r(e11.d(jVar.f38772h, jVar.f38773i, H(F, cArr), true), F + 2, true, cArr);
                I6 = i34;
            }
        }
        if (i24 != 0) {
            int I7 = I(i24);
            int i35 = i24 + 2;
            while (true) {
                int i36 = I7 - 1;
                if (I7 <= 0) {
                    break;
                }
                int F2 = F(jVar, i35);
                i35 = r(e11.d(jVar.f38772h, jVar.f38773i, H(F2, cArr), false), F2 + 2, true, cArr);
                I7 = i36;
            }
        }
        while (true) {
            c cVar4 = cVar3;
            if (cVar4 != null) {
                cVar3 = cVar4.f38721c;
                cVar4.f38721c = null;
                e11.b(cVar4);
            } else {
                e11.c();
                return i15;
            }
        }
    }

    private int w(f fVar, j jVar, int i11) {
        int i12;
        int i13;
        int i14;
        char[] cArr = jVar.f38767c;
        jVar.f38768d = I(i11);
        jVar.f38769e = H(i11 + 2, cArr);
        int i15 = i11 + 4;
        jVar.f38770f = H(i15, cArr);
        int i16 = i11 + 6;
        int I = I(i16);
        int i17 = i16 + 2;
        int i18 = 0;
        int i19 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        c cVar = null;
        boolean z11 = false;
        int i25 = 0;
        String[] strArr = null;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        while (true) {
            int i31 = I - 1;
            if (I <= 0) {
                break;
            }
            String H = H(i17, cArr);
            int t11 = t(i17 + 2);
            int i32 = i17 + 6;
            int i33 = i18;
            if ("Code".equals(H)) {
                if ((jVar.f38766b & 1) == 0) {
                    i29 = i32;
                    i18 = i33;
                    i14 = i29;
                    i17 = i14 + t11;
                    I = i31;
                } else {
                    i12 = i19;
                    i13 = i21;
                    i18 = i33;
                    i19 = i12;
                    i21 = i13;
                }
            } else {
                if ("Exceptions".equals(H)) {
                    int I2 = I(i32);
                    String[] strArr2 = new String[I2];
                    int i34 = i19;
                    int i35 = i21;
                    int i36 = i32 + 2;
                    for (int i37 = 0; i37 < I2; i37++) {
                        strArr2[i37] = m(i36, cArr);
                        i36 += 2;
                    }
                    strArr = strArr2;
                    i25 = i32;
                    i18 = i33;
                    i19 = i34;
                    i21 = i35;
                    i14 = i25;
                } else {
                    i12 = i19;
                    i13 = i21;
                    if ("Signature".equals(H)) {
                        i24 = I(i32);
                    } else if ("Deprecated".equals(H)) {
                        jVar.f38768d |= 131072;
                    } else if ("RuntimeVisibleAnnotations".equals(H)) {
                        i21 = i32;
                        i18 = i33;
                        i19 = i12;
                        i14 = i21;
                    } else if ("RuntimeVisibleTypeAnnotations".equals(H)) {
                        i18 = i32;
                        i14 = i18;
                        i19 = i12;
                        i21 = i13;
                    } else if ("AnnotationDefault".equals(H)) {
                        i22 = i32;
                        i18 = i33;
                        i19 = i12;
                        i21 = i13;
                        i14 = i22;
                    } else if ("Synthetic".equals(H)) {
                        jVar.f38768d |= 4096;
                        i18 = i33;
                        i19 = i12;
                        i21 = i13;
                        z11 = true;
                    } else if ("RuntimeInvisibleAnnotations".equals(H)) {
                        i19 = i32;
                        i18 = i33;
                        i21 = i13;
                        i14 = i19;
                    } else if ("RuntimeInvisibleTypeAnnotations".equals(H)) {
                        i26 = i32;
                        i18 = i33;
                        i19 = i12;
                        i21 = i13;
                        i14 = i26;
                    } else if ("RuntimeVisibleParameterAnnotations".equals(H)) {
                        i27 = i32;
                        i18 = i33;
                        i19 = i12;
                        i21 = i13;
                        i14 = i27;
                    } else if ("RuntimeInvisibleParameterAnnotations".equals(H)) {
                        i28 = i32;
                        i18 = i33;
                        i19 = i12;
                        i21 = i13;
                        i14 = i28;
                    } else if ("MethodParameters".equals(H)) {
                        i23 = i32;
                        i18 = i33;
                        i19 = i12;
                        i21 = i13;
                        i14 = i23;
                    } else {
                        i14 = i32;
                        c j11 = j(jVar.f38765a, H, i32, t11, cArr, -1, null);
                        j11.f38721c = cVar;
                        cVar = j11;
                        i24 = i24;
                        i19 = i12;
                        i21 = i13;
                        i18 = i33;
                        i22 = i22;
                        i23 = i23;
                    }
                    i18 = i33;
                    i19 = i12;
                    i21 = i13;
                }
                i17 = i14 + t11;
                I = i31;
            }
            i14 = i32;
            i17 = i14 + t11;
            I = i31;
        }
        int i38 = i18;
        int i39 = i19;
        int i41 = i21;
        int i42 = i22;
        int i43 = i23;
        int i44 = i24;
        s g11 = fVar.g(jVar.f38768d, jVar.f38769e, jVar.f38770f, i44 == 0 ? null : K(i44, cArr), strArr);
        if (g11 == null) {
            return i17;
        }
        if (g11 instanceof t) {
            t tVar = (t) g11;
            if (tVar.G(this, z11, (jVar.f38768d & 131072) != 0, I(i15), i44, i25)) {
                tVar.S(i11, i17 - i11);
                return i17;
            }
        }
        if (i43 != 0 && (jVar.f38766b & 2) == 0) {
            int l11 = l(i43);
            int i45 = i43 + 1;
            while (true) {
                int i46 = l11 - 1;
                if (l11 <= 0) {
                    break;
                }
                g11.x(H(i45, cArr), I(i45 + 2));
                i45 += 4;
                l11 = i46;
            }
        }
        if (i42 != 0) {
            a c11 = g11.c();
            q(c11, i42, null, cArr);
            if (c11 != null) {
                c11.d();
            }
        }
        if (i41 != 0) {
            int I3 = I(i41);
            int i47 = i41 + 2;
            while (true) {
                int i48 = I3 - 1;
                if (I3 <= 0) {
                    break;
                }
                i47 = r(g11.b(H(i47, cArr), true), i47 + 2, true, cArr);
                I3 = i48;
            }
        }
        if (i39 != 0) {
            int I4 = I(i39);
            int i49 = i39 + 2;
            while (true) {
                int i51 = I4 - 1;
                if (I4 <= 0) {
                    break;
                }
                i49 = r(g11.b(H(i49, cArr), false), i49 + 2, true, cArr);
                I4 = i51;
            }
        }
        if (i38 != 0) {
            int I5 = I(i38);
            int i52 = i38 + 2;
            while (true) {
                int i53 = I5 - 1;
                if (I5 <= 0) {
                    break;
                }
                int F = F(jVar, i52);
                i52 = r(g11.C(jVar.f38772h, jVar.f38773i, H(F, cArr), true), F + 2, true, cArr);
                I5 = i53;
            }
        }
        int i54 = i26;
        if (i54 != 0) {
            int I6 = I(i54);
            int i55 = i54 + 2;
            while (true) {
                int i56 = I6 - 1;
                if (I6 <= 0) {
                    break;
                }
                int F2 = F(jVar, i55);
                i55 = r(g11.C(jVar.f38772h, jVar.f38773i, H(F2, cArr), false), F2 + 2, true, cArr);
                I6 = i56;
            }
        }
        int i57 = i27;
        if (i57 != 0) {
            A(g11, jVar, i57, true);
        }
        int i58 = i28;
        if (i58 != 0) {
            A(g11, jVar, i58, false);
        }
        while (cVar != null) {
            c cVar2 = cVar.f38721c;
            cVar.f38721c = null;
            g11.d(cVar);
            cVar = cVar2;
        }
        int i59 = i29;
        if (i59 != 0) {
            g11.e();
            n(g11, jVar, i59);
        }
        g11.f();
        return i17;
    }

    private void y(f fVar, j jVar, int i11, int i12, String str) {
        String[] strArr;
        char[] cArr = jVar.f38767c;
        int i13 = i11 + 6;
        u h11 = fVar.h(x(i11, cArr), I(i11 + 2), H(i11 + 4, cArr));
        if (h11 == null) {
            return;
        }
        if (str != null) {
            h11.c(str);
        }
        if (i12 != 0) {
            int I = I(i12);
            int i14 = i12 + 2;
            while (true) {
                int i15 = I - 1;
                if (I <= 0) {
                    break;
                }
                h11.e(z(i14, cArr));
                i14 += 2;
                I = i15;
            }
        }
        int I2 = I(i13);
        int i16 = i13 + 2;
        while (true) {
            int i17 = I2 - 1;
            if (I2 <= 0) {
                break;
            }
            i16 += 6;
            h11.g(x(i16, cArr), I(i16 + 2), H(i16 + 4, cArr));
            I2 = i17;
        }
        int I3 = I(i16);
        int i18 = i16 + 2;
        while (true) {
            int i19 = I3 - 1;
            String[] strArr2 = null;
            if (I3 <= 0) {
                break;
            }
            String z11 = z(i18, cArr);
            int I4 = I(i18 + 2);
            int I5 = I(i18 + 4);
            i18 += 6;
            if (I5 != 0) {
                strArr2 = new String[I5];
                for (int i21 = 0; i21 < I5; i21++) {
                    strArr2[i21] = x(i18, cArr);
                    i18 += 2;
                }
            }
            h11.b(z11, I4, strArr2);
            I3 = i19;
        }
        int I6 = I(i18);
        int i22 = i18 + 2;
        while (true) {
            int i23 = I6 - 1;
            if (I6 <= 0) {
                break;
            }
            String z12 = z(i22, cArr);
            int I7 = I(i22 + 2);
            int I8 = I(i22 + 4);
            i22 += 6;
            if (I8 != 0) {
                strArr = new String[I8];
                for (int i24 = 0; i24 < I8; i24++) {
                    strArr[i24] = x(i22, cArr);
                    i22 += 2;
                }
            } else {
                strArr = null;
            }
            h11.d(z12, I7, strArr);
            I6 = i23;
        }
        int I9 = I(i22);
        int i25 = i22 + 2;
        while (true) {
            int i26 = I9 - 1;
            if (I9 <= 0) {
                break;
            }
            h11.h(m(i25, cArr));
            i25 += 2;
            I9 = i26;
        }
        int I10 = I(i25);
        int i27 = i25 + 2;
        while (true) {
            int i28 = I10 - 1;
            if (I10 > 0) {
                String m11 = m(i27, cArr);
                int I11 = I(i27 + 2);
                i27 += 4;
                String[] strArr3 = new String[I11];
                for (int i29 = 0; i29 < I11; i29++) {
                    strArr3[i29] = m(i27, cArr);
                    i27 += 2;
                }
                h11.f(m11, strArr3);
                I10 = i28;
            } else {
                h11.a();
                return;
            }
        }
    }

    public short C(int i11) {
        byte[] bArr = this.f38729b;
        return (short) ((bArr[i11 + 1] & 255) | ((bArr[i11] & 255) << 8));
    }

    public String H(int i11, char[] cArr) {
        int I = I(i11);
        if (i11 == 0 || I == 0) {
            return null;
        }
        return K(I, cArr);
    }

    public int I(int i11) {
        byte[] bArr = this.f38729b;
        return (bArr[i11 + 1] & 255) | ((bArr[i11] & 255) << 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String K(int i11, char[] cArr) {
        String[] strArr = this.f38731d;
        String str = strArr[i11];
        if (str != null) {
            return str;
        }
        int i12 = this.f38730c[i11];
        String J = J(i12 + 2, I(i12), cArr);
        strArr[i11] = J;
        return J;
    }

    public void a(f fVar, c[] cVarArr, int i11) {
        int i12;
        int i13;
        int i14;
        String[] strArr;
        j jVar = new j();
        jVar.f38765a = cVarArr;
        jVar.f38766b = i11;
        char[] cArr = new char[this.f38734g];
        jVar.f38767c = cArr;
        int i15 = this.f38728a;
        int I = I(i15);
        String m11 = m(i15 + 2, cArr);
        String m12 = m(i15 + 4, cArr);
        int I2 = I(i15 + 6);
        String[] strArr2 = new String[I2];
        int i16 = i15 + 8;
        for (int i17 = 0; i17 < I2; i17++) {
            strArr2[i17] = m(i16, cArr);
            i16 += 2;
        }
        int e11 = e();
        int i18 = I;
        int I3 = I(e11 - 2);
        String str = null;
        String str2 = null;
        int i19 = 0;
        String str3 = null;
        int i21 = 0;
        String str4 = null;
        String str5 = null;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        c cVar = null;
        int i28 = 0;
        int i29 = 0;
        int i31 = 0;
        while (I3 > 0) {
            String H = H(e11, cArr);
            int t11 = t(e11 + 2);
            int i32 = e11 + 6;
            String str6 = str;
            if ("SourceFile".equals(H)) {
                i12 = i32;
                str2 = H(i32, cArr);
            } else if ("InnerClasses".equals(H)) {
                i29 = i32;
                i12 = i29;
            } else if ("EnclosingMethod".equals(H)) {
                i22 = i32;
                i12 = i22;
            } else if ("NestHost".equals(H)) {
                i12 = i32;
                str5 = m(i32, cArr);
            } else if ("NestMembers".equals(H)) {
                i27 = i32;
                i12 = i27;
            } else if ("PermittedSubclasses".equals(H)) {
                i28 = i32;
                i12 = i28;
            } else {
                if ("Signature".equals(H)) {
                    str3 = H(i32, cArr);
                } else if ("RuntimeVisibleAnnotations".equals(H)) {
                    i23 = i32;
                    i12 = i23;
                } else if ("RuntimeVisibleTypeAnnotations".equals(H)) {
                    i25 = i32;
                    i12 = i25;
                } else if ("Deprecated".equals(H)) {
                    i18 |= 131072;
                } else if ("Synthetic".equals(H)) {
                    i18 |= 4096;
                } else if ("SourceDebugExtension".equals(H)) {
                    if (t11 <= this.f38729b.length - i32) {
                        str = J(i32, t11, new char[t11]);
                        i12 = i32;
                        i13 = i16;
                        i14 = t11;
                        strArr = strArr2;
                        e11 = i12 + i14;
                        I3--;
                        strArr2 = strArr;
                        i16 = i13;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else if ("RuntimeInvisibleAnnotations".equals(H)) {
                    i24 = i32;
                    i12 = i24;
                } else if ("RuntimeInvisibleTypeAnnotations".equals(H)) {
                    i26 = i32;
                    i12 = i26;
                } else if ("Record".equals(H)) {
                    i18 |= 65536;
                    i31 = i32;
                    i12 = i31;
                } else if ("Module".equals(H)) {
                    i19 = i32;
                    i12 = i19;
                } else if ("ModuleMainClass".equals(H)) {
                    str4 = m(i32, cArr);
                } else if ("ModulePackages".equals(H)) {
                    i21 = i32;
                    i12 = i21;
                } else {
                    if ("BootstrapMethods".equals(H)) {
                        i12 = i32;
                        i13 = i16;
                        i14 = t11;
                        strArr = strArr2;
                        str = str6;
                    } else {
                        i12 = i32;
                        i13 = i16;
                        i14 = t11;
                        strArr = strArr2;
                        c j11 = j(cVarArr, H, i12, t11, cArr, -1, null);
                        j11.f38721c = cVar;
                        cVar = j11;
                        i18 = i18;
                        str = str6;
                        str2 = str2;
                    }
                    e11 = i12 + i14;
                    I3--;
                    strArr2 = strArr;
                    i16 = i13;
                }
                i12 = i32;
            }
            i13 = i16;
            i14 = t11;
            strArr = strArr2;
            str = str6;
            e11 = i12 + i14;
            I3--;
            strArr2 = strArr;
            i16 = i13;
        }
        String str7 = str;
        String str8 = str2;
        int i33 = i16;
        String[] strArr3 = strArr2;
        c cVar2 = cVar;
        fVar.a(t(this.f38730c[1] - 7), i18, m11, str3, m12, strArr3);
        if ((i11 & 2) == 0 && (str8 != null || str7 != null)) {
            fVar.n(str8, str7);
        }
        if (i19 != 0) {
            y(fVar, jVar, i19, i21, str4);
        }
        String str9 = str5;
        if (str9 != null) {
            fVar.i(str9);
        }
        int i34 = i22;
        if (i34 != 0) {
            String m13 = m(i34, cArr);
            int I4 = I(i34 + 2);
            fVar.k(m13, I4 == 0 ? null : H(this.f38730c[I4], cArr), I4 == 0 ? null : H(this.f38730c[I4] + 2, cArr));
        }
        int i35 = i23;
        if (i35 != 0) {
            int I5 = I(i35);
            int i36 = i35 + 2;
            while (true) {
                int i37 = I5 - 1;
                if (I5 <= 0) {
                    break;
                }
                i36 = r(fVar.b(H(i36, cArr), true), i36 + 2, true, cArr);
                I5 = i37;
            }
        }
        int i38 = i24;
        if (i38 != 0) {
            int I6 = I(i38);
            int i39 = i38 + 2;
            while (true) {
                int i41 = I6 - 1;
                if (I6 <= 0) {
                    break;
                }
                i39 = r(fVar.b(H(i39, cArr), false), i39 + 2, true, cArr);
                I6 = i41;
            }
        }
        int i42 = i25;
        if (i42 != 0) {
            int I7 = I(i42);
            int i43 = i42 + 2;
            while (true) {
                int i44 = I7 - 1;
                if (I7 <= 0) {
                    break;
                }
                int F = F(jVar, i43);
                i43 = r(fVar.o(jVar.f38772h, jVar.f38773i, H(F, cArr), true), F + 2, true, cArr);
                I7 = i44;
            }
        }
        int i45 = i26;
        if (i45 != 0) {
            int I8 = I(i45);
            int i46 = i45 + 2;
            while (true) {
                int i47 = I8 - 1;
                if (I8 <= 0) {
                    break;
                }
                int F2 = F(jVar, i46);
                i46 = r(fVar.o(jVar.f38772h, jVar.f38773i, H(F2, cArr), false), F2 + 2, true, cArr);
                I8 = i47;
            }
        }
        while (cVar2 != null) {
            c cVar3 = cVar2.f38721c;
            cVar2.f38721c = null;
            fVar.c(cVar2);
            cVar2 = cVar3;
        }
        int i48 = i27;
        if (i48 != 0) {
            int I9 = I(i48);
            int i49 = i48 + 2;
            while (true) {
                int i51 = I9 - 1;
                if (I9 <= 0) {
                    break;
                }
                fVar.j(m(i49, cArr));
                i49 += 2;
                I9 = i51;
            }
        }
        int i52 = i28;
        if (i52 != 0) {
            int I10 = I(i52);
            int i53 = i52 + 2;
            while (true) {
                int i54 = I10 - 1;
                if (I10 <= 0) {
                    break;
                }
                fVar.l(m(i53, cArr));
                i53 += 2;
                I10 = i54;
            }
        }
        int i55 = i29;
        if (i55 != 0) {
            int I11 = I(i55);
            int i56 = i55 + 2;
            while (true) {
                int i57 = I11 - 1;
                if (I11 <= 0) {
                    break;
                }
                fVar.f(m(i56, cArr), m(i56 + 2, cArr), H(i56 + 4, cArr), I(i56 + 6));
                i56 += 8;
                I11 = i57;
            }
        }
        int i58 = i31;
        if (i58 != 0) {
            int I12 = I(i58);
            int i59 = i58 + 2;
            while (true) {
                int i61 = I12 - 1;
                if (I12 <= 0) {
                    break;
                }
                i59 = B(fVar, jVar, i59);
                I12 = i61;
            }
        }
        int I13 = I(i33);
        int i62 = i33 + 2;
        while (true) {
            int i63 = I13 - 1;
            if (I13 <= 0) {
                break;
            }
            i62 = s(fVar, jVar, i62);
            I13 = i63;
        }
        int I14 = I(i62);
        int i64 = i62 + 2;
        while (true) {
            int i65 = I14 - 1;
            if (I14 > 0) {
                i64 = w(fVar, jVar, i64);
                I14 = i65;
            } else {
                fVar.d();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int e() {
        int i11 = this.f38728a;
        int I = i11 + 8 + (I(i11 + 6) * 2);
        int I2 = I(I);
        int i12 = I + 2;
        while (true) {
            int i13 = I2 - 1;
            if (I2 <= 0) {
                break;
            }
            int I3 = I(i12 + 6);
            i12 += 8;
            while (true) {
                int i14 = I3 - 1;
                if (I3 > 0) {
                    i12 += t(i12 + 2) + 6;
                    I3 = i14;
                }
            }
            I2 = i13;
        }
        int I4 = I(i12);
        int i15 = i12 + 2;
        while (true) {
            int i16 = I4 - 1;
            if (I4 <= 0) {
                return i15 + 2;
            }
            int I5 = I(i15 + 6);
            i15 += 8;
            while (true) {
                int i17 = I5 - 1;
                if (I5 > 0) {
                    i15 += t(i15 + 2) + 6;
                    I5 = i17;
                }
            }
            I4 = i16;
        }
    }

    public int f(int i11) {
        return this.f38730c[i11];
    }

    public int g() {
        return this.f38730c.length;
    }

    public int h() {
        return this.f38734g;
    }

    public int l(int i11) {
        return this.f38729b[i11] & 255;
    }

    public String m(int i11, char[] cArr) {
        return E(i11, cArr);
    }

    public Object o(int i11, char[] cArr) {
        int i12 = this.f38730c[i11];
        byte b11 = this.f38729b[i12 - 1];
        switch (b11) {
            case 3:
                return Integer.valueOf(t(i12));
            case 4:
                return Float.valueOf(Float.intBitsToFloat(t(i12)));
            case 5:
                return Long.valueOf(v(i12));
            case 6:
                return Double.valueOf(Double.longBitsToDouble(v(i12)));
            case 7:
                return b0.j(H(i12, cArr));
            case 8:
                return H(i12, cArr);
            default:
                switch (b11) {
                    case 15:
                        int l11 = l(i12);
                        int i13 = this.f38730c[I(i12 + 1)];
                        int i14 = this.f38730c[I(i13 + 2)];
                        return new p(l11, m(i13, cArr), H(i14, cArr), H(i14 + 2, cArr), this.f38729b[i13 - 1] == 11);
                    case 16:
                        return b0.i(H(i12, cArr));
                    case 17:
                        return p(i11, cArr);
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    public int t(int i11) {
        byte[] bArr = this.f38729b;
        return (bArr[i11 + 3] & 255) | ((bArr[i11] & 255) << 24) | ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11 + 2] & 255) << 8);
    }

    protected r u(int i11, r[] rVarArr) {
        if (rVarArr[i11] == null) {
            rVarArr[i11] = new r();
        }
        return rVarArr[i11];
    }

    public long v(int i11) {
        return (t(i11) << 32) | (t(i11 + 4) & 4294967295L);
    }

    public String x(int i11, char[] cArr) {
        return E(i11, cArr);
    }

    public String z(int i11, char[] cArr) {
        return E(i11, cArr);
    }
}