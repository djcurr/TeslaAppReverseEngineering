package io.grpc.internal;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.grpc.internal.g;
import io.grpc.internal.j2;
import io.grpc.internal.k1;
import java.io.Closeable;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class f implements y {

    /* renamed from: a  reason: collision with root package name */
    private final k1.b f30789a;

    /* renamed from: b  reason: collision with root package name */
    private final io.grpc.internal.g f30790b;

    /* renamed from: c  reason: collision with root package name */
    private final k1 f30791c;

    /* loaded from: classes5.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f30792a;

        a(int i11) {
            this.f30792a = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (f.this.f30791c.isClosed()) {
                return;
            }
            try {
                f.this.f30791c.g(this.f30792a);
            } catch (Throwable th2) {
                f.this.f30790b.c(th2);
                f.this.f30791c.close();
            }
        }
    }

    /* loaded from: classes5.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u1 f30794a;

        b(u1 u1Var) {
            this.f30794a = u1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                f.this.f30791c.m(this.f30794a);
            } catch (Throwable th2) {
                f.this.f30790b.c(th2);
                f.this.f30791c.close();
            }
        }
    }

    /* loaded from: classes5.dex */
    class c implements Closeable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u1 f30796a;

        c(f fVar, u1 u1Var) {
            this.f30796a = u1Var;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f30796a.close();
        }
    }

    /* loaded from: classes5.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.f30791c.p();
        }
    }

    /* loaded from: classes5.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.f30791c.close();
        }
    }

    /* renamed from: io.grpc.internal.f$f  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    private class C0589f extends g implements Closeable {

        /* renamed from: d  reason: collision with root package name */
        private final Closeable f30799d;

        public C0589f(f fVar, Runnable runnable, Closeable closeable) {
            super(fVar, runnable, null);
            this.f30799d = closeable;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f30799d.close();
        }
    }

    /* loaded from: classes5.dex */
    private class g implements j2.a {

        /* renamed from: a  reason: collision with root package name */
        private final Runnable f30800a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f30801b;

        /* synthetic */ g(f fVar, Runnable runnable, a aVar) {
            this(runnable);
        }

        private void a() {
            if (this.f30801b) {
                return;
            }
            this.f30800a.run();
            this.f30801b = true;
        }

        @Override // io.grpc.internal.j2.a
        public InputStream next() {
            a();
            return f.this.f30790b.f();
        }

        private g(Runnable runnable) {
            this.f30801b = false;
            this.f30800a = runnable;
        }
    }

    /* loaded from: classes5.dex */
    interface h extends g.d {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(k1.b bVar, h hVar, k1 k1Var) {
        g2 g2Var = new g2((k1.b) com.google.common.base.u.p(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER));
        this.f30789a = g2Var;
        io.grpc.internal.g gVar = new io.grpc.internal.g(g2Var, hVar);
        this.f30790b = gVar;
        k1Var.p0(gVar);
        this.f30791c = k1Var;
    }

    @Override // io.grpc.internal.y
    public void close() {
        this.f30791c.t0();
        this.f30789a.a(new g(this, new e(), null));
    }

    @Override // io.grpc.internal.y
    public void g(int i11) {
        this.f30789a.a(new g(this, new a(i11), null));
    }

    @Override // io.grpc.internal.y
    public void j(int i11) {
        this.f30791c.j(i11);
    }

    @Override // io.grpc.internal.y
    public void l(io.grpc.u uVar) {
        this.f30791c.l(uVar);
    }

    @Override // io.grpc.internal.y
    public void m(u1 u1Var) {
        this.f30789a.a(new C0589f(this, new b(u1Var), new c(this, u1Var)));
    }

    @Override // io.grpc.internal.y
    public void p() {
        this.f30789a.a(new g(this, new d(), null));
    }
}