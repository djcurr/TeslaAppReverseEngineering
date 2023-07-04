package z2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class y extends d3.e {

    /* renamed from: f  reason: collision with root package name */
    private final x2.d f60150f;

    /* renamed from: g  reason: collision with root package name */
    private long f60151g;

    /* renamed from: h  reason: collision with root package name */
    public x2.q f60152h;

    /* renamed from: i  reason: collision with root package name */
    private final List<Object> f60153i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f60154j;

    /* renamed from: k  reason: collision with root package name */
    private final Set<f3.e> f60155k;

    public y(x2.d density) {
        kotlin.jvm.internal.s.g(density, "density");
        this.f60150f = density;
        this.f60151g = x2.c.b(0, 0, 0, 0, 15, null);
        this.f60153i = new ArrayList();
        this.f60154j = true;
        this.f60155k = new LinkedHashSet();
    }

    @Override // d3.e
    public int c(Object obj) {
        if (obj instanceof x2.g) {
            return this.f60150f.G(((x2.g) obj).l());
        }
        return super.c(obj);
    }

    @Override // d3.e
    public void h() {
        f3.e a11;
        HashMap<Object, d3.d> mReferences = this.f23546a;
        kotlin.jvm.internal.s.f(mReferences, "mReferences");
        for (Map.Entry<Object, d3.d> entry : mReferences.entrySet()) {
            d3.d value = entry.getValue();
            if (value != null && (a11 = value.a()) != null) {
                a11.t0();
            }
        }
        this.f23546a.clear();
        HashMap<Object, d3.d> mReferences2 = this.f23546a;
        kotlin.jvm.internal.s.f(mReferences2, "mReferences");
        mReferences2.put(d3.e.f23545e, this.f23549d);
        this.f60153i.clear();
        this.f60154j = true;
        super.h();
    }

    public final x2.q m() {
        x2.q qVar = this.f60152h;
        if (qVar != null) {
            return qVar;
        }
        kotlin.jvm.internal.s.x("layoutDirection");
        throw null;
    }

    public final long n() {
        return this.f60151g;
    }

    public final boolean o(f3.e constraintWidget) {
        kotlin.jvm.internal.s.g(constraintWidget, "constraintWidget");
        if (this.f60154j) {
            this.f60155k.clear();
            for (Object obj : this.f60153i) {
                d3.d dVar = this.f23546a.get(obj);
                f3.e a11 = dVar == null ? null : dVar.a();
                if (a11 != null) {
                    this.f60155k.add(a11);
                }
            }
            this.f60154j = false;
        }
        return this.f60155k.contains(constraintWidget);
    }

    public final void p(x2.q qVar) {
        kotlin.jvm.internal.s.g(qVar, "<set-?>");
        this.f60152h = qVar;
    }

    public final void q(long j11) {
        this.f60151g = j11;
    }
}