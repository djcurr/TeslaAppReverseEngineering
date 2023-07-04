package qf;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private int f48073a;

    /* renamed from: b  reason: collision with root package name */
    private long f48074b;

    /* renamed from: c  reason: collision with root package name */
    private final int f48075c;

    /* renamed from: d  reason: collision with root package name */
    private final int f48076d;

    /* renamed from: e  reason: collision with root package name */
    private final qd.h<Bitmap> f48077e;

    /* renamed from: qf.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C1026a implements qd.h<Bitmap> {
        C1026a() {
        }

        @Override // qd.h
        /* renamed from: b */
        public void a(Bitmap bitmap) {
            try {
                a.this.a(bitmap);
            } finally {
                bitmap.recycle();
            }
        }
    }

    public a(int i11, int i12) {
        md.k.b(Boolean.valueOf(i11 > 0));
        md.k.b(Boolean.valueOf(i12 > 0));
        this.f48075c = i11;
        this.f48076d = i12;
        this.f48077e = new C1026a();
    }

    public synchronized void a(Bitmap bitmap) {
        int e11 = com.facebook.imageutils.a.e(bitmap);
        md.k.c(this.f48073a > 0, "No bitmaps registered.");
        long j11 = e11;
        md.k.d(j11 <= this.f48074b, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(e11), Long.valueOf(this.f48074b));
        this.f48074b -= j11;
        this.f48073a--;
    }

    public synchronized int b() {
        return this.f48073a;
    }

    public synchronized int c() {
        return this.f48075c;
    }

    public synchronized int d() {
        return this.f48076d;
    }

    public qd.h<Bitmap> e() {
        return this.f48077e;
    }

    public synchronized long f() {
        return this.f48074b;
    }

    public synchronized boolean g(Bitmap bitmap) {
        int e11 = com.facebook.imageutils.a.e(bitmap);
        int i11 = this.f48073a;
        if (i11 < this.f48075c) {
            long j11 = this.f48074b;
            long j12 = e11;
            if (j11 + j12 <= this.f48076d) {
                this.f48073a = i11 + 1;
                this.f48074b = j11 + j12;
                return true;
            }
        }
        return false;
    }
}