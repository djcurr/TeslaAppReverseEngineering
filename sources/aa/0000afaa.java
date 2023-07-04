package r1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import r1.c;

/* loaded from: classes.dex */
public final class b0 {

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f48975a;

        static {
            int[] iArr = new int[x.values().length];
            iArr[x.Inactive.ordinal()] = 1;
            iArr[x.Deactivated.ordinal()] = 2;
            iArr[x.ActiveParent.ordinal()] = 3;
            iArr[x.DeactivatedParent.ordinal()] = 4;
            iArr[x.Active.ordinal()] = 5;
            iArr[x.Captured.ordinal()] = 6;
            f48975a = iArr;
        }
    }

    private static final boolean a(s1.h hVar, s1.h hVar2, s1.h hVar3, int i11) {
        if (b(hVar3, i11, hVar) || !b(hVar2, i11, hVar)) {
            return false;
        }
        if (c(hVar3, i11, hVar)) {
            c.a aVar = c.f48976b;
            if (!c.l(i11, aVar.c()) && !c.l(i11, aVar.g()) && d(hVar2, i11, hVar) >= e(hVar3, i11, hVar)) {
                return false;
            }
        }
        return true;
    }

    private static final boolean b(s1.h hVar, int i11, s1.h hVar2) {
        c.a aVar = c.f48976b;
        if (!(c.l(i11, aVar.c()) ? true : c.l(i11, aVar.g()))) {
            if (!(c.l(i11, aVar.h()) ? true : c.l(i11, aVar.a()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            if (hVar.j() > hVar2.i() && hVar.i() < hVar2.j()) {
                return true;
            }
        } else if (hVar.e() > hVar2.l() && hVar.l() < hVar2.e()) {
            return true;
        }
        return false;
    }

    private static final boolean c(s1.h hVar, int i11, s1.h hVar2) {
        c.a aVar = c.f48976b;
        if (c.l(i11, aVar.c())) {
            if (hVar2.i() >= hVar.j()) {
                return true;
            }
        } else if (c.l(i11, aVar.g())) {
            if (hVar2.j() <= hVar.i()) {
                return true;
            }
        } else if (c.l(i11, aVar.h())) {
            if (hVar2.l() >= hVar.e()) {
                return true;
            }
        } else if (!c.l(i11, aVar.a())) {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        } else {
            if (hVar2.e() <= hVar.l()) {
                return true;
            }
        }
        return false;
    }

    private static final float d(s1.h hVar, int i11, s1.h hVar2) {
        float l11;
        float e11;
        float l12;
        float e12;
        float f11;
        c.a aVar = c.f48976b;
        if (!c.l(i11, aVar.c())) {
            if (c.l(i11, aVar.g())) {
                l11 = hVar.i();
                e11 = hVar2.j();
            } else if (c.l(i11, aVar.h())) {
                l12 = hVar2.l();
                e12 = hVar.e();
            } else if (!c.l(i11, aVar.a())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            } else {
                l11 = hVar.l();
                e11 = hVar2.e();
            }
            f11 = l11 - e11;
            return Math.max((float) BitmapDescriptorFactory.HUE_RED, f11);
        }
        l12 = hVar2.i();
        e12 = hVar.j();
        f11 = l12 - e12;
        return Math.max((float) BitmapDescriptorFactory.HUE_RED, f11);
    }

    private static final float e(s1.h hVar, int i11, s1.h hVar2) {
        float e11;
        float e12;
        float l11;
        float l12;
        float f11;
        c.a aVar = c.f48976b;
        if (!c.l(i11, aVar.c())) {
            if (c.l(i11, aVar.g())) {
                e11 = hVar.j();
                e12 = hVar2.j();
            } else if (c.l(i11, aVar.h())) {
                l11 = hVar2.l();
                l12 = hVar.l();
            } else if (!c.l(i11, aVar.a())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            } else {
                e11 = hVar.e();
                e12 = hVar2.e();
            }
            f11 = e11 - e12;
            return Math.max(1.0f, f11);
        }
        l11 = hVar2.i();
        l12 = hVar.i();
        f11 = l11 - l12;
        return Math.max(1.0f, f11);
    }

    private static final s1.h f(s1.h hVar) {
        return new s1.h(hVar.j(), hVar.e(), hVar.j(), hVar.e());
    }

    private static final h2.s g(List<h2.s> list, s1.h hVar, int i11) {
        s1.h q11;
        c.a aVar = c.f48976b;
        if (c.l(i11, aVar.c())) {
            q11 = hVar.q(hVar.n() + 1, BitmapDescriptorFactory.HUE_RED);
        } else if (c.l(i11, aVar.g())) {
            q11 = hVar.q(-(hVar.n() + 1), BitmapDescriptorFactory.HUE_RED);
        } else if (c.l(i11, aVar.h())) {
            q11 = hVar.q(BitmapDescriptorFactory.HUE_RED, hVar.h() + 1);
        } else if (!c.l(i11, aVar.a())) {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        } else {
            q11 = hVar.q(BitmapDescriptorFactory.HUE_RED, -(hVar.h() + 1));
        }
        h2.s sVar = null;
        int i12 = 0;
        int size = list.size();
        while (i12 < size) {
            int i13 = i12 + 1;
            h2.s sVar2 = list.get(i12);
            s1.h j22 = sVar2.j2();
            if (h(j22, q11, hVar, i11)) {
                sVar = sVar2;
                q11 = j22;
            }
            i12 = i13;
        }
        return sVar;
    }

    private static final boolean h(s1.h hVar, s1.h hVar2, s1.h hVar3, int i11) {
        if (i(hVar, i11, hVar3)) {
            if (!i(hVar2, i11, hVar3) || a(hVar3, hVar, hVar2, i11)) {
                return true;
            }
            if (!a(hVar3, hVar2, hVar, i11) && l(i11, hVar3, hVar) < l(i11, hVar3, hVar2)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean i(s1.h hVar, int i11, s1.h hVar2) {
        c.a aVar = c.f48976b;
        if (c.l(i11, aVar.c())) {
            if ((hVar2.j() > hVar.j() || hVar2.i() >= hVar.j()) && hVar2.i() > hVar.i()) {
                return true;
            }
        } else if (c.l(i11, aVar.g())) {
            if ((hVar2.i() < hVar.i() || hVar2.j() <= hVar.i()) && hVar2.j() < hVar.j()) {
                return true;
            }
        } else if (c.l(i11, aVar.h())) {
            if ((hVar2.e() > hVar.e() || hVar2.l() >= hVar.e()) && hVar2.l() > hVar.l()) {
                return true;
            }
        } else if (!c.l(i11, aVar.a())) {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        } else {
            if ((hVar2.l() < hVar.l() || hVar2.e() <= hVar.l()) && hVar2.e() < hVar.e()) {
                return true;
            }
        }
        return false;
    }

    private static final float j(s1.h hVar, int i11, s1.h hVar2) {
        float l11;
        float e11;
        float l12;
        float e12;
        float f11;
        c.a aVar = c.f48976b;
        if (!c.l(i11, aVar.c())) {
            if (c.l(i11, aVar.g())) {
                l11 = hVar.i();
                e11 = hVar2.j();
            } else if (c.l(i11, aVar.h())) {
                l12 = hVar2.l();
                e12 = hVar.e();
            } else if (!c.l(i11, aVar.a())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            } else {
                l11 = hVar.l();
                e11 = hVar2.e();
            }
            f11 = l11 - e11;
            return Math.max((float) BitmapDescriptorFactory.HUE_RED, f11);
        }
        l12 = hVar2.i();
        e12 = hVar.j();
        f11 = l12 - e12;
        return Math.max((float) BitmapDescriptorFactory.HUE_RED, f11);
    }

    private static final float k(s1.h hVar, int i11, s1.h hVar2) {
        float f11;
        float i12;
        float i13;
        float n11;
        c.a aVar = c.f48976b;
        if (c.l(i11, aVar.c()) ? true : c.l(i11, aVar.g())) {
            f11 = 2;
            i12 = hVar2.l() + (hVar2.h() / f11);
            i13 = hVar.l();
            n11 = hVar.h();
        } else {
            if (!(c.l(i11, aVar.h()) ? true : c.l(i11, aVar.a()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            f11 = 2;
            i12 = hVar2.i() + (hVar2.n() / f11);
            i13 = hVar.i();
            n11 = hVar.n();
        }
        return i12 - (i13 + (n11 / f11));
    }

    private static final long l(int i11, s1.h hVar, s1.h hVar2) {
        long abs = Math.abs(j(hVar2, i11, hVar));
        long abs2 = Math.abs(k(hVar2, i11, hVar));
        return (13 * abs * abs) + (abs2 * abs2);
    }

    private static final s1.h m(s1.h hVar) {
        return new s1.h(hVar.i(), hVar.l(), hVar.i(), hVar.l());
    }

    public static final h2.s n(h2.s twoDimensionalFocusSearch, int i11) {
        h2.s n11;
        s1.h f11;
        kotlin.jvm.internal.s.g(twoDimensionalFocusSearch, "$this$twoDimensionalFocusSearch");
        switch (a.f48975a[twoDimensionalFocusSearch.k2().ordinal()]) {
            case 1:
                return twoDimensionalFocusSearch;
            case 2:
                return null;
            case 3:
            case 4:
                h2.s l22 = twoDimensionalFocusSearch.l2();
                if (l22 != null) {
                    if (l22.k2() != x.ActiveParent || (n11 = n(l22, i11)) == null) {
                        h2.s a11 = z.a(twoDimensionalFocusSearch);
                        s1.h j22 = a11 != null ? a11.j2() : null;
                        if (j22 != null) {
                            return g(twoDimensionalFocusSearch.f1(true), j22, i11);
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                    }
                    return n11;
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            case 5:
            case 6:
                List<h2.s> f12 = twoDimensionalFocusSearch.f1(true);
                if (f12.size() <= 1) {
                    return (h2.s) wz.u.d0(f12);
                }
                c.a aVar = c.f48976b;
                if (c.l(i11, aVar.g()) ? true : c.l(i11, aVar.a())) {
                    f11 = m(twoDimensionalFocusSearch.j2());
                } else {
                    if (!(c.l(i11, aVar.c()) ? true : c.l(i11, aVar.h()))) {
                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                    f11 = f(twoDimensionalFocusSearch.j2());
                }
                return g(f12, f11, i11);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}