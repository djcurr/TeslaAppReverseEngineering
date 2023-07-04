package com.squareup.picasso;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class a0 {

    /* renamed from: a  reason: collision with root package name */
    final HandlerThread f20629a;

    /* renamed from: b  reason: collision with root package name */
    final d f20630b;

    /* renamed from: c  reason: collision with root package name */
    final Handler f20631c;

    /* renamed from: d  reason: collision with root package name */
    long f20632d;

    /* renamed from: e  reason: collision with root package name */
    long f20633e;

    /* renamed from: f  reason: collision with root package name */
    long f20634f;

    /* renamed from: g  reason: collision with root package name */
    long f20635g;

    /* renamed from: h  reason: collision with root package name */
    long f20636h;

    /* renamed from: i  reason: collision with root package name */
    long f20637i;

    /* renamed from: j  reason: collision with root package name */
    long f20638j;

    /* renamed from: k  reason: collision with root package name */
    long f20639k;

    /* renamed from: l  reason: collision with root package name */
    int f20640l;

    /* renamed from: m  reason: collision with root package name */
    int f20641m;

    /* renamed from: n  reason: collision with root package name */
    int f20642n;

    /* loaded from: classes2.dex */
    private static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final a0 f20643a;

        /* renamed from: com.squareup.picasso.a0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class RunnableC0362a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Message f20644a;

            RunnableC0362a(a aVar, Message message) {
                this.f20644a = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unhandled stats message." + this.f20644a.what);
            }
        }

        a(Looper looper, a0 a0Var) {
            super(looper);
            this.f20643a = a0Var;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i11 = message.what;
            if (i11 == 0) {
                this.f20643a.j();
            } else if (i11 == 1) {
                this.f20643a.k();
            } else if (i11 == 2) {
                this.f20643a.h(message.arg1);
            } else if (i11 == 3) {
                this.f20643a.i(message.arg1);
            } else if (i11 != 4) {
                t.f20735p.post(new RunnableC0362a(this, message));
            } else {
                this.f20643a.l((Long) message.obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(d dVar) {
        this.f20630b = dVar;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        this.f20629a = handlerThread;
        handlerThread.start();
        d0.h(handlerThread.getLooper());
        this.f20631c = new a(handlerThread.getLooper(), this);
    }

    private static long g(int i11, long j11) {
        return j11 / i11;
    }

    private void m(Bitmap bitmap, int i11) {
        int i12 = d0.i(bitmap);
        Handler handler = this.f20631c;
        handler.sendMessage(handler.obtainMessage(i11, i12, 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0 a() {
        return new b0(this.f20630b.a(), this.f20630b.size(), this.f20632d, this.f20633e, this.f20634f, this.f20635g, this.f20636h, this.f20637i, this.f20638j, this.f20639k, this.f20640l, this.f20641m, this.f20642n, System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Bitmap bitmap) {
        m(bitmap, 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Bitmap bitmap) {
        m(bitmap, 3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        this.f20631c.sendEmptyMessage(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        this.f20631c.sendEmptyMessage(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(long j11) {
        Handler handler = this.f20631c;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j11)));
    }

    void h(long j11) {
        int i11 = this.f20641m + 1;
        this.f20641m = i11;
        long j12 = this.f20635g + j11;
        this.f20635g = j12;
        this.f20638j = g(i11, j12);
    }

    void i(long j11) {
        this.f20642n++;
        long j12 = this.f20636h + j11;
        this.f20636h = j12;
        this.f20639k = g(this.f20641m, j12);
    }

    void j() {
        this.f20632d++;
    }

    void k() {
        this.f20633e++;
    }

    void l(Long l11) {
        this.f20640l++;
        long longValue = this.f20634f + l11.longValue();
        this.f20634f = longValue;
        this.f20637i = g(this.f20640l, longValue);
    }
}