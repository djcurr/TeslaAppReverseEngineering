package hf;

import com.facebook.common.memory.PooledByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class x {

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f29201b = x.class;

    /* renamed from: a  reason: collision with root package name */
    private Map<gd.d, nf.e> f29202a = new HashMap();

    private x() {
    }

    public static x d() {
        return new x();
    }

    private synchronized void e() {
        nd.a.w(f29201b, "Count = %d", Integer.valueOf(this.f29202a.size()));
    }

    public void a() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f29202a.values());
            this.f29202a.clear();
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            nf.e eVar = (nf.e) arrayList.get(i11);
            if (eVar != null) {
                eVar.close();
            }
        }
    }

    public synchronized boolean b(gd.d dVar) {
        md.k.g(dVar);
        if (this.f29202a.containsKey(dVar)) {
            nf.e eVar = this.f29202a.get(dVar);
            synchronized (eVar) {
                if (nf.e.G0(eVar)) {
                    return true;
                }
                this.f29202a.remove(dVar);
                nd.a.E(f29201b, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(eVar)), dVar.a(), Integer.valueOf(System.identityHashCode(dVar)));
                return false;
            }
        }
        return false;
    }

    public synchronized nf.e c(gd.d dVar) {
        md.k.g(dVar);
        nf.e eVar = this.f29202a.get(dVar);
        if (eVar != null) {
            synchronized (eVar) {
                if (!nf.e.G0(eVar)) {
                    this.f29202a.remove(dVar);
                    nd.a.E(f29201b, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(eVar)), dVar.a(), Integer.valueOf(System.identityHashCode(dVar)));
                    return null;
                }
                eVar = nf.e.g(eVar);
            }
        }
        return eVar;
    }

    public synchronized void f(gd.d dVar, nf.e eVar) {
        md.k.g(dVar);
        md.k.b(Boolean.valueOf(nf.e.G0(eVar)));
        nf.e.j(this.f29202a.put(dVar, nf.e.g(eVar)));
        e();
    }

    public boolean g(gd.d dVar) {
        nf.e remove;
        md.k.g(dVar);
        synchronized (this) {
            remove = this.f29202a.remove(dVar);
        }
        if (remove == null) {
            return false;
        }
        try {
            return remove.F0();
        } finally {
            remove.close();
        }
    }

    public synchronized boolean h(gd.d dVar, nf.e eVar) {
        md.k.g(dVar);
        md.k.g(eVar);
        md.k.b(Boolean.valueOf(nf.e.G0(eVar)));
        nf.e eVar2 = this.f29202a.get(dVar);
        if (eVar2 == null) {
            return false;
        }
        qd.a<PooledByteBuffer> m11 = eVar2.m();
        qd.a<PooledByteBuffer> m12 = eVar.m();
        if (m11 != null && m12 != null && m11.J() == m12.J()) {
            this.f29202a.remove(dVar);
            qd.a.C(m12);
            qd.a.C(m11);
            nf.e.j(eVar2);
            e();
            return true;
        }
        qd.a.C(m12);
        qd.a.C(m11);
        nf.e.j(eVar2);
        return false;
    }
}