package com.squareup.moshi;

import com.squareup.moshi.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: d  reason: collision with root package name */
    static final List<f.d> f20578d;

    /* renamed from: a  reason: collision with root package name */
    private final List<f.d> f20579a;

    /* renamed from: b  reason: collision with root package name */
    private final ThreadLocal<d> f20580b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    private final Map<Object, f<?>> f20581c = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements f.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Type f20582a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f20583b;

        a(Type type, f fVar) {
            this.f20582a = type;
            this.f20583b = fVar;
        }

        @Override // com.squareup.moshi.f.d
        public f<?> a(Type type, Set<? extends Annotation> set, p pVar) {
            if (set.isEmpty() && kr.b.u(this.f20582a, type)) {
                return this.f20583b;
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        final List<f.d> f20584a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        int f20585b = 0;

        public b a(f.d dVar) {
            if (dVar != null) {
                List<f.d> list = this.f20584a;
                int i11 = this.f20585b;
                this.f20585b = i11 + 1;
                list.add(i11, dVar);
                return this;
            }
            throw new IllegalArgumentException("factory == null");
        }

        public b b(Object obj) {
            if (obj != null) {
                return a(com.squareup.moshi.a.d(obj));
            }
            throw new IllegalArgumentException("adapter == null");
        }

        public <T> b c(Type type, f<T> fVar) {
            return a(p.h(type, fVar));
        }

        public p d() {
            return new p(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class c<T> extends f<T> {

        /* renamed from: a  reason: collision with root package name */
        final Type f20586a;

        /* renamed from: b  reason: collision with root package name */
        final String f20587b;

        /* renamed from: c  reason: collision with root package name */
        final Object f20588c;

        /* renamed from: d  reason: collision with root package name */
        f<T> f20589d;

        c(Type type, String str, Object obj) {
            this.f20586a = type;
            this.f20587b = str;
            this.f20588c = obj;
        }

        @Override // com.squareup.moshi.f
        public T b(h hVar) {
            f<T> fVar = this.f20589d;
            if (fVar != null) {
                return fVar.b(hVar);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        @Override // com.squareup.moshi.f
        public void j(m mVar, T t11) {
            f<T> fVar = this.f20589d;
            if (fVar != null) {
                fVar.j(mVar, t11);
                return;
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        public String toString() {
            f<T> fVar = this.f20589d;
            return fVar != null ? fVar.toString() : super.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class d {

        /* renamed from: a  reason: collision with root package name */
        final List<c<?>> f20590a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        final Deque<c<?>> f20591b = new ArrayDeque();

        /* renamed from: c  reason: collision with root package name */
        boolean f20592c;

        d() {
        }

        <T> void a(f<T> fVar) {
            this.f20591b.getLast().f20589d = fVar;
        }

        IllegalArgumentException b(IllegalArgumentException illegalArgumentException) {
            if (this.f20592c) {
                return illegalArgumentException;
            }
            this.f20592c = true;
            if (this.f20591b.size() == 1 && this.f20591b.getFirst().f20587b == null) {
                return illegalArgumentException;
            }
            StringBuilder sb2 = new StringBuilder(illegalArgumentException.getMessage());
            Iterator<c<?>> descendingIterator = this.f20591b.descendingIterator();
            while (descendingIterator.hasNext()) {
                c<?> next = descendingIterator.next();
                sb2.append("\nfor ");
                sb2.append(next.f20586a);
                if (next.f20587b != null) {
                    sb2.append(' ');
                    sb2.append(next.f20587b);
                }
            }
            return new IllegalArgumentException(sb2.toString(), illegalArgumentException);
        }

        void c(boolean z11) {
            this.f20591b.removeLast();
            if (this.f20591b.isEmpty()) {
                p.this.f20580b.remove();
                if (z11) {
                    synchronized (p.this.f20581c) {
                        int size = this.f20590a.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            c<?> cVar = this.f20590a.get(i11);
                            f<T> fVar = (f) p.this.f20581c.put(cVar.f20588c, cVar.f20589d);
                            if (fVar != 0) {
                                cVar.f20589d = fVar;
                                p.this.f20581c.put(cVar.f20588c, fVar);
                            }
                        }
                    }
                }
            }
        }

        <T> f<T> d(Type type, String str, Object obj) {
            int size = this.f20590a.size();
            for (int i11 = 0; i11 < size; i11++) {
                c<?> cVar = this.f20590a.get(i11);
                if (cVar.f20588c.equals(obj)) {
                    this.f20591b.add(cVar);
                    f<T> fVar = (f<T>) cVar.f20589d;
                    return fVar != null ? fVar : cVar;
                }
            }
            c<?> cVar2 = new c<>(type, str, obj);
            this.f20590a.add(cVar2);
            this.f20591b.add(cVar2);
            return null;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        f20578d = arrayList;
        arrayList.add(q.f20594a);
        arrayList.add(e.f20506b);
        arrayList.add(o.f20575c);
        arrayList.add(com.squareup.moshi.b.f20486c);
        arrayList.add(com.squareup.moshi.d.f20499d);
    }

    p(b bVar) {
        int size = bVar.f20584a.size();
        List<f.d> list = f20578d;
        ArrayList arrayList = new ArrayList(size + list.size());
        arrayList.addAll(bVar.f20584a);
        arrayList.addAll(list);
        this.f20579a = Collections.unmodifiableList(arrayList);
    }

    private Object g(Type type, Set<? extends Annotation> set) {
        return set.isEmpty() ? type : Arrays.asList(type, set);
    }

    static <T> f.d h(Type type, f<T> fVar) {
        if (type != null) {
            if (fVar != null) {
                return new a(type, fVar);
            }
            throw new IllegalArgumentException("jsonAdapter == null");
        }
        throw new IllegalArgumentException("type == null");
    }

    public <T> f<T> c(Class<T> cls) {
        return e(cls, kr.b.f35689a);
    }

    public <T> f<T> d(Type type) {
        return e(type, kr.b.f35689a);
    }

    public <T> f<T> e(Type type, Set<? extends Annotation> set) {
        return f(type, set, null);
    }

    public <T> f<T> f(Type type, Set<? extends Annotation> set, String str) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(set, "annotations == null");
        Type n11 = kr.b.n(kr.b.a(type));
        Object g11 = g(n11, set);
        synchronized (this.f20581c) {
            f<T> fVar = (f<T>) this.f20581c.get(g11);
            if (fVar != null) {
                return fVar;
            }
            d dVar = this.f20580b.get();
            if (dVar == null) {
                dVar = new d();
                this.f20580b.set(dVar);
            }
            f<T> d11 = dVar.d(n11, str, g11);
            try {
                if (d11 != null) {
                    return d11;
                }
                try {
                    int size = this.f20579a.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        f<T> fVar2 = (f<T>) this.f20579a.get(i11).a(n11, set, this);
                        if (fVar2 != null) {
                            dVar.a(fVar2);
                            dVar.c(true);
                            return fVar2;
                        }
                    }
                    throw new IllegalArgumentException("No JsonAdapter for " + kr.b.s(n11, set));
                } catch (IllegalArgumentException e11) {
                    throw dVar.b(e11);
                }
            } finally {
                dVar.c(false);
            }
        }
    }

    public <T> f<T> i(f.d dVar, Type type, Set<? extends Annotation> set) {
        Objects.requireNonNull(set, "annotations == null");
        Type n11 = kr.b.n(kr.b.a(type));
        int indexOf = this.f20579a.indexOf(dVar);
        if (indexOf != -1) {
            int size = this.f20579a.size();
            for (int i11 = indexOf + 1; i11 < size; i11++) {
                f<T> fVar = (f<T>) this.f20579a.get(i11).a(n11, set, this);
                if (fVar != null) {
                    return fVar;
                }
            }
            throw new IllegalArgumentException("No next JsonAdapter for " + kr.b.s(n11, set));
        }
        throw new IllegalArgumentException("Unable to skip past unknown factory " + dVar);
    }
}