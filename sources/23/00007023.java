package g6;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import ch.qos.logback.core.CoreConstants;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;
import vz.p;

/* loaded from: classes.dex */
public final class h {
    public static final <T> w5.g<T> a(b6.g fetcher, T data) {
        s.g(fetcher, "$this$fetcher");
        s.g(data, "data");
        p<w5.g<?>, Class<?>> t11 = fetcher.t();
        if (t11 != null) {
            w5.g<T> gVar = (w5.g<T>) t11.a();
            if (t11.b().isAssignableFrom(data.getClass())) {
                Objects.requireNonNull(gVar, "null cannot be cast to non-null type coil.fetch.Fetcher<T>");
                return gVar;
            }
            throw new IllegalStateException((gVar.getClass().getName() + " cannot handle data with type " + data.getClass().getName() + CoreConstants.DOT).toString());
        }
        return null;
    }

    public static final boolean b(b6.g allowInexactSize) {
        s.g(allowInexactSize, "$this$allowInexactSize");
        int i11 = g.f27796a[allowInexactSize.D().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    if ((allowInexactSize.G() instanceof d6.c) && (((d6.c) allowInexactSize.G()).getView() instanceof ImageView) && (allowInexactSize.F() instanceof c6.i) && ((c6.i) allowInexactSize.F()).getView() == ((d6.c) allowInexactSize.G()).getView()) {
                        return true;
                    }
                    return allowInexactSize.o().k() == null && (allowInexactSize.F() instanceof c6.a);
                }
                throw new NoWhenBranchMatchedException();
            }
            return true;
        }
        return false;
    }

    public static final Drawable c(b6.g getDrawableCompat, Drawable drawable, Integer num, Drawable drawable2) {
        s.g(getDrawableCompat, "$this$getDrawableCompat");
        if (drawable != null) {
            return drawable;
        }
        if (num != null) {
            if (num.intValue() == 0) {
                return null;
            }
            return c.a(getDrawableCompat.k(), num.intValue());
        }
        return drawable2;
    }
}