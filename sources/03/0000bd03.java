package wm;

import com.google.firebase.installations.h;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
class e {

    /* renamed from: d  reason: collision with root package name */
    private static final long f56128d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e  reason: collision with root package name */
    private static final long f56129e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a  reason: collision with root package name */
    private final h f56130a = h.c();

    /* renamed from: b  reason: collision with root package name */
    private long f56131b;

    /* renamed from: c  reason: collision with root package name */
    private int f56132c;

    private synchronized long a(int i11) {
        if (!c(i11)) {
            return f56128d;
        }
        return (long) Math.min(Math.pow(2.0d, this.f56132c) + this.f56130a.e(), f56129e);
    }

    private static boolean c(int i11) {
        return i11 == 429 || (i11 >= 500 && i11 < 600);
    }

    private static boolean d(int i11) {
        return (i11 >= 200 && i11 < 300) || i11 == 401 || i11 == 404;
    }

    private synchronized void e() {
        this.f56132c = 0;
    }

    public synchronized boolean b() {
        boolean z11;
        if (this.f56132c != 0) {
            z11 = this.f56130a.a() > this.f56131b;
        }
        return z11;
    }

    public synchronized void f(int i11) {
        if (d(i11)) {
            e();
            return;
        }
        this.f56132c++;
        this.f56131b = this.f56130a.a() + a(i11);
    }
}