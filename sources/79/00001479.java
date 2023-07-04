package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class d implements l {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f10271a;

    /* loaded from: classes.dex */
    class a implements Executor {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Handler f10272a;

        a(d dVar, Handler handler) {
            this.f10272a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f10272a.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final i f10273a;

        /* renamed from: b  reason: collision with root package name */
        private final k f10274b;

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f10275c;

        public b(i iVar, k kVar, Runnable runnable) {
            this.f10273a = iVar;
            this.f10274b = kVar;
            this.f10275c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f10273a.isCanceled()) {
                this.f10273a.finish("canceled-at-delivery");
                return;
            }
            if (this.f10274b.b()) {
                this.f10273a.deliverResponse(this.f10274b.f10302a);
            } else {
                this.f10273a.deliverError(this.f10274b.f10304c);
            }
            if (this.f10274b.f10305d) {
                this.f10273a.addMarker("intermediate-response");
            } else {
                this.f10273a.finish("done");
            }
            Runnable runnable = this.f10275c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public d(Handler handler) {
        this.f10271a = new a(this, handler);
    }

    @Override // com.android.volley.l
    public void a(i<?> iVar, k<?> kVar) {
        b(iVar, kVar, null);
    }

    @Override // com.android.volley.l
    public void b(i<?> iVar, k<?> kVar, Runnable runnable) {
        iVar.markDelivered();
        iVar.addMarker("post-response");
        this.f10271a.execute(new b(iVar, kVar, runnable));
    }

    @Override // com.android.volley.l
    public void c(i<?> iVar, VolleyError volleyError) {
        iVar.addMarker("post-error");
        this.f10271a.execute(new b(iVar, k.a(volleyError), null));
    }
}