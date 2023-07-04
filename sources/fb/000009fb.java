package androidx.work;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import v20.a2;

/* loaded from: classes.dex */
public final class n<R> implements com.google.common.util.concurrent.c<R> {

    /* renamed from: a  reason: collision with root package name */
    private final a2 f6690a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c<R> f6691b;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<Throwable, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n<R> f6692a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(n<R> nVar) {
            super(1);
            this.f6692a = nVar;
        }

        public final void a(Throwable th2) {
            if (th2 == null) {
                if (!((n) this.f6692a).f6691b.isDone()) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            } else if (th2 instanceof CancellationException) {
                ((n) this.f6692a).f6691b.cancel(true);
            } else {
                androidx.work.impl.utils.futures.c cVar = ((n) this.f6692a).f6691b;
                Throwable cause = th2.getCause();
                if (cause != null) {
                    th2 = cause;
                }
                cVar.q(th2);
            }
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(Throwable th2) {
            a(th2);
            return vz.b0.f54756a;
        }
    }

    public n(a2 job, androidx.work.impl.utils.futures.c<R> underlying) {
        kotlin.jvm.internal.s.g(job, "job");
        kotlin.jvm.internal.s.g(underlying, "underlying");
        this.f6690a = job;
        this.f6691b = underlying;
        job.p(new a(this));
    }

    @Override // com.google.common.util.concurrent.c
    public void a(Runnable runnable, Executor executor) {
        this.f6691b.a(runnable, executor);
    }

    public final void c(R r11) {
        this.f6691b.p(r11);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        return this.f6691b.cancel(z11);
    }

    @Override // java.util.concurrent.Future
    public R get() {
        return this.f6691b.get();
    }

    @Override // java.util.concurrent.Future
    public R get(long j11, TimeUnit timeUnit) {
        return this.f6691b.get(j11, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f6691b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f6691b.isDone();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ n(v20.a2 r1, androidx.work.impl.utils.futures.c r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            androidx.work.impl.utils.futures.c r2 = androidx.work.impl.utils.futures.c.t()
            java.lang.String r3 = "create()"
            kotlin.jvm.internal.s.f(r2, r3)
        Ld:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.n.<init>(v20.a2, androidx.work.impl.utils.futures.c, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}