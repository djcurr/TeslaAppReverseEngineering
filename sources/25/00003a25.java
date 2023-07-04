package com.google.gson;

import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: n  reason: collision with root package name */
    static final String f17165n = null;

    /* renamed from: o  reason: collision with root package name */
    static final com.google.gson.d f17166o = com.google.gson.c.IDENTITY;

    /* renamed from: p  reason: collision with root package name */
    static final t f17167p = s.DOUBLE;

    /* renamed from: q  reason: collision with root package name */
    static final t f17168q = s.LAZILY_PARSED_NUMBER;

    /* renamed from: r  reason: collision with root package name */
    private static final com.google.gson.reflect.a<?> f17169r = com.google.gson.reflect.a.get(Object.class);

    /* renamed from: a  reason: collision with root package name */
    private final ThreadLocal<Map<com.google.gson.reflect.a<?>, f<?>>> f17170a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<com.google.gson.reflect.a<?>, u<?>> f17171b;

    /* renamed from: c  reason: collision with root package name */
    private final on.c f17172c;

    /* renamed from: d  reason: collision with root package name */
    private final pn.e f17173d;

    /* renamed from: e  reason: collision with root package name */
    final List<v> f17174e;

    /* renamed from: f  reason: collision with root package name */
    final Map<Type, g<?>> f17175f;

    /* renamed from: g  reason: collision with root package name */
    final boolean f17176g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f17177h;

    /* renamed from: i  reason: collision with root package name */
    final boolean f17178i;

    /* renamed from: j  reason: collision with root package name */
    final boolean f17179j;

    /* renamed from: k  reason: collision with root package name */
    final boolean f17180k;

    /* renamed from: l  reason: collision with root package name */
    final List<v> f17181l;

    /* renamed from: m  reason: collision with root package name */
    final List<v> f17182m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends u<Number> {
        a(e eVar) {
        }

        @Override // com.google.gson.u
        /* renamed from: e */
        public Double b(tn.a aVar) {
            if (aVar.Q0() == com.google.gson.stream.a.NULL) {
                aVar.G0();
                return null;
            }
            return Double.valueOf(aVar.t0());
        }

        @Override // com.google.gson.u
        /* renamed from: f */
        public void d(com.google.gson.stream.b bVar, Number number) {
            if (number == null) {
                bVar.n0();
                return;
            }
            e.d(number.doubleValue());
            bVar.R0(number);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b extends u<Number> {
        b(e eVar) {
        }

        @Override // com.google.gson.u
        /* renamed from: e */
        public Float b(tn.a aVar) {
            if (aVar.Q0() == com.google.gson.stream.a.NULL) {
                aVar.G0();
                return null;
            }
            return Float.valueOf((float) aVar.t0());
        }

        @Override // com.google.gson.u
        /* renamed from: f */
        public void d(com.google.gson.stream.b bVar, Number number) {
            if (number == null) {
                bVar.n0();
                return;
            }
            e.d(number.floatValue());
            bVar.R0(number);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c extends u<Number> {
        c() {
        }

        @Override // com.google.gson.u
        /* renamed from: e */
        public Number b(tn.a aVar) {
            if (aVar.Q0() == com.google.gson.stream.a.NULL) {
                aVar.G0();
                return null;
            }
            return Long.valueOf(aVar.C0());
        }

        @Override // com.google.gson.u
        /* renamed from: f */
        public void d(com.google.gson.stream.b bVar, Number number) {
            if (number == null) {
                bVar.n0();
            } else {
                bVar.S0(number.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d extends u<AtomicLong> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f17183a;

        d(u uVar) {
            this.f17183a = uVar;
        }

        @Override // com.google.gson.u
        /* renamed from: e */
        public AtomicLong b(tn.a aVar) {
            return new AtomicLong(((Number) this.f17183a.b(aVar)).longValue());
        }

        @Override // com.google.gson.u
        /* renamed from: f */
        public void d(com.google.gson.stream.b bVar, AtomicLong atomicLong) {
            this.f17183a.d(bVar, Long.valueOf(atomicLong.get()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.gson.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0311e extends u<AtomicLongArray> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f17184a;

        C0311e(u uVar) {
            this.f17184a = uVar;
        }

        @Override // com.google.gson.u
        /* renamed from: e */
        public AtomicLongArray b(tn.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.R()) {
                arrayList.add(Long.valueOf(((Number) this.f17184a.b(aVar)).longValue()));
            }
            aVar.p();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i11 = 0; i11 < size; i11++) {
                atomicLongArray.set(i11, ((Long) arrayList.get(i11)).longValue());
            }
            return atomicLongArray;
        }

        @Override // com.google.gson.u
        /* renamed from: f */
        public void d(com.google.gson.stream.b bVar, AtomicLongArray atomicLongArray) {
            bVar.j();
            int length = atomicLongArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                this.f17184a.d(bVar, Long.valueOf(atomicLongArray.get(i11)));
            }
            bVar.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class f<T> extends u<T> {

        /* renamed from: a  reason: collision with root package name */
        private u<T> f17185a;

        f() {
        }

        @Override // com.google.gson.u
        public T b(tn.a aVar) {
            u<T> uVar = this.f17185a;
            if (uVar != null) {
                return uVar.b(aVar);
            }
            throw new IllegalStateException();
        }

        @Override // com.google.gson.u
        public void d(com.google.gson.stream.b bVar, T t11) {
            u<T> uVar = this.f17185a;
            if (uVar != null) {
                uVar.d(bVar, t11);
                return;
            }
            throw new IllegalStateException();
        }

        public void e(u<T> uVar) {
            if (this.f17185a == null) {
                this.f17185a = uVar;
                return;
            }
            throw new AssertionError();
        }
    }

    public e() {
        this(on.d.f42795g, f17166o, Collections.emptyMap(), false, false, false, true, false, false, false, true, r.DEFAULT, f17165n, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), f17167p, f17168q);
    }

    private static void a(Object obj, tn.a aVar) {
        if (obj != null) {
            try {
                if (aVar.Q0() == com.google.gson.stream.a.END_DOCUMENT) {
                    return;
                }
                throw new JsonIOException("JSON document was not fully consumed.");
            } catch (MalformedJsonException e11) {
                throw new JsonSyntaxException(e11);
            } catch (IOException e12) {
                throw new JsonIOException(e12);
            }
        }
    }

    private static u<AtomicLong> b(u<Number> uVar) {
        return new d(uVar).a();
    }

    private static u<AtomicLongArray> c(u<Number> uVar) {
        return new C0311e(uVar).a();
    }

    static void d(double d11) {
        if (Double.isNaN(d11) || Double.isInfinite(d11)) {
            throw new IllegalArgumentException(d11 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private u<Number> e(boolean z11) {
        if (z11) {
            return pn.n.f46782v;
        }
        return new a(this);
    }

    private u<Number> f(boolean z11) {
        if (z11) {
            return pn.n.f46781u;
        }
        return new b(this);
    }

    private static u<Number> n(r rVar) {
        if (rVar == r.DEFAULT) {
            return pn.n.f46780t;
        }
        return new c();
    }

    public <T> T g(Reader reader, Type type) {
        tn.a o11 = o(reader);
        T t11 = (T) j(o11, type);
        a(t11, o11);
        return t11;
    }

    public <T> T h(String str, Class<T> cls) {
        return (T) on.k.b(cls).cast(i(str, cls));
    }

    public <T> T i(String str, Type type) {
        if (str == null) {
            return null;
        }
        return (T) g(new StringReader(str), type);
    }

    public <T> T j(tn.a aVar, Type type) {
        boolean a02 = aVar.a0();
        boolean z11 = true;
        aVar.b1(true);
        try {
            try {
                try {
                    aVar.Q0();
                    z11 = false;
                    T b11 = k(com.google.gson.reflect.a.get(type)).b(aVar);
                    aVar.b1(a02);
                    return b11;
                } catch (EOFException e11) {
                    if (z11) {
                        aVar.b1(a02);
                        return null;
                    }
                    throw new JsonSyntaxException(e11);
                } catch (IOException e12) {
                    throw new JsonSyntaxException(e12);
                }
            } catch (AssertionError e13) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.0): " + e13.getMessage());
                assertionError.initCause(e13);
                throw assertionError;
            } catch (IllegalStateException e14) {
                throw new JsonSyntaxException(e14);
            }
        } catch (Throwable th2) {
            aVar.b1(a02);
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> u<T> k(com.google.gson.reflect.a<T> aVar) {
        u<T> uVar = (u<T>) this.f17171b.get(aVar == null ? f17169r : aVar);
        if (uVar != null) {
            return uVar;
        }
        Map<com.google.gson.reflect.a<?>, f<?>> map = this.f17170a.get();
        boolean z11 = false;
        if (map == null) {
            map = new HashMap<>();
            this.f17170a.set(map);
            z11 = true;
        }
        f<?> fVar = map.get(aVar);
        if (fVar != null) {
            return fVar;
        }
        try {
            f<?> fVar2 = new f<>();
            map.put(aVar, fVar2);
            for (v vVar : this.f17174e) {
                u uVar2 = (u<T>) vVar.a(this, aVar);
                if (uVar2 != null) {
                    fVar2.e(uVar2);
                    this.f17171b.put(aVar, uVar2);
                    return uVar2;
                }
            }
            throw new IllegalArgumentException("GSON (2.9.0) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z11) {
                this.f17170a.remove();
            }
        }
    }

    public <T> u<T> l(Class<T> cls) {
        return k(com.google.gson.reflect.a.get((Class) cls));
    }

    public <T> u<T> m(v vVar, com.google.gson.reflect.a<T> aVar) {
        if (!this.f17174e.contains(vVar)) {
            vVar = this.f17173d;
        }
        boolean z11 = false;
        for (v vVar2 : this.f17174e) {
            if (z11) {
                u<T> a11 = vVar2.a(this, aVar);
                if (a11 != null) {
                    return a11;
                }
            } else if (vVar2 == vVar) {
                z11 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public tn.a o(Reader reader) {
        tn.a aVar = new tn.a(reader);
        aVar.b1(this.f17180k);
        return aVar;
    }

    public com.google.gson.stream.b p(Writer writer) {
        if (this.f17177h) {
            writer.write(")]}'\n");
        }
        com.google.gson.stream.b bVar = new com.google.gson.stream.b(writer);
        if (this.f17179j) {
            bVar.F0("  ");
        }
        bVar.D0(this.f17178i);
        bVar.G0(this.f17180k);
        bVar.I0(this.f17176g);
        return bVar;
    }

    public String q(k kVar) {
        StringWriter stringWriter = new StringWriter();
        u(kVar, stringWriter);
        return stringWriter.toString();
    }

    public String r(Object obj) {
        if (obj == null) {
            return q(l.f17206a);
        }
        return s(obj, obj.getClass());
    }

    public String s(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        w(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void t(k kVar, com.google.gson.stream.b bVar) {
        boolean L = bVar.L();
        bVar.G0(true);
        boolean J = bVar.J();
        bVar.D0(this.f17178i);
        boolean D = bVar.D();
        bVar.I0(this.f17176g);
        try {
            try {
                on.l.b(kVar, bVar);
            } catch (IOException e11) {
                throw new JsonIOException(e11);
            } catch (AssertionError e12) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.0): " + e12.getMessage());
                assertionError.initCause(e12);
                throw assertionError;
            }
        } finally {
            bVar.G0(L);
            bVar.D0(J);
            bVar.I0(D);
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f17176g + ",factories:" + this.f17174e + ",instanceCreators:" + this.f17172c + "}";
    }

    public void u(k kVar, Appendable appendable) {
        try {
            t(kVar, p(on.l.c(appendable)));
        } catch (IOException e11) {
            throw new JsonIOException(e11);
        }
    }

    public void v(Object obj, Type type, com.google.gson.stream.b bVar) {
        u k11 = k(com.google.gson.reflect.a.get(type));
        boolean L = bVar.L();
        bVar.G0(true);
        boolean J = bVar.J();
        bVar.D0(this.f17178i);
        boolean D = bVar.D();
        bVar.I0(this.f17176g);
        try {
            try {
                k11.d(bVar, obj);
            } catch (IOException e11) {
                throw new JsonIOException(e11);
            } catch (AssertionError e12) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.0): " + e12.getMessage());
                assertionError.initCause(e12);
                throw assertionError;
            }
        } finally {
            bVar.G0(L);
            bVar.D0(J);
            bVar.I0(D);
        }
    }

    public void w(Object obj, Type type, Appendable appendable) {
        try {
            v(obj, type, p(on.l.c(appendable)));
        } catch (IOException e11) {
            throw new JsonIOException(e11);
        }
    }

    public k x(Object obj) {
        if (obj == null) {
            return l.f17206a;
        }
        return y(obj, obj.getClass());
    }

    public k y(Object obj, Type type) {
        pn.g gVar = new pn.g();
        v(obj, type, gVar);
        return gVar.b1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(on.d dVar, com.google.gson.d dVar2, Map<Type, g<?>> map, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, r rVar, String str, int i11, int i12, List<v> list, List<v> list2, List<v> list3, t tVar, t tVar2) {
        this.f17170a = new ThreadLocal<>();
        this.f17171b = new ConcurrentHashMap();
        this.f17175f = map;
        on.c cVar = new on.c(map, z18);
        this.f17172c = cVar;
        this.f17176g = z11;
        this.f17177h = z13;
        this.f17178i = z14;
        this.f17179j = z15;
        this.f17180k = z16;
        this.f17181l = list;
        this.f17182m = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(pn.n.W);
        arrayList.add(pn.j.e(tVar));
        arrayList.add(dVar);
        arrayList.addAll(list3);
        arrayList.add(pn.n.C);
        arrayList.add(pn.n.f46773m);
        arrayList.add(pn.n.f46767g);
        arrayList.add(pn.n.f46769i);
        arrayList.add(pn.n.f46771k);
        u<Number> n11 = n(rVar);
        arrayList.add(pn.n.c(Long.TYPE, Long.class, n11));
        arrayList.add(pn.n.c(Double.TYPE, Double.class, e(z17)));
        arrayList.add(pn.n.c(Float.TYPE, Float.class, f(z17)));
        arrayList.add(pn.i.e(tVar2));
        arrayList.add(pn.n.f46775o);
        arrayList.add(pn.n.f46777q);
        arrayList.add(pn.n.b(AtomicLong.class, b(n11)));
        arrayList.add(pn.n.b(AtomicLongArray.class, c(n11)));
        arrayList.add(pn.n.f46779s);
        arrayList.add(pn.n.f46784x);
        arrayList.add(pn.n.E);
        arrayList.add(pn.n.G);
        arrayList.add(pn.n.b(BigDecimal.class, pn.n.f46786z));
        arrayList.add(pn.n.b(BigInteger.class, pn.n.A));
        arrayList.add(pn.n.b(on.g.class, pn.n.B));
        arrayList.add(pn.n.I);
        arrayList.add(pn.n.K);
        arrayList.add(pn.n.O);
        arrayList.add(pn.n.Q);
        arrayList.add(pn.n.U);
        arrayList.add(pn.n.M);
        arrayList.add(pn.n.f46764d);
        arrayList.add(pn.c.f46698b);
        arrayList.add(pn.n.S);
        if (sn.d.f50472a) {
            arrayList.add(sn.d.f50476e);
            arrayList.add(sn.d.f50475d);
            arrayList.add(sn.d.f50477f);
        }
        arrayList.add(pn.a.f46692c);
        arrayList.add(pn.n.f46762b);
        arrayList.add(new pn.b(cVar));
        arrayList.add(new pn.h(cVar, z12));
        pn.e eVar = new pn.e(cVar);
        this.f17173d = eVar;
        arrayList.add(eVar);
        arrayList.add(pn.n.X);
        arrayList.add(new pn.k(cVar, dVar2, dVar, eVar));
        this.f17174e = Collections.unmodifiableList(arrayList);
    }
}