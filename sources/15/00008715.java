package mq;

import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.spongycastle.pqc.math.linearalgebra.Matrix;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class o {

    /* renamed from: a */
    r f38799a;

    /* renamed from: b */
    private int[] f38800b;

    /* renamed from: c */
    private int[] f38801c;

    /* renamed from: d */
    private int[] f38802d;

    /* renamed from: e */
    private int[] f38803e;

    /* renamed from: f */
    private short f38804f;

    /* renamed from: g */
    private short f38805g;

    /* renamed from: h */
    private int f38806h;

    /* renamed from: i */
    private int[] f38807i;

    public o(r rVar) {
        this.f38799a = rVar;
    }

    private void b(int i11) {
        if (this.f38807i == null) {
            this.f38807i = new int[2];
        }
        int length = this.f38807i.length;
        int i12 = this.f38806h;
        if (i12 >= length) {
            int[] iArr = new int[Math.max(i12 + 1, length * 2)];
            System.arraycopy(this.f38807i, 0, iArr, 0, length);
            this.f38807i = iArr;
        }
        int[] iArr2 = this.f38807i;
        int i13 = this.f38806h;
        this.f38806h = i13 + 1;
        iArr2[i13] = i11;
    }

    public static int e(a0 a0Var, Object obj) {
        if (obj instanceof Integer) {
            return 4194304 | ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            return f(a0Var, b0.j((String) obj).d(), 0);
        }
        return a0Var.K("", ((r) obj).f38823d) | 12582912;
    }

    private static int f(a0 a0Var, String str, int i11) {
        char charAt = str.charAt(i11);
        int i12 = 4194306;
        if (charAt != 'F') {
            if (charAt != 'L') {
                if (charAt != 'S') {
                    if (charAt == 'V') {
                        return 0;
                    }
                    if (charAt != 'I') {
                        if (charAt == 'J') {
                            return 4194308;
                        }
                        if (charAt != 'Z') {
                            if (charAt != '[') {
                                switch (charAt) {
                                    case 'B':
                                    case 'C':
                                        break;
                                    case 'D':
                                        return 4194307;
                                    default:
                                        throw new IllegalArgumentException();
                                }
                            } else {
                                int i13 = i11 + 1;
                                while (str.charAt(i13) == '[') {
                                    i13++;
                                }
                                char charAt2 = str.charAt(i13);
                                if (charAt2 != 'F') {
                                    if (charAt2 == 'L') {
                                        i12 = a0Var.I(str.substring(i13 + 1, str.length() - 1)) | 8388608;
                                    } else if (charAt2 == 'S') {
                                        i12 = 4194316;
                                    } else if (charAt2 == 'Z') {
                                        i12 = 4194313;
                                    } else if (charAt2 == 'I') {
                                        i12 = 4194305;
                                    } else if (charAt2 != 'J') {
                                        switch (charAt2) {
                                            case 'B':
                                                i12 = 4194314;
                                                break;
                                            case 'C':
                                                i12 = 4194315;
                                                break;
                                            case 'D':
                                                i12 = 4194307;
                                                break;
                                            default:
                                                throw new IllegalArgumentException();
                                        }
                                    } else {
                                        i12 = 4194308;
                                    }
                                }
                                return ((i13 - i11) << 26) | i12;
                            }
                        }
                    }
                }
                return 4194305;
            }
            return a0Var.I(str.substring(i11 + 1, str.length() - 1)) | 8388608;
        }
        return 4194306;
    }

    public static int g(a0 a0Var, String str) {
        return a0Var.I(str) | 8388608;
    }

    private int h(int i11, int i12) {
        int i13 = (-67108864) & i11;
        int i14 = 62914560 & i11;
        if (i14 == 16777216) {
            int i15 = i13 + this.f38800b[i11 & 1048575];
            if ((i11 & PKIFailureInfo.badCertTemplate) == 0 || !(i15 == 4194308 || i15 == 4194307)) {
                return i15;
            }
            return 4194304;
        } else if (i14 == 20971520) {
            int i16 = i13 + this.f38801c[i12 - (1048575 & i11)];
            if ((i11 & PKIFailureInfo.badCertTemplate) == 0 || !(i16 == 4194308 || i16 == 4194307)) {
                return i16;
            }
            return 4194304;
        } else {
            return i11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0051 A[LOOP:0: B:34:0x000d->B:50:0x0051, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0037 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int i(mq.a0 r9, int r10) {
        /*
            r8 = this;
            r0 = 4194310(0x400006, float:5.87748E-39)
            if (r10 == r0) goto Lc
            r1 = -4194304(0xffffffffffc00000, float:NaN)
            r1 = r1 & r10
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            if (r1 != r2) goto L54
        Lc:
            r1 = 0
        Ld:
            int r2 = r8.f38806h
            if (r1 >= r2) goto L54
            int[] r2 = r8.f38807i
            r2 = r2[r1]
            r3 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r3 = r3 & r2
            r4 = 62914560(0x3c00000, float:1.1284746E-36)
            r4 = r4 & r2
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r2 & r5
            r7 = 16777216(0x1000000, float:2.3509887E-38)
            if (r4 != r7) goto L2a
            int[] r2 = r8.f38800b
            r2 = r2[r6]
        L28:
            int r2 = r2 + r3
            goto L35
        L2a:
            r7 = 20971520(0x1400000, float:3.526483E-38)
            if (r4 != r7) goto L35
            int[] r2 = r8.f38801c
            int r4 = r2.length
            int r4 = r4 - r6
            r2 = r2[r4]
            goto L28
        L35:
            if (r10 != r2) goto L51
            r1 = 8388608(0x800000, float:1.17549435E-38)
            if (r10 != r0) goto L45
            java.lang.String r10 = r9.O()
            int r9 = r9.I(r10)
        L43:
            r9 = r9 | r1
            return r9
        L45:
            r10 = r10 & r5
            mq.z r10 = r9.T(r10)
            java.lang.String r10 = r10.f38899e
            int r9 = r9.I(r10)
            goto L43
        L51:
            int r1 = r1 + 1
            goto Ld
        L54:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: mq.o.i(mq.a0, int):int");
    }

    private int k(int i11) {
        int[] iArr = this.f38802d;
        if (iArr == null || i11 >= iArr.length) {
            return i11 | Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        int i12 = iArr[i11];
        if (i12 == 0) {
            int i13 = i11 | Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
            iArr[i11] = i13;
            return i13;
        }
        return i12;
    }

    private static boolean l(a0 a0Var, int i11, int[] iArr, int i12) {
        int min;
        int I;
        int i13 = iArr[i12];
        if (i13 == i11) {
            return false;
        }
        if ((67108863 & i11) == 4194309) {
            if (i13 == 4194309) {
                return false;
            }
            i11 = 4194309;
        }
        if (i13 == 0) {
            iArr[i12] = i11;
            return true;
        }
        int i14 = i13 & (-67108864);
        int i15 = 4194304;
        if (i14 != 0 || (i13 & 62914560) == 8388608) {
            if (i11 == 4194309) {
                return false;
            }
            if ((i11 & (-4194304)) != ((-4194304) & i13)) {
                int i16 = i11 & (-67108864);
                if (i16 != 0 || (i11 & 62914560) == 8388608) {
                    if (i16 != 0 && (i11 & 62914560) != 8388608) {
                        i16 -= 67108864;
                    }
                    if (i14 != 0 && (i13 & 62914560) != 8388608) {
                        i14 -= 67108864;
                    }
                    min = Math.min(i16, i14) | 8388608;
                    I = a0Var.I("java/lang/Object");
                    i15 = min | I;
                }
            } else if ((i13 & 62914560) == 8388608) {
                i15 = (i11 & (-67108864)) | 8388608 | a0Var.H(i11 & 1048575, 1048575 & i13);
            } else {
                min = ((i11 & (-67108864)) - 67108864) | 8388608;
                I = a0Var.I("java/lang/Object");
                i15 = min | I;
            }
        } else if (i13 == 4194309) {
            if ((i11 & (-67108864)) == 0 && (i11 & 62914560) != 8388608) {
                i11 = 4194304;
            }
            i15 = i11;
        }
        if (i15 != i13) {
            iArr[i12] = i15;
            return true;
        }
        return false;
    }

    private int n() {
        short s11 = this.f38805g;
        if (s11 > 0) {
            int[] iArr = this.f38803e;
            short s12 = (short) (s11 - 1);
            this.f38805g = s12;
            return iArr[s12];
        }
        short s13 = (short) (this.f38804f - 1);
        this.f38804f = s13;
        return 20971520 | (-s13);
    }

    private void o(int i11) {
        short s11 = this.f38805g;
        if (s11 >= i11) {
            this.f38805g = (short) (s11 - i11);
            return;
        }
        this.f38804f = (short) (this.f38804f - (i11 - s11));
        this.f38805g = (short) 0;
    }

    private void p(String str) {
        char charAt = str.charAt(0);
        if (charAt == '(') {
            o((b0.c(str) >> 2) - 1);
        } else if (charAt != 'J' && charAt != 'D') {
            o(1);
        } else {
            o(2);
        }
    }

    private void q(int i11) {
        if (this.f38803e == null) {
            this.f38803e = new int[10];
        }
        int length = this.f38803e.length;
        short s11 = this.f38805g;
        if (s11 >= length) {
            int[] iArr = new int[Math.max(s11 + 1, length * 2)];
            System.arraycopy(this.f38803e, 0, iArr, 0, length);
            this.f38803e = iArr;
        }
        int[] iArr2 = this.f38803e;
        short s12 = this.f38805g;
        short s13 = (short) (s12 + 1);
        this.f38805g = s13;
        iArr2[s12] = i11;
        short s14 = (short) (this.f38804f + s13);
        r rVar = this.f38799a;
        if (s14 > rVar.f38827h) {
            rVar.f38827h = s14;
        }
    }

    private void r(a0 a0Var, String str) {
        int f11 = f(a0Var, str, str.charAt(0) == '(' ? b0.k(str) : 0);
        if (f11 != 0) {
            q(f11);
            if (f11 == 4194308 || f11 == 4194307) {
                q(4194304);
            }
        }
    }

    public static void s(a0 a0Var, int i11, d dVar) {
        int i12 = ((-67108864) & i11) >> 26;
        if (i12 == 0) {
            int i13 = i11 & 1048575;
            int i14 = i11 & 62914560;
            if (i14 == 4194304) {
                dVar.g(i13);
                return;
            } else if (i14 == 8388608) {
                dVar.g(7).k(a0Var.e(a0Var.T(i13).f38899e).f38895a);
                return;
            } else if (i14 == 12582912) {
                dVar.g(8).k((int) a0Var.T(i13).f38900f);
                return;
            } else {
                throw new AssertionError();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i15 = i12 - 1;
            if (i12 <= 0) {
                break;
            }
            sb2.append('[');
            i12 = i15;
        }
        if ((i11 & 62914560) == 8388608) {
            sb2.append(Matrix.MATRIX_TYPE_RANDOM_LT);
            sb2.append(a0Var.T(i11 & 1048575).f38899e);
            sb2.append(';');
        } else {
            int i16 = i11 & 1048575;
            if (i16 == 1) {
                sb2.append('I');
            } else if (i16 == 2) {
                sb2.append('F');
            } else if (i16 == 3) {
                sb2.append('D');
            } else if (i16 != 4) {
                switch (i16) {
                    case 9:
                        sb2.append(Matrix.MATRIX_TYPE_ZERO);
                        break;
                    case 10:
                        sb2.append('B');
                        break;
                    case 11:
                        sb2.append('C');
                        break;
                    case 12:
                        sb2.append('S');
                        break;
                    default:
                        throw new AssertionError();
                }
            } else {
                sb2.append('J');
            }
        }
        dVar.g(7).k(a0Var.e(sb2.toString()).f38895a);
    }

    private void v(int i11, int i12) {
        if (this.f38802d == null) {
            this.f38802d = new int[10];
        }
        int length = this.f38802d.length;
        if (i11 >= length) {
            int[] iArr = new int[Math.max(i11 + 1, length * 2)];
            System.arraycopy(this.f38802d, 0, iArr, 0, length);
            this.f38802d = iArr;
        }
        this.f38802d[i11] = i12;
    }

    public final void a(t tVar) {
        int[] iArr = this.f38800b;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = 2;
            if (i12 >= iArr.length) {
                break;
            }
            int i16 = iArr[i12];
            if (i16 != 4194308 && i16 != 4194307) {
                i15 = 1;
            }
            i12 += i15;
            if (i16 == 4194304) {
                i14++;
            } else {
                i13 += i14 + 1;
                i14 = 0;
            }
        }
        int[] iArr2 = this.f38801c;
        int i17 = 0;
        int i18 = 0;
        while (i17 < iArr2.length) {
            int i19 = iArr2[i17];
            i17 += (i19 == 4194308 || i19 == 4194307) ? 2 : 1;
            i18++;
        }
        int V = tVar.V(this.f38799a.f38823d, i13, i18);
        int i21 = 0;
        while (true) {
            int i22 = i13 - 1;
            if (i13 <= 0) {
                break;
            }
            int i23 = iArr[i21];
            i21 += (i23 == 4194308 || i23 == 4194307) ? 2 : 1;
            tVar.T(V, i23);
            i13 = i22;
            V++;
        }
        while (true) {
            int i24 = i18 - 1;
            if (i18 > 0) {
                int i25 = iArr2[i11];
                i11 += (i25 == 4194308 || i25 == 4194307) ? 2 : 1;
                tVar.T(V, i25);
                V++;
                i18 = i24;
            } else {
                tVar.U();
                return;
            }
        }
    }

    public final void c(o oVar) {
        this.f38800b = oVar.f38800b;
        this.f38801c = oVar.f38801c;
        this.f38804f = (short) 0;
        this.f38802d = oVar.f38802d;
        this.f38803e = oVar.f38803e;
        this.f38805g = oVar.f38805g;
        this.f38806h = oVar.f38806h;
        this.f38807i = oVar.f38807i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:817)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:856)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:856)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:856)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:856)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0356  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void d(int r17, int r18, mq.z r19, mq.a0 r20) {
        /*
            Method dump skipped, instructions count: 1246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mq.o.d(int, int, mq.z, mq.a0):void");
    }

    public final int j() {
        return this.f38801c.length;
    }

    public final boolean m(a0 a0Var, o oVar, int i11) {
        boolean z11;
        int i12;
        int length = this.f38800b.length;
        int length2 = this.f38801c.length;
        boolean z12 = true;
        if (oVar.f38800b == null) {
            oVar.f38800b = new int[length];
            z11 = true;
        } else {
            z11 = false;
        }
        for (int i13 = 0; i13 < length; i13++) {
            int[] iArr = this.f38802d;
            if (iArr != null && i13 < iArr.length) {
                int i14 = iArr[i13];
                if (i14 == 0) {
                    i12 = this.f38800b[i13];
                } else {
                    i12 = h(i14, length2);
                }
            } else {
                i12 = this.f38800b[i13];
            }
            if (this.f38807i != null) {
                i12 = i(a0Var, i12);
            }
            z11 |= l(a0Var, i12, oVar.f38800b, i13);
        }
        if (i11 > 0) {
            for (int i15 = 0; i15 < length; i15++) {
                z11 |= l(a0Var, this.f38800b[i15], oVar.f38800b, i15);
            }
            if (oVar.f38801c == null) {
                oVar.f38801c = new int[1];
            } else {
                z12 = z11;
            }
            return l(a0Var, i11, oVar.f38801c, 0) | z12;
        }
        int length3 = this.f38801c.length + this.f38804f;
        if (oVar.f38801c == null) {
            oVar.f38801c = new int[this.f38805g + length3];
        } else {
            z12 = z11;
        }
        for (int i16 = 0; i16 < length3; i16++) {
            int i17 = this.f38801c[i16];
            if (this.f38807i != null) {
                i17 = i(a0Var, i17);
            }
            z12 |= l(a0Var, i17, oVar.f38801c, i16);
        }
        for (int i18 = 0; i18 < this.f38805g; i18++) {
            int h11 = h(this.f38803e[i18], length2);
            if (this.f38807i != null) {
                h11 = i(a0Var, h11);
            }
            z12 |= l(a0Var, h11, oVar.f38801c, length3 + i18);
        }
        return z12;
    }

    public final void t(a0 a0Var, int i11, Object[] objArr, int i12, Object[] objArr2) {
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = i13 + 1;
            this.f38800b[i13] = e(a0Var, objArr[i14]);
            if (objArr[i14] == w.f38882e || objArr[i14] == w.f38881d) {
                this.f38800b[i15] = 4194304;
                i13 = i15 + 1;
            } else {
                i13 = i15;
            }
        }
        while (true) {
            int[] iArr = this.f38800b;
            if (i13 >= iArr.length) {
                break;
            }
            iArr[i13] = 4194304;
            i13++;
        }
        int i16 = 0;
        for (int i17 = 0; i17 < i12; i17++) {
            if (objArr2[i17] == w.f38882e || objArr2[i17] == w.f38881d) {
                i16++;
            }
        }
        this.f38801c = new int[i16 + i12];
        int i18 = 0;
        for (int i19 = 0; i19 < i12; i19++) {
            int i21 = i18 + 1;
            this.f38801c[i18] = e(a0Var, objArr2[i19]);
            if (objArr2[i19] == w.f38882e || objArr2[i19] == w.f38881d) {
                this.f38801c[i21] = 4194304;
                i18 = i21 + 1;
            } else {
                i18 = i21;
            }
        }
        this.f38805g = (short) 0;
        this.f38806h = 0;
    }

    public final void u(a0 a0Var, int i11, String str, int i12) {
        int[] iArr = new int[i12];
        this.f38800b = iArr;
        this.f38801c = new int[0];
        int i13 = 1;
        if ((i11 & 8) != 0) {
            i13 = 0;
        } else if ((i11 & 262144) == 0) {
            iArr[0] = 8388608 | a0Var.I(a0Var.O());
        } else {
            iArr[0] = 4194310;
        }
        for (b0 b0Var : b0.b(str)) {
            int f11 = f(a0Var, b0Var.d(), 0);
            int[] iArr2 = this.f38800b;
            int i14 = i13 + 1;
            iArr2[i13] = f11;
            if (f11 == 4194308 || f11 == 4194307) {
                i13 = i14 + 1;
                iArr2[i14] = 4194304;
            } else {
                i13 = i14;
            }
        }
        while (i13 < i12) {
            this.f38800b[i13] = 4194304;
            i13++;
        }
    }
}