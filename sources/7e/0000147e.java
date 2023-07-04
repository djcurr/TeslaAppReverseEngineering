package com.android.volley;

import android.net.TrafficStats;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public class g extends Thread {

    /* renamed from: a  reason: collision with root package name */
    private final BlockingQueue<i<?>> f10278a;

    /* renamed from: b  reason: collision with root package name */
    private final f f10279b;

    /* renamed from: c  reason: collision with root package name */
    private final a f10280c;

    /* renamed from: d  reason: collision with root package name */
    private final l f10281d;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f10282e = false;

    public g(BlockingQueue<i<?>> blockingQueue, f fVar, a aVar, l lVar) {
        this.f10278a = blockingQueue;
        this.f10279b = fVar;
        this.f10280c = aVar;
        this.f10281d = lVar;
    }

    private void a(i<?> iVar) {
        if (Build.VERSION.SDK_INT >= 14) {
            TrafficStats.setThreadStatsTag(iVar.getTrafficStatsTag());
        }
    }

    private void b(i<?> iVar, VolleyError volleyError) {
        this.f10281d.c(iVar, iVar.parseNetworkError(volleyError));
    }

    private void c() {
        d(this.f10278a.take());
    }

    void d(i<?> iVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        iVar.sendEvent(3);
        try {
            try {
                try {
                    iVar.addMarker("network-queue-take");
                } catch (Exception e11) {
                    n.d(e11, "Unhandled exception %s", e11.toString());
                    VolleyError volleyError = new VolleyError(e11);
                    volleyError.a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    this.f10281d.c(iVar, volleyError);
                    iVar.notifyListenerResponseNotUsable();
                }
            } catch (VolleyError e12) {
                e12.a(SystemClock.elapsedRealtime() - elapsedRealtime);
                b(iVar, e12);
                iVar.notifyListenerResponseNotUsable();
            }
            if (iVar.isCanceled()) {
                iVar.finish("network-discard-cancelled");
                iVar.notifyListenerResponseNotUsable();
                return;
            }
            a(iVar);
            h a11 = this.f10279b.a(iVar);
            iVar.addMarker("network-http-complete");
            if (a11.f10287e && iVar.hasHadResponseDelivered()) {
                iVar.finish("not-modified");
                iVar.notifyListenerResponseNotUsable();
                return;
            }
            k<?> parseNetworkResponse = iVar.parseNetworkResponse(a11);
            iVar.addMarker("network-parse-complete");
            if (iVar.shouldCache() && parseNetworkResponse.f10303b != null) {
                this.f10280c.b(iVar.getCacheKey(), parseNetworkResponse.f10303b);
                iVar.addMarker("network-cache-written");
            }
            iVar.markDelivered();
            this.f10281d.a(iVar, parseNetworkResponse);
            iVar.notifyListenerResponseReceived(parseNetworkResponse);
        } finally {
            iVar.sendEvent(4);
        }
    }

    public void e() {
        this.f10282e = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                c();
            } catch (InterruptedException unused) {
                if (this.f10282e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                n.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}