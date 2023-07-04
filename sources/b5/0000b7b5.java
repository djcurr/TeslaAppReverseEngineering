package uf;

import android.graphics.Matrix;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final md.f<Integer> f53423a = md.f.b(2, 7, 4, 5);

    public static int a(int i11) {
        return Math.max(1, 8 / i11);
    }

    public static float b(p001if.d dVar, int i11, int i12) {
        if (dVar == null) {
            return 1.0f;
        }
        float f11 = i11;
        float f12 = i12;
        float max = Math.max(dVar.f30385a / f11, dVar.f30386b / f12);
        float f13 = dVar.f30387c;
        if (f11 * max > f13) {
            max = f13 / f11;
        }
        return f12 * max > f13 ? f13 / f12 : max;
    }

    private static int c(nf.e eVar) {
        int e02 = eVar.e0();
        if (e02 == 90 || e02 == 180 || e02 == 270) {
            return eVar.e0();
        }
        return 0;
    }

    public static int d(p001if.e eVar, nf.e eVar2) {
        int D = eVar2.D();
        md.f<Integer> fVar = f53423a;
        int indexOf = fVar.indexOf(Integer.valueOf(D));
        if (indexOf >= 0) {
            return fVar.get((indexOf + ((eVar.g() ? 0 : eVar.e()) / 90)) % fVar.size()).intValue();
        }
        throw new IllegalArgumentException("Only accepts inverted exif orientations");
    }

    public static int e(p001if.e eVar, nf.e eVar2) {
        if (eVar.f()) {
            int c11 = c(eVar2);
            return eVar.g() ? c11 : (c11 + eVar.e()) % 360;
        }
        return 0;
    }

    public static int f(p001if.e eVar, p001if.d dVar, nf.e eVar2, boolean z11) {
        if (z11 && dVar != null) {
            int e11 = e(eVar, eVar2);
            boolean z12 = false;
            int d11 = f53423a.contains(Integer.valueOf(eVar2.D())) ? d(eVar, eVar2) : 0;
            if (e11 == 90 || e11 == 270 || d11 == 5 || d11 == 7) {
                z12 = true;
            }
            int k11 = k(b(dVar, z12 ? eVar2.getHeight() : eVar2.getWidth(), z12 ? eVar2.getWidth() : eVar2.getHeight()), dVar.f30388d);
            if (k11 > 8) {
                return 8;
            }
            if (k11 < 1) {
                return 1;
            }
            return k11;
        }
        return 8;
    }

    public static Matrix g(nf.e eVar, p001if.e eVar2) {
        if (f53423a.contains(Integer.valueOf(eVar.D()))) {
            return h(d(eVar2, eVar));
        }
        int e11 = e(eVar2, eVar);
        if (e11 != 0) {
            Matrix matrix = new Matrix();
            matrix.setRotate(e11);
            return matrix;
        }
        return null;
    }

    private static Matrix h(int i11) {
        Matrix matrix = new Matrix();
        if (i11 == 2) {
            matrix.setScale(-1.0f, 1.0f);
        } else if (i11 == 7) {
            matrix.setRotate(-90.0f);
            matrix.postScale(-1.0f, 1.0f);
        } else if (i11 == 4) {
            matrix.setRotate(180.0f);
            matrix.postScale(-1.0f, 1.0f);
        } else if (i11 != 5) {
            return null;
        } else {
            matrix.setRotate(90.0f);
            matrix.postScale(-1.0f, 1.0f);
        }
        return matrix;
    }

    public static boolean i(int i11) {
        switch (i11) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static boolean j(int i11) {
        return i11 >= 0 && i11 <= 270 && i11 % 90 == 0;
    }

    public static int k(float f11, float f12) {
        return (int) (f12 + (f11 * 8.0f));
    }
}