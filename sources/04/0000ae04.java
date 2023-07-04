package qi;

import ak.k0;
import ak.v;
import android.util.Pair;
import ci.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.spongycastle.crypto.tls.CipherSuite;
import qi.a;
import wi.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f48172a = k0.l0("OpusHead");

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f48173a;

        /* renamed from: b  reason: collision with root package name */
        public int f48174b;

        /* renamed from: c  reason: collision with root package name */
        public int f48175c;

        /* renamed from: d  reason: collision with root package name */
        public long f48176d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f48177e;

        /* renamed from: f  reason: collision with root package name */
        private final v f48178f;

        /* renamed from: g  reason: collision with root package name */
        private final v f48179g;

        /* renamed from: h  reason: collision with root package name */
        private int f48180h;

        /* renamed from: i  reason: collision with root package name */
        private int f48181i;

        public a(v vVar, v vVar2, boolean z11) {
            this.f48179g = vVar;
            this.f48178f = vVar2;
            this.f48177e = z11;
            vVar2.O(12);
            this.f48173a = vVar2.G();
            vVar.O(12);
            this.f48181i = vVar.G();
            ak.a.g(vVar.m() == 1, "first_chunk must be 1");
            this.f48174b = -1;
        }

        public boolean a() {
            int i11 = this.f48174b + 1;
            this.f48174b = i11;
            if (i11 == this.f48173a) {
                return false;
            }
            this.f48176d = this.f48177e ? this.f48178f.H() : this.f48178f.E();
            if (this.f48174b == this.f48180h) {
                this.f48175c = this.f48179g.G();
                this.f48179g.P(4);
                int i12 = this.f48181i - 1;
                this.f48181i = i12;
                this.f48180h = i12 > 0 ? this.f48179g.G() - 1 : -1;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qi.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC1030b {
        int a();

        int b();

        int c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final p[] f48182a;

        /* renamed from: b  reason: collision with root package name */
        public ci.i f48183b;

        /* renamed from: c  reason: collision with root package name */
        public int f48184c;

        /* renamed from: d  reason: collision with root package name */
        public int f48185d = 0;

        public c(int i11) {
            this.f48182a = new p[i11];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC1030b {

        /* renamed from: a  reason: collision with root package name */
        private final int f48186a;

        /* renamed from: b  reason: collision with root package name */
        private final int f48187b;

        /* renamed from: c  reason: collision with root package name */
        private final v f48188c;

        public d(a.b bVar, ci.i iVar) {
            v vVar = bVar.f48171b;
            this.f48188c = vVar;
            vVar.O(12);
            int G = vVar.G();
            if ("audio/raw".equals(iVar.f9205l)) {
                int c02 = k0.c0(iVar.F, iVar.C);
                if (G == 0 || G % c02 != 0) {
                    StringBuilder sb2 = new StringBuilder(88);
                    sb2.append("Audio sample size mismatch. stsd sample size: ");
                    sb2.append(c02);
                    sb2.append(", stsz sample size: ");
                    sb2.append(G);
                    ak.o.h("AtomParsers", sb2.toString());
                    G = c02;
                }
            }
            this.f48186a = G == 0 ? -1 : G;
            this.f48187b = vVar.G();
        }

        @Override // qi.b.InterfaceC1030b
        public int a() {
            int i11 = this.f48186a;
            return i11 == -1 ? this.f48188c.G() : i11;
        }

        @Override // qi.b.InterfaceC1030b
        public int b() {
            return this.f48186a;
        }

        @Override // qi.b.InterfaceC1030b
        public int c() {
            return this.f48187b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC1030b {

        /* renamed from: a  reason: collision with root package name */
        private final v f48189a;

        /* renamed from: b  reason: collision with root package name */
        private final int f48190b;

        /* renamed from: c  reason: collision with root package name */
        private final int f48191c;

        /* renamed from: d  reason: collision with root package name */
        private int f48192d;

        /* renamed from: e  reason: collision with root package name */
        private int f48193e;

        public e(a.b bVar) {
            v vVar = bVar.f48171b;
            this.f48189a = vVar;
            vVar.O(12);
            this.f48191c = vVar.G() & 255;
            this.f48190b = vVar.G();
        }

        @Override // qi.b.InterfaceC1030b
        public int a() {
            int i11 = this.f48191c;
            if (i11 == 8) {
                return this.f48189a.C();
            }
            if (i11 == 16) {
                return this.f48189a.I();
            }
            int i12 = this.f48192d;
            this.f48192d = i12 + 1;
            if (i12 % 2 == 0) {
                int C = this.f48189a.C();
                this.f48193e = C;
                return (C & 240) >> 4;
            }
            return this.f48193e & 15;
        }

        @Override // qi.b.InterfaceC1030b
        public int b() {
            return -1;
        }

        @Override // qi.b.InterfaceC1030b
        public int c() {
            return this.f48190b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        private final int f48194a;

        /* renamed from: b  reason: collision with root package name */
        private final long f48195b;

        /* renamed from: c  reason: collision with root package name */
        private final int f48196c;

        public f(int i11, long j11, int i12) {
            this.f48194a = i11;
            this.f48195b = j11;
            this.f48196c = i12;
        }
    }

    public static Pair<wi.a, wi.a> A(a.b bVar) {
        v vVar = bVar.f48171b;
        vVar.O(8);
        wi.a aVar = null;
        wi.a aVar2 = null;
        while (vVar.a() >= 8) {
            int e11 = vVar.e();
            int m11 = vVar.m();
            int m12 = vVar.m();
            if (m12 == 1835365473) {
                vVar.O(e11);
                aVar = B(vVar, e11 + m11);
            } else if (m12 == 1936553057) {
                vVar.O(e11);
                aVar2 = t(vVar, e11 + m11);
            }
            vVar.O(e11 + m11);
        }
        return Pair.create(aVar, aVar2);
    }

    private static wi.a B(v vVar, int i11) {
        vVar.P(8);
        d(vVar);
        while (vVar.e() < i11) {
            int e11 = vVar.e();
            int m11 = vVar.m();
            if (vVar.m() == 1768715124) {
                vVar.O(e11);
                return k(vVar, e11 + m11);
            }
            vVar.O(e11 + m11);
        }
        return null;
    }

    private static void C(v vVar, int i11, int i12, int i13, int i14, int i15, com.google.android.exoplayer2.drm.e eVar, c cVar, int i16) {
        com.google.android.exoplayer2.drm.e eVar2;
        List<byte[]> list;
        String str;
        List<byte[]> list2;
        String str2;
        String str3;
        int i17 = i12;
        int i18 = i13;
        com.google.android.exoplayer2.drm.e eVar3 = eVar;
        vVar.O(i17 + 8 + 8);
        vVar.P(16);
        int I = vVar.I();
        int I2 = vVar.I();
        vVar.P(50);
        int e11 = vVar.e();
        String str4 = null;
        int i19 = i11;
        if (i19 == 1701733238) {
            Pair<Integer, p> r11 = r(vVar, i17, i18);
            if (r11 != null) {
                i19 = ((Integer) r11.first).intValue();
                eVar3 = eVar3 == null ? null : eVar3.c(((p) r11.second).f48303b);
                cVar.f48182a[i16] = (p) r11.second;
            }
            vVar.O(e11);
        }
        int i21 = -1;
        float f11 = 1.0f;
        boolean z11 = false;
        List<byte[]> list3 = null;
        String str5 = i19 == 1831958048 ? "video/mpeg" : null;
        byte[] bArr = null;
        while (true) {
            if (e11 - i17 >= i18) {
                eVar2 = eVar3;
                list = list3;
                break;
            }
            vVar.O(e11);
            int e12 = vVar.e();
            eVar2 = eVar3;
            int m11 = vVar.m();
            if (m11 == 0) {
                list = list3;
                if (vVar.e() - i17 == i18) {
                    break;
                }
            } else {
                list = list3;
            }
            ak.a.g(m11 > 0, "childAtomSize should be positive");
            int m12 = vVar.m();
            if (m12 == 1635148611) {
                ak.a.f(str5 == null);
                vVar.O(e12 + 8);
                bk.a b11 = bk.a.b(vVar);
                list2 = b11.f7712a;
                cVar.f48184c = b11.f7713b;
                if (!z11) {
                    f11 = b11.f7716e;
                }
                str2 = b11.f7717f;
                str3 = "video/avc";
            } else if (m12 == 1752589123) {
                ak.a.f(str5 == null);
                vVar.O(e12 + 8);
                bk.f a11 = bk.f.a(vVar);
                list2 = a11.f7747a;
                cVar.f48184c = a11.f7748b;
                str2 = a11.f7749c;
                str3 = "video/hevc";
            } else {
                if (m12 == 1685480259 || m12 == 1685485123) {
                    bk.c a12 = bk.c.a(vVar);
                    if (a12 != null) {
                        str4 = a12.f7723a;
                        str5 = "video/dolby-vision";
                    }
                } else {
                    if (m12 == 1987076931) {
                        ak.a.f(str5 == null);
                        str = i19 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                    } else if (m12 == 1635135811) {
                        ak.a.f(str5 == null);
                        str = "video/av01";
                    } else if (m12 == 1681012275) {
                        ak.a.f(str5 == null);
                        str = "video/3gpp";
                    } else {
                        if (m12 == 1702061171) {
                            ak.a.f(str5 == null);
                            Pair<String, byte[]> h11 = h(vVar, e12);
                            String str6 = (String) h11.first;
                            byte[] bArr2 = (byte[]) h11.second;
                            list3 = bArr2 != null ? com.google.common.collect.r.s(bArr2) : list;
                            str5 = str6;
                        } else if (m12 == 1885434736) {
                            list3 = list;
                            f11 = p(vVar, e12);
                            z11 = true;
                        } else if (m12 == 1937126244) {
                            list3 = list;
                            bArr = q(vVar, e12, m11);
                        } else if (m12 == 1936995172) {
                            int C = vVar.C();
                            vVar.P(3);
                            if (C == 0) {
                                int C2 = vVar.C();
                                if (C2 == 0) {
                                    list3 = list;
                                    i21 = 0;
                                } else if (C2 == 1) {
                                    i21 = 1;
                                } else if (C2 == 2) {
                                    list3 = list;
                                    i21 = 2;
                                } else if (C2 == 3) {
                                    list3 = list;
                                    i21 = 3;
                                }
                            }
                        }
                        e11 += m11;
                        i17 = i12;
                        i18 = i13;
                        eVar3 = eVar2;
                    }
                    list3 = list;
                    str5 = str;
                    e11 += m11;
                    i17 = i12;
                    i18 = i13;
                    eVar3 = eVar2;
                }
                list3 = list;
                e11 += m11;
                i17 = i12;
                i18 = i13;
                eVar3 = eVar2;
            }
            list3 = list2;
            str5 = str3;
            str4 = str2;
            e11 += m11;
            i17 = i12;
            i18 = i13;
            eVar3 = eVar2;
        }
        if (str5 == null) {
            return;
        }
        cVar.f48183b = new i.b().R(i14).e0(str5).I(str4).j0(I).Q(I2).a0(f11).d0(i15).b0(bArr).h0(i21).T(list).L(eVar2).E();
    }

    private static boolean a(long[] jArr, long j11, long j12, long j13) {
        int length = jArr.length - 1;
        return jArr[0] <= j12 && j12 < jArr[k0.r(4, 0, length)] && jArr[k0.r(jArr.length - 4, 0, length)] < j13 && j13 <= j11;
    }

    private static int b(v vVar, int i11, int i12) {
        int e11 = vVar.e();
        while (e11 - i11 < i12) {
            vVar.O(e11);
            int m11 = vVar.m();
            ak.a.g(m11 > 0, "childAtomSize should be positive");
            if (vVar.m() == 1702061171) {
                return e11;
            }
            e11 += m11;
        }
        return -1;
    }

    private static int c(int i11) {
        if (i11 == 1936684398) {
            return 1;
        }
        if (i11 == 1986618469) {
            return 2;
        }
        if (i11 == 1952807028 || i11 == 1935832172 || i11 == 1937072756 || i11 == 1668047728) {
            return 3;
        }
        return i11 == 1835365473 ? 5 : -1;
    }

    public static void d(v vVar) {
        int e11 = vVar.e();
        vVar.P(4);
        if (vVar.m() != 1751411826) {
            e11 += 4;
        }
        vVar.O(e11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0135  */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(ak.v r20, int r21, int r22, int r23, int r24, java.lang.String r25, boolean r26, com.google.android.exoplayer2.drm.e r27, qi.b.c r28, int r29) {
        /*
            Method dump skipped, instructions count: 717
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qi.b.e(ak.v, int, int, int, int, java.lang.String, boolean, com.google.android.exoplayer2.drm.e, qi.b$c, int):void");
    }

    static Pair<Integer, p> f(v vVar, int i11, int i12) {
        int i13 = i11 + 8;
        int i14 = 0;
        int i15 = -1;
        String str = null;
        Integer num = null;
        while (i13 - i11 < i12) {
            vVar.O(i13);
            int m11 = vVar.m();
            int m12 = vVar.m();
            if (m12 == 1718775137) {
                num = Integer.valueOf(vVar.m());
            } else if (m12 == 1935894637) {
                vVar.P(4);
                str = vVar.z(4);
            } else if (m12 == 1935894633) {
                i15 = i13;
                i14 = m11;
            }
            i13 += m11;
        }
        if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
            ak.a.i(num, "frma atom is mandatory");
            ak.a.g(i15 != -1, "schi atom is mandatory");
            return Pair.create(num, (p) ak.a.i(s(vVar, i15, i14, str), "tenc atom is mandatory"));
        }
        return null;
    }

    private static Pair<long[], long[]> g(a.C1029a c1029a) {
        a.b g11 = c1029a.g(1701606260);
        if (g11 == null) {
            return null;
        }
        v vVar = g11.f48171b;
        vVar.O(8);
        int c11 = qi.a.c(vVar.m());
        int G = vVar.G();
        long[] jArr = new long[G];
        long[] jArr2 = new long[G];
        for (int i11 = 0; i11 < G; i11++) {
            jArr[i11] = c11 == 1 ? vVar.H() : vVar.E();
            jArr2[i11] = c11 == 1 ? vVar.v() : vVar.m();
            if (vVar.y() == 1) {
                vVar.P(2);
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    private static Pair<String, byte[]> h(v vVar, int i11) {
        vVar.O(i11 + 8 + 4);
        vVar.P(1);
        i(vVar);
        vVar.P(2);
        int C = vVar.C();
        if ((C & 128) != 0) {
            vVar.P(2);
        }
        if ((C & 64) != 0) {
            vVar.P(vVar.I());
        }
        if ((C & 32) != 0) {
            vVar.P(2);
        }
        vVar.P(1);
        i(vVar);
        String h11 = ak.r.h(vVar.C());
        if (!"audio/mpeg".equals(h11) && !"audio/vnd.dts".equals(h11) && !"audio/vnd.dts.hd".equals(h11)) {
            vVar.P(12);
            vVar.P(1);
            int i12 = i(vVar);
            byte[] bArr = new byte[i12];
            vVar.j(bArr, 0, i12);
            return Pair.create(h11, bArr);
        }
        return Pair.create(h11, null);
    }

    private static int i(v vVar) {
        int C = vVar.C();
        int i11 = C & 127;
        while ((C & 128) == 128) {
            C = vVar.C();
            i11 = (i11 << 7) | (C & 127);
        }
        return i11;
    }

    private static int j(v vVar) {
        vVar.O(16);
        return vVar.m();
    }

    private static wi.a k(v vVar, int i11) {
        vVar.P(8);
        ArrayList arrayList = new ArrayList();
        while (vVar.e() < i11) {
            a.b c11 = h.c(vVar);
            if (c11 != null) {
                arrayList.add(c11);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new wi.a(arrayList);
    }

    private static Pair<Long, String> l(v vVar) {
        vVar.O(8);
        int c11 = qi.a.c(vVar.m());
        vVar.P(c11 == 0 ? 8 : 16);
        long E = vVar.E();
        vVar.P(c11 == 0 ? 4 : 8);
        int I = vVar.I();
        StringBuilder sb2 = new StringBuilder(3);
        sb2.append((char) (((I >> 10) & 31) + 96));
        sb2.append((char) (((I >> 5) & 31) + 96));
        sb2.append((char) ((I & 31) + 96));
        return Pair.create(Long.valueOf(E), sb2.toString());
    }

    public static wi.a m(a.C1029a c1029a) {
        a.b g11 = c1029a.g(1751411826);
        a.b g12 = c1029a.g(1801812339);
        a.b g13 = c1029a.g(1768715124);
        if (g11 == null || g12 == null || g13 == null || j(g11.f48171b) != 1835299937) {
            return null;
        }
        v vVar = g12.f48171b;
        vVar.O(12);
        int m11 = vVar.m();
        String[] strArr = new String[m11];
        for (int i11 = 0; i11 < m11; i11++) {
            int m12 = vVar.m();
            vVar.P(4);
            strArr[i11] = vVar.z(m12 - 8);
        }
        v vVar2 = g13.f48171b;
        vVar2.O(8);
        ArrayList arrayList = new ArrayList();
        while (vVar2.a() > 8) {
            int e11 = vVar2.e();
            int m13 = vVar2.m();
            int m14 = vVar2.m() - 1;
            if (m14 >= 0 && m14 < m11) {
                cj.a f11 = h.f(vVar2, e11 + m13, strArr[m14]);
                if (f11 != null) {
                    arrayList.add(f11);
                }
            } else {
                StringBuilder sb2 = new StringBuilder(52);
                sb2.append("Skipped metadata with unknown key index: ");
                sb2.append(m14);
                ak.o.h("AtomParsers", sb2.toString());
            }
            vVar2.O(e11 + m13);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new wi.a(arrayList);
    }

    private static void n(v vVar, int i11, int i12, int i13, c cVar) {
        vVar.O(i12 + 8 + 8);
        if (i11 == 1835365492) {
            vVar.w();
            String w11 = vVar.w();
            if (w11 != null) {
                cVar.f48183b = new i.b().R(i13).e0(w11).E();
            }
        }
    }

    private static long o(v vVar) {
        vVar.O(8);
        vVar.P(qi.a.c(vVar.m()) != 0 ? 16 : 8);
        return vVar.E();
    }

    private static float p(v vVar, int i11) {
        vVar.O(i11 + 8);
        return vVar.G() / vVar.G();
    }

    private static byte[] q(v vVar, int i11, int i12) {
        int i13 = i11 + 8;
        while (i13 - i11 < i12) {
            vVar.O(i13);
            int m11 = vVar.m();
            if (vVar.m() == 1886547818) {
                return Arrays.copyOfRange(vVar.d(), i13, m11 + i13);
            }
            i13 += m11;
        }
        return null;
    }

    private static Pair<Integer, p> r(v vVar, int i11, int i12) {
        Pair<Integer, p> f11;
        int e11 = vVar.e();
        while (e11 - i11 < i12) {
            vVar.O(e11);
            int m11 = vVar.m();
            ak.a.g(m11 > 0, "childAtomSize should be positive");
            if (vVar.m() == 1936289382 && (f11 = f(vVar, e11, m11)) != null) {
                return f11;
            }
            e11 += m11;
        }
        return null;
    }

    private static p s(v vVar, int i11, int i12, String str) {
        int i13;
        int i14;
        int i15 = i11 + 8;
        while (true) {
            byte[] bArr = null;
            if (i15 - i11 >= i12) {
                return null;
            }
            vVar.O(i15);
            int m11 = vVar.m();
            if (vVar.m() == 1952804451) {
                int c11 = qi.a.c(vVar.m());
                vVar.P(1);
                if (c11 == 0) {
                    vVar.P(1);
                    i14 = 0;
                    i13 = 0;
                } else {
                    int C = vVar.C();
                    i13 = C & 15;
                    i14 = (C & 240) >> 4;
                }
                boolean z11 = vVar.C() == 1;
                int C2 = vVar.C();
                byte[] bArr2 = new byte[16];
                vVar.j(bArr2, 0, 16);
                if (z11 && C2 == 0) {
                    int C3 = vVar.C();
                    bArr = new byte[C3];
                    vVar.j(bArr, 0, C3);
                }
                return new p(z11, str, C2, bArr2, i14, i13, bArr);
            }
            i15 += m11;
        }
    }

    private static wi.a t(v vVar, int i11) {
        vVar.P(12);
        while (vVar.e() < i11) {
            int e11 = vVar.e();
            int m11 = vVar.m();
            if (vVar.m() == 1935766900) {
                if (m11 < 14) {
                    return null;
                }
                vVar.P(5);
                int C = vVar.C();
                if (C == 12 || C == 13) {
                    float f11 = C == 12 ? 240.0f : 120.0f;
                    vVar.P(1);
                    return new wi.a(new cj.d(f11, vVar.C()));
                }
                return null;
            }
            vVar.O(e11 + m11);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x043e A[EDGE_INSN: B:207:0x043e->B:169:0x043e ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static qi.r u(qi.o r37, qi.a.C1029a r38, ji.r r39) {
        /*
            Method dump skipped, instructions count: 1331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qi.b.u(qi.o, qi.a$a, ji.r):qi.r");
    }

    private static c v(v vVar, int i11, int i12, String str, com.google.android.exoplayer2.drm.e eVar, boolean z11) {
        int i13;
        vVar.O(12);
        int m11 = vVar.m();
        c cVar = new c(m11);
        for (int i14 = 0; i14 < m11; i14++) {
            int e11 = vVar.e();
            int m12 = vVar.m();
            ak.a.g(m12 > 0, "childAtomSize should be positive");
            int m13 = vVar.m();
            if (m13 == 1635148593 || m13 == 1635148595 || m13 == 1701733238 || m13 == 1831958048 || m13 == 1836070006 || m13 == 1752589105 || m13 == 1751479857 || m13 == 1932670515 || m13 == 1987063864 || m13 == 1987063865 || m13 == 1635135537 || m13 == 1685479798 || m13 == 1685479729 || m13 == 1685481573 || m13 == 1685481521) {
                i13 = e11;
                C(vVar, m13, i13, m12, i11, i12, eVar, cVar, i14);
            } else if (m13 == 1836069985 || m13 == 1701733217 || m13 == 1633889587 || m13 == 1700998451 || m13 == 1633889588 || m13 == 1685353315 || m13 == 1685353317 || m13 == 1685353320 || m13 == 1685353324 || m13 == 1935764850 || m13 == 1935767394 || m13 == 1819304813 || m13 == 1936684916 || m13 == 1953984371 || m13 == 778924082 || m13 == 778924083 || m13 == 1634492771 || m13 == 1634492791 || m13 == 1970037111 || m13 == 1332770163 || m13 == 1716281667) {
                i13 = e11;
                e(vVar, m13, e11, m12, i11, str, z11, eVar, cVar, i14);
            } else {
                if (m13 == 1414810956 || m13 == 1954034535 || m13 == 2004251764 || m13 == 1937010800 || m13 == 1664495672) {
                    w(vVar, m13, e11, m12, i11, str, cVar);
                } else if (m13 == 1835365492) {
                    n(vVar, m13, e11, i11, cVar);
                } else if (m13 == 1667329389) {
                    cVar.f48183b = new i.b().R(i11).e0("application/x-camera-motion").E();
                }
                i13 = e11;
            }
            vVar.O(i13 + m12);
        }
        return cVar;
    }

    private static void w(v vVar, int i11, int i12, int i13, int i14, String str, c cVar) {
        vVar.O(i12 + 8 + 8);
        String str2 = "application/ttml+xml";
        com.google.common.collect.r rVar = null;
        long j11 = Long.MAX_VALUE;
        if (i11 != 1414810956) {
            if (i11 == 1954034535) {
                int i15 = (i13 - 8) - 8;
                byte[] bArr = new byte[i15];
                vVar.j(bArr, 0, i15);
                rVar = com.google.common.collect.r.s(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i11 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i11 == 1937010800) {
                j11 = 0;
            } else if (i11 == 1664495672) {
                cVar.f48185d = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                throw new IllegalStateException();
            }
        }
        cVar.f48183b = new i.b().R(i14).e0(str2).V(str).i0(j11).T(rVar).E();
    }

    private static f x(v vVar) {
        boolean z11;
        vVar.O(8);
        int c11 = qi.a.c(vVar.m());
        vVar.P(c11 == 0 ? 8 : 16);
        int m11 = vVar.m();
        vVar.P(4);
        int e11 = vVar.e();
        int i11 = c11 == 0 ? 4 : 8;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i13 >= i11) {
                z11 = true;
                break;
            } else if (vVar.d()[e11 + i13] != -1) {
                z11 = false;
                break;
            } else {
                i13++;
            }
        }
        long j11 = -9223372036854775807L;
        if (z11) {
            vVar.P(i11);
        } else {
            long E = c11 == 0 ? vVar.E() : vVar.H();
            if (E != 0) {
                j11 = E;
            }
        }
        vVar.P(16);
        int m12 = vVar.m();
        int m13 = vVar.m();
        vVar.P(4);
        int m14 = vVar.m();
        int m15 = vVar.m();
        if (m12 == 0 && m13 == 65536 && m14 == -65536 && m15 == 0) {
            i12 = 90;
        } else if (m12 == 0 && m13 == -65536 && m14 == 65536 && m15 == 0) {
            i12 = 270;
        } else if (m12 == -65536 && m13 == 0 && m14 == 0 && m15 == -65536) {
            i12 = CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256;
        }
        return new f(m11, j11, i12);
    }

    private static o y(a.C1029a c1029a, a.b bVar, long j11, com.google.android.exoplayer2.drm.e eVar, boolean z11, boolean z12) {
        a.b bVar2;
        long j12;
        long[] jArr;
        long[] jArr2;
        a.C1029a f11;
        Pair<long[], long[]> g11;
        a.C1029a c1029a2 = (a.C1029a) ak.a.e(c1029a.f(1835297121));
        int c11 = c(j(((a.b) ak.a.e(c1029a2.g(1751411826))).f48171b));
        if (c11 == -1) {
            return null;
        }
        f x11 = x(((a.b) ak.a.e(c1029a.g(1953196132))).f48171b);
        if (j11 == -9223372036854775807L) {
            bVar2 = bVar;
            j12 = x11.f48195b;
        } else {
            bVar2 = bVar;
            j12 = j11;
        }
        long o11 = o(bVar2.f48171b);
        long I0 = j12 != -9223372036854775807L ? k0.I0(j12, 1000000L, o11) : -9223372036854775807L;
        Pair<Long, String> l11 = l(((a.b) ak.a.e(c1029a2.g(1835296868))).f48171b);
        c v11 = v(((a.b) ak.a.e(((a.C1029a) ak.a.e(((a.C1029a) ak.a.e(c1029a2.f(1835626086))).f(1937007212))).g(1937011556))).f48171b, x11.f48194a, x11.f48196c, (String) l11.second, eVar, z12);
        if (z11 || (f11 = c1029a.f(1701082227)) == null || (g11 = g(f11)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            jArr2 = (long[]) g11.second;
            jArr = (long[]) g11.first;
        }
        if (v11.f48183b == null) {
            return null;
        }
        return new o(x11.f48194a, c11, ((Long) l11.first).longValue(), o11, I0, v11.f48183b, v11.f48185d, v11.f48182a, v11.f48184c, jArr, jArr2);
    }

    public static List<r> z(a.C1029a c1029a, ji.r rVar, long j11, com.google.android.exoplayer2.drm.e eVar, boolean z11, boolean z12, com.google.common.base.l<o, o> lVar) {
        o apply;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < c1029a.f48170d.size(); i11++) {
            a.C1029a c1029a2 = c1029a.f48170d.get(i11);
            if (c1029a2.f48167a == 1953653099 && (apply = lVar.apply(y(c1029a2, (a.b) ak.a.e(c1029a.g(1836476516)), j11, eVar, z11, z12))) != null) {
                arrayList.add(u(apply, (a.C1029a) ak.a.e(((a.C1029a) ak.a.e(((a.C1029a) ak.a.e(c1029a2.f(1835297121))).f(1835626086))).f(1937007212)), rVar));
            }
        }
        return arrayList;
    }
}