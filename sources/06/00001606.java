package com.facebook.datasource;

import android.util.Pair;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class a<T> implements com.facebook.datasource.c<T> {

    /* renamed from: h  reason: collision with root package name */
    private static volatile c f11060h;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Object> f11061a;

    /* renamed from: d  reason: collision with root package name */
    private T f11064d = null;

    /* renamed from: e  reason: collision with root package name */
    private Throwable f11065e = null;

    /* renamed from: f  reason: collision with root package name */
    private float f11066f = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11063c = false;

    /* renamed from: b  reason: collision with root package name */
    private d f11062b = d.IN_PROGRESS;

    /* renamed from: g  reason: collision with root package name */
    private final ConcurrentLinkedQueue<Pair<e<T>, Executor>> f11067g = new ConcurrentLinkedQueue<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.datasource.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0208a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f11068a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f11069b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f11070c;

        RunnableC0208a(boolean z11, e eVar, boolean z12) {
            this.f11068a = z11;
            this.f11069b = eVar;
            this.f11070c = z12;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f11068a) {
                this.f11069b.onFailure(a.this);
            } else if (this.f11070c) {
                this.f11069b.onCancellation(a.this);
            } else {
                this.f11069b.onNewResult(a.this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f11072a;

        b(e eVar) {
            this.f11072a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11072a.onProgressUpdate(a.this);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        Runnable a(Runnable runnable, String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum d {
        IN_PROGRESS,
        SUCCESS,
        FAILURE
    }

    public static c i() {
        return f11060h;
    }

    private void m() {
        boolean j11 = j();
        boolean w11 = w();
        Iterator<Pair<e<T>, Executor>> it2 = this.f11067g.iterator();
        while (it2.hasNext()) {
            Pair<e<T>, Executor> next = it2.next();
            l((e) next.first, (Executor) next.second, j11, w11);
        }
    }

    private synchronized boolean r(Throwable th2, Map<String, Object> map) {
        if (!this.f11063c && this.f11062b == d.IN_PROGRESS) {
            this.f11062b = d.FAILURE;
            this.f11065e = th2;
            this.f11061a = map;
            return true;
        }
        return false;
    }

    private synchronized boolean t(float f11) {
        if (!this.f11063c && this.f11062b == d.IN_PROGRESS) {
            if (f11 < this.f11066f) {
                return false;
            }
            this.f11066f = f11;
            return true;
        }
        return false;
    }

    private boolean v(T t11, boolean z11) {
        T t12;
        T t13 = null;
        try {
            synchronized (this) {
                try {
                    try {
                        if (!this.f11063c && this.f11062b == d.IN_PROGRESS) {
                            if (z11) {
                                this.f11062b = d.SUCCESS;
                                this.f11066f = 1.0f;
                            }
                            T t14 = this.f11064d;
                            if (t14 != t11) {
                                try {
                                    this.f11064d = t11;
                                    t12 = t14;
                                } catch (Throwable th2) {
                                    th = th2;
                                    t13 = t14;
                                    throw th;
                                }
                            } else {
                                t12 = null;
                            }
                            return true;
                        }
                        if (t11 != null) {
                            h(t11);
                        }
                        return false;
                    } catch (Throwable th3) {
                        t13 = t11;
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } finally {
            if (t13 != null) {
                h(t13);
            }
        }
    }

    private synchronized boolean w() {
        boolean z11;
        if (k()) {
            z11 = a() ? false : true;
        }
        return z11;
    }

    @Override // com.facebook.datasource.c
    public synchronized boolean a() {
        return this.f11062b != d.IN_PROGRESS;
    }

    @Override // com.facebook.datasource.c
    public synchronized boolean b() {
        return this.f11064d != null;
    }

    @Override // com.facebook.datasource.c
    public synchronized Throwable c() {
        return this.f11065e;
    }

    @Override // com.facebook.datasource.c
    public boolean close() {
        synchronized (this) {
            if (this.f11063c) {
                return false;
            }
            this.f11063c = true;
            T t11 = this.f11064d;
            this.f11064d = null;
            if (t11 != null) {
                h(t11);
            }
            if (!a()) {
                m();
            }
            synchronized (this) {
                this.f11067g.clear();
            }
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // com.facebook.datasource.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(com.facebook.datasource.e<T> r3, java.util.concurrent.Executor r4) {
        /*
            r2 = this;
            md.k.g(r3)
            md.k.g(r4)
            monitor-enter(r2)
            boolean r0 = r2.f11063c     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto Ld
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L41
            return
        Ld:
            com.facebook.datasource.a$d r0 = r2.f11062b     // Catch: java.lang.Throwable -> L41
            com.facebook.datasource.a$d r1 = com.facebook.datasource.a.d.IN_PROGRESS     // Catch: java.lang.Throwable -> L41
            if (r0 != r1) goto L1c
            java.util.concurrent.ConcurrentLinkedQueue<android.util.Pair<com.facebook.datasource.e<T>, java.util.concurrent.Executor>> r0 = r2.f11067g     // Catch: java.lang.Throwable -> L41
            android.util.Pair r1 = android.util.Pair.create(r3, r4)     // Catch: java.lang.Throwable -> L41
            r0.add(r1)     // Catch: java.lang.Throwable -> L41
        L1c:
            boolean r0 = r2.b()     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L31
            boolean r0 = r2.a()     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L31
            boolean r0 = r2.w()     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L2f
            goto L31
        L2f:
            r0 = 0
            goto L32
        L31:
            r0 = 1
        L32:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L40
            boolean r0 = r2.j()
            boolean r1 = r2.w()
            r2.l(r3, r4, r0, r1)
        L40:
            return
        L41:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L41
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.a.d(com.facebook.datasource.e, java.util.concurrent.Executor):void");
    }

    @Override // com.facebook.datasource.c
    public synchronized float e() {
        return this.f11066f;
    }

    @Override // com.facebook.datasource.c
    public boolean f() {
        return false;
    }

    @Override // com.facebook.datasource.c
    public synchronized T g() {
        return this.f11064d;
    }

    @Override // com.facebook.datasource.c
    public Map<String, Object> getExtras() {
        return this.f11061a;
    }

    protected void h(T t11) {
    }

    public synchronized boolean j() {
        return this.f11062b == d.FAILURE;
    }

    public synchronized boolean k() {
        return this.f11063c;
    }

    protected void l(e<T> eVar, Executor executor, boolean z11, boolean z12) {
        Runnable runnableC0208a = new RunnableC0208a(z11, eVar, z12);
        c i11 = i();
        if (i11 != null) {
            runnableC0208a = i11.a(runnableC0208a, "AbstractDataSource_notifyDataSubscriber");
        }
        executor.execute(runnableC0208a);
    }

    protected void n() {
        Iterator<Pair<e<T>, Executor>> it2 = this.f11067g.iterator();
        while (it2.hasNext()) {
            Pair<e<T>, Executor> next = it2.next();
            ((Executor) next.second).execute(new b((e) next.first));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void o(Map<String, Object> map) {
        this.f11061a = map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean p(Throwable th2) {
        return q(th2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean q(Throwable th2, Map<String, Object> map) {
        boolean r11 = r(th2, map);
        if (r11) {
            m();
        }
        return r11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean s(float f11) {
        boolean t11 = t(f11);
        if (t11) {
            n();
        }
        return t11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean u(T t11, boolean z11, Map<String, Object> map) {
        o(map);
        boolean v11 = v(t11, z11);
        if (v11) {
            m();
        }
        return v11;
    }
}