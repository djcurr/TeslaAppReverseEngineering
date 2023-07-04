package uf;

import md.k;

/* loaded from: classes3.dex */
public class a {
    public static float a(p001if.e eVar, p001if.d dVar, nf.e eVar2) {
        k.b(Boolean.valueOf(nf.e.D0(eVar2)));
        if (dVar == null || dVar.f30386b <= 0 || dVar.f30385a <= 0 || eVar2.getWidth() == 0 || eVar2.getHeight() == 0) {
            return 1.0f;
        }
        int d11 = d(eVar, eVar2);
        boolean z11 = d11 == 90 || d11 == 270;
        int height = z11 ? eVar2.getHeight() : eVar2.getWidth();
        int width = z11 ? eVar2.getWidth() : eVar2.getHeight();
        float f11 = dVar.f30385a / height;
        float f12 = dVar.f30386b / width;
        float max = Math.max(f11, f12);
        nd.a.B("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f", Integer.valueOf(dVar.f30385a), Integer.valueOf(dVar.f30386b), Integer.valueOf(height), Integer.valueOf(width), Float.valueOf(f11), Float.valueOf(f12), Float.valueOf(max));
        return max;
    }

    public static int b(p001if.e eVar, p001if.d dVar, nf.e eVar2, int i11) {
        int e11;
        if (nf.e.D0(eVar2)) {
            float a11 = a(eVar, dVar, eVar2);
            if (eVar2.L() == af.b.f395a) {
                e11 = f(a11);
            } else {
                e11 = e(a11);
            }
            int max = Math.max(eVar2.getHeight(), eVar2.getWidth());
            float f11 = dVar != null ? dVar.f30387c : i11;
            while (max / e11 > f11) {
                e11 = eVar2.L() == af.b.f395a ? e11 * 2 : e11 + 1;
            }
            return e11;
        }
        return 1;
    }

    public static int c(nf.e eVar, int i11, int i12) {
        int n02 = eVar.n0();
        while ((((eVar.getWidth() * eVar.getHeight()) * i11) / n02) / n02 > i12) {
            n02 *= 2;
        }
        return n02;
    }

    private static int d(p001if.e eVar, nf.e eVar2) {
        boolean z11 = false;
        if (eVar.g()) {
            int e02 = eVar2.e0();
            k.b(Boolean.valueOf((e02 == 0 || e02 == 90 || e02 == 180 || e02 == 270) ? true : true));
            return e02;
        }
        return 0;
    }

    public static int e(float f11) {
        if (f11 > 0.6666667f) {
            return 1;
        }
        int i11 = 2;
        while (true) {
            double d11 = i11;
            if ((1.0d / d11) + ((1.0d / (Math.pow(d11, 2.0d) - d11)) * 0.3333333432674408d) <= f11) {
                return i11 - 1;
            }
            i11++;
        }
    }

    public static int f(float f11) {
        if (f11 > 0.6666667f) {
            return 1;
        }
        int i11 = 2;
        while (true) {
            int i12 = i11 * 2;
            double d11 = 1.0d / i12;
            if (d11 + (0.3333333432674408d * d11) <= f11) {
                return i11;
            }
            i11 = i12;
        }
    }
}