package hp;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.l;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static final ip.a f29385a = new ip.a();

    private static c a(h hVar) {
        int[] j11;
        if (hVar == null || (j11 = hVar.j()) == null) {
            return null;
        }
        int p11 = p(j11);
        int i11 = 0;
        int i12 = 0;
        for (int i13 : j11) {
            i12 += p11 - i13;
            if (i13 > 0) {
                break;
            }
        }
        d[] d11 = hVar.d();
        for (int i14 = 0; i12 > 0 && d11[i14] == null; i14++) {
            i12--;
        }
        for (int length = j11.length - 1; length >= 0; length--) {
            i11 += p11 - j11[length];
            if (j11[length] > 0) {
                break;
            }
        }
        for (int length2 = d11.length - 1; i11 > 0 && d11[length2] == null; length2--) {
            i11--;
        }
        return hVar.a().a(i12, i11, hVar.k());
    }

    private static void b(f fVar, b[][] bVarArr) {
        b bVar = bVarArr[0][1];
        int[] a11 = bVar.a();
        int j11 = (fVar.j() * fVar.l()) - r(fVar.k());
        if (a11.length != 0) {
            if (a11[0] != j11) {
                bVar.b(j11);
            }
        } else if (j11 > 0 && j11 <= 928) {
            bVar.b(j11);
        } else {
            throw NotFoundException.a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0022, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0022, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0022, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int c(uo.b r5, int r6, int r7, boolean r8, int r9, int r10) {
        /*
            if (r8 == 0) goto L4
            r0 = -1
            goto L5
        L4:
            r0 = 1
        L5:
            r1 = 0
            r2 = r9
        L7:
            r3 = 2
            if (r1 >= r3) goto L28
        La:
            if (r8 == 0) goto Lf
            if (r2 < r6) goto L22
            goto L11
        Lf:
            if (r2 >= r7) goto L22
        L11:
            boolean r4 = r5.d(r2, r10)
            if (r8 != r4) goto L22
            int r4 = r9 - r2
            int r4 = java.lang.Math.abs(r4)
            if (r4 <= r3) goto L20
            return r9
        L20:
            int r2 = r2 + r0
            goto La
        L22:
            int r0 = -r0
            r8 = r8 ^ 1
            int r1 = r1 + 1
            goto L7
        L28:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: hp.j.c(uo.b, int, int, boolean, int, int):int");
    }

    private static boolean d(int i11, int i12, int i13) {
        return i12 + (-2) <= i11 && i11 <= i13 + 2;
    }

    private static int e(int[] iArr, int[] iArr2, int i11) {
        if ((iArr2 == null || iArr2.length <= (i11 / 2) + 3) && i11 >= 0 && i11 <= 512) {
            return f29385a.a(iArr, i11, iArr2);
        }
        throw ChecksumException.a();
    }

    private static b[][] f(f fVar) {
        g[] o11;
        d[] d11;
        int c11;
        b[][] bVarArr = (b[][]) Array.newInstance(b.class, fVar.l(), fVar.j() + 2);
        for (int i11 = 0; i11 < bVarArr.length; i11++) {
            for (int i12 = 0; i12 < bVarArr[i11].length; i12++) {
                bVarArr[i11][i12] = new b();
            }
        }
        int i13 = 0;
        for (g gVar : fVar.o()) {
            if (gVar != null) {
                for (d dVar : gVar.d()) {
                    if (dVar != null && (c11 = dVar.c()) >= 0 && c11 < bVarArr.length) {
                        bVarArr[c11][i13].b(dVar.e());
                    }
                }
            }
            i13++;
        }
        return bVarArr;
    }

    private static uo.e g(f fVar) {
        b[][] f11 = f(fVar);
        b(fVar, f11);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[fVar.l() * fVar.j()];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i11 = 0; i11 < fVar.l(); i11++) {
            int i12 = 0;
            while (i12 < fVar.j()) {
                int i13 = i12 + 1;
                int[] a11 = f11[i11][i13].a();
                int j11 = (fVar.j() * i11) + i12;
                if (a11.length == 0) {
                    arrayList.add(Integer.valueOf(j11));
                } else if (a11.length == 1) {
                    iArr[j11] = a11[0];
                } else {
                    arrayList3.add(Integer.valueOf(j11));
                    arrayList2.add(a11);
                }
                i12 = i13;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size];
        for (int i14 = 0; i14 < size; i14++) {
            iArr2[i14] = (int[]) arrayList2.get(i14);
        }
        return h(fVar.k(), iArr, gp.a.b(arrayList), gp.a.b(arrayList3), iArr2);
    }

    private static uo.e h(int i11, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i12 = 100;
        while (true) {
            int i13 = i12 - 1;
            if (i12 > 0) {
                for (int i14 = 0; i14 < length; i14++) {
                    iArr[iArr3[i14]] = iArr4[i14][iArr5[i14]];
                }
                try {
                    return j(iArr, i11, iArr2);
                } catch (ChecksumException unused) {
                    if (length == 0) {
                        throw ChecksumException.a();
                    }
                    int i15 = 0;
                    while (true) {
                        if (i15 >= length) {
                            break;
                        } else if (iArr5[i15] < iArr4[i15].length - 1) {
                            iArr5[i15] = iArr5[i15] + 1;
                            break;
                        } else {
                            iArr5[i15] = 0;
                            if (i15 == length - 1) {
                                throw ChecksumException.a();
                            }
                            i15++;
                        }
                    }
                    i12 = i13;
                }
            } else {
                throw ChecksumException.a();
            }
        }
    }

    public static uo.e i(uo.b bVar, l lVar, l lVar2, l lVar3, l lVar4, int i11, int i12) {
        g hVar;
        int i13;
        int i14;
        int i15;
        int i16;
        h hVar2 = null;
        h hVar3 = null;
        f fVar = null;
        c cVar = new c(bVar, lVar, lVar2, lVar3, lVar4);
        for (int i17 = 0; i17 < 2; i17++) {
            if (lVar != null) {
                hVar2 = s(bVar, cVar, lVar, true, i11, i12);
            }
            if (lVar3 != null) {
                hVar3 = s(bVar, cVar, lVar3, false, i11, i12);
            }
            fVar = v(hVar2, hVar3);
            if (fVar != null) {
                if (i17 == 0 && fVar.m() != null && (fVar.m().g() < cVar.g() || fVar.m().e() > cVar.e())) {
                    cVar = fVar.m();
                } else {
                    fVar.p(cVar);
                    break;
                }
            } else {
                throw NotFoundException.a();
            }
        }
        int j11 = fVar.j() + 1;
        fVar.q(0, hVar2);
        fVar.q(j11, hVar3);
        boolean z11 = hVar2 != null;
        int i18 = i11;
        int i19 = i12;
        for (int i21 = 1; i21 <= j11; i21++) {
            int i22 = z11 ? i21 : j11 - i21;
            if (fVar.n(i22) == null) {
                if (i22 != 0 && i22 != j11) {
                    hVar = new g(cVar);
                } else {
                    hVar = new h(cVar, i22 == 0);
                }
                fVar.q(i22, hVar);
                int i23 = -1;
                int g11 = cVar.g();
                int i24 = -1;
                while (g11 <= cVar.e()) {
                    int t11 = t(fVar, i22, g11, z11);
                    if (t11 >= 0 && t11 <= cVar.d()) {
                        i16 = t11;
                    } else if (i24 != i23) {
                        i16 = i24;
                    } else {
                        i13 = i24;
                        i14 = g11;
                        i15 = i23;
                        i24 = i13;
                        g11 = i14 + 1;
                        i23 = i15;
                    }
                    i13 = i24;
                    int i25 = g11;
                    i15 = i23;
                    d k11 = k(bVar, cVar.f(), cVar.d(), z11, i16, i25, i18, i19);
                    i14 = i25;
                    if (k11 != null) {
                        hVar.f(i14, k11);
                        i18 = Math.min(i18, k11.f());
                        i19 = Math.max(i19, k11.f());
                        i24 = i16;
                        g11 = i14 + 1;
                        i23 = i15;
                    }
                    i24 = i13;
                    g11 = i14 + 1;
                    i23 = i15;
                }
            }
        }
        return g(fVar);
    }

    private static uo.e j(int[] iArr, int i11, int[] iArr2) {
        if (iArr.length != 0) {
            int i12 = 1 << (i11 + 1);
            int e11 = e(iArr, iArr2, i12);
            w(iArr, i12);
            uo.e b11 = e.b(iArr, String.valueOf(i11));
            b11.k(Integer.valueOf(e11));
            b11.j(Integer.valueOf(iArr2.length));
            return b11;
        }
        throw FormatException.a();
    }

    private static d k(uo.b bVar, int i11, int i12, boolean z11, int i13, int i14, int i15, int i16) {
        int i17;
        int d11;
        int a11;
        int c11 = c(bVar, i11, i12, z11, i13, i14);
        int[] q11 = q(bVar, i11, i12, z11, c11, i14);
        if (q11 == null) {
            return null;
        }
        int d12 = vo.a.d(q11);
        if (z11) {
            i17 = c11 + d12;
        } else {
            for (int i18 = 0; i18 < q11.length / 2; i18++) {
                int i19 = q11[i18];
                q11[i18] = q11[(q11.length - 1) - i18];
                q11[(q11.length - 1) - i18] = i19;
            }
            c11 -= d12;
            i17 = c11;
        }
        if (d(d12, i15, i16) && (a11 = gp.a.a((d11 = i.d(q11)))) != -1) {
            return new d(c11, i17, n(d11), a11);
        }
        return null;
    }

    private static a l(h hVar, h hVar2) {
        a i11;
        a i12;
        if (hVar == null || (i11 = hVar.i()) == null) {
            if (hVar2 == null) {
                return null;
            }
            return hVar2.i();
        } else if (hVar2 == null || (i12 = hVar2.i()) == null || i11.a() == i12.a() || i11.b() == i12.b() || i11.c() == i12.c()) {
            return i11;
        } else {
            return null;
        }
    }

    private static int[] m(int i11) {
        int[] iArr = new int[8];
        int i12 = 0;
        int i13 = 7;
        while (true) {
            int i14 = i11 & 1;
            if (i14 != i12) {
                i13--;
                if (i13 < 0) {
                    return iArr;
                }
                i12 = i14;
            }
            iArr[i13] = iArr[i13] + 1;
            i11 >>= 1;
        }
    }

    private static int n(int i11) {
        return o(m(i11));
    }

    private static int o(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    private static int p(int[] iArr) {
        int i11 = -1;
        for (int i12 : iArr) {
            i11 = Math.max(i11, i12);
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0027 A[EDGE_INSN: B:27:0x0027->B:16:0x0027 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int[] q(uo.b r7, int r8, int r9, boolean r10, int r11, int r12) {
        /*
            r0 = 8
            int[] r1 = new int[r0]
            r2 = 1
            if (r10 == 0) goto L9
            r3 = r2
            goto La
        L9:
            r3 = -1
        La:
            r4 = 0
            r5 = r10
        Lc:
            if (r10 == 0) goto L11
            if (r11 >= r9) goto L27
            goto L13
        L11:
            if (r11 < r8) goto L27
        L13:
            if (r4 >= r0) goto L27
            boolean r6 = r7.d(r11, r12)
            if (r6 != r5) goto L22
            r6 = r1[r4]
            int r6 = r6 + r2
            r1[r4] = r6
            int r11 = r11 + r3
            goto Lc
        L22:
            int r4 = r4 + 1
            r5 = r5 ^ 1
            goto Lc
        L27:
            if (r4 == r0) goto L34
            if (r10 == 0) goto L2c
            r8 = r9
        L2c:
            if (r11 != r8) goto L32
            r7 = 7
            if (r4 != r7) goto L32
            goto L34
        L32:
            r7 = 0
            return r7
        L34:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hp.j.q(uo.b, int, int, boolean, int, int):int[]");
    }

    private static int r(int i11) {
        return 2 << i11;
    }

    private static h s(uo.b bVar, c cVar, l lVar, boolean z11, int i11, int i12) {
        int b11;
        h hVar = new h(cVar, z11);
        int i13 = 0;
        while (i13 < 2) {
            int i14 = i13 == 0 ? 1 : -1;
            int c11 = (int) lVar.c();
            for (int d11 = (int) lVar.d(); d11 <= cVar.e() && d11 >= cVar.g(); d11 += i14) {
                d k11 = k(bVar, 0, bVar.j(), z11, c11, d11, i11, i12);
                if (k11 != null) {
                    hVar.f(d11, k11);
                    if (z11) {
                        b11 = k11.d();
                    } else {
                        b11 = k11.b();
                    }
                    c11 = b11;
                }
            }
            i13++;
        }
        return hVar;
    }

    private static int t(f fVar, int i11, int i12, boolean z11) {
        d[] d11;
        int i13 = z11 ? 1 : -1;
        int i14 = i11 - i13;
        d b11 = u(fVar, i14) ? fVar.n(i14).b(i12) : null;
        if (b11 != null) {
            return z11 ? b11.b() : b11.d();
        }
        d c11 = fVar.n(i11).c(i12);
        if (c11 != null) {
            return z11 ? c11.d() : c11.b();
        }
        if (u(fVar, i14)) {
            c11 = fVar.n(i14).c(i12);
        }
        if (c11 != null) {
            return z11 ? c11.b() : c11.d();
        }
        int i15 = 0;
        while (true) {
            i11 -= i13;
            if (u(fVar, i11)) {
                for (d dVar : fVar.n(i11).d()) {
                    if (dVar != null) {
                        return (z11 ? dVar.b() : dVar.d()) + (i13 * i15 * (dVar.b() - dVar.d()));
                    }
                }
                i15++;
            } else {
                c m11 = fVar.m();
                return z11 ? m11.f() : m11.d();
            }
        }
    }

    private static boolean u(f fVar, int i11) {
        return i11 >= 0 && i11 <= fVar.j() + 1;
    }

    private static f v(h hVar, h hVar2) {
        a l11;
        if ((hVar == null && hVar2 == null) || (l11 = l(hVar, hVar2)) == null) {
            return null;
        }
        return new f(l11, c.j(a(hVar), a(hVar2)));
    }

    private static void w(int[] iArr, int i11) {
        if (iArr.length >= 4) {
            int i12 = iArr[0];
            if (i12 > iArr.length) {
                throw FormatException.a();
            }
            if (i12 == 0) {
                if (i11 < iArr.length) {
                    iArr[0] = iArr.length - i11;
                    return;
                }
                throw FormatException.a();
            }
            return;
        }
        throw FormatException.a();
    }
}