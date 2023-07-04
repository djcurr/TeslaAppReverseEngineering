package freemarker.ext.beans;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class q implements Cloneable {

    /* renamed from: f  reason: collision with root package name */
    private static final Map f26980f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private static final ReferenceQueue f26981g = new ReferenceQueue();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f26982a;

    /* renamed from: b  reason: collision with root package name */
    private int f26983b = 1;

    /* renamed from: c  reason: collision with root package name */
    private boolean f26984c;

    /* renamed from: d  reason: collision with root package name */
    private t f26985d;

    /* renamed from: e  reason: collision with root package name */
    private u f26986e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(ix.p pVar) {
        this.f26982a = i.j(pVar);
    }

    private static void g() {
        while (true) {
            Reference poll = f26981g.poll();
            if (poll == null) {
                return;
            }
            Map map = f26980f;
            synchronized (map) {
                Iterator it2 = map.values().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (it2.next() == poll) {
                        it2.remove();
                        break;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p a() {
        p pVar;
        if (this.f26985d != null || this.f26986e != null) {
            return new p(this, new Object(), true, false);
        }
        Map map = f26980f;
        synchronized (map) {
            Reference reference = (Reference) map.get(this);
            pVar = reference != null ? (p) reference.get() : null;
            if (pVar == null) {
                q qVar = (q) clone();
                p pVar2 = new p(qVar, new Object(), true, true);
                map.put(qVar, new WeakReference(pVar2, f26981g));
                pVar = pVar2;
            }
        }
        g();
        return pVar;
    }

    public boolean b() {
        return this.f26984c;
    }

    public int c() {
        return this.f26983b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e11) {
            throw new RuntimeException("Failed to clone ClassIntrospectorBuilder", e11);
        }
    }

    public t d() {
        return this.f26985d;
    }

    public u e() {
        return this.f26986e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            return this.f26982a == qVar.f26982a && this.f26984c == qVar.f26984c && this.f26983b == qVar.f26983b && this.f26985d == qVar.f26985d && this.f26986e == qVar.f26986e;
        }
        return false;
    }

    public boolean f() {
        return this.f26982a;
    }

    public void h(t tVar) {
        this.f26985d = tVar;
    }

    public int hashCode() {
        return (((((((((this.f26982a ? 1231 : 1237) + 31) * 31) + (this.f26984c ? 1231 : 1237)) * 31) + this.f26983b) * 31) + System.identityHashCode(this.f26985d)) * 31) + System.identityHashCode(this.f26986e);
    }
}