package r1;

import kotlin.NoWhenBranchMatchedException;
import r1.c;

/* loaded from: classes.dex */
public final class o {

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f49008a;

        static {
            int[] iArr = new int[x2.q.values().length];
            iArr[x2.q.Ltr.ordinal()] = 1;
            iArr[x2.q.Rtl.ordinal()] = 2;
            f49008a = iArr;
        }
    }

    public static final s a(h2.s customFocusSearch, int i11, x2.q layoutDirection) {
        s b11;
        s g11;
        kotlin.jvm.internal.s.g(customFocusSearch, "$this$customFocusSearch");
        kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
        m mVar = new m();
        h2.o w12 = customFocusSearch.w1();
        if (w12 != null) {
            w12.N1(mVar);
        }
        c.a aVar = c.f48976b;
        if (c.l(i11, aVar.d())) {
            return mVar.d();
        }
        if (c.l(i11, aVar.f())) {
            return mVar.e();
        }
        if (c.l(i11, aVar.h())) {
            return mVar.h();
        }
        if (c.l(i11, aVar.a())) {
            return mVar.a();
        }
        if (c.l(i11, aVar.c())) {
            int i12 = a.f49008a[layoutDirection.ordinal()];
            if (i12 == 1) {
                g11 = mVar.g();
            } else if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            } else {
                g11 = mVar.b();
            }
            if (kotlin.jvm.internal.s.c(g11, s.f49016b.a())) {
                g11 = null;
            }
            return g11 == null ? mVar.c() : g11;
        } else if (c.l(i11, aVar.g())) {
            int i13 = a.f49008a[layoutDirection.ordinal()];
            if (i13 == 1) {
                b11 = mVar.b();
            } else if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            } else {
                b11 = mVar.g();
            }
            if (kotlin.jvm.internal.s.c(b11, s.f49016b.a())) {
                b11 = null;
            }
            return b11 == null ? mVar.f() : b11;
        } else if (c.l(i11, aVar.b())) {
            return s.f49016b.a();
        } else {
            if (c.l(i11, aVar.e())) {
                return s.f49016b.a();
            }
            throw new IllegalStateException("invalid FocusDirection".toString());
        }
    }
}