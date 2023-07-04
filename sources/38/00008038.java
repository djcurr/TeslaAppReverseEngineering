package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.g0;
import kotlinx.coroutines.internal.i0;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a */
    public static final long f35564a;

    /* renamed from: b */
    public static final int f35565b;

    /* renamed from: c */
    public static final int f35566c;

    /* renamed from: d */
    public static final long f35567d;

    /* renamed from: e */
    public static g f35568e;

    /* renamed from: f */
    public static final i f35569f;

    /* renamed from: g */
    public static final i f35570g;

    static {
        long e11;
        int d11;
        int d12;
        int d13;
        long e12;
        e11 = i0.e("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        f35564a = e11;
        d11 = m00.l.d(g0.a(), 2);
        d12 = i0.d("kotlinx.coroutines.scheduler.core.pool.size", d11, 1, 0, 8, null);
        f35565b = d12;
        d13 = i0.d("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        f35566c = d13;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        e12 = i0.e("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        f35567d = timeUnit.toNanos(e12);
        f35568e = e.f35554a;
        f35569f = new j(0);
        f35570g = new j(1);
    }
}