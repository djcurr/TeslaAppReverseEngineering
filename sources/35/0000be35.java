package x1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import t1.a0;
import t1.h0;
import t1.j0;
import t1.w;
import v1.a;
import v1.e;
import vz.b0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private h0 f56639a;

    /* renamed from: b  reason: collision with root package name */
    private t1.u f56640b;

    /* renamed from: c  reason: collision with root package name */
    private x2.d f56641c;

    /* renamed from: d  reason: collision with root package name */
    private long f56642d;

    /* renamed from: e  reason: collision with root package name */
    private final v1.a f56643e;

    public a() {
        x2.q qVar = x2.q.Ltr;
        this.f56642d = x2.o.f56954b.a();
        this.f56643e = new v1.a();
    }

    private final void a(v1.e eVar) {
        e.b.j(eVar, a0.f51365b.a(), 0L, 0L, BitmapDescriptorFactory.HUE_RED, null, null, t1.p.f51470a.a(), 62, null);
    }

    public final void b(long j11, x2.d density, x2.q layoutDirection, h00.l<? super v1.e, b0> block) {
        kotlin.jvm.internal.s.g(density, "density");
        kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.s.g(block, "block");
        this.f56641c = density;
        h0 h0Var = this.f56639a;
        t1.u uVar = this.f56640b;
        if (h0Var == null || uVar == null || x2.o.g(j11) > h0Var.getWidth() || x2.o.f(j11) > h0Var.getHeight()) {
            h0Var = j0.b(x2.o.g(j11), x2.o.f(j11), 0, false, null, 28, null);
            uVar = w.a(h0Var);
            this.f56639a = h0Var;
            this.f56640b = uVar;
        }
        this.f56642d = j11;
        v1.a aVar = this.f56643e;
        long b11 = x2.p.b(j11);
        a.C1210a D = aVar.D();
        x2.d a11 = D.a();
        x2.q b12 = D.b();
        t1.u c11 = D.c();
        long d11 = D.d();
        a.C1210a D2 = aVar.D();
        D2.j(density);
        D2.k(layoutDirection);
        D2.i(uVar);
        D2.l(b11);
        uVar.m();
        a(aVar);
        block.invoke(aVar);
        uVar.h();
        a.C1210a D3 = aVar.D();
        D3.j(a11);
        D3.k(b12);
        D3.i(c11);
        D3.l(d11);
        h0Var.a();
    }

    public final void c(v1.e target, float f11, t1.b0 b0Var) {
        kotlin.jvm.internal.s.g(target, "target");
        h0 h0Var = this.f56639a;
        if (h0Var != null) {
            e.b.c(target, h0Var, 0L, this.f56642d, 0L, 0L, f11, null, b0Var, 0, 0, 858, null);
            return;
        }
        throw new IllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination".toString());
    }
}