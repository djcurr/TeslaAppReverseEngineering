package com.facebook.imagepipeline.producers;

/* loaded from: classes3.dex */
public final class e1 {
    public static int a(int i11) {
        return (int) (i11 * 1.3333334f);
    }

    public static boolean b(int i11, int i12, p001if.d dVar) {
        return dVar == null ? ((float) a(i11)) >= 2048.0f && a(i12) >= 2048 : a(i11) >= dVar.f30385a && a(i12) >= dVar.f30386b;
    }

    public static boolean c(nf.e eVar, p001if.d dVar) {
        if (eVar == null) {
            return false;
        }
        int e02 = eVar.e0();
        if (e02 != 90 && e02 != 270) {
            return b(eVar.getWidth(), eVar.getHeight(), dVar);
        }
        return b(eVar.getHeight(), eVar.getWidth(), dVar);
    }
}