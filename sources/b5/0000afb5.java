package r1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r1.c;

/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    private final j f48988a;

    /* renamed from: b  reason: collision with root package name */
    public x2.q f48989b;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f48990a;

        static {
            int[] iArr = new int[x.values().length];
            iArr[x.Active.ordinal()] = 1;
            iArr[x.ActiveParent.ordinal()] = 2;
            iArr[x.Captured.ordinal()] = 3;
            iArr[x.Deactivated.ordinal()] = 4;
            iArr[x.DeactivatedParent.ordinal()] = 5;
            iArr[x.Inactive.ordinal()] = 6;
            f48990a = iArr;
        }
    }

    public h(j focusModifier) {
        kotlin.jvm.internal.s.g(focusModifier, "focusModifier");
        this.f48988a = focusModifier;
    }

    @Override // r1.g
    public boolean a(int i11) {
        h2.s a11 = z.a(this.f48988a.b());
        if (a11 == null) {
            return false;
        }
        s a12 = o.a(a11, i11, d());
        if (!kotlin.jvm.internal.s.c(a12, s.f49016b.a())) {
            a12.c();
            return true;
        }
        h2.s c11 = z.c(this.f48988a.b(), i11, d());
        if (kotlin.jvm.internal.s.c(c11, a11)) {
            return false;
        }
        if (c11 == null) {
            if (!this.f48988a.c().getHasFocus() || this.f48988a.c().isFocused()) {
                return false;
            }
            c.a aVar = c.f48976b;
            if (c.l(i11, aVar.d()) ? true : c.l(i11, aVar.f())) {
                b(false);
                if (this.f48988a.c().isFocused()) {
                    return a(i11);
                }
                return false;
            }
            return false;
        } else if (c11.a1() != null) {
            y.h(c11);
            return true;
        } else {
            throw new IllegalStateException("Move focus landed at the root.".toString());
        }
    }

    @Override // r1.g
    public void b(boolean z11) {
        x xVar;
        x c11 = this.f48988a.c();
        if (y.c(this.f48988a.b(), z11)) {
            j jVar = this.f48988a;
            switch (a.f48990a[c11.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    xVar = x.Active;
                    break;
                case 4:
                case 5:
                    xVar = x.Deactivated;
                    break;
                case 6:
                    xVar = x.Inactive;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            jVar.i(xVar);
        }
    }

    public final void c() {
        i.a(this.f48988a.b());
    }

    public final x2.q d() {
        x2.q qVar = this.f48989b;
        if (qVar != null) {
            return qVar;
        }
        kotlin.jvm.internal.s.x("layoutDirection");
        return null;
    }

    public final o1.f e() {
        return k.b(o1.f.f42062f1, this.f48988a);
    }

    public final void f() {
        y.c(this.f48988a.b(), true);
    }

    public final void g(x2.q qVar) {
        kotlin.jvm.internal.s.g(qVar, "<set-?>");
        this.f48989b = qVar;
    }

    public final void h() {
        if (this.f48988a.c() == x.Inactive) {
            this.f48988a.i(x.Active);
        }
    }

    public /* synthetic */ h(j jVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new j(x.Inactive, null, 2, null) : jVar);
    }
}