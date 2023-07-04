package n2;

import t1.u;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final x f40416a = new x();

    private x() {
    }

    public final void a(t1.u canvas, w textLayoutResult) {
        kotlin.jvm.internal.s.g(canvas, "canvas");
        kotlin.jvm.internal.s.g(textLayoutResult, "textLayoutResult");
        boolean z11 = textLayoutResult.h() && w2.k.d(textLayoutResult.k().g(), w2.k.f55428a.a());
        if (z11) {
            s1.h b11 = s1.i.b(s1.f.f49950b.c(), s1.m.a(x2.o.g(textLayoutResult.A()), x2.o.f(textLayoutResult.A())));
            canvas.m();
            u.a.d(canvas, b11, 0, 2, null);
        }
        try {
            textLayoutResult.v().z(canvas, textLayoutResult.k().k().f(), textLayoutResult.k().k().p(), textLayoutResult.k().k().r());
        } finally {
            if (z11) {
                canvas.h();
            }
        }
    }
}