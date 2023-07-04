package io.sentry;

import io.sentry.g3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.ApiStatus;

/* loaded from: classes5.dex */
public final class u1 {

    /* renamed from: a  reason: collision with root package name */
    private f3 f32629a;

    /* renamed from: b  reason: collision with root package name */
    private j0 f32630b;

    /* renamed from: c  reason: collision with root package name */
    private String f32631c;

    /* renamed from: d  reason: collision with root package name */
    private io.sentry.protocol.w f32632d;

    /* renamed from: e  reason: collision with root package name */
    private io.sentry.protocol.k f32633e;

    /* renamed from: f  reason: collision with root package name */
    private List<String> f32634f;

    /* renamed from: g  reason: collision with root package name */
    private Queue<io.sentry.c> f32635g;

    /* renamed from: h  reason: collision with root package name */
    private Map<String, String> f32636h;

    /* renamed from: i  reason: collision with root package name */
    private Map<String, Object> f32637i;

    /* renamed from: j  reason: collision with root package name */
    private List<r> f32638j;

    /* renamed from: k  reason: collision with root package name */
    private final g3 f32639k;

    /* renamed from: l  reason: collision with root package name */
    private volatile q3 f32640l;

    /* renamed from: m  reason: collision with root package name */
    private final Object f32641m;

    /* renamed from: n  reason: collision with root package name */
    private final Object f32642n;

    /* renamed from: o  reason: collision with root package name */
    private io.sentry.protocol.c f32643o;

    /* renamed from: p  reason: collision with root package name */
    private List<io.sentry.b> f32644p;

    /* loaded from: classes5.dex */
    interface a {
        void a(q3 q3Var);
    }

    @ApiStatus.Internal
    /* loaded from: classes5.dex */
    public interface b {
        void a(j0 j0Var);
    }

    /* loaded from: classes5.dex */
    static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final q3 f32645a;

        /* renamed from: b  reason: collision with root package name */
        private final q3 f32646b;

        public c(q3 q3Var, q3 q3Var2) {
            this.f32646b = q3Var;
            this.f32645a = q3Var2;
        }

        public q3 a() {
            return this.f32646b;
        }

        public q3 b() {
            return this.f32645a;
        }
    }

    public u1(g3 g3Var) {
        this.f32634f = new ArrayList();
        this.f32636h = new ConcurrentHashMap();
        this.f32637i = new ConcurrentHashMap();
        this.f32638j = new CopyOnWriteArrayList();
        this.f32641m = new Object();
        this.f32642n = new Object();
        this.f32643o = new io.sentry.protocol.c();
        this.f32644p = new CopyOnWriteArrayList();
        g3 g3Var2 = (g3) rz.j.a(g3Var, "SentryOptions is required.");
        this.f32639k = g3Var2;
        this.f32635g = e(g3Var2.getMaxBreadcrumbs());
    }

    private Queue<io.sentry.c> e(int i11) {
        return a4.d(new d(i11));
    }

    private io.sentry.c g(g3.a aVar, io.sentry.c cVar, t tVar) {
        try {
            return aVar.a(cVar, tVar);
        } catch (Throwable th2) {
            this.f32639k.getLogger().b(f3.ERROR, "The BeforeBreadcrumbCallback callback threw an exception. Exception details will be added to the breadcrumb.", th2);
            if (th2.getMessage() != null) {
                cVar.m("sentry:message", th2.getMessage());
                return cVar;
            }
            return cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q3 A(a aVar) {
        q3 clone;
        synchronized (this.f32641m) {
            aVar.a(this.f32640l);
            clone = this.f32640l != null ? this.f32640l.clone() : null;
        }
        return clone;
    }

    @ApiStatus.Internal
    public void B(b bVar) {
        synchronized (this.f32642n) {
            bVar.a(this.f32630b);
        }
    }

    public void a(io.sentry.c cVar) {
        b(cVar, null);
    }

    public void b(io.sentry.c cVar, t tVar) {
        if (cVar == null) {
            return;
        }
        if (tVar == null) {
            tVar = new t();
        }
        g3.a beforeBreadcrumb = this.f32639k.getBeforeBreadcrumb();
        if (beforeBreadcrumb != null) {
            cVar = g(beforeBreadcrumb, cVar, tVar);
        }
        if (cVar != null) {
            this.f32635g.add(cVar);
            if (this.f32639k.isEnableScopeSync()) {
                for (e0 e0Var : this.f32639k.getScopeObservers()) {
                    e0Var.e(cVar);
                }
                return;
            }
            return;
        }
        this.f32639k.getLogger().c(f3.INFO, "Breadcrumb was dropped by beforeBreadcrumb", new Object[0]);
    }

    public void c() {
        this.f32635g.clear();
    }

    public void d() {
        synchronized (this.f32642n) {
            this.f32630b = null;
        }
        this.f32631c = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q3 f() {
        q3 q3Var;
        synchronized (this.f32641m) {
            q3Var = null;
            if (this.f32640l != null) {
                this.f32640l.c();
                q3 clone = this.f32640l.clone();
                this.f32640l = null;
                q3Var = clone;
            }
        }
        return q3Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<io.sentry.b> h() {
        return new CopyOnWriteArrayList(this.f32644p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Queue<io.sentry.c> i() {
        return this.f32635g;
    }

    public io.sentry.protocol.c j() {
        return this.f32643o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<r> k() {
        return this.f32638j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, Object> l() {
        return this.f32637i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<String> m() {
        return this.f32634f;
    }

    public f3 n() {
        return this.f32629a;
    }

    public io.sentry.protocol.k o() {
        return this.f32633e;
    }

    public i0 p() {
        t3 f11;
        j0 j0Var = this.f32630b;
        return (j0Var == null || (f11 = j0Var.f()) == null) ? j0Var : f11;
    }

    @ApiStatus.Internal
    public Map<String, String> q() {
        return rz.a.b(this.f32636h);
    }

    public j0 r() {
        return this.f32630b;
    }

    public String s() {
        j0 j0Var = this.f32630b;
        return j0Var != null ? j0Var.getName() : this.f32631c;
    }

    public io.sentry.protocol.w t() {
        return this.f32632d;
    }

    public void u(String str, Object obj) {
        this.f32643o.put(str, obj);
    }

    public void v(String str, String str2) {
        this.f32637i.put(str, str2);
        if (this.f32639k.isEnableScopeSync()) {
            for (e0 e0Var : this.f32639k.getScopeObservers()) {
                e0Var.b(str, str2);
            }
        }
    }

    public void w(String str, String str2) {
        this.f32636h.put(str, str2);
        if (this.f32639k.isEnableScopeSync()) {
            for (e0 e0Var : this.f32639k.getScopeObservers()) {
                e0Var.a(str, str2);
            }
        }
    }

    public void x(j0 j0Var) {
        synchronized (this.f32642n) {
            this.f32630b = j0Var;
        }
    }

    public void y(io.sentry.protocol.w wVar) {
        this.f32632d = wVar;
        if (this.f32639k.isEnableScopeSync()) {
            for (e0 e0Var : this.f32639k.getScopeObservers()) {
                e0Var.c(wVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c z() {
        c cVar;
        synchronized (this.f32641m) {
            if (this.f32640l != null) {
                this.f32640l.c();
            }
            q3 q3Var = this.f32640l;
            cVar = null;
            if (this.f32639k.getRelease() != null) {
                this.f32640l = new q3(this.f32639k.getDistinctId(), this.f32632d, this.f32639k.getEnvironment(), this.f32639k.getRelease());
                cVar = new c(this.f32640l.clone(), q3Var != null ? q3Var.clone() : null);
            } else {
                this.f32639k.getLogger().c(f3.WARNING, "Release is not set on SentryOptions. Session could not be started", new Object[0]);
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u1(u1 u1Var) {
        this.f32634f = new ArrayList();
        this.f32636h = new ConcurrentHashMap();
        this.f32637i = new ConcurrentHashMap();
        this.f32638j = new CopyOnWriteArrayList();
        this.f32641m = new Object();
        this.f32642n = new Object();
        this.f32643o = new io.sentry.protocol.c();
        this.f32644p = new CopyOnWriteArrayList();
        this.f32630b = u1Var.f32630b;
        this.f32631c = u1Var.f32631c;
        this.f32640l = u1Var.f32640l;
        this.f32639k = u1Var.f32639k;
        this.f32629a = u1Var.f32629a;
        io.sentry.protocol.w wVar = u1Var.f32632d;
        this.f32632d = wVar != null ? new io.sentry.protocol.w(wVar) : null;
        io.sentry.protocol.k kVar = u1Var.f32633e;
        this.f32633e = kVar != null ? new io.sentry.protocol.k(kVar) : null;
        this.f32634f = new ArrayList(u1Var.f32634f);
        this.f32638j = new CopyOnWriteArrayList(u1Var.f32638j);
        Queue<io.sentry.c> queue = u1Var.f32635g;
        Queue<io.sentry.c> e11 = e(u1Var.f32639k.getMaxBreadcrumbs());
        for (io.sentry.c cVar : queue) {
            e11.add(new io.sentry.c(cVar));
        }
        this.f32635g = e11;
        Map<String, String> map = u1Var.f32636h;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry != null) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.f32636h = concurrentHashMap;
        Map<String, Object> map2 = u1Var.f32637i;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
            if (entry2 != null) {
                concurrentHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        this.f32637i = concurrentHashMap2;
        this.f32643o = new io.sentry.protocol.c(u1Var.f32643o);
        this.f32644p = new CopyOnWriteArrayList(u1Var.f32644p);
    }
}