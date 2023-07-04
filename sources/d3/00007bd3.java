package ji;

import ak.k0;
import com.google.android.exoplayer2.ParserException;

/* loaded from: classes3.dex */
public final class m {

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public long f33743a;
    }

    private static boolean a(ak.v vVar, p pVar, int i11) {
        int j11 = j(vVar, i11);
        return j11 != -1 && j11 <= pVar.f33748b;
    }

    private static boolean b(ak.v vVar, int i11) {
        return vVar.C() == k0.v(vVar.d(), i11, vVar.e() - 1, 0);
    }

    private static boolean c(ak.v vVar, p pVar, boolean z11, a aVar) {
        try {
            long J = vVar.J();
            if (!z11) {
                J *= pVar.f33748b;
            }
            aVar.f33743a = J;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(ak.v vVar, p pVar, int i11, a aVar) {
        int e11 = vVar.e();
        long E = vVar.E();
        long j11 = E >>> 16;
        if (j11 != i11) {
            return false;
        }
        return g((int) ((E >> 4) & 15), pVar) && f((int) ((E >> 1) & 7), pVar) && !(((E & 1) > 1L ? 1 : ((E & 1) == 1L ? 0 : -1)) == 0) && c(vVar, pVar, ((j11 & 1) > 1L ? 1 : ((j11 & 1) == 1L ? 0 : -1)) == 0, aVar) && a(vVar, pVar, (int) ((E >> 12) & 15)) && e(vVar, pVar, (int) ((E >> 8) & 15)) && b(vVar, e11);
    }

    private static boolean e(ak.v vVar, p pVar, int i11) {
        int i12 = pVar.f33751e;
        if (i11 == 0) {
            return true;
        }
        if (i11 <= 11) {
            return i11 == pVar.f33752f;
        } else if (i11 == 12) {
            return vVar.C() * 1000 == i12;
        } else if (i11 <= 14) {
            int I = vVar.I();
            if (i11 == 14) {
                I *= 10;
            }
            return I == i12;
        } else {
            return false;
        }
    }

    private static boolean f(int i11, p pVar) {
        return i11 == 0 || i11 == pVar.f33755i;
    }

    private static boolean g(int i11, p pVar) {
        return i11 <= 7 ? i11 == pVar.f33753g - 1 : i11 <= 10 && pVar.f33753g == 2;
    }

    public static boolean h(i iVar, p pVar, int i11, a aVar) {
        long f11 = iVar.f();
        byte[] bArr = new byte[2];
        iVar.n(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i11) {
            iVar.d();
            iVar.g((int) (f11 - iVar.getPosition()));
            return false;
        }
        ak.v vVar = new ak.v(16);
        System.arraycopy(bArr, 0, vVar.d(), 0, 2);
        vVar.N(k.a(iVar, vVar.d(), 2, 14));
        iVar.d();
        iVar.g((int) (f11 - iVar.getPosition()));
        return d(vVar, pVar, i11, aVar);
    }

    public static long i(i iVar, p pVar) {
        iVar.d();
        iVar.g(1);
        byte[] bArr = new byte[1];
        iVar.n(bArr, 0, 1);
        boolean z11 = (bArr[0] & 1) == 1;
        iVar.g(2);
        int i11 = z11 ? 7 : 6;
        ak.v vVar = new ak.v(i11);
        vVar.N(k.a(iVar, vVar.d(), 0, i11));
        iVar.d();
        a aVar = new a();
        if (c(vVar, pVar, z11, aVar)) {
            return aVar.f33743a;
        }
        throw new ParserException();
    }

    public static int j(ak.v vVar, int i11) {
        switch (i11) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i11 - 2);
            case 6:
                return vVar.C() + 1;
            case 7:
                return vVar.I() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i11 - 8);
            default:
                return -1;
        }
    }
}