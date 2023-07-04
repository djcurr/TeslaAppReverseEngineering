package io.grpc.internal;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.grpc.internal.j2;
import io.grpc.internal.k1;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class g implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    private final d f30928a;

    /* renamed from: b  reason: collision with root package name */
    private final k1.b f30929b;

    /* renamed from: c  reason: collision with root package name */
    private final Queue<InputStream> f30930c = new ArrayDeque();

    /* loaded from: classes5.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f30931a;

        a(int i11) {
            this.f30931a = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.f30929b.b(this.f30931a);
        }
    }

    /* loaded from: classes5.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f30933a;

        b(boolean z11) {
            this.f30933a = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.f30929b.d(this.f30933a);
        }
    }

    /* loaded from: classes5.dex */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Throwable f30935a;

        c(Throwable th2) {
            this.f30935a = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.f30929b.c(this.f30935a);
        }
    }

    /* loaded from: classes5.dex */
    public interface d {
        void e(Runnable runnable);
    }

    public g(k1.b bVar, d dVar) {
        this.f30929b = (k1.b) com.google.common.base.u.p(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f30928a = (d) com.google.common.base.u.p(dVar, "transportExecutor");
    }

    @Override // io.grpc.internal.k1.b
    public void a(j2.a aVar) {
        while (true) {
            InputStream next = aVar.next();
            if (next == null) {
                return;
            }
            this.f30930c.add(next);
        }
    }

    @Override // io.grpc.internal.k1.b
    public void b(int i11) {
        this.f30928a.e(new a(i11));
    }

    @Override // io.grpc.internal.k1.b
    public void c(Throwable th2) {
        this.f30928a.e(new c(th2));
    }

    @Override // io.grpc.internal.k1.b
    public void d(boolean z11) {
        this.f30928a.e(new b(z11));
    }

    public InputStream f() {
        return this.f30930c.poll();
    }
}