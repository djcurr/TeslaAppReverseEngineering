package net.time4j.engine;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes5.dex */
public class w<T> implements t<T> {

    /* renamed from: f */
    private static final List<b> f40974f = new CopyOnWriteArrayList();

    /* renamed from: g */
    private static final ReferenceQueue<w<?>> f40975g = new ReferenceQueue<>();

    /* renamed from: a */
    private final Class<T> f40976a;

    /* renamed from: b */
    private final t<T> f40977b;

    /* renamed from: c */
    private final Map<p<?>, y<T, ?>> f40978c;

    /* renamed from: d */
    private final List<r> f40979d;

    /* renamed from: e */
    private final Map<p<?>, b0<T>> f40980e;

    /* loaded from: classes5.dex */
    public static class a<T extends q<T>> {

        /* renamed from: a */
        final Class<T> f40981a;

        /* renamed from: b */
        final boolean f40982b;

        /* renamed from: c */
        final t<T> f40983c;

        /* renamed from: d */
        final Map<p<?>, y<T, ?>> f40984d;

        /* renamed from: e */
        final List<r> f40985e;

        public a(Class<T> cls, t<T> tVar) {
            Objects.requireNonNull(tVar, "Missing chronological merger.");
            this.f40981a = cls;
            this.f40982b = cls.getName().startsWith("net.time4j.");
            this.f40983c = tVar;
            this.f40984d = new HashMap();
            this.f40985e = new ArrayList();
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x001e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void c(net.time4j.engine.p<?> r5) {
            /*
                r4 = this;
                boolean r0 = r4.f40982b
                if (r0 == 0) goto L5
                return
            L5:
                java.lang.String r0 = "Static initialization problem: Check if given element statically refer to any chronology causing premature class loading."
                java.util.Objects.requireNonNull(r5, r0)
                java.lang.String r0 = r5.name()
                java.util.Map<net.time4j.engine.p<?>, net.time4j.engine.y<T extends net.time4j.engine.q<T>, ?>> r1 = r4.f40984d
                java.util.Set r1 = r1.keySet()
                java.util.Iterator r1 = r1.iterator()
            L18:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L4c
                java.lang.Object r2 = r1.next()
                net.time4j.engine.p r2 = (net.time4j.engine.p) r2
                boolean r3 = r2.equals(r5)
                if (r3 != 0) goto L35
                java.lang.String r2 = r2.name()
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L35
                goto L18
            L35:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Element duplicate found: "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r5.<init>(r0)
                throw r5
            L4c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.time4j.engine.w.a.c(net.time4j.engine.p):void");
        }

        public <V> a<T> a(p<V> pVar, y<T, V> yVar) {
            c(pVar);
            this.f40984d.put(pVar, yVar);
            return this;
        }

        public a<T> b(r rVar) {
            Objects.requireNonNull(rVar, "Missing chronological extension.");
            if (!this.f40985e.contains(rVar)) {
                this.f40985e.add(rVar);
            }
            return this;
        }
    }

    /* loaded from: classes5.dex */
    public static class b extends WeakReference<w<?>> {

        /* renamed from: a */
        private final String f40986a;

        b(w<?> wVar, ReferenceQueue<w<?>> referenceQueue) {
            super(wVar, referenceQueue);
            this.f40986a = ((w) wVar).f40976a.getName();
        }
    }

    public w(Class<T> cls, t<T> tVar, Map<p<?>, y<T, ?>> map, List<r> list) {
        Objects.requireNonNull(cls, "Missing chronological type.");
        Objects.requireNonNull(tVar, "Missing chronological merger.");
        this.f40976a = cls;
        this.f40977b = tVar;
        Map<p<?>, y<T, ?>> unmodifiableMap = Collections.unmodifiableMap(map);
        this.f40978c = unmodifiableMap;
        this.f40979d = Collections.unmodifiableList(list);
        HashMap hashMap = new HashMap();
        for (p<?> pVar : unmodifiableMap.keySet()) {
            if (pVar.getType() == Integer.class) {
                y<T, ?> yVar = this.f40978c.get(pVar);
                if (yVar instanceof b0) {
                    hashMap.put(pVar, (b0) yVar);
                }
            }
        }
        this.f40980e = Collections.unmodifiableMap(hashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> T l(Object obj) {
        return obj;
    }

    private y<T, ?> q(p<?> pVar, boolean z11) {
        if ((pVar instanceof e) && q.class.isAssignableFrom(p())) {
            e eVar = (e) e.class.cast(pVar);
            String j11 = z11 ? eVar.j(this) : null;
            if (j11 == null) {
                return (y) l(eVar.f((w) l(this)));
            }
            throw new RuleNotFoundException(j11);
        }
        return null;
    }

    public static <T> w<T> x(Class<T> cls) {
        try {
            Class.forName(cls.getName(), true, cls.getClassLoader());
            w<?> wVar = null;
            boolean z11 = false;
            Iterator<b> it2 = f40974f.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                w<?> wVar2 = it2.next().get();
                if (wVar2 == null) {
                    z11 = true;
                } else if (wVar2.p() == cls) {
                    wVar = wVar2;
                    break;
                }
            }
            if (z11) {
                y();
            }
            return (w) l(wVar);
        } catch (ClassNotFoundException e11) {
            throw new IllegalStateException(e11);
        }
    }

    private static void y() {
        while (true) {
            b bVar = (b) f40975g.poll();
            if (bVar == null) {
                return;
            }
            Iterator<b> it2 = f40974f.iterator();
            while (true) {
                if (it2.hasNext()) {
                    b next = it2.next();
                    if (next.f40986a.equals(bVar.f40986a)) {
                        f40974f.remove(next);
                        break;
                    }
                }
            }
        }
    }

    public static void z(w<?> wVar) {
        f40974f.add(new b(wVar, f40975g));
    }

    @Override // net.time4j.engine.t
    public d0 a() {
        return this.f40977b.a();
    }

    @Override // net.time4j.engine.t
    public w<?> b() {
        return this.f40977b.b();
    }

    @Override // net.time4j.engine.t
    public T c(q<?> qVar, d dVar, boolean z11, boolean z12) {
        return this.f40977b.c(qVar, dVar, z11, z12);
    }

    @Override // net.time4j.engine.t
    public int f() {
        return this.f40977b.f();
    }

    @Override // net.time4j.engine.t
    public o g(T t11, d dVar) {
        return this.f40977b.g(t11, dVar);
    }

    @Override // net.time4j.engine.t
    public String i(x xVar, Locale locale) {
        return this.f40977b.i(xVar, locale);
    }

    public k<T> m() {
        throw new ChronoException("Calendar system is not available.");
    }

    public k<T> o(String str) {
        throw new ChronoException("Calendar variant is not available: " + str);
    }

    public Class<T> p() {
        return this.f40976a;
    }

    public List<r> r() {
        return this.f40979d;
    }

    public b0<T> s(p<Integer> pVar) {
        return this.f40980e.get(pVar);
    }

    public Set<p<?>> t() {
        return this.f40978c.keySet();
    }

    public <V> y<T, V> u(p<V> pVar) {
        Objects.requireNonNull(pVar, "Missing chronological element.");
        y<T, ?> yVar = this.f40978c.get(pVar);
        if (yVar == null && (yVar = q(pVar, true)) == null) {
            throw new RuleNotFoundException((w<?>) this, (p<?>) pVar);
        }
        return (y) l(yVar);
    }

    public boolean v(p<?> pVar) {
        return pVar != null && this.f40978c.containsKey(pVar);
    }

    public boolean w(p<?> pVar) {
        if (pVar == null) {
            return false;
        }
        return v(pVar) || q(pVar, false) != null;
    }
}