package io.grpc.internal;

import io.grpc.m0;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
final class q1 extends io.grpc.m0 {

    /* renamed from: b  reason: collision with root package name */
    private final m0.d f31177b;

    /* renamed from: c  reason: collision with root package name */
    private m0.h f31178c;

    /* loaded from: classes5.dex */
    class a implements m0.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m0.h f31179a;

        a(m0.h hVar) {
            this.f31179a = hVar;
        }

        @Override // io.grpc.m0.j
        public void a(io.grpc.q qVar) {
            q1.this.g(this.f31179a, qVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f31181a;

        static {
            int[] iArr = new int[io.grpc.p.values().length];
            f31181a = iArr;
            try {
                iArr[io.grpc.p.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31181a[io.grpc.p.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31181a[io.grpc.p.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31181a[io.grpc.p.TRANSIENT_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class c extends m0.i {

        /* renamed from: a  reason: collision with root package name */
        private final m0.e f31182a;

        c(m0.e eVar) {
            this.f31182a = (m0.e) com.google.common.base.u.p(eVar, "result");
        }

        @Override // io.grpc.m0.i
        public m0.e a(m0.f fVar) {
            return this.f31182a;
        }

        public String toString() {
            return com.google.common.base.o.b(c.class).d("result", this.f31182a).toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class d extends m0.i {

        /* renamed from: a  reason: collision with root package name */
        private final m0.h f31183a;

        /* renamed from: b  reason: collision with root package name */
        private final AtomicBoolean f31184b = new AtomicBoolean(false);

        /* loaded from: classes5.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f31183a.e();
            }
        }

        d(m0.h hVar) {
            this.f31183a = (m0.h) com.google.common.base.u.p(hVar, "subchannel");
        }

        @Override // io.grpc.m0.i
        public m0.e a(m0.f fVar) {
            if (this.f31184b.compareAndSet(false, true)) {
                q1.this.f31177b.c().execute(new a());
            }
            return m0.e.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q1(m0.d dVar) {
        this.f31177b = (m0.d) com.google.common.base.u.p(dVar, "helper");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(m0.h hVar, io.grpc.q qVar) {
        m0.i dVar;
        m0.i iVar;
        io.grpc.p c11 = qVar.c();
        if (c11 == io.grpc.p.SHUTDOWN) {
            return;
        }
        if (qVar.c() == io.grpc.p.TRANSIENT_FAILURE || qVar.c() == io.grpc.p.IDLE) {
            this.f31177b.d();
        }
        int i11 = b.f31181a[c11.ordinal()];
        if (i11 == 1) {
            dVar = new d(hVar);
        } else {
            if (i11 == 2) {
                iVar = new c(m0.e.g());
            } else if (i11 == 3) {
                dVar = new c(m0.e.h(hVar));
            } else if (i11 == 4) {
                iVar = new c(m0.e.f(qVar.d()));
            } else {
                throw new IllegalArgumentException("Unsupported state:" + c11);
            }
            this.f31177b.e(c11, iVar);
        }
        iVar = dVar;
        this.f31177b.e(c11, iVar);
    }

    @Override // io.grpc.m0
    public void b(io.grpc.f1 f1Var) {
        m0.h hVar = this.f31178c;
        if (hVar != null) {
            hVar.f();
            this.f31178c = null;
        }
        this.f31177b.e(io.grpc.p.TRANSIENT_FAILURE, new c(m0.e.f(f1Var)));
    }

    @Override // io.grpc.m0
    public void c(m0.g gVar) {
        List<io.grpc.x> a11 = gVar.a();
        m0.h hVar = this.f31178c;
        if (hVar == null) {
            m0.h a12 = this.f31177b.a(m0.b.c().e(a11).b());
            a12.g(new a(a12));
            this.f31178c = a12;
            this.f31177b.e(io.grpc.p.CONNECTING, new c(m0.e.h(a12)));
            a12.e();
            return;
        }
        hVar.h(a11);
    }

    @Override // io.grpc.m0
    public void d() {
        m0.h hVar = this.f31178c;
        if (hVar != null) {
            hVar.f();
        }
    }
}