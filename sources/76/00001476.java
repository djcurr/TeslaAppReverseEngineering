package com.android.volley;

import android.os.Process;
import com.android.volley.a;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public class b extends Thread {

    /* renamed from: g  reason: collision with root package name */
    private static final boolean f10258g = n.f10307b;

    /* renamed from: a  reason: collision with root package name */
    private final BlockingQueue<i<?>> f10259a;

    /* renamed from: b  reason: collision with root package name */
    private final BlockingQueue<i<?>> f10260b;

    /* renamed from: c  reason: collision with root package name */
    private final com.android.volley.a f10261c;

    /* renamed from: d  reason: collision with root package name */
    private final l f10262d;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f10263e = false;

    /* renamed from: f  reason: collision with root package name */
    private final o f10264f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f10265a;

        a(i iVar) {
            this.f10265a = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                b.this.f10260b.put(this.f10265a);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public b(BlockingQueue<i<?>> blockingQueue, BlockingQueue<i<?>> blockingQueue2, com.android.volley.a aVar, l lVar) {
        this.f10259a = blockingQueue;
        this.f10260b = blockingQueue2;
        this.f10261c = aVar;
        this.f10262d = lVar;
        this.f10264f = new o(this, blockingQueue2, lVar);
    }

    private void b() {
        c(this.f10259a.take());
    }

    void c(i<?> iVar) {
        iVar.addMarker("cache-queue-take");
        iVar.sendEvent(1);
        try {
            if (iVar.isCanceled()) {
                iVar.finish("cache-discard-canceled");
                return;
            }
            a.C0196a c0196a = this.f10261c.get(iVar.getCacheKey());
            if (c0196a == null) {
                iVar.addMarker("cache-miss");
                if (!this.f10264f.c(iVar)) {
                    this.f10260b.put(iVar);
                }
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (c0196a.b(currentTimeMillis)) {
                iVar.addMarker("cache-hit-expired");
                iVar.setCacheEntry(c0196a);
                if (!this.f10264f.c(iVar)) {
                    this.f10260b.put(iVar);
                }
                return;
            }
            iVar.addMarker("cache-hit");
            k<?> parseNetworkResponse = iVar.parseNetworkResponse(new h(c0196a.f10250a, c0196a.f10256g));
            iVar.addMarker("cache-hit-parsed");
            if (!parseNetworkResponse.b()) {
                iVar.addMarker("cache-parsing-failed");
                this.f10261c.a(iVar.getCacheKey(), true);
                iVar.setCacheEntry(null);
                if (!this.f10264f.c(iVar)) {
                    this.f10260b.put(iVar);
                }
                return;
            }
            if (!c0196a.c(currentTimeMillis)) {
                this.f10262d.a(iVar, parseNetworkResponse);
            } else {
                iVar.addMarker("cache-hit-refresh-needed");
                iVar.setCacheEntry(c0196a);
                parseNetworkResponse.f10305d = true;
                if (!this.f10264f.c(iVar)) {
                    this.f10262d.b(iVar, parseNetworkResponse, new a(iVar));
                } else {
                    this.f10262d.a(iVar, parseNetworkResponse);
                }
            }
        } finally {
            iVar.sendEvent(2);
        }
    }

    public void d() {
        this.f10263e = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (f10258g) {
            n.e("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f10261c.initialize();
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.f10263e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                n.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}