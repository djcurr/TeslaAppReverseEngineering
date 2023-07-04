package b1;

import c1.n1;
import c1.v1;
import l0.b0;
import l0.c1;
import t1.a0;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private static final c1<Float> f7256a = new c1<>(15, 0, b0.b(), 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final l0.i<Float> c(o0.j jVar) {
        if (jVar instanceof o0.g) {
            return f7256a;
        }
        if (!(jVar instanceof o0.d) && !(jVar instanceof o0.b)) {
            return f7256a;
        }
        return new c1(45, 0, b0.b(), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l0.i<Float> d(o0.j jVar) {
        if (!(jVar instanceof o0.g) && !(jVar instanceof o0.d)) {
            return jVar instanceof o0.b ? new c1(150, 0, b0.b(), 2, null) : f7256a;
        }
        return f7256a;
    }

    public static final m0.p e(boolean z11, float f11, long j11, c1.i iVar, int i11, int i12) {
        iVar.x(-1508283743);
        if ((i12 & 1) != 0) {
            z11 = true;
        }
        if ((i12 & 2) != 0) {
            f11 = x2.g.f56937b.b();
        }
        if ((i12 & 4) != 0) {
            j11 = a0.f51365b.f();
        }
        v1 m11 = n1.m(a0.h(j11), iVar, (i11 >> 6) & 14);
        Boolean valueOf = Boolean.valueOf(z11);
        x2.g c11 = x2.g.c(f11);
        iVar.x(-3686552);
        boolean O = iVar.O(valueOf) | iVar.O(c11);
        Object y11 = iVar.y();
        if (O || y11 == c1.i.f8486a.a()) {
            y11 = new d(z11, f11, m11, null);
            iVar.p(y11);
        }
        iVar.N();
        d dVar = (d) y11;
        iVar.N();
        return dVar;
    }
}