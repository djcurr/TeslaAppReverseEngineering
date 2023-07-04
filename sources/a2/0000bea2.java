package x10;

import j20.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import k20.a1;
import k20.b0;
import k20.b1;
import k20.d0;
import k20.g0;
import k20.k1;
import k20.n;
import k20.y0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.p;
import w00.e;
import w00.s0;
import wz.x;

/* loaded from: classes5.dex */
public final class d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends u implements h00.a<d0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y0 f56928a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y0 y0Var) {
            super(0);
            this.f56928a = y0Var;
        }

        @Override // h00.a
        /* renamed from: a */
        public final d0 invoke() {
            d0 type = this.f56928a.getType();
            s.f(type, "this@createCapturedIfNeeded.type");
            return type;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends n {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f56929c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z11, b1 b1Var) {
            super(b1Var);
            this.f56929c = z11;
        }

        @Override // k20.b1
        public boolean b() {
            return this.f56929c;
        }

        @Override // k20.n, k20.b1
        public y0 e(d0 key) {
            s.g(key, "key");
            y0 e11 = super.e(key);
            if (e11 == null) {
                return null;
            }
            e n11 = key.H0().n();
            return d.b(e11, n11 instanceof s0 ? (s0) n11 : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y0 b(y0 y0Var, s0 s0Var) {
        if (s0Var == null || y0Var.b() == k1.INVARIANT) {
            return y0Var;
        }
        if (s0Var.k() == y0Var.b()) {
            if (y0Var.a()) {
                j20.n NO_LOCKS = f.f33124e;
                s.f(NO_LOCKS, "NO_LOCKS");
                return new a1(new g0(NO_LOCKS, new a(y0Var)));
            }
            return new a1(y0Var.getType());
        }
        return new a1(c(y0Var));
    }

    public static final d0 c(y0 typeProjection) {
        s.g(typeProjection, "typeProjection");
        return new x10.a(typeProjection, null, false, null, 14, null);
    }

    public static final boolean d(d0 d0Var) {
        s.g(d0Var, "<this>");
        return d0Var.H0() instanceof x10.b;
    }

    public static final b1 e(b1 b1Var, boolean z11) {
        List<p> H0;
        int t11;
        s.g(b1Var, "<this>");
        if (b1Var instanceof b0) {
            b0 b0Var = (b0) b1Var;
            s0[] j11 = b0Var.j();
            H0 = wz.p.H0(b0Var.i(), b0Var.j());
            t11 = x.t(H0, 10);
            ArrayList arrayList = new ArrayList(t11);
            for (p pVar : H0) {
                arrayList.add(b((y0) pVar.c(), (s0) pVar.d()));
            }
            Object[] array = arrayList.toArray(new y0[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return new b0(j11, (y0[]) array, z11);
        }
        return new b(z11, b1Var);
    }

    public static /* synthetic */ b1 f(b1 b1Var, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return e(b1Var, z11);
    }
}