package r1;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import r1.c;

/* loaded from: classes.dex */
public final class a0 {

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f48970a;

        static {
            int[] iArr = new int[x.values().length];
            iArr[x.ActiveParent.ordinal()] = 1;
            iArr[x.DeactivatedParent.ordinal()] = 2;
            iArr[x.Active.ordinal()] = 3;
            iArr[x.Captured.ordinal()] = 4;
            iArr[x.Deactivated.ordinal()] = 5;
            iArr[x.Inactive.ordinal()] = 6;
            f48970a = iArr;
        }
    }

    private static final h2.s a(h2.s sVar) {
        h2.s a11;
        h2.s a12;
        h2.s a13;
        h2.s a14;
        h2.s a15;
        x k22 = sVar.k2();
        int[] iArr = a.f48970a;
        boolean z11 = false;
        switch (iArr[k22.ordinal()]) {
            case 1:
                h2.s l22 = sVar.l2();
                if (l22 != null) {
                    switch (iArr[l22.k2().ordinal()]) {
                        case 1:
                            h2.s a16 = a(l22);
                            return a16 == null ? l22 : a16;
                        case 2:
                            h2.s a17 = a(l22);
                            if (a17 == null) {
                                List<h2.s> f12 = sVar.f1(false);
                                int size = f12.size() - 1;
                                if (size >= 0) {
                                    while (true) {
                                        int i11 = size - 1;
                                        if (z11 && (a11 = a(f12.get(size))) != null) {
                                            return a11;
                                        }
                                        if (kotlin.jvm.internal.s.c(f12.get(size), l22)) {
                                            z11 = true;
                                        }
                                        if (i11 >= 0) {
                                            size = i11;
                                        }
                                    }
                                }
                                if (c(sVar)) {
                                    return null;
                                }
                                return sVar;
                            }
                            return a17;
                        case 3:
                        case 4:
                            List<h2.s> f13 = sVar.f1(false);
                            int size2 = f13.size() - 1;
                            if (size2 >= 0) {
                                while (true) {
                                    int i12 = size2 - 1;
                                    if (z11 && (a12 = a(f13.get(size2))) != null) {
                                        return a12;
                                    }
                                    if (kotlin.jvm.internal.s.c(f13.get(size2), l22)) {
                                        z11 = true;
                                    }
                                    if (i12 >= 0) {
                                        size2 = i12;
                                    }
                                }
                            }
                            if (c(sVar)) {
                                return null;
                            }
                            return sVar;
                        case 5:
                        case 6:
                            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            case 2:
                h2.s l23 = sVar.l2();
                if (l23 != null) {
                    switch (iArr[l23.k2().ordinal()]) {
                        case 1:
                            h2.s a18 = a(l23);
                            return a18 == null ? l23 : a18;
                        case 2:
                            h2.s a19 = a(l23);
                            if (a19 == null) {
                                List<h2.s> f14 = sVar.f1(false);
                                int size3 = f14.size() - 1;
                                if (size3 >= 0) {
                                    while (true) {
                                        int i13 = size3 - 1;
                                        if (z11 && (a13 = a(f14.get(size3))) != null) {
                                            return a13;
                                        }
                                        if (kotlin.jvm.internal.s.c(f14.get(size3), l23)) {
                                            z11 = true;
                                        }
                                        if (i13 >= 0) {
                                            size3 = i13;
                                        }
                                    }
                                }
                                return null;
                            }
                            return a19;
                        case 3:
                        case 4:
                            List<h2.s> f15 = sVar.f1(false);
                            int size4 = f15.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i14 = size4 - 1;
                                    if (z11 && (a14 = a(f15.get(size4))) != null) {
                                        return a14;
                                    }
                                    if (kotlin.jvm.internal.s.c(f15.get(size4), l23)) {
                                        z11 = true;
                                    }
                                    if (i14 >= 0) {
                                        size4 = i14;
                                    }
                                }
                            }
                            return null;
                        case 5:
                        case 6:
                            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            case 3:
            case 4:
            case 6:
                h2.s sVar2 = (h2.s) wz.u.p0(sVar.f1(true));
                return (sVar2 == null || (a15 = a(sVar2)) == null) ? sVar : a15;
            case 5:
                h2.s sVar3 = (h2.s) wz.u.p0(sVar.f1(true));
                if (sVar3 == null) {
                    return null;
                }
                return a(sVar3);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final h2.s b(h2.s sVar) {
        h2.s b11;
        int i11 = 0;
        switch (a.f48970a[sVar.k2().ordinal()]) {
            case 1:
            case 2:
                h2.s l22 = sVar.l2();
                if (l22 != null) {
                    h2.s b12 = b(l22);
                    if (b12 == null) {
                        List<h2.s> f12 = sVar.f1(false);
                        int size = f12.size();
                        boolean z11 = false;
                        while (i11 < size) {
                            int i12 = i11 + 1;
                            if (z11 && (b11 = b(f12.get(i11))) != null) {
                                return b11;
                            }
                            if (kotlin.jvm.internal.s.c(f12.get(i11), l22)) {
                                z11 = true;
                            }
                            i11 = i12;
                        }
                        return null;
                    }
                    return b12;
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            case 3:
            case 4:
            case 5:
                List<h2.s> f13 = sVar.f1(false);
                int size2 = f13.size();
                while (i11 < size2) {
                    int i13 = i11 + 1;
                    h2.s b13 = b(f13.get(i11));
                    if (b13 != null) {
                        return b13;
                    }
                    i11 = i13;
                }
                return null;
            case 6:
                return sVar;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final boolean c(h2.s sVar) {
        return sVar.a1() == null;
    }

    public static final h2.s d(h2.s oneDimensionalFocusSearch, int i11) {
        kotlin.jvm.internal.s.g(oneDimensionalFocusSearch, "$this$oneDimensionalFocusSearch");
        c.a aVar = c.f48976b;
        if (c.l(i11, aVar.d())) {
            return b(oneDimensionalFocusSearch);
        }
        if (c.l(i11, aVar.f())) {
            return a(oneDimensionalFocusSearch);
        }
        throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
    }
}