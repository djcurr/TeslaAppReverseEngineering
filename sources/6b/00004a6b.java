package com.squareup.moshi;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class n<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: i  reason: collision with root package name */
    private static final Comparator<Comparable> f20546i = new a();

    /* renamed from: a  reason: collision with root package name */
    Comparator<? super K> f20547a;

    /* renamed from: b  reason: collision with root package name */
    g<K, V>[] f20548b;

    /* renamed from: c  reason: collision with root package name */
    final g<K, V> f20549c;

    /* renamed from: d  reason: collision with root package name */
    int f20550d;

    /* renamed from: e  reason: collision with root package name */
    int f20551e;

    /* renamed from: f  reason: collision with root package name */
    int f20552f;

    /* renamed from: g  reason: collision with root package name */
    private n<K, V>.d f20553g;

    /* renamed from: h  reason: collision with root package name */
    private n<K, V>.e f20554h;

    /* loaded from: classes2.dex */
    class a implements Comparator<Comparable> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private g<K, V> f20555a;

        /* renamed from: b  reason: collision with root package name */
        private int f20556b;

        /* renamed from: c  reason: collision with root package name */
        private int f20557c;

        /* renamed from: d  reason: collision with root package name */
        private int f20558d;

        b() {
        }

        void a(g<K, V> gVar) {
            gVar.f20568c = null;
            gVar.f20566a = null;
            gVar.f20567b = null;
            gVar.f20574i = 1;
            int i11 = this.f20556b;
            if (i11 > 0) {
                int i12 = this.f20558d;
                if ((i12 & 1) == 0) {
                    this.f20558d = i12 + 1;
                    this.f20556b = i11 - 1;
                    this.f20557c++;
                }
            }
            gVar.f20566a = this.f20555a;
            this.f20555a = gVar;
            int i13 = this.f20558d + 1;
            this.f20558d = i13;
            int i14 = this.f20556b;
            if (i14 > 0 && (i13 & 1) == 0) {
                this.f20558d = i13 + 1;
                this.f20556b = i14 - 1;
                this.f20557c++;
            }
            int i15 = 4;
            while (true) {
                int i16 = i15 - 1;
                if ((this.f20558d & i16) != i16) {
                    return;
                }
                int i17 = this.f20557c;
                if (i17 == 0) {
                    g<K, V> gVar2 = this.f20555a;
                    g<K, V> gVar3 = gVar2.f20566a;
                    g<K, V> gVar4 = gVar3.f20566a;
                    gVar3.f20566a = gVar4.f20566a;
                    this.f20555a = gVar3;
                    gVar3.f20567b = gVar4;
                    gVar3.f20568c = gVar2;
                    gVar3.f20574i = gVar2.f20574i + 1;
                    gVar4.f20566a = gVar3;
                    gVar2.f20566a = gVar3;
                } else if (i17 == 1) {
                    g<K, V> gVar5 = this.f20555a;
                    g<K, V> gVar6 = gVar5.f20566a;
                    this.f20555a = gVar6;
                    gVar6.f20568c = gVar5;
                    gVar6.f20574i = gVar5.f20574i + 1;
                    gVar5.f20566a = gVar6;
                    this.f20557c = 0;
                } else if (i17 == 2) {
                    this.f20557c = 0;
                }
                i15 *= 2;
            }
        }

        void b(int i11) {
            this.f20556b = ((Integer.highestOneBit(i11) * 2) - 1) - i11;
            this.f20558d = 0;
            this.f20557c = 0;
            this.f20555a = null;
        }

        g<K, V> c() {
            g<K, V> gVar = this.f20555a;
            if (gVar.f20566a == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class c<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private g<K, V> f20559a;

        c() {
        }

        public g<K, V> a() {
            g<K, V> gVar = this.f20559a;
            if (gVar == null) {
                return null;
            }
            g<K, V> gVar2 = gVar.f20566a;
            gVar.f20566a = null;
            g<K, V> gVar3 = gVar.f20568c;
            while (true) {
                g<K, V> gVar4 = gVar2;
                gVar2 = gVar3;
                if (gVar2 != null) {
                    gVar2.f20566a = gVar4;
                    gVar3 = gVar2.f20567b;
                } else {
                    this.f20559a = gVar4;
                    return gVar;
                }
            }
        }

        void b(g<K, V> gVar) {
            g<K, V> gVar2 = null;
            while (gVar != null) {
                gVar.f20566a = gVar2;
                gVar2 = gVar;
                gVar = gVar.f20567b;
            }
            this.f20559a = gVar2;
        }
    }

    /* loaded from: classes2.dex */
    final class d extends AbstractSet<Map.Entry<K, V>> {

        /* loaded from: classes2.dex */
        class a extends n<K, V>.f<Map.Entry<K, V>> {
            a(d dVar) {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: b */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            n.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && n.this.f((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            g<K, V> f11;
            if ((obj instanceof Map.Entry) && (f11 = n.this.f((Map.Entry) obj)) != null) {
                n.this.j(f11, true);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return n.this.f20550d;
        }
    }

    /* loaded from: classes2.dex */
    final class e extends AbstractSet<K> {

        /* loaded from: classes2.dex */
        class a extends n<K, V>.f<K> {
            a(e eVar) {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f20571f;
            }
        }

        e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            n.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return n.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return n.this.k(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return n.this.f20550d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public abstract class f<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        g<K, V> f20562a;

        /* renamed from: b  reason: collision with root package name */
        g<K, V> f20563b = null;

        /* renamed from: c  reason: collision with root package name */
        int f20564c;

        f() {
            this.f20562a = n.this.f20549c.f20569d;
            this.f20564c = n.this.f20551e;
        }

        final g<K, V> a() {
            g<K, V> gVar = this.f20562a;
            n nVar = n.this;
            if (gVar != nVar.f20549c) {
                if (nVar.f20551e == this.f20564c) {
                    this.f20562a = gVar.f20569d;
                    this.f20563b = gVar;
                    return gVar;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f20562a != n.this.f20549c;
        }

        @Override // java.util.Iterator
        public final void remove() {
            g<K, V> gVar = this.f20563b;
            if (gVar != null) {
                n.this.j(gVar, true);
                this.f20563b = null;
                this.f20564c = n.this.f20551e;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n() {
        this(null);
    }

    private void a() {
        g<K, V>[] b11 = b(this.f20548b);
        this.f20548b = b11;
        this.f20552f = (b11.length / 2) + (b11.length / 4);
    }

    static <K, V> g<K, V>[] b(g<K, V>[] gVarArr) {
        int length = gVarArr.length;
        g<K, V>[] gVarArr2 = new g[length * 2];
        c cVar = new c();
        b bVar = new b();
        b bVar2 = new b();
        for (int i11 = 0; i11 < length; i11++) {
            g<K, V> gVar = gVarArr[i11];
            if (gVar != null) {
                cVar.b(gVar);
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    g<K, V> a11 = cVar.a();
                    if (a11 == null) {
                        break;
                    } else if ((a11.f20572g & length) == 0) {
                        i12++;
                    } else {
                        i13++;
                    }
                }
                bVar.b(i12);
                bVar2.b(i13);
                cVar.b(gVar);
                while (true) {
                    g<K, V> a12 = cVar.a();
                    if (a12 == null) {
                        break;
                    } else if ((a12.f20572g & length) == 0) {
                        bVar.a(a12);
                    } else {
                        bVar2.a(a12);
                    }
                }
                gVarArr2[i11] = i12 > 0 ? bVar.c() : null;
                gVarArr2[i11 + length] = i13 > 0 ? bVar2.c() : null;
            }
        }
        return gVarArr2;
    }

    private boolean c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void i(g<K, V> gVar, boolean z11) {
        while (gVar != null) {
            g<K, V> gVar2 = gVar.f20567b;
            g<K, V> gVar3 = gVar.f20568c;
            int i11 = gVar2 != null ? gVar2.f20574i : 0;
            int i12 = gVar3 != null ? gVar3.f20574i : 0;
            int i13 = i11 - i12;
            if (i13 == -2) {
                g<K, V> gVar4 = gVar3.f20567b;
                g<K, V> gVar5 = gVar3.f20568c;
                int i14 = (gVar4 != null ? gVar4.f20574i : 0) - (gVar5 != null ? gVar5.f20574i : 0);
                if (i14 != -1 && (i14 != 0 || z11)) {
                    n(gVar3);
                    m(gVar);
                } else {
                    m(gVar);
                }
                if (z11) {
                    return;
                }
            } else if (i13 == 2) {
                g<K, V> gVar6 = gVar2.f20567b;
                g<K, V> gVar7 = gVar2.f20568c;
                int i15 = (gVar6 != null ? gVar6.f20574i : 0) - (gVar7 != null ? gVar7.f20574i : 0);
                if (i15 != 1 && (i15 != 0 || z11)) {
                    m(gVar2);
                    n(gVar);
                } else {
                    n(gVar);
                }
                if (z11) {
                    return;
                }
            } else if (i13 == 0) {
                gVar.f20574i = i11 + 1;
                if (z11) {
                    return;
                }
            } else {
                gVar.f20574i = Math.max(i11, i12) + 1;
                if (!z11) {
                    return;
                }
            }
            gVar = gVar.f20566a;
        }
    }

    private void l(g<K, V> gVar, g<K, V> gVar2) {
        g<K, V> gVar3 = gVar.f20566a;
        gVar.f20566a = null;
        if (gVar2 != null) {
            gVar2.f20566a = gVar3;
        }
        if (gVar3 != null) {
            if (gVar3.f20567b == gVar) {
                gVar3.f20567b = gVar2;
                return;
            } else {
                gVar3.f20568c = gVar2;
                return;
            }
        }
        int i11 = gVar.f20572g;
        g<K, V>[] gVarArr = this.f20548b;
        gVarArr[i11 & (gVarArr.length - 1)] = gVar2;
    }

    private void m(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.f20567b;
        g<K, V> gVar3 = gVar.f20568c;
        g<K, V> gVar4 = gVar3.f20567b;
        g<K, V> gVar5 = gVar3.f20568c;
        gVar.f20568c = gVar4;
        if (gVar4 != null) {
            gVar4.f20566a = gVar;
        }
        l(gVar, gVar3);
        gVar3.f20567b = gVar;
        gVar.f20566a = gVar3;
        int max = Math.max(gVar2 != null ? gVar2.f20574i : 0, gVar4 != null ? gVar4.f20574i : 0) + 1;
        gVar.f20574i = max;
        gVar3.f20574i = Math.max(max, gVar5 != null ? gVar5.f20574i : 0) + 1;
    }

    private void n(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.f20567b;
        g<K, V> gVar3 = gVar.f20568c;
        g<K, V> gVar4 = gVar2.f20567b;
        g<K, V> gVar5 = gVar2.f20568c;
        gVar.f20567b = gVar5;
        if (gVar5 != null) {
            gVar5.f20566a = gVar;
        }
        l(gVar, gVar2);
        gVar2.f20568c = gVar;
        gVar.f20566a = gVar2;
        int max = Math.max(gVar3 != null ? gVar3.f20574i : 0, gVar5 != null ? gVar5.f20574i : 0) + 1;
        gVar.f20574i = max;
        gVar2.f20574i = Math.max(max, gVar4 != null ? gVar4.f20574i : 0) + 1;
    }

    private static int o(int i11) {
        int i12 = i11 ^ ((i11 >>> 20) ^ (i11 >>> 12));
        return (i12 >>> 4) ^ ((i12 >>> 7) ^ i12);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.f20548b, (Object) null);
        this.f20550d = 0;
        this.f20551e++;
        g<K, V> gVar = this.f20549c;
        g<K, V> gVar2 = gVar.f20569d;
        while (gVar2 != gVar) {
            g<K, V> gVar3 = gVar2.f20569d;
            gVar2.f20570e = null;
            gVar2.f20569d = null;
            gVar2 = gVar3;
        }
        gVar.f20570e = gVar;
        gVar.f20569d = gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return h(obj) != null;
    }

    g<K, V> e(K k11, boolean z11) {
        int i11;
        g<K, V> gVar;
        Comparator<? super K> comparator = this.f20547a;
        g<K, V>[] gVarArr = this.f20548b;
        int o11 = o(k11.hashCode());
        int length = (gVarArr.length - 1) & o11;
        g<K, V> gVar2 = gVarArr[length];
        if (gVar2 != null) {
            Comparable comparable = comparator == f20546i ? (Comparable) k11 : null;
            while (true) {
                if (comparable != null) {
                    i11 = comparable.compareTo(gVar2.f20571f);
                } else {
                    i11 = comparator.compare(k11, (K) gVar2.f20571f);
                }
                if (i11 == 0) {
                    return gVar2;
                }
                g<K, V> gVar3 = i11 < 0 ? gVar2.f20567b : gVar2.f20568c;
                if (gVar3 == null) {
                    break;
                }
                gVar2 = gVar3;
            }
        } else {
            i11 = 0;
        }
        g<K, V> gVar4 = gVar2;
        int i12 = i11;
        if (z11) {
            g<K, V> gVar5 = this.f20549c;
            if (gVar4 == null) {
                if (comparator == f20546i && !(k11 instanceof Comparable)) {
                    throw new ClassCastException(k11.getClass().getName() + " is not Comparable");
                }
                gVar = new g<>(gVar4, k11, o11, gVar5, gVar5.f20570e);
                gVarArr[length] = gVar;
            } else {
                gVar = new g<>(gVar4, k11, o11, gVar5, gVar5.f20570e);
                if (i12 < 0) {
                    gVar4.f20567b = gVar;
                } else {
                    gVar4.f20568c = gVar;
                }
                i(gVar4, true);
            }
            int i13 = this.f20550d;
            this.f20550d = i13 + 1;
            if (i13 > this.f20552f) {
                a();
            }
            this.f20551e++;
            return gVar;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        n<K, V>.d dVar = this.f20553g;
        if (dVar != null) {
            return dVar;
        }
        n<K, V>.d dVar2 = new d();
        this.f20553g = dVar2;
        return dVar2;
    }

    g<K, V> f(Map.Entry<?, ?> entry) {
        g<K, V> h11 = h(entry.getKey());
        if (h11 != null && c(h11.f20573h, entry.getValue())) {
            return h11;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        g<K, V> h11 = h(obj);
        if (h11 != null) {
            return h11.f20573h;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    g<K, V> h(Object obj) {
        if (obj != 0) {
            try {
                return e(obj, false);
            } catch (ClassCastException unused) {
                return null;
            }
        }
        return null;
    }

    void j(g<K, V> gVar, boolean z11) {
        int i11;
        if (z11) {
            g<K, V> gVar2 = gVar.f20570e;
            gVar2.f20569d = gVar.f20569d;
            gVar.f20569d.f20570e = gVar2;
            gVar.f20570e = null;
            gVar.f20569d = null;
        }
        g<K, V> gVar3 = gVar.f20567b;
        g<K, V> gVar4 = gVar.f20568c;
        g<K, V> gVar5 = gVar.f20566a;
        int i12 = 0;
        if (gVar3 != null && gVar4 != null) {
            g<K, V> b11 = gVar3.f20574i > gVar4.f20574i ? gVar3.b() : gVar4.a();
            j(b11, false);
            g<K, V> gVar6 = gVar.f20567b;
            if (gVar6 != null) {
                i11 = gVar6.f20574i;
                b11.f20567b = gVar6;
                gVar6.f20566a = b11;
                gVar.f20567b = null;
            } else {
                i11 = 0;
            }
            g<K, V> gVar7 = gVar.f20568c;
            if (gVar7 != null) {
                i12 = gVar7.f20574i;
                b11.f20568c = gVar7;
                gVar7.f20566a = b11;
                gVar.f20568c = null;
            }
            b11.f20574i = Math.max(i11, i12) + 1;
            l(gVar, b11);
            return;
        }
        if (gVar3 != null) {
            l(gVar, gVar3);
            gVar.f20567b = null;
        } else if (gVar4 != null) {
            l(gVar, gVar4);
            gVar.f20568c = null;
        } else {
            l(gVar, null);
        }
        i(gVar5, false);
        this.f20550d--;
        this.f20551e++;
    }

    g<K, V> k(Object obj) {
        g<K, V> h11 = h(obj);
        if (h11 != null) {
            j(h11, true);
        }
        return h11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        n<K, V>.e eVar = this.f20554h;
        if (eVar != null) {
            return eVar;
        }
        n<K, V>.e eVar2 = new e();
        this.f20554h = eVar2;
        return eVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k11, V v11) {
        Objects.requireNonNull(k11, "key == null");
        g<K, V> e11 = e(k11, true);
        V v12 = e11.f20573h;
        e11.f20573h = v11;
        return v12;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g<K, V> k11 = k(obj);
        if (k11 != null) {
            return k11.f20573h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f20550d;
    }

    n(Comparator<? super K> comparator) {
        this.f20550d = 0;
        this.f20551e = 0;
        this.f20547a = comparator == null ? f20546i : comparator;
        this.f20549c = new g<>();
        g<K, V>[] gVarArr = new g[16];
        this.f20548b = gVarArr;
        this.f20552f = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class g<K, V> implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        g<K, V> f20566a;

        /* renamed from: b  reason: collision with root package name */
        g<K, V> f20567b;

        /* renamed from: c  reason: collision with root package name */
        g<K, V> f20568c;

        /* renamed from: d  reason: collision with root package name */
        g<K, V> f20569d;

        /* renamed from: e  reason: collision with root package name */
        g<K, V> f20570e;

        /* renamed from: f  reason: collision with root package name */
        final K f20571f;

        /* renamed from: g  reason: collision with root package name */
        final int f20572g;

        /* renamed from: h  reason: collision with root package name */
        V f20573h;

        /* renamed from: i  reason: collision with root package name */
        int f20574i;

        g() {
            this.f20571f = null;
            this.f20572g = -1;
            this.f20570e = this;
            this.f20569d = this;
        }

        public g<K, V> a() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.f20567b; gVar2 != null; gVar2 = gVar2.f20567b) {
                gVar = gVar2;
            }
            return gVar;
        }

        public g<K, V> b() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.f20568c; gVar2 != null; gVar2 = gVar2.f20568c) {
                gVar = gVar2;
            }
            return gVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k11 = this.f20571f;
                if (k11 == null) {
                    if (entry.getKey() != null) {
                        return false;
                    }
                } else if (!k11.equals(entry.getKey())) {
                    return false;
                }
                V v11 = this.f20573h;
                if (v11 == null) {
                    if (entry.getValue() != null) {
                        return false;
                    }
                } else if (!v11.equals(entry.getValue())) {
                    return false;
                }
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f20571f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f20573h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k11 = this.f20571f;
            int hashCode = k11 == null ? 0 : k11.hashCode();
            V v11 = this.f20573h;
            return hashCode ^ (v11 != null ? v11.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v11) {
            V v12 = this.f20573h;
            this.f20573h = v11;
            return v12;
        }

        public String toString() {
            return this.f20571f + "=" + this.f20573h;
        }

        g(g<K, V> gVar, K k11, int i11, g<K, V> gVar2, g<K, V> gVar3) {
            this.f20566a = gVar;
            this.f20571f = k11;
            this.f20572g = i11;
            this.f20574i = 1;
            this.f20569d = gVar2;
            this.f20570e = gVar3;
            gVar3.f20569d = this;
            gVar2.f20570e = this;
        }
    }
}