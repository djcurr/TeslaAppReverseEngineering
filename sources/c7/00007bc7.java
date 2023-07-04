package ji;

/* loaded from: classes3.dex */
public final class b {
    public static void a(long j11, ak.v vVar, x[] xVarArr) {
        while (true) {
            if (vVar.a() <= 1) {
                return;
            }
            int c11 = c(vVar);
            int c12 = c(vVar);
            int e11 = vVar.e() + c12;
            if (c12 == -1 || c12 > vVar.a()) {
                ak.o.h("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                e11 = vVar.f();
            } else if (c11 == 4 && c12 >= 8) {
                int C = vVar.C();
                int I = vVar.I();
                int m11 = I == 49 ? vVar.m() : 0;
                int C2 = vVar.C();
                if (I == 47) {
                    vVar.P(1);
                }
                boolean z11 = C == 181 && (I == 49 || I == 47) && C2 == 3;
                if (I == 49) {
                    z11 &= m11 == 1195456820;
                }
                if (z11) {
                    b(j11, vVar, xVarArr);
                }
            }
            vVar.O(e11);
        }
    }

    public static void b(long j11, ak.v vVar, x[] xVarArr) {
        int C = vVar.C();
        if ((C & 64) != 0) {
            vVar.P(1);
            int i11 = (C & 31) * 3;
            int e11 = vVar.e();
            for (x xVar : xVarArr) {
                vVar.O(e11);
                xVar.e(vVar, i11);
                xVar.f(j11, 1, i11, 0, null);
            }
        }
    }

    private static int c(ak.v vVar) {
        int i11 = 0;
        while (vVar.a() != 0) {
            int C = vVar.C();
            i11 += C;
            if (C != 255) {
                return i11;
            }
        }
        return -1;
    }
}