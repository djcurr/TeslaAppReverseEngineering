package com.bumptech.glide.request;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.GlideException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class f<R> implements c<R>, g<R> {

    /* renamed from: k  reason: collision with root package name */
    private static final a f10832k = new a();

    /* renamed from: a  reason: collision with root package name */
    private final int f10833a;

    /* renamed from: b  reason: collision with root package name */
    private final int f10834b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f10835c;

    /* renamed from: d  reason: collision with root package name */
    private final a f10836d;

    /* renamed from: e  reason: collision with root package name */
    private R f10837e;

    /* renamed from: f  reason: collision with root package name */
    private d f10838f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f10839g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f10840h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f10841i;

    /* renamed from: j  reason: collision with root package name */
    private GlideException f10842j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        a() {
        }

        void a(Object obj) {
            obj.notifyAll();
        }

        void b(Object obj, long j11) {
            obj.wait(j11);
        }
    }

    public f(int i11, int i12) {
        this(i11, i12, true, f10832k);
    }

    private synchronized R b(Long l11) {
        if (this.f10835c && !isDone()) {
            bb.k.a();
        }
        if (!this.f10839g) {
            if (!this.f10841i) {
                if (this.f10840h) {
                    return this.f10837e;
                }
                if (l11 == null) {
                    this.f10836d.b(this, 0L);
                } else if (l11.longValue() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long longValue = l11.longValue() + currentTimeMillis;
                    while (!isDone() && currentTimeMillis < longValue) {
                        this.f10836d.b(this, longValue - currentTimeMillis);
                        currentTimeMillis = System.currentTimeMillis();
                    }
                }
                if (!Thread.interrupted()) {
                    if (!this.f10841i) {
                        if (!this.f10839g) {
                            if (this.f10840h) {
                                return this.f10837e;
                            }
                            throw new TimeoutException();
                        }
                        throw new CancellationException();
                    }
                    throw new ExecutionException(this.f10842j);
                }
                throw new InterruptedException();
            }
            throw new ExecutionException(this.f10842j);
        }
        throw new CancellationException();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.f10839g = true;
            this.f10836d.a(this);
            d dVar = null;
            if (z11) {
                d dVar2 = this.f10838f;
                this.f10838f = null;
                dVar = dVar2;
            }
            if (dVar != null) {
                dVar.clear();
            }
            return true;
        }
    }

    @Override // java.util.concurrent.Future
    public R get() {
        try {
            return b(null);
        } catch (TimeoutException e11) {
            throw new AssertionError(e11);
        }
    }

    @Override // ya.k
    public synchronized d getRequest() {
        return this.f10838f;
    }

    @Override // ya.k
    public void getSize(ya.j jVar) {
        jVar.e(this.f10833a, this.f10834b);
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.f10839g;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        boolean z11;
        if (!this.f10839g && !this.f10840h) {
            z11 = this.f10841i;
        }
        return z11;
    }

    @Override // va.m
    public void onDestroy() {
    }

    @Override // ya.k
    public void onLoadCleared(Drawable drawable) {
    }

    @Override // ya.k
    public synchronized void onLoadFailed(Drawable drawable) {
    }

    @Override // ya.k
    public void onLoadStarted(Drawable drawable) {
    }

    @Override // ya.k
    public synchronized void onResourceReady(R r11, za.b<? super R> bVar) {
    }

    @Override // va.m
    public void onStart() {
    }

    @Override // va.m
    public void onStop() {
    }

    @Override // ya.k
    public void removeCallback(ya.j jVar) {
    }

    @Override // ya.k
    public synchronized void setRequest(d dVar) {
        this.f10838f = dVar;
    }

    f(int i11, int i12, boolean z11, a aVar) {
        this.f10833a = i11;
        this.f10834b = i12;
        this.f10835c = z11;
        this.f10836d = aVar;
    }

    @Override // com.bumptech.glide.request.g
    public synchronized boolean onLoadFailed(GlideException glideException, Object obj, ya.k<R> kVar, boolean z11) {
        this.f10841i = true;
        this.f10842j = glideException;
        this.f10836d.a(this);
        return false;
    }

    @Override // com.bumptech.glide.request.g
    public synchronized boolean onResourceReady(R r11, Object obj, ya.k<R> kVar, com.bumptech.glide.load.a aVar, boolean z11) {
        this.f10840h = true;
        this.f10837e = r11;
        this.f10836d.a(this);
        return false;
    }

    @Override // java.util.concurrent.Future
    public R get(long j11, TimeUnit timeUnit) {
        return b(Long.valueOf(timeUnit.toMillis(j11)));
    }
}