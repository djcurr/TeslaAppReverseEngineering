package com.android.volley;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f10291a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<i<?>> f10292b;

    /* renamed from: c  reason: collision with root package name */
    private final PriorityBlockingQueue<i<?>> f10293c;

    /* renamed from: d  reason: collision with root package name */
    private final PriorityBlockingQueue<i<?>> f10294d;

    /* renamed from: e  reason: collision with root package name */
    private final com.android.volley.a f10295e;

    /* renamed from: f  reason: collision with root package name */
    private final f f10296f;

    /* renamed from: g  reason: collision with root package name */
    private final l f10297g;

    /* renamed from: h  reason: collision with root package name */
    private final g[] f10298h;

    /* renamed from: i  reason: collision with root package name */
    private com.android.volley.b f10299i;

    /* renamed from: j  reason: collision with root package name */
    private final List<b> f10300j;

    /* renamed from: k  reason: collision with root package name */
    private final List<a> f10301k;

    /* loaded from: classes.dex */
    public interface a {
        void a(i<?> iVar, int i11);
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface b<T> {
        void a(i<T> iVar);
    }

    public j(com.android.volley.a aVar, f fVar, int i11, l lVar) {
        this.f10291a = new AtomicInteger();
        this.f10292b = new HashSet();
        this.f10293c = new PriorityBlockingQueue<>();
        this.f10294d = new PriorityBlockingQueue<>();
        this.f10300j = new ArrayList();
        this.f10301k = new ArrayList();
        this.f10295e = aVar;
        this.f10296f = fVar;
        this.f10298h = new g[i11];
        this.f10297g = lVar;
    }

    public <T> i<T> a(i<T> iVar) {
        iVar.setRequestQueue(this);
        synchronized (this.f10292b) {
            this.f10292b.add(iVar);
        }
        iVar.setSequence(d());
        iVar.addMarker("add-to-queue");
        e(iVar, 0);
        b(iVar);
        return iVar;
    }

    <T> void b(i<T> iVar) {
        if (!iVar.shouldCache()) {
            f(iVar);
        } else {
            this.f10293c.add(iVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> void c(i<T> iVar) {
        synchronized (this.f10292b) {
            this.f10292b.remove(iVar);
        }
        synchronized (this.f10300j) {
            for (b bVar : this.f10300j) {
                bVar.a(iVar);
            }
        }
        e(iVar, 5);
    }

    public int d() {
        return this.f10291a.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(i<?> iVar, int i11) {
        synchronized (this.f10301k) {
            for (a aVar : this.f10301k) {
                aVar.a(iVar, i11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> void f(i<T> iVar) {
        this.f10294d.add(iVar);
    }

    public void g() {
        h();
        com.android.volley.b bVar = new com.android.volley.b(this.f10293c, this.f10294d, this.f10295e, this.f10297g);
        this.f10299i = bVar;
        bVar.start();
        for (int i11 = 0; i11 < this.f10298h.length; i11++) {
            g gVar = new g(this.f10294d, this.f10296f, this.f10295e, this.f10297g);
            this.f10298h[i11] = gVar;
            gVar.start();
        }
    }

    public void h() {
        g[] gVarArr;
        com.android.volley.b bVar = this.f10299i;
        if (bVar != null) {
            bVar.d();
        }
        for (g gVar : this.f10298h) {
            if (gVar != null) {
                gVar.e();
            }
        }
    }

    public j(com.android.volley.a aVar, f fVar, int i11) {
        this(aVar, fVar, i11, new d(new Handler(Looper.getMainLooper())));
    }

    public j(com.android.volley.a aVar, f fVar) {
        this(aVar, fVar, 4);
    }
}