package com.alipay.android.phone.mrpc.core;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class l implements ab {

    /* renamed from: b  reason: collision with root package name */
    public static l f10091b;

    /* renamed from: i  reason: collision with root package name */
    public static final ThreadFactory f10092i = new n();

    /* renamed from: a  reason: collision with root package name */
    public Context f10093a;

    /* renamed from: c  reason: collision with root package name */
    public ThreadPoolExecutor f10094c;

    /* renamed from: d  reason: collision with root package name */
    public b f10095d = b.a("android");

    /* renamed from: e  reason: collision with root package name */
    public long f10096e;

    /* renamed from: f  reason: collision with root package name */
    public long f10097f;

    /* renamed from: g  reason: collision with root package name */
    public long f10098g;

    /* renamed from: h  reason: collision with root package name */
    public int f10099h;

    public l(Context context) {
        this.f10093a = context;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 11, 3L, TimeUnit.SECONDS, new ArrayBlockingQueue(20), f10092i, new ThreadPoolExecutor.CallerRunsPolicy());
        this.f10094c = threadPoolExecutor;
        try {
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        } catch (Exception unused) {
        }
        CookieSyncManager.createInstance(this.f10093a);
        CookieManager.getInstance().setAcceptCookie(true);
    }

    public static final l a(Context context) {
        l lVar = f10091b;
        return lVar != null ? lVar : b(context);
    }

    public static final synchronized l b(Context context) {
        synchronized (l.class) {
            l lVar = f10091b;
            if (lVar != null) {
                return lVar;
            }
            l lVar2 = new l(context);
            f10091b = lVar2;
            return lVar2;
        }
    }

    public final b a() {
        return this.f10095d;
    }

    @Override // com.alipay.android.phone.mrpc.core.ab
    public final Future<u> a(t tVar) {
        if (s.a(this.f10093a)) {
            String str = "HttpManager" + hashCode() + ": Active Task = %d, Completed Task = %d, All Task = %d,Avarage Speed = %d KB/S, Connetct Time = %d ms, All data size = %d bytes, All enqueueConnect time = %d ms, All socket time = %d ms, All request times = %d times";
            Object[] objArr = new Object[9];
            objArr[0] = Integer.valueOf(this.f10094c.getActiveCount());
            objArr[1] = Long.valueOf(this.f10094c.getCompletedTaskCount());
            objArr[2] = Long.valueOf(this.f10094c.getTaskCount());
            long j11 = this.f10098g;
            objArr[3] = Long.valueOf(j11 == 0 ? 0L : ((this.f10096e * 1000) / j11) >> 10);
            int i11 = this.f10099h;
            objArr[4] = Long.valueOf(i11 != 0 ? this.f10097f / i11 : 0L);
            objArr[5] = Long.valueOf(this.f10096e);
            objArr[6] = Long.valueOf(this.f10097f);
            objArr[7] = Long.valueOf(this.f10098g);
            objArr[8] = Integer.valueOf(this.f10099h);
            String.format(str, objArr);
        }
        q qVar = new q(this, (o) tVar);
        m mVar = new m(this, qVar, qVar);
        this.f10094c.execute(mVar);
        return mVar;
    }

    public final void a(long j11) {
        this.f10096e += j11;
    }

    public final void b(long j11) {
        this.f10097f += j11;
        this.f10099h++;
    }

    public final void c(long j11) {
        this.f10098g += j11;
    }
}