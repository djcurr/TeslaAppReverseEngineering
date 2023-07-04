package rx;

import com.google.common.base.o;
import com.google.common.base.u;
import expo.modules.interfaces.permissions.PermissionsResponse;
import io.grpc.a;
import io.grpc.f1;
import io.grpc.m0;
import io.grpc.p;
import io.grpc.q;
import io.grpc.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes5.dex */
final class a extends m0 {

    /* renamed from: g  reason: collision with root package name */
    static final a.c<d<q>> f49720g = a.c.a("state-info");

    /* renamed from: h  reason: collision with root package name */
    private static final f1 f49721h = f1.f30562f.r("no subchannels ready");

    /* renamed from: b  reason: collision with root package name */
    private final m0.d f49722b;

    /* renamed from: e  reason: collision with root package name */
    private p f49725e;

    /* renamed from: c  reason: collision with root package name */
    private final Map<x, m0.h> f49723c = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private e f49726f = new b(f49721h);

    /* renamed from: d  reason: collision with root package name */
    private final Random f49724d = new Random();

    /* renamed from: rx.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class C1088a implements m0.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m0.h f49727a;

        C1088a(m0.h hVar) {
            this.f49727a = hVar;
        }

        @Override // io.grpc.m0.j
        public void a(q qVar) {
            a.this.j(this.f49727a, qVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends e {

        /* renamed from: a  reason: collision with root package name */
        private final f1 f49729a;

        b(f1 f1Var) {
            super(null);
            this.f49729a = (f1) u.p(f1Var, PermissionsResponse.STATUS_KEY);
        }

        @Override // io.grpc.m0.i
        public m0.e a(m0.f fVar) {
            return this.f49729a.p() ? m0.e.g() : m0.e.f(this.f49729a);
        }

        @Override // rx.a.e
        boolean b(e eVar) {
            if (eVar instanceof b) {
                b bVar = (b) eVar;
                if (com.google.common.base.q.a(this.f49729a, bVar.f49729a) || (this.f49729a.p() && bVar.f49729a.p())) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return o.b(b.class).d(PermissionsResponse.STATUS_KEY, this.f49729a).toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends e {

        /* renamed from: c  reason: collision with root package name */
        private static final AtomicIntegerFieldUpdater<c> f49730c = AtomicIntegerFieldUpdater.newUpdater(c.class, "b");

        /* renamed from: a  reason: collision with root package name */
        private final List<m0.h> f49731a;

        /* renamed from: b  reason: collision with root package name */
        private volatile int f49732b;

        c(List<m0.h> list, int i11) {
            super(null);
            u.e(!list.isEmpty(), "empty list");
            this.f49731a = list;
            this.f49732b = i11 - 1;
        }

        private m0.h c() {
            int size = this.f49731a.size();
            AtomicIntegerFieldUpdater<c> atomicIntegerFieldUpdater = f49730c;
            int incrementAndGet = atomicIntegerFieldUpdater.incrementAndGet(this);
            if (incrementAndGet >= size) {
                int i11 = incrementAndGet % size;
                atomicIntegerFieldUpdater.compareAndSet(this, incrementAndGet, i11);
                incrementAndGet = i11;
            }
            return this.f49731a.get(incrementAndGet);
        }

        @Override // io.grpc.m0.i
        public m0.e a(m0.f fVar) {
            return m0.e.h(c());
        }

        @Override // rx.a.e
        boolean b(e eVar) {
            if (eVar instanceof c) {
                c cVar = (c) eVar;
                return cVar == this || (this.f49731a.size() == cVar.f49731a.size() && new HashSet(this.f49731a).containsAll(cVar.f49731a));
            }
            return false;
        }

        public String toString() {
            return o.b(c.class).d("list", this.f49731a).toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d<T> {

        /* renamed from: a  reason: collision with root package name */
        T f49733a;

        d(T t11) {
            this.f49733a = t11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static abstract class e extends m0.i {
        private e() {
        }

        abstract boolean b(e eVar);

        /* synthetic */ e(C1088a c1088a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(m0.d dVar) {
        this.f49722b = (m0.d) u.p(dVar, "helper");
    }

    private static List<m0.h> f(Collection<m0.h> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (m0.h hVar : collection) {
            if (i(hVar)) {
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    private static d<q> g(m0.h hVar) {
        return (d) u.p((d) hVar.c().b(f49720g), "STATE_INFO");
    }

    static boolean i(m0.h hVar) {
        return g(hVar).f49733a.c() == p.READY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void j(m0.h hVar, q qVar) {
        if (this.f49723c.get(m(hVar.a())) != hVar) {
            return;
        }
        p c11 = qVar.c();
        p pVar = p.TRANSIENT_FAILURE;
        if (c11 == pVar || qVar.c() == p.IDLE) {
            this.f49722b.d();
        }
        p c12 = qVar.c();
        p pVar2 = p.IDLE;
        if (c12 == pVar2) {
            hVar.e();
        }
        d<q> g11 = g(hVar);
        if (g11.f49733a.c().equals(pVar) && (qVar.c().equals(p.CONNECTING) || qVar.c().equals(pVar2))) {
            return;
        }
        g11.f49733a = qVar;
        o();
    }

    private static <T> Set<T> k(Set<T> set, Set<T> set2) {
        HashSet hashSet = new HashSet(set);
        hashSet.removeAll(set2);
        return hashSet;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, io.grpc.q] */
    private void l(m0.h hVar) {
        hVar.f();
        g(hVar).f49733a = q.a(p.SHUTDOWN);
    }

    private static x m(x xVar) {
        return new x(xVar.a());
    }

    private static Map<x, x> n(List<x> list) {
        HashMap hashMap = new HashMap(list.size() * 2);
        for (x xVar : list) {
            hashMap.put(m(xVar), xVar);
        }
        return hashMap;
    }

    private void o() {
        List<m0.h> f11 = f(h());
        if (f11.isEmpty()) {
            boolean z11 = false;
            f1 f1Var = f49721h;
            for (m0.h hVar : h()) {
                q qVar = g(hVar).f49733a;
                z11 = (qVar.c() == p.CONNECTING || qVar.c() == p.IDLE) ? true : true;
                if (f1Var == f49721h || !f1Var.p()) {
                    f1Var = qVar.d();
                }
            }
            p(z11 ? p.CONNECTING : p.TRANSIENT_FAILURE, new b(f1Var));
            return;
        }
        p(p.READY, new c(f11, this.f49724d.nextInt(f11.size())));
    }

    private void p(p pVar, e eVar) {
        if (pVar == this.f49725e && eVar.b(this.f49726f)) {
            return;
        }
        this.f49722b.e(pVar, eVar);
        this.f49725e = pVar;
        this.f49726f = eVar;
    }

    @Override // io.grpc.m0
    public void b(f1 f1Var) {
        if (this.f49725e != p.READY) {
            p(p.TRANSIENT_FAILURE, new b(f1Var));
        }
    }

    @Override // io.grpc.m0
    public void c(m0.g gVar) {
        List<x> a11 = gVar.a();
        Set<x> keySet = this.f49723c.keySet();
        Map<x, x> n11 = n(a11);
        Set<x> k11 = k(keySet, n11.keySet());
        for (Map.Entry<x, x> entry : n11.entrySet()) {
            x key = entry.getKey();
            x value = entry.getValue();
            m0.h hVar = this.f49723c.get(key);
            if (hVar != null) {
                hVar.h(Collections.singletonList(value));
            } else {
                m0.h hVar2 = (m0.h) u.p(this.f49722b.a(m0.b.c().d(value).f(io.grpc.a.c().d(f49720g, new d(q.a(p.IDLE))).a()).b()), "subchannel");
                hVar2.g(new C1088a(hVar2));
                this.f49723c.put(key, hVar2);
                hVar2.e();
            }
        }
        ArrayList arrayList = new ArrayList();
        for (x xVar : k11) {
            arrayList.add(this.f49723c.remove(xVar));
        }
        o();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            l((m0.h) it2.next());
        }
    }

    @Override // io.grpc.m0
    public void d() {
        for (m0.h hVar : h()) {
            l(hVar);
        }
        this.f49723c.clear();
    }

    Collection<m0.h> h() {
        return this.f49723c.values();
    }
}