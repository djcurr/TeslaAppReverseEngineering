package bj;

import ak.k0;
import ak.o;
import ak.u;
import ak.v;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.spongycastle.i18n.LocalizedMessage;

/* loaded from: classes3.dex */
public final class h extends wi.g {

    /* renamed from: b */
    public static final a f7692b = new a() { // from class: bj.g
        @Override // bj.h.a
        public final boolean a(int i11, int i12, int i13, int i14, int i15) {
            return h.c(i11, i12, i13, i14, i15);
        }
    };

    /* renamed from: a */
    private final a f7693a;

    /* loaded from: classes3.dex */
    public interface a {
        boolean a(int i11, int i12, int i13, int i14, int i15);
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private final int f7694a;

        /* renamed from: b */
        private final boolean f7695b;

        /* renamed from: c */
        private final int f7696c;

        public b(int i11, boolean z11, int i12) {
            this.f7694a = i11;
            this.f7695b = z11;
            this.f7696c = i12;
        }
    }

    public h() {
        this(null);
    }

    private static int A(v vVar, int i11) {
        byte[] d11 = vVar.d();
        int e11 = vVar.e();
        int i12 = e11;
        while (true) {
            int i13 = i12 + 1;
            if (i13 >= e11 + i11) {
                return i11;
            }
            if ((d11[i12] & 255) == 255 && d11[i13] == 0) {
                System.arraycopy(d11, i12 + 2, d11, i13, (i11 - (i12 - e11)) - 2);
                i11--;
            }
            i12 = i13;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0076, code lost:
        if ((r10 & 1) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0079, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0086, code lost:
        if ((r10 & 128) != 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean B(ak.v r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.e()
        L8:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> Laf
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lab
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L22
            int r7 = r18.m()     // Catch: java.lang.Throwable -> Laf
            long r8 = r18.E()     // Catch: java.lang.Throwable -> Laf
            int r10 = r18.I()     // Catch: java.lang.Throwable -> Laf
            goto L2c
        L22:
            int r7 = r18.F()     // Catch: java.lang.Throwable -> Laf
            int r8 = r18.F()     // Catch: java.lang.Throwable -> Laf
            long r8 = (long) r8
            r10 = r6
        L2c:
            r11 = 0
            if (r7 != 0) goto L3a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3a
            if (r10 != 0) goto L3a
            r1.O(r2)
            return r4
        L3a:
            r7 = 4
            if (r0 != r7) goto L6b
            if (r21 != 0) goto L6b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4b
            r1.O(r2)
            return r6
        L4b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6b:
            if (r0 != r7) goto L7b
            r3 = r10 & 64
            if (r3 == 0) goto L73
            r3 = r4
            goto L74
        L73:
            r3 = r6
        L74:
            r7 = r10 & 1
            if (r7 == 0) goto L79
            goto L8b
        L79:
            r4 = r6
            goto L8b
        L7b:
            if (r0 != r3) goto L89
            r3 = r10 & 32
            if (r3 == 0) goto L83
            r3 = r4
            goto L84
        L83:
            r3 = r6
        L84:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L79
            goto L8b
        L89:
            r3 = r6
            r4 = r3
        L8b:
            if (r4 == 0) goto L8f
            int r3 = r3 + 4
        L8f:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L98
            r1.O(r2)
            return r6
        L98:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> Laf
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La5
            r1.O(r2)
            return r6
        La5:
            int r3 = (int) r8
            r1.P(r3)     // Catch: java.lang.Throwable -> Laf
            goto L8
        Lab:
            r1.O(r2)
            return r4
        Laf:
            r0 = move-exception
            r1.O(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bj.h.B(ak.v, int, int, boolean):boolean");
    }

    public static /* synthetic */ boolean c(int i11, int i12, int i13, int i14, int i15) {
        return z(i11, i12, i13, i14, i15);
    }

    private static byte[] d(byte[] bArr, int i11, int i12) {
        if (i12 <= i11) {
            return k0.f482f;
        }
        return Arrays.copyOfRange(bArr, i11, i12);
    }

    private static bj.a f(v vVar, int i11, int i12) {
        int y11;
        String str;
        int C = vVar.C();
        String v11 = v(C);
        int i13 = i11 - 1;
        byte[] bArr = new byte[i13];
        vVar.j(bArr, 0, i13);
        if (i12 == 2) {
            String valueOf = String.valueOf(k0.R0(new String(bArr, 0, 3, LocalizedMessage.DEFAULT_ENCODING)));
            str = valueOf.length() != 0 ? "image/".concat(valueOf) : new String("image/");
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            y11 = 2;
        } else {
            y11 = y(bArr, 0);
            String R0 = k0.R0(new String(bArr, 0, y11, LocalizedMessage.DEFAULT_ENCODING));
            if (R0.indexOf(47) == -1) {
                if (R0.length() != 0) {
                    str = "image/".concat(R0);
                } else {
                    R0 = new String("image/");
                }
            }
            str = R0;
        }
        int i14 = y11 + 2;
        int x11 = x(bArr, i14, C);
        return new bj.a(str, new String(bArr, i14, x11 - i14, v11), bArr[y11 + 1] & 255, d(bArr, x11 + u(C), i13));
    }

    private static bj.b g(v vVar, int i11, String str) {
        byte[] bArr = new byte[i11];
        vVar.j(bArr, 0, i11);
        return new bj.b(str, bArr);
    }

    private static c h(v vVar, int i11, int i12, boolean z11, int i13, a aVar) {
        int e11 = vVar.e();
        int y11 = y(vVar.d(), e11);
        String str = new String(vVar.d(), e11, y11 - e11, LocalizedMessage.DEFAULT_ENCODING);
        vVar.O(y11 + 1);
        int m11 = vVar.m();
        int m12 = vVar.m();
        long E = vVar.E();
        long j11 = E == 4294967295L ? -1L : E;
        long E2 = vVar.E();
        long j12 = E2 == 4294967295L ? -1L : E2;
        ArrayList arrayList = new ArrayList();
        int i14 = e11 + i11;
        while (vVar.e() < i14) {
            i k11 = k(i12, vVar, z11, i13, aVar);
            if (k11 != null) {
                arrayList.add(k11);
            }
        }
        return new c(str, m11, m12, j11, j12, (i[]) arrayList.toArray(new i[0]));
    }

    private static d i(v vVar, int i11, int i12, boolean z11, int i13, a aVar) {
        int e11 = vVar.e();
        int y11 = y(vVar.d(), e11);
        String str = new String(vVar.d(), e11, y11 - e11, LocalizedMessage.DEFAULT_ENCODING);
        vVar.O(y11 + 1);
        int C = vVar.C();
        boolean z12 = (C & 2) != 0;
        boolean z13 = (C & 1) != 0;
        int C2 = vVar.C();
        String[] strArr = new String[C2];
        for (int i14 = 0; i14 < C2; i14++) {
            int e12 = vVar.e();
            int y12 = y(vVar.d(), e12);
            strArr[i14] = new String(vVar.d(), e12, y12 - e12, LocalizedMessage.DEFAULT_ENCODING);
            vVar.O(y12 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i15 = e11 + i11;
        while (vVar.e() < i15) {
            i k11 = k(i12, vVar, z11, i13, aVar);
            if (k11 != null) {
                arrayList.add(k11);
            }
        }
        return new d(str, z12, z13, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    private static e j(v vVar, int i11) {
        if (i11 < 4) {
            return null;
        }
        int C = vVar.C();
        String v11 = v(C);
        byte[] bArr = new byte[3];
        vVar.j(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i12 = i11 - 4;
        byte[] bArr2 = new byte[i12];
        vVar.j(bArr2, 0, i12);
        int x11 = x(bArr2, 0, C);
        String str2 = new String(bArr2, 0, x11, v11);
        int u11 = x11 + u(C);
        return new e(str, str2, p(bArr2, u11, x(bArr2, u11, C), v11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:303:0x0190, code lost:
        if (r13 == 67) goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static bj.i k(int r19, ak.v r20, boolean r21, int r22, bj.h.a r23) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bj.h.k(int, ak.v, boolean, int, bj.h$a):bj.i");
    }

    private static f l(v vVar, int i11) {
        int C = vVar.C();
        String v11 = v(C);
        int i12 = i11 - 1;
        byte[] bArr = new byte[i12];
        vVar.j(bArr, 0, i12);
        int y11 = y(bArr, 0);
        String str = new String(bArr, 0, y11, LocalizedMessage.DEFAULT_ENCODING);
        int i13 = y11 + 1;
        int x11 = x(bArr, i13, C);
        String p11 = p(bArr, i13, x11, v11);
        int u11 = x11 + u(C);
        int x12 = x(bArr, u11, C);
        return new f(str, p11, p(bArr, u11, x12, v11), d(bArr, x12 + u(C), i12));
    }

    private static b m(v vVar) {
        if (vVar.a() < 10) {
            o.h("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int F = vVar.F();
        boolean z11 = false;
        if (F != 4801587) {
            String valueOf = String.valueOf(String.format("%06X", Integer.valueOf(F)));
            o.h("Id3Decoder", valueOf.length() != 0 ? "Unexpected first three bytes of ID3 tag header: 0x".concat(valueOf) : new String("Unexpected first three bytes of ID3 tag header: 0x"));
            return null;
        }
        int C = vVar.C();
        vVar.P(1);
        int C2 = vVar.C();
        int B = vVar.B();
        if (C == 2) {
            if ((C2 & 64) != 0) {
                o.h("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (C == 3) {
            if ((C2 & 64) != 0) {
                int m11 = vVar.m();
                vVar.P(m11);
                B -= m11 + 4;
            }
        } else if (C != 4) {
            StringBuilder sb2 = new StringBuilder(57);
            sb2.append("Skipped ID3 tag with unsupported majorVersion=");
            sb2.append(C);
            o.h("Id3Decoder", sb2.toString());
            return null;
        } else {
            if ((C2 & 64) != 0) {
                int B2 = vVar.B();
                vVar.P(B2 - 4);
                B -= B2;
            }
            if ((C2 & 16) != 0) {
                B -= 10;
            }
        }
        if (C < 4 && (C2 & 128) != 0) {
            z11 = true;
        }
        return new b(C, z11, B);
    }

    private static k n(v vVar, int i11) {
        int I = vVar.I();
        int F = vVar.F();
        int F2 = vVar.F();
        int C = vVar.C();
        int C2 = vVar.C();
        u uVar = new u();
        uVar.m(vVar);
        int i12 = ((i11 - 10) * 8) / (C + C2);
        int[] iArr = new int[i12];
        int[] iArr2 = new int[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            int h11 = uVar.h(C);
            int h12 = uVar.h(C2);
            iArr[i13] = h11;
            iArr2[i13] = h12;
        }
        return new k(I, F, F2, iArr, iArr2);
    }

    private static l o(v vVar, int i11) {
        byte[] bArr = new byte[i11];
        vVar.j(bArr, 0, i11);
        int y11 = y(bArr, 0);
        return new l(new String(bArr, 0, y11, LocalizedMessage.DEFAULT_ENCODING), d(bArr, y11 + 1, i11));
    }

    private static String p(byte[] bArr, int i11, int i12, String str) {
        return (i12 <= i11 || i12 > bArr.length) ? "" : new String(bArr, i11, i12 - i11, str);
    }

    private static m q(v vVar, int i11, String str) {
        if (i11 < 1) {
            return null;
        }
        int C = vVar.C();
        String v11 = v(C);
        int i12 = i11 - 1;
        byte[] bArr = new byte[i12];
        vVar.j(bArr, 0, i12);
        return new m(str, null, new String(bArr, 0, x(bArr, 0, C), v11));
    }

    private static m r(v vVar, int i11) {
        if (i11 < 1) {
            return null;
        }
        int C = vVar.C();
        String v11 = v(C);
        int i12 = i11 - 1;
        byte[] bArr = new byte[i12];
        vVar.j(bArr, 0, i12);
        int x11 = x(bArr, 0, C);
        String str = new String(bArr, 0, x11, v11);
        int u11 = x11 + u(C);
        return new m("TXXX", str, p(bArr, u11, x(bArr, u11, C), v11));
    }

    private static n s(v vVar, int i11, String str) {
        byte[] bArr = new byte[i11];
        vVar.j(bArr, 0, i11);
        return new n(str, null, new String(bArr, 0, y(bArr, 0), LocalizedMessage.DEFAULT_ENCODING));
    }

    private static n t(v vVar, int i11) {
        if (i11 < 1) {
            return null;
        }
        int C = vVar.C();
        String v11 = v(C);
        int i12 = i11 - 1;
        byte[] bArr = new byte[i12];
        vVar.j(bArr, 0, i12);
        int x11 = x(bArr, 0, C);
        String str = new String(bArr, 0, x11, v11);
        int u11 = x11 + u(C);
        return new n("WXXX", str, p(bArr, u11, y(bArr, u11), LocalizedMessage.DEFAULT_ENCODING));
    }

    private static int u(int i11) {
        return (i11 == 0 || i11 == 3) ? 1 : 2;
    }

    private static String v(int i11) {
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? LocalizedMessage.DEFAULT_ENCODING : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    private static String w(int i11, int i12, int i13, int i14, int i15) {
        return i11 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15));
    }

    private static int x(byte[] bArr, int i11, int i12) {
        int y11 = y(bArr, i11);
        if (i12 == 0 || i12 == 3) {
            return y11;
        }
        while (y11 < bArr.length - 1) {
            if (y11 % 2 == 0 && bArr[y11 + 1] == 0) {
                return y11;
            }
            y11 = y(bArr, y11 + 1);
        }
        return bArr.length;
    }

    private static int y(byte[] bArr, int i11) {
        while (i11 < bArr.length) {
            if (bArr[i11] == 0) {
                return i11;
            }
            i11++;
        }
        return bArr.length;
    }

    public static /* synthetic */ boolean z(int i11, int i12, int i13, int i14, int i15) {
        return false;
    }

    @Override // wi.g
    protected wi.a b(wi.d dVar, ByteBuffer byteBuffer) {
        return e(byteBuffer.array(), byteBuffer.limit());
    }

    public wi.a e(byte[] bArr, int i11) {
        ArrayList arrayList = new ArrayList();
        v vVar = new v(bArr, i11);
        b m11 = m(vVar);
        if (m11 == null) {
            return null;
        }
        int e11 = vVar.e();
        int i12 = m11.f7694a == 2 ? 6 : 10;
        int i13 = m11.f7696c;
        if (m11.f7695b) {
            i13 = A(vVar, m11.f7696c);
        }
        vVar.N(e11 + i13);
        boolean z11 = false;
        if (!B(vVar, m11.f7694a, i12, false)) {
            if (m11.f7694a != 4 || !B(vVar, 4, i12, true)) {
                int i14 = m11.f7694a;
                StringBuilder sb2 = new StringBuilder(56);
                sb2.append("Failed to validate ID3 tag with majorVersion=");
                sb2.append(i14);
                o.h("Id3Decoder", sb2.toString());
                return null;
            }
            z11 = true;
        }
        while (vVar.a() >= i12) {
            i k11 = k(m11.f7694a, vVar, z11, i12, this.f7693a);
            if (k11 != null) {
                arrayList.add(k11);
            }
        }
        return new wi.a(arrayList);
    }

    public h(a aVar) {
        this.f7693a = aVar;
    }
}