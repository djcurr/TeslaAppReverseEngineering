package ep;

import com.google.zxing.NotFoundException;
import com.google.zxing.j;
import com.google.zxing.l;
import cp.k;
import dp.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.Primes;

/* loaded from: classes2.dex */
public final class d extends dp.a {

    /* renamed from: k  reason: collision with root package name */
    private static final int[] f25230k = {7, 5, 4, 3, 1};

    /* renamed from: l  reason: collision with root package name */
    private static final int[] f25231l = {4, 20, 52, 104, 204};

    /* renamed from: m  reason: collision with root package name */
    private static final int[] f25232m = {0, 348, 1388, 2948, 3988};

    /* renamed from: n  reason: collision with root package name */
    private static final int[][] f25233n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: o  reason: collision with root package name */
    private static final int[][] f25234o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256, 118, 143, 7, 21, 63}, new int[]{CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 91}, new int[]{62, CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256, 136, 197, CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384, 85, 44, 132}, new int[]{CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256, 139, 206, 196, CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_FORM_VALUE, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, CipherSuite.TLS_PSK_WITH_NULL_SHA384}, new int[]{109, 116, 137, 200, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256, 112, 125, CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256}, new int[]{70, 210, 208, 202, 184, com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, 115}, new int[]{134, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, 94, 71, 2}, new int[]{6, 18, 54, CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384}, new int[]{79, 26, 78, 23, 69, 207, 199, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384}, new int[]{103, 98, 83, 38, 114, com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND_VALUE, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256, 124}, new int[]{CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384, 61, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384, 127, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 88, 53, 159}, new int[]{55, CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 100, 89}};

    /* renamed from: p  reason: collision with root package name */
    private static final int[][] f25235p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* renamed from: g  reason: collision with root package name */
    private final List<b> f25236g = new ArrayList(11);

    /* renamed from: h  reason: collision with root package name */
    private final List<c> f25237h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private final int[] f25238i = new int[2];

    /* renamed from: j  reason: collision with root package name */
    private boolean f25239j;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean A(java.lang.Iterable<ep.b> r7, java.lang.Iterable<ep.c> r8) {
        /*
            java.util.Iterator r8 = r8.iterator()
        L4:
            boolean r0 = r8.hasNext()
            r1 = 0
            if (r0 == 0) goto L46
            java.lang.Object r0 = r8.next()
            ep.c r0 = (ep.c) r0
            java.util.Iterator r2 = r7.iterator()
        L15:
            boolean r3 = r2.hasNext()
            r4 = 1
            if (r3 == 0) goto L42
            java.lang.Object r3 = r2.next()
            ep.b r3 = (ep.b) r3
            java.util.List r5 = r0.a()
            java.util.Iterator r5 = r5.iterator()
        L2a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L3e
            java.lang.Object r6 = r5.next()
            ep.b r6 = (ep.b) r6
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L2a
            r3 = r4
            goto L3f
        L3e:
            r3 = r1
        L3f:
            if (r3 != 0) goto L15
            goto L43
        L42:
            r1 = r4
        L43:
            if (r1 == 0) goto L4
            return r4
        L46:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ep.d.A(java.lang.Iterable, java.lang.Iterable):boolean");
    }

    private static boolean B(List<b> list) {
        int[][] iArr;
        boolean z11;
        for (int[] iArr2 : f25235p) {
            if (list.size() <= iArr2.length) {
                int i11 = 0;
                while (true) {
                    if (i11 >= list.size()) {
                        z11 = true;
                        break;
                    } else if (list.get(i11).b().c() != iArr2[i11]) {
                        z11 = false;
                        break;
                    } else {
                        i11++;
                    }
                }
                if (z11) {
                    return true;
                }
            }
        }
        return false;
    }

    private dp.c C(uo.a aVar, int i11, boolean z11) {
        int i12;
        int i13;
        int i14;
        if (z11) {
            int i15 = this.f25238i[0] - 1;
            while (i15 >= 0 && !aVar.c(i15)) {
                i15--;
            }
            int i16 = i15 + 1;
            int[] iArr = this.f25238i;
            i14 = iArr[0] - i16;
            i12 = iArr[1];
            i13 = i16;
        } else {
            int[] iArr2 = this.f25238i;
            int i17 = iArr2[0];
            int f11 = aVar.f(iArr2[1] + 1);
            i12 = f11;
            i13 = i17;
            i14 = f11 - this.f25238i[1];
        }
        int[] i18 = i();
        System.arraycopy(i18, 0, i18, 1, i18.length - 1);
        i18[0] = i14;
        try {
            return new dp.c(dp.a.p(i18, f25233n), new int[]{i13, i12}, i13, i12, i11);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004c, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void D(java.util.List<ep.b> r6, java.util.List<ep.c> r7) {
        /*
            java.util.Iterator r7 = r7.iterator()
        L4:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r0 = r7.next()
            ep.c r0 = (ep.c) r0
            java.util.List r1 = r0.a()
            int r1 = r1.size()
            int r2 = r6.size()
            if (r1 == r2) goto L4
            java.util.List r0 = r0.a()
            java.util.Iterator r0 = r0.iterator()
        L26:
            boolean r1 = r0.hasNext()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r0.next()
            ep.b r1 = (ep.b) r1
            java.util.Iterator r4 = r6.iterator()
        L38:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4b
            java.lang.Object r5 = r4.next()
            ep.b r5 = (ep.b) r5
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L38
            goto L4c
        L4b:
            r3 = r2
        L4c:
            if (r3 != 0) goto L26
            goto L50
        L4f:
            r2 = r3
        L50:
            if (r2 == 0) goto L4
            r7.remove()
            goto L4
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ep.d.D(java.util.List, java.util.List):void");
    }

    private static void F(int[] iArr) {
        int length = iArr.length;
        for (int i11 = 0; i11 < length / 2; i11++) {
            int i12 = iArr[i11];
            int i13 = (length - i11) - 1;
            iArr[i11] = iArr[i13];
            iArr[i13] = i12;
        }
    }

    private void G(int i11, boolean z11) {
        boolean z12 = false;
        int i12 = 0;
        boolean z13 = false;
        while (true) {
            if (i12 >= this.f25237h.size()) {
                break;
            }
            c cVar = this.f25237h.get(i12);
            if (cVar.b() > i11) {
                z12 = cVar.c(this.f25236g);
                break;
            } else {
                z13 = cVar.c(this.f25236g);
                i12++;
            }
        }
        if (z12 || z13 || A(this.f25236g, this.f25237h)) {
            return;
        }
        this.f25237h.add(i12, new c(this.f25236g, i11, z11));
        D(this.f25236g, this.f25237h);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void q(int r11) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ep.d.q(int):void");
    }

    private boolean r() {
        b bVar = this.f25236g.get(0);
        dp.b c11 = bVar.c();
        dp.b d11 = bVar.d();
        if (d11 == null) {
            return false;
        }
        int a11 = d11.a();
        int i11 = 2;
        for (int i12 = 1; i12 < this.f25236g.size(); i12++) {
            b bVar2 = this.f25236g.get(i12);
            a11 += bVar2.c().a();
            i11++;
            dp.b d12 = bVar2.d();
            if (d12 != null) {
                a11 += d12.a();
                i11++;
            }
        }
        return ((i11 + (-4)) * Primes.SMALL_FACTOR_LIMIT) + (a11 % Primes.SMALL_FACTOR_LIMIT) == c11.b();
    }

    private List<b> s(List<c> list, int i11) {
        while (i11 < this.f25237h.size()) {
            c cVar = this.f25237h.get(i11);
            this.f25236g.clear();
            for (c cVar2 : list) {
                this.f25236g.addAll(cVar2.a());
            }
            this.f25236g.addAll(cVar.a());
            if (B(this.f25236g)) {
                if (r()) {
                    return this.f25236g;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(cVar);
                try {
                    return s(arrayList, i11 + 1);
                } catch (NotFoundException unused) {
                    continue;
                }
            }
            i11++;
        }
        throw NotFoundException.a();
    }

    private List<b> t(boolean z11) {
        List<b> list = null;
        if (this.f25237h.size() > 25) {
            this.f25237h.clear();
            return null;
        }
        this.f25236g.clear();
        if (z11) {
            Collections.reverse(this.f25237h);
        }
        try {
            list = s(new ArrayList(), 0);
        } catch (NotFoundException unused) {
        }
        if (z11) {
            Collections.reverse(this.f25237h);
        }
        return list;
    }

    static j u(List<b> list) {
        String d11 = fp.j.a(a.a(list)).d();
        l[] a11 = list.get(0).b().a();
        l[] a12 = list.get(list.size() - 1).b().a();
        return new j(d11, null, new l[]{a11[0], a11[1], a12[0], a12[1]}, com.google.zxing.a.RSS_EXPANDED);
    }

    private void x(uo.a aVar, List<b> list, int i11) {
        int[] i12 = i();
        i12[0] = 0;
        i12[1] = 0;
        i12[2] = 0;
        i12[3] = 0;
        int g11 = aVar.g();
        if (i11 < 0) {
            i11 = list.isEmpty() ? 0 : list.get(list.size() - 1).b().b()[1];
        }
        boolean z11 = list.size() % 2 != 0;
        if (this.f25239j) {
            z11 = !z11;
        }
        boolean z12 = false;
        while (i11 < g11) {
            z12 = !aVar.c(i11);
            if (!z12) {
                break;
            }
            i11++;
        }
        int i13 = 0;
        boolean z13 = z12;
        int i14 = i11;
        while (i11 < g11) {
            if (aVar.c(i11) != z13) {
                i12[i13] = i12[i13] + 1;
            } else {
                if (i13 == 3) {
                    if (z11) {
                        F(i12);
                    }
                    if (dp.a.o(i12)) {
                        int[] iArr = this.f25238i;
                        iArr[0] = i14;
                        iArr[1] = i11;
                        return;
                    }
                    if (z11) {
                        F(i12);
                    }
                    i14 += i12[0] + i12[1];
                    i12[0] = i12[2];
                    i12[1] = i12[3];
                    i12[2] = 0;
                    i12[3] = 0;
                    i13--;
                } else {
                    i13++;
                }
                i12[i13] = 1;
                z13 = !z13;
            }
            i11++;
        }
        throw NotFoundException.a();
    }

    private static int y(uo.a aVar, int i11) {
        if (aVar.c(i11)) {
            return aVar.e(aVar.f(i11));
        }
        return aVar.f(aVar.e(i11));
    }

    private static boolean z(dp.c cVar, boolean z11, boolean z12) {
        return (cVar.c() == 0 && z11 && z12) ? false : true;
    }

    b E(uo.a aVar, List<b> list, int i11) {
        dp.c C;
        dp.b bVar;
        boolean z11 = list.size() % 2 == 0;
        if (this.f25239j) {
            z11 = !z11;
        }
        int i12 = -1;
        boolean z12 = true;
        do {
            x(aVar, list, i12);
            C = C(aVar, i11, z11);
            if (C == null) {
                i12 = y(aVar, this.f25238i[0]);
                continue;
            } else {
                z12 = false;
                continue;
            }
        } while (z12);
        dp.b v11 = v(aVar, C, z11, true);
        if (!list.isEmpty() && list.get(list.size() - 1).f()) {
            throw NotFoundException.a();
        }
        try {
            bVar = v(aVar, C, z11, false);
        } catch (NotFoundException unused) {
            bVar = null;
        }
        return new b(v11, bVar, C, true);
    }

    @Override // cp.k
    public j b(int i11, uo.a aVar, Map<com.google.zxing.d, ?> map) {
        this.f25236g.clear();
        this.f25239j = false;
        try {
            return u(w(i11, aVar));
        } catch (NotFoundException unused) {
            this.f25236g.clear();
            this.f25239j = true;
            return u(w(i11, aVar));
        }
    }

    @Override // cp.k, com.google.zxing.i
    public void reset() {
        this.f25236g.clear();
        this.f25237h.clear();
    }

    dp.b v(uo.a aVar, dp.c cVar, boolean z11, boolean z12) {
        int[] h11 = h();
        for (int i11 = 0; i11 < h11.length; i11++) {
            h11[i11] = 0;
        }
        if (z12) {
            k.f(aVar, cVar.b()[0], h11);
        } else {
            k.e(aVar, cVar.b()[1], h11);
            int i12 = 0;
            for (int length = h11.length - 1; i12 < length; length--) {
                int i13 = h11[i12];
                h11[i12] = h11[length];
                h11[length] = i13;
                i12++;
            }
        }
        float d11 = vo.a.d(h11) / 17.0f;
        float f11 = (cVar.b()[1] - cVar.b()[0]) / 15.0f;
        if (Math.abs(d11 - f11) / f11 <= 0.3f) {
            int[] l11 = l();
            int[] j11 = j();
            float[] m11 = m();
            float[] k11 = k();
            for (int i14 = 0; i14 < h11.length; i14++) {
                float f12 = (h11[i14] * 1.0f) / d11;
                int i15 = (int) (0.5f + f12);
                if (i15 <= 0) {
                    if (f12 < 0.3f) {
                        throw NotFoundException.a();
                    }
                    i15 = 1;
                } else if (i15 > 8) {
                    if (f12 > 8.7f) {
                        throw NotFoundException.a();
                    }
                    i15 = 8;
                }
                int i16 = i14 / 2;
                if ((i14 & 1) == 0) {
                    l11[i16] = i15;
                    m11[i16] = f12 - i15;
                } else {
                    j11[i16] = i15;
                    k11[i16] = f12 - i15;
                }
            }
            q(17);
            int c11 = (((cVar.c() * 4) + (z11 ? 0 : 2)) + (!z12 ? 1 : 0)) - 1;
            int i17 = 0;
            int i18 = 0;
            for (int length2 = l11.length - 1; length2 >= 0; length2--) {
                if (z(cVar, z11, z12)) {
                    i17 += l11[length2] * f25234o[c11][length2 * 2];
                }
                i18 += l11[length2];
            }
            int i19 = 0;
            for (int length3 = j11.length - 1; length3 >= 0; length3--) {
                if (z(cVar, z11, z12)) {
                    i19 += j11[length3] * f25234o[c11][(length3 * 2) + 1];
                }
            }
            int i21 = i17 + i19;
            if ((i18 & 1) == 0 && i18 <= 13 && i18 >= 4) {
                int i22 = (13 - i18) / 2;
                int i23 = f25230k[i22];
                return new dp.b((f.b(l11, i23, true) * f25231l[i22]) + f.b(j11, 9 - i23, false) + f25232m[i22], i21);
            }
            throw NotFoundException.a();
        }
        throw NotFoundException.a();
    }

    List<b> w(int i11, uo.a aVar) {
        boolean z11 = false;
        while (!z11) {
            try {
                List<b> list = this.f25236g;
                list.add(E(aVar, list, i11));
            } catch (NotFoundException e11) {
                if (this.f25236g.isEmpty()) {
                    throw e11;
                }
                z11 = true;
            }
        }
        if (r()) {
            return this.f25236g;
        }
        boolean z12 = !this.f25237h.isEmpty();
        G(i11, false);
        if (z12) {
            List<b> t11 = t(false);
            if (t11 != null) {
                return t11;
            }
            List<b> t12 = t(true);
            if (t12 != null) {
                return t12;
            }
        }
        throw NotFoundException.a();
    }
}