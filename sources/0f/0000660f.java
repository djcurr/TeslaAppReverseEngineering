package dp;

import com.google.zxing.NotFoundException;
import com.google.zxing.j;
import com.google.zxing.l;
import com.google.zxing.m;
import cp.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes2.dex */
public final class e extends a {

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f24225i = {1, 10, 34, 70, 126};

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f24226j = {4, 20, 48, 81};

    /* renamed from: k  reason: collision with root package name */
    private static final int[] f24227k = {0, CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384, 961, 2015, 2715};

    /* renamed from: l  reason: collision with root package name */
    private static final int[] f24228l = {0, 336, 1036, 1516};

    /* renamed from: m  reason: collision with root package name */
    private static final int[] f24229m = {8, 6, 4, 3, 1};

    /* renamed from: n  reason: collision with root package name */
    private static final int[] f24230n = {2, 4, 6, 8};

    /* renamed from: o  reason: collision with root package name */
    private static final int[][] f24231o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: g  reason: collision with root package name */
    private final List<d> f24232g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final List<d> f24233h = new ArrayList();

    private static void q(Collection<d> collection, d dVar) {
        if (dVar == null) {
            return;
        }
        boolean z11 = false;
        Iterator<d> it2 = collection.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            d next = it2.next();
            if (next.b() == dVar.b()) {
                next.e();
                z11 = true;
                break;
            }
        }
        if (z11) {
            return;
        }
        collection.add(dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r1 < 4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
        if (r1 < 4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
        r5 = false;
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
        r2 = false;
        r5 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void r(boolean r10, int r11) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dp.e.r(boolean, int):void");
    }

    private static boolean s(d dVar, d dVar2) {
        int a11 = (dVar.a() + (dVar2.a() * 16)) % 79;
        int c11 = (dVar.d().c() * 9) + dVar2.d().c();
        if (c11 > 72) {
            c11--;
        }
        if (c11 > 8) {
            c11--;
        }
        return a11 == c11;
    }

    private static j t(d dVar, d dVar2) {
        String valueOf = String.valueOf((dVar.b() * 4537077) + dVar2.b());
        StringBuilder sb2 = new StringBuilder(14);
        for (int length = 13 - valueOf.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(valueOf);
        int i11 = 0;
        for (int i12 = 0; i12 < 13; i12++) {
            int charAt = sb2.charAt(i12) - '0';
            if ((i12 & 1) == 0) {
                charAt *= 3;
            }
            i11 += charAt;
        }
        int i13 = 10 - (i11 % 10);
        if (i13 == 10) {
            i13 = 0;
        }
        sb2.append(i13);
        l[] a11 = dVar.d().a();
        l[] a12 = dVar2.d().a();
        return new j(sb2.toString(), null, new l[]{a11[0], a11[1], a12[0], a12[1]}, com.google.zxing.a.RSS_14);
    }

    private b u(uo.a aVar, c cVar, boolean z11) {
        int[] h11 = h();
        for (int i11 = 0; i11 < h11.length; i11++) {
            h11[i11] = 0;
        }
        if (z11) {
            k.f(aVar, cVar.b()[0], h11);
        } else {
            k.e(aVar, cVar.b()[1] + 1, h11);
            int i12 = 0;
            for (int length = h11.length - 1; i12 < length; length--) {
                int i13 = h11[i12];
                h11[i12] = h11[length];
                h11[length] = i13;
                i12++;
            }
        }
        int i14 = z11 ? 16 : 15;
        float d11 = vo.a.d(h11) / i14;
        int[] l11 = l();
        int[] j11 = j();
        float[] m11 = m();
        float[] k11 = k();
        for (int i15 = 0; i15 < h11.length; i15++) {
            float f11 = h11[i15] / d11;
            int i16 = (int) (0.5f + f11);
            if (i16 <= 0) {
                i16 = 1;
            } else if (i16 > 8) {
                i16 = 8;
            }
            int i17 = i15 / 2;
            if ((i15 & 1) == 0) {
                l11[i17] = i16;
                m11[i17] = f11 - i16;
            } else {
                j11[i17] = i16;
                k11[i17] = f11 - i16;
            }
        }
        r(z11, i14);
        int i18 = 0;
        int i19 = 0;
        for (int length2 = l11.length - 1; length2 >= 0; length2--) {
            i18 = (i18 * 9) + l11[length2];
            i19 += l11[length2];
        }
        int i21 = 0;
        int i22 = 0;
        for (int length3 = j11.length - 1; length3 >= 0; length3--) {
            i21 = (i21 * 9) + j11[length3];
            i22 += j11[length3];
        }
        int i23 = i18 + (i21 * 3);
        if (!z11) {
            if ((i22 & 1) == 0 && i22 <= 10 && i22 >= 4) {
                int i24 = (10 - i22) / 2;
                int i25 = f24230n[i24];
                return new b((f.b(j11, 9 - i25, false) * f24226j[i24]) + f.b(l11, i25, true) + f24228l[i24], i23);
            }
            throw NotFoundException.a();
        } else if ((i19 & 1) == 0 && i19 <= 12 && i19 >= 4) {
            int i26 = (12 - i19) / 2;
            int i27 = f24229m[i26];
            return new b((f.b(l11, i27, false) * f24225i[i26]) + f.b(j11, 9 - i27, true) + f24227k[i26], i23);
        } else {
            throw NotFoundException.a();
        }
    }

    private d v(uo.a aVar, boolean z11, int i11, Map<com.google.zxing.d, ?> map) {
        try {
            int[] w11 = w(aVar, z11);
            c x11 = x(aVar, i11, z11, w11);
            m mVar = map == null ? null : (m) map.get(com.google.zxing.d.NEED_RESULT_POINT_CALLBACK);
            if (mVar != null) {
                float f11 = (w11[0] + w11[1]) / 2.0f;
                if (z11) {
                    f11 = (aVar.g() - 1) - f11;
                }
                mVar.a(new l(f11, i11));
            }
            b u11 = u(aVar, x11, true);
            b u12 = u(aVar, x11, false);
            return new d((u11.b() * 1597) + u12.b(), u11.a() + (u12.a() * 4), x11);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    private int[] w(uo.a aVar, boolean z11) {
        int[] i11 = i();
        i11[0] = 0;
        i11[1] = 0;
        i11[2] = 0;
        i11[3] = 0;
        int g11 = aVar.g();
        int i12 = 0;
        boolean z12 = false;
        while (i12 < g11) {
            z12 = !aVar.c(i12);
            if (z11 == z12) {
                break;
            }
            i12++;
        }
        int i13 = 0;
        int i14 = i12;
        while (i12 < g11) {
            if (aVar.c(i12) != z12) {
                i11[i13] = i11[i13] + 1;
            } else {
                if (i13 != 3) {
                    i13++;
                } else if (a.o(i11)) {
                    return new int[]{i14, i12};
                } else {
                    i14 += i11[0] + i11[1];
                    i11[0] = i11[2];
                    i11[1] = i11[3];
                    i11[2] = 0;
                    i11[3] = 0;
                    i13--;
                }
                i11[i13] = 1;
                z12 = !z12;
            }
            i12++;
        }
        throw NotFoundException.a();
    }

    private c x(uo.a aVar, int i11, boolean z11, int[] iArr) {
        int i12;
        int i13;
        boolean c11 = aVar.c(iArr[0]);
        int i14 = iArr[0] - 1;
        while (i14 >= 0 && c11 != aVar.c(i14)) {
            i14--;
        }
        int i15 = i14 + 1;
        int[] i16 = i();
        System.arraycopy(i16, 0, i16, 1, i16.length - 1);
        i16[0] = iArr[0] - i15;
        int p11 = a.p(i16, f24231o);
        int i17 = iArr[1];
        if (z11) {
            i12 = (aVar.g() - 1) - i17;
            i13 = (aVar.g() - 1) - i15;
        } else {
            i12 = i17;
            i13 = i15;
        }
        return new c(p11, new int[]{i15, iArr[1]}, i13, i12, i11);
    }

    @Override // cp.k
    public j b(int i11, uo.a aVar, Map<com.google.zxing.d, ?> map) {
        q(this.f24232g, v(aVar, false, i11, map));
        aVar.j();
        q(this.f24233h, v(aVar, true, i11, map));
        aVar.j();
        for (d dVar : this.f24232g) {
            if (dVar.c() > 1) {
                for (d dVar2 : this.f24233h) {
                    if (dVar2.c() > 1 && s(dVar, dVar2)) {
                        return t(dVar, dVar2);
                    }
                }
                continue;
            }
        }
        throw NotFoundException.a();
    }

    @Override // cp.k, com.google.zxing.i
    public void reset() {
        this.f24232g.clear();
        this.f24233h.clear();
    }
}