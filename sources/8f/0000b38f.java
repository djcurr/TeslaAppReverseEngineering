package t;

import androidx.camera.core.impl.a0;
import s.a;

/* loaded from: classes.dex */
final class q1 extends m0 {

    /* renamed from: c  reason: collision with root package name */
    static final q1 f51150c = new q1(new x.d());

    /* renamed from: b  reason: collision with root package name */
    private final x.d f51151b;

    private q1(x.d dVar) {
        this.f51151b = dVar;
    }

    @Override // t.m0, androidx.camera.core.impl.a0.b
    public void a(androidx.camera.core.impl.p1<?> p1Var, a0.a aVar) {
        super.a(p1Var, aVar);
        if (p1Var instanceof androidx.camera.core.impl.m0) {
            androidx.camera.core.impl.m0 m0Var = (androidx.camera.core.impl.m0) p1Var;
            a.C1090a c1090a = new a.C1090a();
            if (m0Var.L()) {
                this.f51151b.a(m0Var.F(), c1090a);
            }
            aVar.e(c1090a.c());
            return;
        }
        throw new IllegalArgumentException("config is not ImageCaptureConfig");
    }
}