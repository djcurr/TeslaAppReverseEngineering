package androidx.camera.core.impl;

import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.concurrent.futures.b;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a */
    private final Object f2379a = new Object();

    /* renamed from: b */
    private final Map<String, s> f2380b = new LinkedHashMap();

    /* renamed from: c */
    private final Set<s> f2381c = new HashSet();

    /* renamed from: d */
    private com.google.common.util.concurrent.c<Void> f2382d;

    /* renamed from: e */
    private b.a<Void> f2383e;

    public static /* synthetic */ Object a(v vVar, b.a aVar) {
        return vVar.f(aVar);
    }

    public static /* synthetic */ void b(v vVar, s sVar) {
        vVar.g(sVar);
    }

    public /* synthetic */ Object f(b.a aVar) {
        synchronized (this.f2379a) {
            this.f2383e = aVar;
        }
        return "CameraRepository-deinit";
    }

    public /* synthetic */ void g(s sVar) {
        synchronized (this.f2379a) {
            this.f2381c.remove(sVar);
            if (this.f2381c.isEmpty()) {
                v3.h.f(this.f2383e);
                this.f2383e.c(null);
                this.f2383e = null;
                this.f2382d = null;
            }
        }
    }

    public com.google.common.util.concurrent.c<Void> c() {
        synchronized (this.f2379a) {
            if (this.f2380b.isEmpty()) {
                com.google.common.util.concurrent.c<Void> cVar = this.f2382d;
                if (cVar == null) {
                    cVar = c0.f.h(null);
                }
                return cVar;
            }
            com.google.common.util.concurrent.c<Void> cVar2 = this.f2382d;
            if (cVar2 == null) {
                cVar2 = androidx.concurrent.futures.b.a(new b.c() { // from class: androidx.camera.core.impl.t
                    {
                        v.this = this;
                    }

                    @Override // androidx.concurrent.futures.b.c
                    public final Object a(b.a aVar) {
                        return v.a(v.this, aVar);
                    }
                });
                this.f2382d = cVar2;
            }
            this.f2381c.addAll(this.f2380b.values());
            for (final s sVar : this.f2380b.values()) {
                sVar.release().a(new Runnable() { // from class: androidx.camera.core.impl.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        v.b(v.this, sVar);
                    }
                }, b0.a.a());
            }
            this.f2380b.clear();
            return cVar2;
        }
    }

    public LinkedHashSet<s> d() {
        LinkedHashSet<s> linkedHashSet;
        synchronized (this.f2379a) {
            linkedHashSet = new LinkedHashSet<>(this.f2380b.values());
        }
        return linkedHashSet;
    }

    public void e(q qVar) {
        synchronized (this.f2379a) {
            try {
                try {
                    for (String str : qVar.b()) {
                        androidx.camera.core.n0.a("CameraRepository", "Added camera: " + str);
                        this.f2380b.put(str, qVar.a(str));
                    }
                } catch (CameraUnavailableException e11) {
                    throw new InitializationException(e11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}