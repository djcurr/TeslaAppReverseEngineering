package ul;

import android.util.Log;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import ul.n;

/* loaded from: classes3.dex */
public class n extends ul.a implements km.a {

    /* renamed from: g */
    private static final sm.b<Set<Object>> f53574g = new sm.b() { // from class: ul.m
        @Override // sm.b
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* renamed from: a */
    private final Map<d<?>, sm.b<?>> f53575a;

    /* renamed from: b */
    private final Map<Class<?>, sm.b<?>> f53576b;

    /* renamed from: c */
    private final Map<Class<?>, u<?>> f53577c;

    /* renamed from: d */
    private final List<sm.b<i>> f53578d;

    /* renamed from: e */
    private final s f53579e;

    /* renamed from: f */
    private final AtomicReference<Boolean> f53580f;

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private final Executor f53581a;

        /* renamed from: b */
        private final List<sm.b<i>> f53582b = new ArrayList();

        /* renamed from: c */
        private final List<d<?>> f53583c = new ArrayList();

        b(Executor executor) {
            this.f53581a = executor;
        }

        public static /* synthetic */ i a(i iVar) {
            return f(iVar);
        }

        public static /* synthetic */ i f(i iVar) {
            return iVar;
        }

        public b b(d<?> dVar) {
            this.f53583c.add(dVar);
            return this;
        }

        public b c(final i iVar) {
            this.f53582b.add(new sm.b() { // from class: ul.o
                @Override // sm.b
                public final Object get() {
                    return n.b.a(iVar);
                }
            });
            return this;
        }

        public b d(Collection<sm.b<i>> collection) {
            this.f53582b.addAll(collection);
            return this;
        }

        public n e() {
            return new n(this.f53581a, this.f53582b, this.f53583c);
        }
    }

    public static /* synthetic */ Object f(n nVar, d dVar) {
        return nVar.n(dVar);
    }

    public static /* synthetic */ void g(u uVar, sm.b bVar) {
        uVar.a(bVar);
    }

    public static /* synthetic */ void h(y yVar, sm.b bVar) {
        yVar.j(bVar);
    }

    public static b i(Executor executor) {
        return new b(executor);
    }

    private void j(List<d<?>> list) {
        ArrayList<Runnable> arrayList = new ArrayList();
        synchronized (this) {
            Iterator<sm.b<i>> it2 = this.f53578d.iterator();
            while (it2.hasNext()) {
                try {
                    i iVar = it2.next().get();
                    if (iVar != null) {
                        list.addAll(iVar.getComponents());
                        it2.remove();
                    }
                } catch (InvalidRegistrarException e11) {
                    it2.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e11);
                }
            }
            if (this.f53575a.isEmpty()) {
                p.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f53575a.keySet());
                arrayList2.addAll(list);
                p.a(arrayList2);
            }
            for (final d<?> dVar : list) {
                this.f53575a.put(dVar, new t(new sm.b() { // from class: ul.l
                    @Override // sm.b
                    public final Object get() {
                        return n.f(n.this, dVar);
                    }
                }));
            }
            arrayList.addAll(s(list));
            arrayList.addAll(t());
            r();
        }
        for (Runnable runnable : arrayList) {
            runnable.run();
        }
        q();
    }

    private void k(Map<d<?>, sm.b<?>> map, boolean z11) {
        for (Map.Entry<d<?>, sm.b<?>> entry : map.entrySet()) {
            d<?> key = entry.getKey();
            sm.b<?> value = entry.getValue();
            if (key.k() || (key.l() && z11)) {
                value.get();
            }
        }
        this.f53579e.e();
    }

    private static <T> List<T> m(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T t11 : iterable) {
            arrayList.add(t11);
        }
        return arrayList;
    }

    public /* synthetic */ Object n(d dVar) {
        return dVar.f().a(new a0(dVar, this));
    }

    private void q() {
        Boolean bool = this.f53580f.get();
        if (bool != null) {
            k(this.f53575a, bool.booleanValue());
        }
    }

    private void r() {
        for (d<?> dVar : this.f53575a.keySet()) {
            for (q qVar : dVar.e()) {
                if (qVar.g() && !this.f53577c.containsKey(qVar.c())) {
                    this.f53577c.put(qVar.c(), u.b(Collections.emptySet()));
                } else if (this.f53576b.containsKey(qVar.c())) {
                    continue;
                } else if (!qVar.f()) {
                    if (!qVar.g()) {
                        this.f53576b.put(qVar.c(), y.e());
                    }
                } else {
                    throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", dVar, qVar.c()));
                }
            }
        }
    }

    private List<Runnable> s(List<d<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (d<?> dVar : list) {
            if (dVar.m()) {
                final sm.b<?> bVar = this.f53575a.get(dVar);
                for (Class<? super Object> cls : dVar.g()) {
                    if (!this.f53576b.containsKey(cls)) {
                        this.f53576b.put(cls, bVar);
                    } else {
                        final y yVar = (y) this.f53576b.get(cls);
                        arrayList.add(new Runnable() { // from class: ul.k
                            @Override // java.lang.Runnable
                            public final void run() {
                                n.h(yVar, bVar);
                            }
                        });
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Runnable> t() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry<d<?>, sm.b<?>> entry : this.f53575a.entrySet()) {
            d<?> key = entry.getKey();
            if (!key.m()) {
                sm.b<?> value = entry.getValue();
                for (Class<? super Object> cls : key.g()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!this.f53577c.containsKey(entry2.getKey())) {
                this.f53577c.put((Class) entry2.getKey(), u.b((Collection) entry2.getValue()));
            } else {
                final u<?> uVar = this.f53577c.get(entry2.getKey());
                for (final sm.b bVar : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: ul.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            n.g(uVar, bVar);
                        }
                    });
                }
            }
        }
        return arrayList;
    }

    @Override // ul.e
    public synchronized <T> sm.b<Set<T>> b(Class<T> cls) {
        u<?> uVar = this.f53577c.get(cls);
        if (uVar != null) {
            return uVar;
        }
        return (sm.b<Set<T>>) f53574g;
    }

    @Override // ul.e
    public synchronized <T> sm.b<T> d(Class<T> cls) {
        z.c(cls, "Null interface requested.");
        return (sm.b<T>) this.f53576b.get(cls);
    }

    @Override // ul.e
    public <T> sm.a<T> e(Class<T> cls) {
        sm.b<T> d11 = d(cls);
        if (d11 == null) {
            return y.e();
        }
        if (d11 instanceof y) {
            return (y) d11;
        }
        return y.i(d11);
    }

    public void l(boolean z11) {
        HashMap hashMap;
        if (this.f53580f.compareAndSet(null, Boolean.valueOf(z11))) {
            synchronized (this) {
                hashMap = new HashMap(this.f53575a);
            }
            k(hashMap, z11);
        }
    }

    private n(Executor executor, Iterable<sm.b<i>> iterable, Collection<d<?>> collection) {
        this.f53575a = new HashMap();
        this.f53576b = new HashMap();
        this.f53577c = new HashMap();
        this.f53580f = new AtomicReference<>();
        s sVar = new s(executor);
        this.f53579e = sVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(d.p(sVar, s.class, pm.d.class, pm.c.class));
        arrayList.add(d.p(this, km.a.class, new Class[0]));
        for (d<?> dVar : collection) {
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        this.f53578d = m(iterable);
        j(arrayList);
    }
}