package h2;

import c1.o0;
import c1.s1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final k f28676a;

    /* renamed from: b  reason: collision with root package name */
    private o0<f2.z> f28677b;

    /* renamed from: c  reason: collision with root package name */
    private f2.z f28678c;

    /* loaded from: classes.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
    }

    public i(k layoutNode) {
        kotlin.jvm.internal.s.g(layoutNode, "layoutNode");
        this.f28676a = layoutNode;
    }

    private final f2.z d() {
        o0<f2.z> o0Var = this.f28677b;
        if (o0Var == null) {
            f2.z zVar = this.f28678c;
            if (zVar == null) {
                throw new IllegalStateException("Intrinsic size is queried but there is no measure policy in place.".toString());
            }
            o0Var = s1.d(zVar, null, 2, null);
        }
        this.f28677b = o0Var;
        return o0Var.getValue();
    }

    public final k a() {
        return this.f28676a;
    }

    public final int b(int i11) {
        return d().d(a().W(), a().J(), i11);
    }

    public final int c(int i11) {
        return d().c(a().W(), a().J(), i11);
    }

    public final int e(int i11) {
        return d().e(a().W(), a().J(), i11);
    }

    public final int f(int i11) {
        return d().a(a().W(), a().J(), i11);
    }

    public final void g(f2.z measurePolicy) {
        kotlin.jvm.internal.s.g(measurePolicy, "measurePolicy");
        o0<f2.z> o0Var = this.f28677b;
        if (o0Var != null) {
            kotlin.jvm.internal.s.e(o0Var);
            o0Var.setValue(measurePolicy);
            return;
        }
        this.f28678c = measurePolicy;
    }
}