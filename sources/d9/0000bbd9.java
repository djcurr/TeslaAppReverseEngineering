package w1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import h00.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import s1.f;
import s1.h;
import s1.m;
import t1.b0;
import t1.i;
import t1.o0;
import v1.e;
import x2.q;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private o0 f55362a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f55363b;

    /* renamed from: c  reason: collision with root package name */
    private b0 f55364c;

    /* renamed from: d  reason: collision with root package name */
    private float f55365d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    private q f55366e = q.Ltr;

    /* loaded from: classes.dex */
    static final class a extends u implements l<e, vz.b0> {
        a() {
            super(1);
        }

        public final void a(e eVar) {
            s.g(eVar, "$this$null");
            b.this.j(eVar);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(e eVar) {
            a(eVar);
            return vz.b0.f54756a;
        }
    }

    public b() {
        new a();
    }

    private final void d(float f11) {
        if (this.f55365d == f11) {
            return;
        }
        if (!a(f11)) {
            if (f11 == 1.0f) {
                o0 o0Var = this.f55362a;
                if (o0Var != null) {
                    o0Var.b(f11);
                }
                this.f55363b = false;
            } else {
                i().b(f11);
                this.f55363b = true;
            }
        }
        this.f55365d = f11;
    }

    private final void e(b0 b0Var) {
        if (s.c(this.f55364c, b0Var)) {
            return;
        }
        if (!b(b0Var)) {
            if (b0Var == null) {
                o0 o0Var = this.f55362a;
                if (o0Var != null) {
                    o0Var.f(null);
                }
                this.f55363b = false;
            } else {
                i().f(b0Var);
                this.f55363b = true;
            }
        }
        this.f55364c = b0Var;
    }

    private final void f(q qVar) {
        if (this.f55366e != qVar) {
            c(qVar);
            this.f55366e = qVar;
        }
    }

    private final o0 i() {
        o0 o0Var = this.f55362a;
        if (o0Var == null) {
            o0 a11 = i.a();
            this.f55362a = a11;
            return a11;
        }
        return o0Var;
    }

    protected abstract boolean a(float f11);

    protected abstract boolean b(b0 b0Var);

    protected boolean c(q layoutDirection) {
        s.g(layoutDirection, "layoutDirection");
        return false;
    }

    public final void g(e receiver, long j11, float f11, b0 b0Var) {
        s.g(receiver, "$receiver");
        d(f11);
        e(b0Var);
        f(receiver.getLayoutDirection());
        float i11 = s1.l.i(receiver.c()) - s1.l.i(j11);
        float g11 = s1.l.g(receiver.c()) - s1.l.g(j11);
        receiver.j0().a().g(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i11, g11);
        if (f11 > BitmapDescriptorFactory.HUE_RED && s1.l.i(j11) > BitmapDescriptorFactory.HUE_RED && s1.l.g(j11) > BitmapDescriptorFactory.HUE_RED) {
            if (this.f55363b) {
                h b11 = s1.i.b(f.f49950b.c(), m.a(s1.l.i(j11), s1.l.g(j11)));
                t1.u b12 = receiver.j0().b();
                try {
                    b12.u(b11, i());
                    j(receiver);
                } finally {
                    b12.h();
                }
            } else {
                j(receiver);
            }
        }
        receiver.j0().a().g(-0.0f, -0.0f, -i11, -g11);
    }

    public abstract long h();

    protected abstract void j(e eVar);
}