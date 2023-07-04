package r1;

import kotlin.NoWhenBranchMatchedException;
import r1.c;

/* loaded from: classes.dex */
public final class z {

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f49023a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f49024b;

        static {
            int[] iArr = new int[x2.q.values().length];
            iArr[x2.q.Rtl.ordinal()] = 1;
            iArr[x2.q.Ltr.ordinal()] = 2;
            f49023a = iArr;
            int[] iArr2 = new int[x.values().length];
            iArr2[x.Active.ordinal()] = 1;
            iArr2[x.Captured.ordinal()] = 2;
            iArr2[x.ActiveParent.ordinal()] = 3;
            iArr2[x.DeactivatedParent.ordinal()] = 4;
            iArr2[x.Inactive.ordinal()] = 5;
            iArr2[x.Deactivated.ordinal()] = 6;
            f49024b = iArr2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final h2.s a(h2.s sVar) {
        kotlin.jvm.internal.s.g(sVar, "<this>");
        switch (a.f49024b[sVar.k2().ordinal()]) {
            case 1:
            case 2:
                return sVar;
            case 3:
            case 4:
                h2.s l22 = sVar.l2();
                if (l22 != null) {
                    return a(l22);
                }
                break;
            case 5:
            case 6:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return null;
    }

    public static final h2.s b(h2.s sVar) {
        kotlin.jvm.internal.s.g(sVar, "<this>");
        h2.s a12 = sVar.a1();
        if (a12 == null) {
            return null;
        }
        switch (a.f49024b[sVar.k2().ordinal()]) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
                return b(a12);
            case 3:
                return sVar;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final h2.s c(h2.s focusSearch, int i11, x2.q layoutDirection) {
        int c11;
        kotlin.jvm.internal.s.g(focusSearch, "$this$focusSearch");
        kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
        c.a aVar = c.f48976b;
        if (c.l(i11, aVar.d()) ? true : c.l(i11, aVar.f())) {
            return a0.d(focusSearch, i11);
        }
        if (c.l(i11, aVar.c()) ? true : c.l(i11, aVar.g()) ? true : c.l(i11, aVar.h()) ? true : c.l(i11, aVar.a())) {
            return b0.n(focusSearch, i11);
        }
        if (c.l(i11, aVar.b())) {
            int i12 = a.f49023a[layoutDirection.ordinal()];
            if (i12 == 1) {
                c11 = aVar.c();
            } else if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            } else {
                c11 = aVar.g();
            }
            h2.s a11 = a(focusSearch);
            if (a11 == null) {
                return null;
            }
            return b0.n(a11, c11);
        } else if (c.l(i11, aVar.e())) {
            h2.s a12 = a(focusSearch);
            h2.s b11 = a12 == null ? null : b(a12);
            if (kotlin.jvm.internal.s.c(b11, focusSearch)) {
                return null;
            }
            return b11;
        } else {
            throw new IllegalStateException("Invalid FocusDirection".toString());
        }
    }
}