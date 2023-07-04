package qi;

import ak.v;
import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* loaded from: classes3.dex */
final class n {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f48290a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    private static boolean a(int i11, boolean z11) {
        if ((i11 >>> 8) == 3368816) {
            return true;
        }
        if (i11 == 1751476579 && z11) {
            return true;
        }
        for (int i12 : f48290a) {
            if (i12 == i11) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(ji.i iVar) {
        return c(iVar, true, false);
    }

    private static boolean c(ji.i iVar, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        long length = iVar.getLength();
        long j11 = -1;
        int i11 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j12 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
        if (i11 != 0 && length <= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) {
            j12 = length;
        }
        int i12 = (int) j12;
        v vVar = new v(64);
        boolean z18 = false;
        int i13 = 0;
        boolean z19 = false;
        while (i13 < i12) {
            vVar.K(8);
            if (!iVar.a(vVar.d(), z18 ? 1 : 0, 8, true)) {
                break;
            }
            long E = vVar.E();
            int m11 = vVar.m();
            int i14 = 16;
            if (E == 1) {
                iVar.n(vVar.d(), 8, 8);
                vVar.N(16);
                E = vVar.v();
            } else {
                if (E == 0) {
                    long length2 = iVar.getLength();
                    if (length2 != j11) {
                        E = (length2 - iVar.f()) + 8;
                    }
                }
                i14 = 8;
            }
            long j13 = i14;
            if (E < j13) {
                return z18;
            }
            i13 += i14;
            if (m11 == 1836019574) {
                i12 += (int) E;
                if (i11 != 0 && i12 > length) {
                    i12 = (int) length;
                }
            } else if (m11 == 1836019558 || m11 == 1836475768) {
                z13 = z18 ? 1 : 0;
                z14 = true;
                z15 = true;
                break;
            } else {
                long j14 = length;
                if ((i13 + E) - j13 >= i12) {
                    z13 = false;
                    z14 = true;
                    break;
                }
                int i15 = (int) (E - j13);
                i13 += i15;
                if (m11 != 1718909296) {
                    z16 = false;
                    z19 = z19;
                    if (i15 != 0) {
                        iVar.g(i15);
                        z19 = z19;
                    }
                } else if (i15 < 8) {
                    return false;
                } else {
                    vVar.K(i15);
                    iVar.n(vVar.d(), 0, i15);
                    int i16 = i15 / 4;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= i16) {
                            z17 = z19;
                            break;
                        }
                        if (i17 == 1) {
                            vVar.P(4);
                        } else if (a(vVar.m(), z12)) {
                            z17 = true;
                            break;
                        }
                        i17++;
                    }
                    if (!z17) {
                        return false;
                    }
                    z16 = false;
                    z19 = z17;
                }
                z18 = z16;
                length = j14;
            }
            j11 = -1;
            z19 = z19;
        }
        z13 = z18 ? 1 : 0;
        z14 = true;
        z15 = z13;
        return (z19 && z11 == z15) ? z14 : z13;
    }

    public static boolean d(ji.i iVar, boolean z11) {
        return c(iVar, false, z11);
    }
}