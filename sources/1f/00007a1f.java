package io.sentry;

import io.sentry.protocol.DebugImage;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class z0 implements r, Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final g3 f32725a;

    /* renamed from: b  reason: collision with root package name */
    private final j3 f32726b;

    /* renamed from: c  reason: collision with root package name */
    private final c3 f32727c;

    /* renamed from: d  reason: collision with root package name */
    private final w f32728d;

    public z0(g3 g3Var) {
        this(g3Var, g3Var.isAttachServerName() ? w.e() : null);
    }

    private void C(b3 b3Var) {
        if (this.f32725a.getProguardUuid() != null) {
            io.sentry.protocol.d m02 = b3Var.m0();
            if (m02 == null) {
                m02 = new io.sentry.protocol.d();
            }
            if (m02.c() == null) {
                m02.d(new ArrayList());
            }
            List<DebugImage> c11 = m02.c();
            if (c11 != null) {
                DebugImage debugImage = new DebugImage();
                debugImage.setType(DebugImage.PROGUARD);
                debugImage.setUuid(this.f32725a.getProguardUuid());
                c11.add(debugImage);
                b3Var.t0(m02);
            }
        }
    }

    private void D(d2 d2Var) {
        if (d2Var.C() == null) {
            d2Var.Q(this.f32725a.getDist());
        }
    }

    private void J(d2 d2Var) {
        if (d2Var.D() == null) {
            d2Var.R(this.f32725a.getEnvironment() != null ? this.f32725a.getEnvironment() : "production");
        }
    }

    private void L(b3 b3Var) {
        Throwable N = b3Var.N();
        if (N != null) {
            b3Var.u0(this.f32727c.c(N));
        }
    }

    private void R(d2 d2Var) {
        if (d2Var.G() == null) {
            d2Var.U("java");
        }
    }

    private void a0(d2 d2Var) {
        if (d2Var.H() == null) {
            d2Var.V(this.f32725a.getRelease());
        }
    }

    private void e0(d2 d2Var) {
        if (d2Var.J() == null) {
            d2Var.X(this.f32725a.getSdkVersion());
        }
    }

    private boolean j(t tVar) {
        return rz.h.g(tVar, oz.b.class);
    }

    private void l(d2 d2Var) {
        if (this.f32725a.isSendDefaultPii()) {
            if (d2Var.O() == null) {
                io.sentry.protocol.w wVar = new io.sentry.protocol.w();
                wVar.m("{{auto}}");
                d2Var.b0(wVar);
            } else if (d2Var.O().h() == null) {
                d2Var.O().m("{{auto}}");
            }
        }
    }

    private void m(d2 d2Var) {
        a0(d2Var);
        J(d2Var);
        n0(d2Var);
        D(d2Var);
        e0(d2Var);
        p0(d2Var);
        l(d2Var);
    }

    private void n0(d2 d2Var) {
        if (d2Var.K() == null) {
            d2Var.Y(this.f32725a.getServerName());
        }
        if (this.f32725a.isAttachServerName() && this.f32728d != null && d2Var.K() == null) {
            d2Var.Y(this.f32728d.d());
        }
    }

    private void p(d2 d2Var) {
        R(d2Var);
    }

    private void p0(d2 d2Var) {
        if (d2Var.L() == null) {
            d2Var.a0(new HashMap(this.f32725a.getTags()));
            return;
        }
        for (Map.Entry<String, String> entry : this.f32725a.getTags().entrySet()) {
            if (!d2Var.L().containsKey(entry.getKey())) {
                d2Var.Z(entry.getKey(), entry.getValue());
            }
        }
    }

    private void t0(b3 b3Var, t tVar) {
        if (b3Var.p0() == null) {
            ArrayList arrayList = null;
            List<io.sentry.protocol.n> n02 = b3Var.n0();
            if (n02 != null && !n02.isEmpty()) {
                for (io.sentry.protocol.n nVar : n02) {
                    if (nVar.g() != null && nVar.h() != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(nVar.h());
                    }
                }
            }
            if (this.f32725a.isAttachThreads()) {
                b3Var.x0(this.f32726b.b(arrayList));
            } else if (this.f32725a.isAttachStacktrace()) {
                if ((n02 == null || n02.isEmpty()) && !j(tVar)) {
                    b3Var.x0(this.f32726b.a());
                }
            }
        }
    }

    private boolean u0(d2 d2Var, t tVar) {
        if (rz.h.q(tVar)) {
            return true;
        }
        this.f32725a.getLogger().c(f3.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", d2Var.E());
        return false;
    }

    @Override // io.sentry.r
    public b3 a(b3 b3Var, t tVar) {
        p(b3Var);
        L(b3Var);
        C(b3Var);
        if (u0(b3Var, tVar)) {
            m(b3Var);
            t0(b3Var, tVar);
        }
        return b3Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        w wVar = this.f32728d;
        if (wVar != null) {
            wVar.c();
        }
    }

    @Override // io.sentry.r
    public io.sentry.protocol.v g(io.sentry.protocol.v vVar, t tVar) {
        p(vVar);
        if (u0(vVar, tVar)) {
            m(vVar);
        }
        return vVar;
    }

    z0(g3 g3Var, w wVar) {
        g3 g3Var2 = (g3) rz.j.a(g3Var, "The SentryOptions is required.");
        this.f32725a = g3Var2;
        this.f32728d = wVar;
        i3 i3Var = new i3(g3Var2.getInAppExcludes(), g3Var2.getInAppIncludes());
        this.f32727c = new c3(i3Var);
        this.f32726b = new j3(i3Var, g3Var2);
    }
}