package oe;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import oe.a;

/* loaded from: classes3.dex */
public class c<T extends oe.a> extends oe.b<T> {

    /* renamed from: b  reason: collision with root package name */
    private final td.b f42355b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f42356c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f42357d;

    /* renamed from: e  reason: collision with root package name */
    private long f42358e;

    /* renamed from: f  reason: collision with root package name */
    private long f42359f;

    /* renamed from: g  reason: collision with root package name */
    private long f42360g;

    /* renamed from: h  reason: collision with root package name */
    private b f42361h;

    /* renamed from: i  reason: collision with root package name */
    private final Runnable f42362i;

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (c.this) {
                c.this.f42357d = false;
                if (c.this.p()) {
                    if (c.this.f42361h != null) {
                        c.this.f42361h.h();
                    }
                } else {
                    c.this.q();
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void h();
    }

    private c(T t11, b bVar, td.b bVar2, ScheduledExecutorService scheduledExecutorService) {
        super(t11);
        this.f42357d = false;
        this.f42359f = 2000L;
        this.f42360g = 1000L;
        this.f42362i = new a();
        this.f42361h = bVar;
        this.f42355b = bVar2;
        this.f42356c = scheduledExecutorService;
    }

    public static <T extends oe.a> oe.b<T> n(T t11, b bVar, td.b bVar2, ScheduledExecutorService scheduledExecutorService) {
        return new c(t11, bVar, bVar2, scheduledExecutorService);
    }

    public static <T extends oe.a & b> oe.b<T> o(T t11, td.b bVar, ScheduledExecutorService scheduledExecutorService) {
        return n(t11, (b) t11, bVar, scheduledExecutorService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p() {
        return this.f42355b.now() - this.f42358e > this.f42359f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void q() {
        if (!this.f42357d) {
            this.f42357d = true;
            this.f42356c.schedule(this.f42362i, this.f42360g, TimeUnit.MILLISECONDS);
        }
    }

    @Override // oe.b, oe.a
    public boolean g(Drawable drawable, Canvas canvas, int i11) {
        this.f42358e = this.f42355b.now();
        boolean g11 = super.g(drawable, canvas, i11);
        q();
        return g11;
    }
}