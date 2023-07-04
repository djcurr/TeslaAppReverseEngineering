package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.d0;
import androidx.camera.core.impl.g1;
import androidx.camera.core.impl.p1;
import androidx.camera.core.impl.q1;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class f1 {

    /* renamed from: d  reason: collision with root package name */
    private p1<?> f2225d;

    /* renamed from: e  reason: collision with root package name */
    private p1<?> f2226e;

    /* renamed from: f  reason: collision with root package name */
    private p1<?> f2227f;

    /* renamed from: g  reason: collision with root package name */
    private Size f2228g;

    /* renamed from: h  reason: collision with root package name */
    private p1<?> f2229h;

    /* renamed from: i  reason: collision with root package name */
    private Rect f2230i;

    /* renamed from: j  reason: collision with root package name */
    private androidx.camera.core.impl.s f2231j;

    /* renamed from: a  reason: collision with root package name */
    private final Set<d> f2222a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private final Object f2223b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private c f2224c = c.INACTIVE;

    /* renamed from: k  reason: collision with root package name */
    private g1 f2232k = g1.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2233a;

        static {
            int[] iArr = new int[c.values().length];
            f2233a = iArr;
            try {
                iArr[c.INACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2233a[c.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b(z.d dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum c {
        ACTIVE,
        INACTIVE
    }

    /* loaded from: classes.dex */
    public interface d {
        void c(f1 f1Var);

        void d(f1 f1Var);

        void g(f1 f1Var);

        void k(f1 f1Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public f1(p1<?> p1Var) {
        this.f2226e = p1Var;
        this.f2227f = p1Var;
    }

    private void E(d dVar) {
        this.f2222a.remove(dVar);
    }

    private void a(d dVar) {
        this.f2222a.add(dVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.core.impl.p1<?>, androidx.camera.core.impl.p1] */
    p1<?> A(androidx.camera.core.impl.r rVar, p1.a<?, ?, ?> aVar) {
        return aVar.b();
    }

    public void B() {
        x();
    }

    public void C() {
    }

    protected abstract Size D(Size size);

    public void F(Rect rect) {
        this.f2230i = rect;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void G(g1 g1Var) {
        this.f2232k = g1Var;
    }

    public void H(Size size) {
        this.f2228g = D(size);
    }

    public Size b() {
        return this.f2228g;
    }

    public androidx.camera.core.impl.s c() {
        androidx.camera.core.impl.s sVar;
        synchronized (this.f2223b) {
            sVar = this.f2231j;
        }
        return sVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public CameraControlInternal d() {
        synchronized (this.f2223b) {
            androidx.camera.core.impl.s sVar = this.f2231j;
            if (sVar == null) {
                return CameraControlInternal.f2243a;
            }
            return sVar.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String e() {
        androidx.camera.core.impl.s c11 = c();
        return ((androidx.camera.core.impl.s) v3.h.g(c11, "No camera attached to use case: " + this)).i().a();
    }

    public p1<?> f() {
        return this.f2227f;
    }

    public abstract p1<?> g(boolean z11, q1 q1Var);

    public int h() {
        return this.f2227f.getInputFormat();
    }

    public String i() {
        p1<?> p1Var = this.f2227f;
        return p1Var.r("<UnknownUseCase-" + hashCode() + ">");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int j(androidx.camera.core.impl.s sVar) {
        return sVar.i().h(l());
    }

    public g1 k() {
        return this.f2232k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int l() {
        return ((androidx.camera.core.impl.p0) this.f2227f).x(0);
    }

    public abstract p1.a<?, ?, ?> m(androidx.camera.core.impl.d0 d0Var);

    public Rect n() {
        return this.f2230i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean o(String str) {
        if (c() == null) {
            return false;
        }
        return Objects.equals(str, e());
    }

    public p1<?> p(androidx.camera.core.impl.r rVar, p1<?> p1Var, p1<?> p1Var2) {
        androidx.camera.core.impl.x0 I;
        if (p1Var2 != null) {
            I = androidx.camera.core.impl.x0.J(p1Var2);
            I.K(d0.e.f23252o);
        } else {
            I = androidx.camera.core.impl.x0.I();
        }
        for (d0.a<?> aVar : this.f2226e.e()) {
            I.n(aVar, this.f2226e.h(aVar), this.f2226e.a(aVar));
        }
        if (p1Var != null) {
            for (d0.a<?> aVar2 : p1Var.e()) {
                if (!aVar2.c().equals(d0.e.f23252o.c())) {
                    I.n(aVar2, p1Var.h(aVar2), p1Var.a(aVar2));
                }
            }
        }
        if (I.b(androidx.camera.core.impl.p0.f2350d)) {
            d0.a<Integer> aVar3 = androidx.camera.core.impl.p0.f2348b;
            if (I.b(aVar3)) {
                I.K(aVar3);
            }
        }
        return A(rVar, m(I));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void q() {
        this.f2224c = c.ACTIVE;
        t();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r() {
        this.f2224c = c.INACTIVE;
        t();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void s() {
        for (d dVar : this.f2222a) {
            dVar.g(this);
        }
    }

    public final void t() {
        int i11 = a.f2233a[this.f2224c.ordinal()];
        if (i11 == 1) {
            for (d dVar : this.f2222a) {
                dVar.k(this);
            }
        } else if (i11 == 2) {
            for (d dVar2 : this.f2222a) {
                dVar2.c(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void u() {
        for (d dVar : this.f2222a) {
            dVar.d(this);
        }
    }

    public void v(androidx.camera.core.impl.s sVar, p1<?> p1Var, p1<?> p1Var2) {
        synchronized (this.f2223b) {
            this.f2231j = sVar;
            a(sVar);
        }
        this.f2225d = p1Var;
        this.f2229h = p1Var2;
        p1<?> p11 = p(sVar.i(), this.f2225d, this.f2229h);
        this.f2227f = p11;
        b C = p11.C(null);
        if (C != null) {
            C.b(sVar.i());
        }
        w();
    }

    public void w() {
    }

    protected void x() {
    }

    public void y(androidx.camera.core.impl.s sVar) {
        z();
        b C = this.f2227f.C(null);
        if (C != null) {
            C.a();
        }
        synchronized (this.f2223b) {
            v3.h.a(sVar == this.f2231j);
            E(this.f2231j);
            this.f2231j = null;
        }
        this.f2228g = null;
        this.f2230i = null;
        this.f2227f = this.f2226e;
        this.f2225d = null;
        this.f2229h = null;
    }

    public void z() {
    }
}