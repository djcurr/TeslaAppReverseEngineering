package ji;

import com.google.android.exoplayer2.ParserException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import ji.p;

/* loaded from: classes3.dex */
public final class n {

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public p f33744a;

        public a(p pVar) {
            this.f33744a = pVar;
        }
    }

    public static boolean a(i iVar) {
        ak.v vVar = new ak.v(4);
        iVar.n(vVar.d(), 0, 4);
        return vVar.E() == 1716281667;
    }

    public static int b(i iVar) {
        iVar.d();
        ak.v vVar = new ak.v(2);
        iVar.n(vVar.d(), 0, 2);
        int I = vVar.I();
        if ((I >> 2) == 16382) {
            iVar.d();
            return I;
        }
        iVar.d();
        throw new ParserException("First frame does not start with sync code.");
    }

    public static wi.a c(i iVar, boolean z11) {
        wi.a a11 = new s().a(iVar, z11 ? null : bj.h.f7692b);
        if (a11 == null || a11.d() == 0) {
            return null;
        }
        return a11;
    }

    public static wi.a d(i iVar, boolean z11) {
        iVar.d();
        long f11 = iVar.f();
        wi.a c11 = c(iVar, z11);
        iVar.k((int) (iVar.f() - f11));
        return c11;
    }

    public static boolean e(i iVar, a aVar) {
        iVar.d();
        ak.u uVar = new ak.u(new byte[4]);
        iVar.n(uVar.f539a, 0, 4);
        boolean g11 = uVar.g();
        int h11 = uVar.h(7);
        int h12 = uVar.h(24) + 4;
        if (h11 == 0) {
            aVar.f33744a = i(iVar);
        } else {
            p pVar = aVar.f33744a;
            if (pVar == null) {
                throw new IllegalArgumentException();
            }
            if (h11 == 3) {
                aVar.f33744a = pVar.c(h(iVar, h12));
            } else if (h11 == 4) {
                aVar.f33744a = pVar.d(k(iVar, h12));
            } else if (h11 == 6) {
                aVar.f33744a = pVar.b(Collections.singletonList(f(iVar, h12)));
            } else {
                iVar.k(h12);
            }
        }
        return g11;
    }

    private static zi.a f(i iVar, int i11) {
        ak.v vVar = new ak.v(i11);
        iVar.readFully(vVar.d(), 0, i11);
        vVar.P(4);
        int m11 = vVar.m();
        String A = vVar.A(vVar.m(), com.google.common.base.f.f15918a);
        String z11 = vVar.z(vVar.m());
        int m12 = vVar.m();
        int m13 = vVar.m();
        int m14 = vVar.m();
        int m15 = vVar.m();
        int m16 = vVar.m();
        byte[] bArr = new byte[m16];
        vVar.j(bArr, 0, m16);
        return new zi.a(m11, A, z11, m12, m13, m14, m15, bArr);
    }

    public static p.a g(ak.v vVar) {
        vVar.P(1);
        int F = vVar.F();
        long e11 = vVar.e() + F;
        int i11 = F / 18;
        long[] jArr = new long[i11];
        long[] jArr2 = new long[i11];
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            long v11 = vVar.v();
            if (v11 == -1) {
                jArr = Arrays.copyOf(jArr, i12);
                jArr2 = Arrays.copyOf(jArr2, i12);
                break;
            }
            jArr[i12] = v11;
            jArr2[i12] = vVar.v();
            vVar.P(2);
            i12++;
        }
        vVar.P((int) (e11 - vVar.e()));
        return new p.a(jArr, jArr2);
    }

    private static p.a h(i iVar, int i11) {
        ak.v vVar = new ak.v(i11);
        iVar.readFully(vVar.d(), 0, i11);
        return g(vVar);
    }

    private static p i(i iVar) {
        byte[] bArr = new byte[38];
        iVar.readFully(bArr, 0, 38);
        return new p(bArr, 4);
    }

    public static void j(i iVar) {
        ak.v vVar = new ak.v(4);
        iVar.readFully(vVar.d(), 0, 4);
        if (vVar.E() != 1716281667) {
            throw new ParserException("Failed to read FLAC stream marker.");
        }
    }

    private static List<String> k(i iVar, int i11) {
        ak.v vVar = new ak.v(i11);
        iVar.readFully(vVar.d(), 0, i11);
        vVar.P(4);
        return Arrays.asList(z.i(vVar, false, false).f33786a);
    }
}