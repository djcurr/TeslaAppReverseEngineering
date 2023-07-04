package r1;

import h2.f0;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class y {

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f49022a;

        static {
            int[] iArr = new int[x.values().length];
            iArr[x.Active.ordinal()] = 1;
            iArr[x.Captured.ordinal()] = 2;
            iArr[x.Deactivated.ordinal()] = 3;
            iArr[x.DeactivatedParent.ordinal()] = 4;
            iArr[x.ActiveParent.ordinal()] = 5;
            iArr[x.Inactive.ordinal()] = 6;
            f49022a = iArr;
        }
    }

    public static final void a(h2.s sVar) {
        kotlin.jvm.internal.s.g(sVar, "<this>");
        int i11 = a.f49022a[sVar.k2().ordinal()];
        if (i11 == 3) {
            sVar.n2(x.Inactive);
        } else if (i11 != 4) {
        } else {
            sVar.n2(x.ActiveParent);
        }
    }

    private static final boolean b(h2.s sVar) {
        h2.s l22 = sVar.l2();
        if (l22 != null) {
            if (d(l22, false, 1, null)) {
                sVar.o2(null);
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static final boolean c(h2.s sVar, boolean z11) {
        kotlin.jvm.internal.s.g(sVar, "<this>");
        switch (a.f49022a[sVar.k2().ordinal()]) {
            case 1:
                sVar.n2(x.Inactive);
                return true;
            case 2:
                if (z11) {
                    sVar.n2(x.Inactive);
                    return z11;
                }
                return z11;
            case 3:
            case 6:
                return true;
            case 4:
                if (b(sVar)) {
                    sVar.n2(x.Deactivated);
                    return true;
                }
                return false;
            case 5:
                if (b(sVar)) {
                    sVar.n2(x.Inactive);
                    return true;
                }
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static /* synthetic */ boolean d(h2.s sVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return c(sVar, z11);
    }

    public static final void e(h2.s sVar) {
        g focusManager;
        kotlin.jvm.internal.s.g(sVar, "<this>");
        int i11 = a.f49022a[sVar.k2().ordinal()];
        if (i11 == 1 || i11 == 2) {
            f0 d02 = sVar.n1().d0();
            if (d02 != null && (focusManager = d02.getFocusManager()) != null) {
                focusManager.b(true);
            }
            sVar.n2(x.Deactivated);
        } else if (i11 == 5) {
            sVar.n2(x.DeactivatedParent);
        } else if (i11 != 6) {
        } else {
            sVar.n2(x.Deactivated);
        }
    }

    private static final void f(h2.s sVar) {
        x xVar;
        switch (a.f49022a[sVar.k2().ordinal()]) {
            case 1:
            case 5:
            case 6:
                xVar = x.Active;
                break;
            case 2:
                xVar = x.Captured;
                break;
            case 3:
            case 4:
                throw new IllegalStateException("Granting focus to a deactivated node.".toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
        sVar.n2(xVar);
    }

    private static final boolean g(h2.s sVar, h2.s sVar2) {
        f(sVar2);
        sVar.o2(sVar2);
        return true;
    }

    public static final void h(h2.s sVar) {
        kotlin.jvm.internal.s.g(sVar, "<this>");
        switch (a.f49022a[sVar.k2().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                sVar.m2(sVar.k2());
                return;
            case 5:
                if (b(sVar)) {
                    f(sVar);
                    return;
                }
                return;
            case 6:
                h2.s a12 = sVar.a1();
                if (a12 != null) {
                    i(a12, sVar);
                    return;
                } else if (j(sVar)) {
                    f(sVar);
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    private static final boolean i(h2.s sVar, h2.s sVar2) {
        if (sVar.f1(false).contains(sVar2)) {
            switch (a.f49022a[sVar.k2().ordinal()]) {
                case 1:
                    sVar.n2(x.ActiveParent);
                    return g(sVar, sVar2);
                case 2:
                    return false;
                case 3:
                    a(sVar);
                    boolean i11 = i(sVar, sVar2);
                    e(sVar);
                    return i11;
                case 4:
                    if (sVar.l2() == null || b(sVar)) {
                        return g(sVar, sVar2);
                    }
                    return false;
                case 5:
                    if (b(sVar)) {
                        return g(sVar, sVar2);
                    }
                    return false;
                case 6:
                    h2.s a12 = sVar.a1();
                    if (a12 == null && j(sVar)) {
                        sVar.n2(x.Active);
                        return i(sVar, sVar2);
                    } else if (a12 == null || !i(a12, sVar)) {
                        return false;
                    } else {
                        return i(sVar, sVar2);
                    }
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        throw new IllegalStateException("Non child node cannot request focus.".toString());
    }

    private static final boolean j(h2.s sVar) {
        f0 d02 = sVar.n1().d0();
        Boolean valueOf = d02 == null ? null : Boolean.valueOf(d02.requestFocus());
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        throw new IllegalStateException("Owner not initialized.".toString());
    }
}