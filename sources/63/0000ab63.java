package pr;

import android.view.View;
import pr.a0;

/* loaded from: classes2.dex */
public final class b0 {
    public static final a0<?> a(View view) {
        kotlin.jvm.internal.s.g(view, "<this>");
        a0<?> d11 = d(view);
        if (d11 != null) {
            return d11;
        }
        throw new IllegalStateException(("Expected " + view + " to have been built by a ViewFactory. Perhaps the factory did not call View.bindShowRendering.").toString());
    }

    public static final a0.a<?> b(View view) {
        kotlin.jvm.internal.s.g(view, "<this>");
        a0<?> a11 = a(view);
        a0.a<?> aVar = a11 instanceof a0.a ? (a0.a) a11 : null;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Expected " + view + " to be un-started, but View.start() has been called").toString());
    }

    public static final a0.b<?> c(View view) {
        kotlin.jvm.internal.s.g(view, "<this>");
        a0<?> a11 = a(view);
        a0.b<?> bVar = a11 instanceof a0.b ? (a0.b) a11 : null;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException(("Expected " + view + " to have been started, but View.start() has not been called").toString());
    }

    public static final a0<?> d(View view) {
        kotlin.jvm.internal.s.g(view, "<this>");
        Object tag = view.getTag(o.f46886c);
        if (tag instanceof a0) {
            return (a0) tag;
        }
        return null;
    }

    public static final void e(View view, a0<?> value) {
        kotlin.jvm.internal.s.g(view, "<this>");
        kotlin.jvm.internal.s.g(value, "value");
        view.setTag(o.f46886c, value);
    }
}