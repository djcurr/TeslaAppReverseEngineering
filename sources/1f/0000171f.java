package com.facebook.imagepipeline.producers;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class o implements o0<qd.a<nf.c>> {

    /* renamed from: a  reason: collision with root package name */
    private final o0<qd.a<nf.c>> f11515a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f11516b;

    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f11517a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p0 f11518b;

        a(l lVar, p0 p0Var) {
            this.f11517a = lVar;
            this.f11518b = p0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.f11515a.b(this.f11517a, this.f11518b);
        }
    }

    public o(o0<qd.a<nf.c>> o0Var, ScheduledExecutorService scheduledExecutorService) {
        this.f11515a = o0Var;
        this.f11516b = scheduledExecutorService;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<qd.a<nf.c>> lVar, p0 p0Var) {
        com.facebook.imagepipeline.request.a l11 = p0Var.l();
        ScheduledExecutorService scheduledExecutorService = this.f11516b;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.schedule(new a(lVar, p0Var), l11.e(), TimeUnit.MILLISECONDS);
        } else {
            this.f11515a.b(lVar, p0Var);
        }
    }
}