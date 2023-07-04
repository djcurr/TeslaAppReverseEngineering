package pr;

import android.view.View;
import pr.a0;

/* loaded from: classes2.dex */
public final class x {
    public static final <RenderingT> void a(View view, RenderingT initialRendering, s initialViewEnvironment, h00.p<? super RenderingT, ? super s, vz.b0> showRendering) {
        kotlin.jvm.internal.s.g(view, "<this>");
        kotlin.jvm.internal.s.g(initialRendering, "initialRendering");
        kotlin.jvm.internal.s.g(initialViewEnvironment, "initialViewEnvironment");
        kotlin.jvm.internal.s.g(showRendering, "showRendering");
        b0.e(view, b0.d(view) instanceof a0.a ? new a0.a(initialRendering, initialViewEnvironment, showRendering, e(view)) : new a0.a(initialRendering, initialViewEnvironment, showRendering, null, 8, null));
    }

    public static final boolean b(View view, Object rendering) {
        kotlin.jvm.internal.s.g(view, "<this>");
        kotlin.jvm.internal.s.g(rendering, "rendering");
        a0<?> d11 = b0.d(view);
        Object c11 = d11 == null ? null : d11.c();
        Object obj = c11 != null ? c11 : null;
        return obj != null && f.a(obj, rendering);
    }

    public static final s c(View view) {
        kotlin.jvm.internal.s.g(view, "<this>");
        a0<?> d11 = b0.d(view);
        if (d11 == null) {
            return null;
        }
        return d11.a();
    }

    public static final <RenderingT> h00.p<RenderingT, s, vz.b0> d(View view) {
        kotlin.jvm.internal.s.g(view, "<this>");
        a0<?> d11 = b0.d(view);
        if (d11 == null) {
            return null;
        }
        return (h00.p<RenderingT, s, vz.b0>) d11.b();
    }

    public static final h00.l<View, vz.b0> e(View view) {
        kotlin.jvm.internal.s.g(view, "<this>");
        return b0.b(view).g();
    }

    public static final void f(View view, h00.l<? super View, vz.b0> value) {
        kotlin.jvm.internal.s.g(view, "<this>");
        kotlin.jvm.internal.s.g(value, "value");
        b0.e(view, a0.a.e(b0.b(view), null, null, null, value, 7, null));
    }

    public static final <RenderingT> void g(View view, RenderingT rendering, s viewEnvironment) {
        kotlin.jvm.internal.s.g(view, "<this>");
        kotlin.jvm.internal.s.g(rendering, "rendering");
        kotlin.jvm.internal.s.g(viewEnvironment, "viewEnvironment");
        a0.b<?> c11 = b0.c(view);
        if (f.a(c11.c(), rendering)) {
            b0.e(view, new a0.b(rendering, viewEnvironment, c11.b()));
            c11.b().invoke(rendering, viewEnvironment);
            return;
        }
        throw new IllegalStateException(("Expected " + view + " to be able to show rendering " + rendering + ", but that did not match previous rendering " + c11.c() + ". Consider using WorkflowViewStub to display arbitrary types.").toString());
    }

    public static final void h(View view) {
        kotlin.jvm.internal.s.g(view, "<this>");
        a0.a<?> b11 = b0.b(view);
        b0.e(view, new a0.b(b11.c(), b11.a(), b11.b()));
        b11.g().invoke(view);
    }
}