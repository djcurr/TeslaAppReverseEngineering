package com.google.common.collect;

import com.google.common.collect.b0.h;
import com.google.common.collect.b0.m;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class b0<K, V, E extends h<K, V, E>, S extends m<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {

    /* renamed from: j  reason: collision with root package name */
    static final z<Object, Object, d> f15969j = new a();

    /* renamed from: a  reason: collision with root package name */
    final transient int f15970a;

    /* renamed from: b  reason: collision with root package name */
    final transient int f15971b;

    /* renamed from: c  reason: collision with root package name */
    final transient m<K, V, E, S>[] f15972c;

    /* renamed from: d  reason: collision with root package name */
    final int f15973d;

    /* renamed from: e  reason: collision with root package name */
    final com.google.common.base.j<Object> f15974e;

    /* renamed from: f  reason: collision with root package name */
    final transient i<K, V, E, S> f15975f;

    /* renamed from: g  reason: collision with root package name */
    transient Set<K> f15976g;

    /* renamed from: h  reason: collision with root package name */
    transient Collection<V> f15977h;

    /* renamed from: i  reason: collision with root package name */
    transient Set<Map.Entry<K, V>> f15978i;

    /* loaded from: classes3.dex */
    class a implements z<Object, Object, d> {
        a() {
        }

        @Override // com.google.common.collect.b0.z
        /* renamed from: c */
        public z<Object, Object, d> b(ReferenceQueue<Object> referenceQueue, d dVar) {
            return this;
        }

        @Override // com.google.common.collect.b0.z
        public void clear() {
        }

        @Override // com.google.common.collect.b0.z
        /* renamed from: d */
        public d a() {
            return null;
        }

        @Override // com.google.common.collect.b0.z
        public Object get() {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a0<K, V, E extends h<K, V, E>> extends WeakReference<V> implements z<K, V, E> {

        /* renamed from: a  reason: collision with root package name */
        final E f15979a;

        a0(ReferenceQueue<V> referenceQueue, V v11, E e11) {
            super(v11, referenceQueue);
            this.f15979a = e11;
        }

        @Override // com.google.common.collect.b0.z
        public E a() {
            return this.f15979a;
        }

        @Override // com.google.common.collect.b0.z
        public z<K, V, E> b(ReferenceQueue<V> referenceQueue, E e11) {
            return new a0(referenceQueue, get(), e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static abstract class b<K, V, E extends h<K, V, E>> implements h<K, V, E> {

        /* renamed from: a  reason: collision with root package name */
        final K f15980a;

        /* renamed from: b  reason: collision with root package name */
        final int f15981b;

        /* renamed from: c  reason: collision with root package name */
        final E f15982c;

        b(K k11, int i11, E e11) {
            this.f15980a = k11;
            this.f15981b = i11;
            this.f15982c = e11;
        }

        @Override // com.google.common.collect.b0.h
        public int b() {
            return this.f15981b;
        }

        @Override // com.google.common.collect.b0.h
        public E c() {
            return this.f15982c;
        }

        @Override // com.google.common.collect.b0.h
        public K getKey() {
            return this.f15980a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.collect.b0$b0  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public final class C0291b0 extends com.google.common.collect.d<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final K f15983a;

        /* renamed from: b  reason: collision with root package name */
        V f15984b;

        C0291b0(K k11, V v11) {
            this.f15983a = k11;
            this.f15984b = v11;
        }

        @Override // com.google.common.collect.d, java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return this.f15983a.equals(entry.getKey()) && this.f15984b.equals(entry.getValue());
            }
            return false;
        }

        @Override // com.google.common.collect.d, java.util.Map.Entry
        public K getKey() {
            return this.f15983a;
        }

        @Override // com.google.common.collect.d, java.util.Map.Entry
        public V getValue() {
            return this.f15984b;
        }

        @Override // com.google.common.collect.d, java.util.Map.Entry
        public int hashCode() {
            return this.f15983a.hashCode() ^ this.f15984b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v11) {
            V v12 = (V) b0.this.put(this.f15983a, v11);
            this.f15984b = v11;
            return v12;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static abstract class c<K, V, E extends h<K, V, E>> extends WeakReference<K> implements h<K, V, E> {

        /* renamed from: a  reason: collision with root package name */
        final int f15986a;

        /* renamed from: b  reason: collision with root package name */
        final E f15987b;

        c(ReferenceQueue<K> referenceQueue, K k11, int i11, E e11) {
            super(k11, referenceQueue);
            this.f15986a = i11;
            this.f15987b = e11;
        }

        @Override // com.google.common.collect.b0.h
        public int b() {
            return this.f15986a;
        }

        @Override // com.google.common.collect.b0.h
        public E c() {
            return this.f15987b;
        }

        @Override // com.google.common.collect.b0.h
        public K getKey() {
            return get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class d implements h<Object, Object, d> {
        private d() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.b0.h
        public int b() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.b0.h
        /* renamed from: d */
        public d c() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.b0.h
        public Object getKey() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.b0.h
        public Object getValue() {
            throw new AssertionError();
        }
    }

    /* loaded from: classes3.dex */
    final class e extends b0<K, V, E, S>.g<Map.Entry<K, V>> {
        e(b0 b0Var) {
            super();
        }

        @Override // java.util.Iterator
        /* renamed from: f */
        public Map.Entry<K, V> next() {
            return c();
        }
    }

    /* loaded from: classes3.dex */
    final class f extends l<Map.Entry<K, V>> {
        f() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            b0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = b0.this.get(key)) != null && b0.this.o().d(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return b0.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new e(b0.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && b0.this.remove(key, entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return b0.this.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public abstract class g<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        int f15989a;

        /* renamed from: b  reason: collision with root package name */
        int f15990b = -1;

        /* renamed from: c  reason: collision with root package name */
        m<K, V, E, S> f15991c;

        /* renamed from: d  reason: collision with root package name */
        AtomicReferenceArray<E> f15992d;

        /* renamed from: e  reason: collision with root package name */
        E f15993e;

        /* renamed from: f  reason: collision with root package name */
        b0<K, V, E, S>.C0291b0 f15994f;

        /* renamed from: g  reason: collision with root package name */
        b0<K, V, E, S>.C0291b0 f15995g;

        g() {
            this.f15989a = b0.this.f15972c.length - 1;
            a();
        }

        final void a() {
            this.f15994f = null;
            if (d() || e()) {
                return;
            }
            while (true) {
                int i11 = this.f15989a;
                if (i11 < 0) {
                    return;
                }
                m<K, V, E, S>[] mVarArr = b0.this.f15972c;
                this.f15989a = i11 - 1;
                m<K, V, E, S> mVar = mVarArr[i11];
                this.f15991c = mVar;
                if (mVar.f15999b != 0) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f15991c.f16002e;
                    this.f15992d = atomicReferenceArray;
                    this.f15990b = atomicReferenceArray.length() - 1;
                    if (e()) {
                        return;
                    }
                }
            }
        }

        boolean b(E e11) {
            boolean z11;
            try {
                Object key = e11.getKey();
                Object e12 = b0.this.e(e11);
                if (e12 != null) {
                    this.f15994f = new C0291b0(key, e12);
                    z11 = true;
                } else {
                    z11 = false;
                }
                return z11;
            } finally {
                this.f15991c.r();
            }
        }

        b0<K, V, E, S>.C0291b0 c() {
            b0<K, V, E, S>.C0291b0 c0291b0 = this.f15994f;
            if (c0291b0 != null) {
                this.f15995g = c0291b0;
                a();
                return this.f15995g;
            }
            throw new NoSuchElementException();
        }

        boolean d() {
            E e11 = this.f15993e;
            if (e11 == null) {
                return false;
            }
            while (true) {
                this.f15993e = (E) e11.c();
                E e12 = this.f15993e;
                if (e12 == null) {
                    return false;
                }
                if (b(e12)) {
                    return true;
                }
                e11 = this.f15993e;
            }
        }

        boolean e() {
            while (true) {
                int i11 = this.f15990b;
                if (i11 < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f15992d;
                this.f15990b = i11 - 1;
                E e11 = atomicReferenceArray.get(i11);
                this.f15993e = e11;
                if (e11 != null && (b(e11) || d())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f15994f != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            com.google.common.collect.h.c(this.f15995g != null);
            b0.this.remove(this.f15995g.getKey());
            this.f15995g = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface h<K, V, E extends h<K, V, E>> {
        int b();

        E c();

        K getKey();

        V getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface i<K, V, E extends h<K, V, E>, S extends m<K, V, E, S>> {
        E a(S s11, E e11, E e12);

        n b();

        void c(S s11, E e11, V v11);

        E d(S s11, K k11, int i11, E e11);

        S e(b0<K, V, E, S> b0Var, int i11, int i12);
    }

    /* loaded from: classes3.dex */
    final class j extends b0<K, V, E, S>.g<K> {
        j(b0 b0Var) {
            super();
        }

        @Override // java.util.Iterator
        public K next() {
            return c().getKey();
        }
    }

    /* loaded from: classes3.dex */
    final class k extends l<K> {
        k() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            b0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return b0.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return b0.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new j(b0.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return b0.this.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return b0.this.size();
        }
    }

    /* loaded from: classes3.dex */
    private static abstract class l<E> extends AbstractSet<E> {
        private l() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return b0.m(this).toArray();
        }

        /* synthetic */ l(a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) b0.m(this).toArray(tArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static abstract class m<K, V, E extends h<K, V, E>, S extends m<K, V, E, S>> extends ReentrantLock {

        /* renamed from: a  reason: collision with root package name */
        final b0<K, V, E, S> f15998a;

        /* renamed from: b  reason: collision with root package name */
        volatile int f15999b;

        /* renamed from: c  reason: collision with root package name */
        int f16000c;

        /* renamed from: d  reason: collision with root package name */
        int f16001d;

        /* renamed from: e  reason: collision with root package name */
        volatile AtomicReferenceArray<E> f16002e;

        /* renamed from: f  reason: collision with root package name */
        final int f16003f;

        /* renamed from: g  reason: collision with root package name */
        final AtomicInteger f16004g = new AtomicInteger();

        m(b0<K, V, E, S> b0Var, int i11, int i12) {
            this.f15998a = b0Var;
            this.f16003f = i12;
            m(q(i11));
        }

        static <K, V, E extends h<K, V, E>> boolean n(E e11) {
            return e11.getValue() == null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        boolean A(K k11, int i11, V v11, V v12) {
            lock();
            try {
                s();
                AtomicReferenceArray<E> atomicReferenceArray = this.f16002e;
                int length = (atomicReferenceArray.length() - 1) & i11;
                E e11 = atomicReferenceArray.get(length);
                for (h hVar = e11; hVar != null; hVar = hVar.c()) {
                    Object key = hVar.getKey();
                    if (hVar.b() == i11 && key != null && this.f15998a.f15974e.d(k11, key)) {
                        Object value = hVar.getValue();
                        if (value == null) {
                            if (n(hVar)) {
                                this.f16000c++;
                                atomicReferenceArray.set(length, y(e11, hVar));
                                this.f15999b--;
                            }
                            return false;
                        } else if (this.f15998a.o().d(v11, value)) {
                            this.f16000c++;
                            E(hVar, v12);
                            return true;
                        } else {
                            return false;
                        }
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        void B() {
            C();
        }

        void C() {
            if (tryLock()) {
                try {
                    p();
                    this.f16004g.set(0);
                } finally {
                    unlock();
                }
            }
        }

        abstract S D();

        void E(E e11, V v11) {
            this.f15998a.f15975f.c(D(), e11, v11);
        }

        void F() {
            if (tryLock()) {
                try {
                    p();
                } finally {
                    unlock();
                }
            }
        }

        void a() {
            if (this.f15999b != 0) {
                lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f16002e;
                    for (int i11 = 0; i11 < atomicReferenceArray.length(); i11++) {
                        atomicReferenceArray.set(i11, null);
                    }
                    o();
                    this.f16004g.set(0);
                    this.f16000c++;
                    this.f15999b = 0;
                } finally {
                    unlock();
                }
            }
        }

        <T> void b(ReferenceQueue<T> referenceQueue) {
            do {
            } while (referenceQueue.poll() != null);
        }

        boolean c(Object obj, int i11) {
            try {
                boolean z11 = false;
                if (this.f15999b != 0) {
                    E k11 = k(obj, i11);
                    if (k11 != null) {
                        if (k11.getValue() != null) {
                            z11 = true;
                        }
                    }
                    return z11;
                }
                return false;
            } finally {
                r();
            }
        }

        E d(E e11, E e12) {
            return this.f15998a.f15975f.a(D(), e11, e12);
        }

        /* JADX WARN: Multi-variable type inference failed */
        void e(ReferenceQueue<K> referenceQueue) {
            int i11 = 0;
            do {
                Reference<? extends K> poll = referenceQueue.poll();
                if (poll == null) {
                    return;
                }
                this.f15998a.i((h) poll);
                i11++;
            } while (i11 != 16);
        }

        void f(ReferenceQueue<V> referenceQueue) {
            int i11 = 0;
            do {
                Reference<? extends V> poll = referenceQueue.poll();
                if (poll == null) {
                    return;
                }
                this.f15998a.j((z) poll);
                i11++;
            } while (i11 != 16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        void g() {
            AtomicReferenceArray<E> atomicReferenceArray = this.f16002e;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i11 = this.f15999b;
            AtomicReferenceArray<E> atomicReferenceArray2 = (AtomicReferenceArray<E>) q(length << 1);
            this.f16001d = (atomicReferenceArray2.length() * 3) / 4;
            int length2 = atomicReferenceArray2.length() - 1;
            for (int i12 = 0; i12 < length; i12++) {
                E e11 = atomicReferenceArray.get(i12);
                if (e11 != null) {
                    h c11 = e11.c();
                    int b11 = e11.b() & length2;
                    if (c11 == null) {
                        atomicReferenceArray2.set(b11, e11);
                    } else {
                        h hVar = e11;
                        while (c11 != null) {
                            int b12 = c11.b() & length2;
                            if (b12 != b11) {
                                hVar = c11;
                                b11 = b12;
                            }
                            c11 = c11.c();
                        }
                        atomicReferenceArray2.set(b11, hVar);
                        while (e11 != hVar) {
                            int b13 = e11.b() & length2;
                            h d11 = d(e11, (h) atomicReferenceArray2.get(b13));
                            if (d11 != null) {
                                atomicReferenceArray2.set(b13, d11);
                            } else {
                                i11--;
                            }
                            e11 = e11.c();
                        }
                    }
                }
            }
            this.f16002e = atomicReferenceArray2;
            this.f15999b = i11;
        }

        V h(Object obj, int i11) {
            try {
                E k11 = k(obj, i11);
                if (k11 == null) {
                    return null;
                }
                V v11 = (V) k11.getValue();
                if (v11 == null) {
                    F();
                }
                return v11;
            } finally {
                r();
            }
        }

        E i(Object obj, int i11) {
            if (this.f15999b != 0) {
                for (E j11 = j(i11); j11 != null; j11 = (E) j11.c()) {
                    if (j11.b() == i11) {
                        Object key = j11.getKey();
                        if (key == null) {
                            F();
                        } else if (this.f15998a.f15974e.d(obj, key)) {
                            return j11;
                        }
                    }
                }
                return null;
            }
            return null;
        }

        E j(int i11) {
            AtomicReferenceArray<E> atomicReferenceArray = this.f16002e;
            return atomicReferenceArray.get(i11 & (atomicReferenceArray.length() - 1));
        }

        E k(Object obj, int i11) {
            return i(obj, i11);
        }

        V l(E e11) {
            if (e11.getKey() == null) {
                F();
                return null;
            }
            V v11 = (V) e11.getValue();
            if (v11 == null) {
                F();
                return null;
            }
            return v11;
        }

        void m(AtomicReferenceArray<E> atomicReferenceArray) {
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.f16001d = length;
            if (length == this.f16003f) {
                this.f16001d = length + 1;
            }
            this.f16002e = atomicReferenceArray;
        }

        void o() {
        }

        void p() {
        }

        AtomicReferenceArray<E> q(int i11) {
            return new AtomicReferenceArray<>(i11);
        }

        void r() {
            if ((this.f16004g.incrementAndGet() & 63) == 0) {
                B();
            }
        }

        void s() {
            C();
        }

        /* JADX WARN: Multi-variable type inference failed */
        V t(K k11, int i11, V v11, boolean z11) {
            lock();
            try {
                s();
                int i12 = this.f15999b + 1;
                if (i12 > this.f16001d) {
                    g();
                    i12 = this.f15999b + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f16002e;
                int length = (atomicReferenceArray.length() - 1) & i11;
                E e11 = atomicReferenceArray.get(length);
                for (h hVar = e11; hVar != null; hVar = hVar.c()) {
                    Object key = hVar.getKey();
                    if (hVar.b() == i11 && key != null && this.f15998a.f15974e.d(k11, key)) {
                        V v12 = (V) hVar.getValue();
                        if (v12 == null) {
                            this.f16000c++;
                            E(hVar, v11);
                            this.f15999b = this.f15999b;
                            return null;
                        } else if (z11) {
                            return v12;
                        } else {
                            this.f16000c++;
                            E(hVar, v11);
                            return v12;
                        }
                    }
                }
                this.f16000c++;
                E d11 = this.f15998a.f15975f.d(D(), k11, i11, e11);
                E(d11, v11);
                atomicReferenceArray.set(length, d11);
                this.f15999b = i12;
                return null;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        boolean u(E e11, int i11) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f16002e;
                int length = i11 & (atomicReferenceArray.length() - 1);
                E e12 = atomicReferenceArray.get(length);
                for (h hVar = e12; hVar != null; hVar = hVar.c()) {
                    if (hVar == e11) {
                        this.f16000c++;
                        atomicReferenceArray.set(length, y(e12, hVar));
                        this.f15999b--;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        boolean v(K k11, int i11, z<K, V, E> zVar) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f16002e;
                int length = (atomicReferenceArray.length() - 1) & i11;
                E e11 = atomicReferenceArray.get(length);
                for (h hVar = e11; hVar != null; hVar = hVar.c()) {
                    Object key = hVar.getKey();
                    if (hVar.b() == i11 && key != null && this.f15998a.f15974e.d(k11, key)) {
                        if (((y) hVar).a() == zVar) {
                            this.f16000c++;
                            atomicReferenceArray.set(length, y(e11, hVar));
                            this.f15999b--;
                            return true;
                        }
                        return false;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        V w(Object obj, int i11) {
            lock();
            try {
                s();
                AtomicReferenceArray<E> atomicReferenceArray = this.f16002e;
                int length = (atomicReferenceArray.length() - 1) & i11;
                E e11 = atomicReferenceArray.get(length);
                for (h hVar = e11; hVar != null; hVar = hVar.c()) {
                    Object key = hVar.getKey();
                    if (hVar.b() == i11 && key != null && this.f15998a.f15974e.d(obj, key)) {
                        V v11 = (V) hVar.getValue();
                        if (v11 == null && !n(hVar)) {
                            return null;
                        }
                        this.f16000c++;
                        atomicReferenceArray.set(length, y(e11, hVar));
                        this.f15999b--;
                        return v11;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
            if (r8.f15998a.o().d(r11, r4.getValue()) == false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
            r5 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
            if (n(r4) == false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
            r8.f16000c++;
            r0.set(r1, y(r3, r4));
            r8.f15999b--;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
            return false;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        boolean x(java.lang.Object r9, int r10, java.lang.Object r11) {
            /*
                r8 = this;
                r8.lock()
                r8.s()     // Catch: java.lang.Throwable -> L69
                java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.b0$h<K, V, E>> r0 = r8.f16002e     // Catch: java.lang.Throwable -> L69
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L69
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r10
                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L69
                com.google.common.collect.b0$h r3 = (com.google.common.collect.b0.h) r3     // Catch: java.lang.Throwable -> L69
                r4 = r3
            L16:
                r5 = 0
                if (r4 == 0) goto L65
                java.lang.Object r6 = r4.getKey()     // Catch: java.lang.Throwable -> L69
                int r7 = r4.b()     // Catch: java.lang.Throwable -> L69
                if (r7 != r10) goto L60
                if (r6 == 0) goto L60
                com.google.common.collect.b0<K, V, E extends com.google.common.collect.b0$h<K, V, E>, S extends com.google.common.collect.b0$m<K, V, E, S>> r7 = r8.f15998a     // Catch: java.lang.Throwable -> L69
                com.google.common.base.j<java.lang.Object> r7 = r7.f15974e     // Catch: java.lang.Throwable -> L69
                boolean r6 = r7.d(r9, r6)     // Catch: java.lang.Throwable -> L69
                if (r6 == 0) goto L60
                java.lang.Object r9 = r4.getValue()     // Catch: java.lang.Throwable -> L69
                com.google.common.collect.b0<K, V, E extends com.google.common.collect.b0$h<K, V, E>, S extends com.google.common.collect.b0$m<K, V, E, S>> r10 = r8.f15998a     // Catch: java.lang.Throwable -> L69
                com.google.common.base.j r10 = r10.o()     // Catch: java.lang.Throwable -> L69
                boolean r9 = r10.d(r11, r9)     // Catch: java.lang.Throwable -> L69
                if (r9 == 0) goto L41
                r5 = r2
                goto L47
            L41:
                boolean r9 = n(r4)     // Catch: java.lang.Throwable -> L69
                if (r9 == 0) goto L5c
            L47:
                int r9 = r8.f16000c     // Catch: java.lang.Throwable -> L69
                int r9 = r9 + r2
                r8.f16000c = r9     // Catch: java.lang.Throwable -> L69
                com.google.common.collect.b0$h r9 = r8.y(r3, r4)     // Catch: java.lang.Throwable -> L69
                int r10 = r8.f15999b     // Catch: java.lang.Throwable -> L69
                int r10 = r10 - r2
                r0.set(r1, r9)     // Catch: java.lang.Throwable -> L69
                r8.f15999b = r10     // Catch: java.lang.Throwable -> L69
                r8.unlock()
                return r5
            L5c:
                r8.unlock()
                return r5
            L60:
                com.google.common.collect.b0$h r4 = r4.c()     // Catch: java.lang.Throwable -> L69
                goto L16
            L65:
                r8.unlock()
                return r5
            L69:
                r9 = move-exception
                r8.unlock()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.b0.m.x(java.lang.Object, int, java.lang.Object):boolean");
        }

        E y(E e11, E e12) {
            int i11 = this.f15999b;
            E e13 = (E) e12.c();
            while (e11 != e12) {
                E d11 = d(e11, e13);
                if (d11 != null) {
                    e13 = d11;
                } else {
                    i11--;
                }
                e11 = (E) e11.c();
            }
            this.f15999b = i11;
            return e13;
        }

        /* JADX WARN: Multi-variable type inference failed */
        V z(K k11, int i11, V v11) {
            lock();
            try {
                s();
                AtomicReferenceArray<E> atomicReferenceArray = this.f16002e;
                int length = (atomicReferenceArray.length() - 1) & i11;
                E e11 = atomicReferenceArray.get(length);
                for (h hVar = e11; hVar != null; hVar = hVar.c()) {
                    Object key = hVar.getKey();
                    if (hVar.b() == i11 && key != null && this.f15998a.f15974e.d(k11, key)) {
                        V v12 = (V) hVar.getValue();
                        if (v12 == null) {
                            if (n(hVar)) {
                                this.f16000c++;
                                atomicReferenceArray.set(length, y(e11, hVar));
                                this.f15999b--;
                            }
                            return null;
                        }
                        this.f16000c++;
                        E(hVar, v11);
                        return v12;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static abstract class n {
        public static final n STRONG = new a("STRONG", 0);
        public static final n WEAK = new b("WEAK", 1);
        private static final /* synthetic */ n[] $VALUES = $values();

        /* loaded from: classes3.dex */
        enum a extends n {
            a(String str, int i11) {
                super(str, i11, null);
            }

            @Override // com.google.common.collect.b0.n
            com.google.common.base.j<Object> defaultEquivalence() {
                return com.google.common.base.j.c();
            }
        }

        /* loaded from: classes3.dex */
        enum b extends n {
            b(String str, int i11) {
                super(str, i11, null);
            }

            @Override // com.google.common.collect.b0.n
            com.google.common.base.j<Object> defaultEquivalence() {
                return com.google.common.base.j.f();
            }
        }

        private static /* synthetic */ n[] $values() {
            return new n[]{STRONG, WEAK};
        }

        private n(String str, int i11) {
        }

        public static n valueOf(String str) {
            return (n) Enum.valueOf(n.class, str);
        }

        public static n[] values() {
            return (n[]) $VALUES.clone();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract com.google.common.base.j<Object> defaultEquivalence();

        /* synthetic */ n(String str, int i11, a aVar) {
            this(str, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class o<K, V> extends b<K, V, o<K, V>> {

        /* renamed from: d  reason: collision with root package name */
        private volatile V f16005d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class a<K, V> implements i<K, V, o<K, V>, p<K, V>> {

            /* renamed from: a  reason: collision with root package name */
            private static final a<?, ?> f16006a = new a<>();

            a() {
            }

            static <K, V> a<K, V> g() {
                return (a<K, V>) f16006a;
            }

            @Override // com.google.common.collect.b0.i
            public n b() {
                return n.STRONG;
            }

            @Override // com.google.common.collect.b0.i
            /* renamed from: f */
            public o<K, V> a(p<K, V> pVar, o<K, V> oVar, o<K, V> oVar2) {
                return oVar.d(oVar2);
            }

            @Override // com.google.common.collect.b0.i
            /* renamed from: h */
            public o<K, V> d(p<K, V> pVar, K k11, int i11, o<K, V> oVar) {
                return new o<>(k11, i11, oVar);
            }

            @Override // com.google.common.collect.b0.i
            /* renamed from: i */
            public p<K, V> e(b0<K, V, o<K, V>, p<K, V>> b0Var, int i11, int i12) {
                return new p<>(b0Var, i11, i12);
            }

            @Override // com.google.common.collect.b0.i
            /* renamed from: j */
            public void c(p<K, V> pVar, o<K, V> oVar, V v11) {
                oVar.e(v11);
            }
        }

        o(K k11, int i11, o<K, V> oVar) {
            super(k11, i11, oVar);
            this.f16005d = null;
        }

        o<K, V> d(o<K, V> oVar) {
            o<K, V> oVar2 = new o<>(this.f15980a, this.f15981b, oVar);
            oVar2.f16005d = this.f16005d;
            return oVar2;
        }

        void e(V v11) {
            this.f16005d = v11;
        }

        @Override // com.google.common.collect.b0.h
        public V getValue() {
            return this.f16005d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class p<K, V> extends m<K, V, o<K, V>, p<K, V>> {
        p(b0<K, V, o<K, V>, p<K, V>> b0Var, int i11, int i12) {
            super(b0Var, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.b0.m
        /* renamed from: G */
        public p<K, V> D() {
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class q<K, V> extends b<K, V, q<K, V>> implements y<K, V, q<K, V>> {

        /* renamed from: d  reason: collision with root package name */
        private volatile z<K, V, q<K, V>> f16007d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class a<K, V> implements i<K, V, q<K, V>, r<K, V>> {

            /* renamed from: a  reason: collision with root package name */
            private static final a<?, ?> f16008a = new a<>();

            a() {
            }

            static <K, V> a<K, V> g() {
                return (a<K, V>) f16008a;
            }

            @Override // com.google.common.collect.b0.i
            public n b() {
                return n.WEAK;
            }

            @Override // com.google.common.collect.b0.i
            /* renamed from: f */
            public q<K, V> a(r<K, V> rVar, q<K, V> qVar, q<K, V> qVar2) {
                if (m.n(qVar)) {
                    return null;
                }
                return qVar.d(((r) rVar).f16009h, qVar2);
            }

            @Override // com.google.common.collect.b0.i
            /* renamed from: h */
            public q<K, V> d(r<K, V> rVar, K k11, int i11, q<K, V> qVar) {
                return new q<>(k11, i11, qVar);
            }

            @Override // com.google.common.collect.b0.i
            /* renamed from: i */
            public r<K, V> e(b0<K, V, q<K, V>, r<K, V>> b0Var, int i11, int i12) {
                return new r<>(b0Var, i11, i12);
            }

            @Override // com.google.common.collect.b0.i
            /* renamed from: j */
            public void c(r<K, V> rVar, q<K, V> qVar, V v11) {
                qVar.e(v11, ((r) rVar).f16009h);
            }
        }

        q(K k11, int i11, q<K, V> qVar) {
            super(k11, i11, qVar);
            this.f16007d = b0.n();
        }

        @Override // com.google.common.collect.b0.y
        public z<K, V, q<K, V>> a() {
            return this.f16007d;
        }

        q<K, V> d(ReferenceQueue<V> referenceQueue, q<K, V> qVar) {
            q<K, V> qVar2 = new q<>(this.f15980a, this.f15981b, qVar);
            qVar2.f16007d = this.f16007d.b(referenceQueue, qVar2);
            return qVar2;
        }

        void e(V v11, ReferenceQueue<V> referenceQueue) {
            z<K, V, q<K, V>> zVar = this.f16007d;
            this.f16007d = new a0(referenceQueue, v11, this);
            zVar.clear();
        }

        @Override // com.google.common.collect.b0.h
        public V getValue() {
            return this.f16007d.get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class r<K, V> extends m<K, V, q<K, V>, r<K, V>> {

        /* renamed from: h  reason: collision with root package name */
        private final ReferenceQueue<V> f16009h;

        r(b0<K, V, q<K, V>, r<K, V>> b0Var, int i11, int i12) {
            super(b0Var, i11, i12);
            this.f16009h = new ReferenceQueue<>();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.b0.m
        /* renamed from: H */
        public r<K, V> D() {
            return this;
        }

        @Override // com.google.common.collect.b0.m
        void o() {
            b((ReferenceQueue<V>) this.f16009h);
        }

        @Override // com.google.common.collect.b0.m
        void p() {
            f(this.f16009h);
        }
    }

    /* loaded from: classes3.dex */
    final class s extends b0<K, V, E, S>.g<V> {
        s(b0 b0Var) {
            super();
        }

        @Override // java.util.Iterator
        public V next() {
            return c().getValue();
        }
    }

    /* loaded from: classes3.dex */
    final class t extends AbstractCollection<V> {
        t() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            b0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return b0.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return b0.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new s(b0.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return b0.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return b0.m(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) b0.m(this).toArray(tArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class u<K, V> extends c<K, V, u<K, V>> {

        /* renamed from: c  reason: collision with root package name */
        private volatile V f16011c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class a<K, V> implements i<K, V, u<K, V>, v<K, V>> {

            /* renamed from: a  reason: collision with root package name */
            private static final a<?, ?> f16012a = new a<>();

            a() {
            }

            static <K, V> a<K, V> g() {
                return (a<K, V>) f16012a;
            }

            @Override // com.google.common.collect.b0.i
            public n b() {
                return n.STRONG;
            }

            @Override // com.google.common.collect.b0.i
            /* renamed from: f */
            public u<K, V> a(v<K, V> vVar, u<K, V> uVar, u<K, V> uVar2) {
                if (uVar.getKey() == null) {
                    return null;
                }
                return uVar.d(((v) vVar).f16013h, uVar2);
            }

            @Override // com.google.common.collect.b0.i
            /* renamed from: h */
            public u<K, V> d(v<K, V> vVar, K k11, int i11, u<K, V> uVar) {
                return new u<>(((v) vVar).f16013h, k11, i11, uVar);
            }

            @Override // com.google.common.collect.b0.i
            /* renamed from: i */
            public v<K, V> e(b0<K, V, u<K, V>, v<K, V>> b0Var, int i11, int i12) {
                return new v<>(b0Var, i11, i12);
            }

            @Override // com.google.common.collect.b0.i
            /* renamed from: j */
            public void c(v<K, V> vVar, u<K, V> uVar, V v11) {
                uVar.e(v11);
            }
        }

        u(ReferenceQueue<K> referenceQueue, K k11, int i11, u<K, V> uVar) {
            super(referenceQueue, k11, i11, uVar);
            this.f16011c = null;
        }

        u<K, V> d(ReferenceQueue<K> referenceQueue, u<K, V> uVar) {
            u<K, V> uVar2 = new u<>(referenceQueue, getKey(), this.f15986a, uVar);
            uVar2.e(this.f16011c);
            return uVar2;
        }

        void e(V v11) {
            this.f16011c = v11;
        }

        @Override // com.google.common.collect.b0.h
        public V getValue() {
            return this.f16011c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class v<K, V> extends m<K, V, u<K, V>, v<K, V>> {

        /* renamed from: h  reason: collision with root package name */
        private final ReferenceQueue<K> f16013h;

        v(b0<K, V, u<K, V>, v<K, V>> b0Var, int i11, int i12) {
            super(b0Var, i11, i12);
            this.f16013h = new ReferenceQueue<>();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.b0.m
        /* renamed from: H */
        public v<K, V> D() {
            return this;
        }

        @Override // com.google.common.collect.b0.m
        void o() {
            b((ReferenceQueue<K>) this.f16013h);
        }

        @Override // com.google.common.collect.b0.m
        void p() {
            e(this.f16013h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class w<K, V> extends c<K, V, w<K, V>> implements y<K, V, w<K, V>> {

        /* renamed from: c  reason: collision with root package name */
        private volatile z<K, V, w<K, V>> f16014c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class a<K, V> implements i<K, V, w<K, V>, x<K, V>> {

            /* renamed from: a  reason: collision with root package name */
            private static final a<?, ?> f16015a = new a<>();

            a() {
            }

            static <K, V> a<K, V> g() {
                return (a<K, V>) f16015a;
            }

            @Override // com.google.common.collect.b0.i
            public n b() {
                return n.WEAK;
            }

            @Override // com.google.common.collect.b0.i
            /* renamed from: f */
            public w<K, V> a(x<K, V> xVar, w<K, V> wVar, w<K, V> wVar2) {
                if (wVar.getKey() == null || m.n(wVar)) {
                    return null;
                }
                return wVar.d(((x) xVar).f16016h, ((x) xVar).f16017i, wVar2);
            }

            @Override // com.google.common.collect.b0.i
            /* renamed from: h */
            public w<K, V> d(x<K, V> xVar, K k11, int i11, w<K, V> wVar) {
                return new w<>(((x) xVar).f16016h, k11, i11, wVar);
            }

            @Override // com.google.common.collect.b0.i
            /* renamed from: i */
            public x<K, V> e(b0<K, V, w<K, V>, x<K, V>> b0Var, int i11, int i12) {
                return new x<>(b0Var, i11, i12);
            }

            @Override // com.google.common.collect.b0.i
            /* renamed from: j */
            public void c(x<K, V> xVar, w<K, V> wVar, V v11) {
                wVar.e(v11, ((x) xVar).f16017i);
            }
        }

        w(ReferenceQueue<K> referenceQueue, K k11, int i11, w<K, V> wVar) {
            super(referenceQueue, k11, i11, wVar);
            this.f16014c = b0.n();
        }

        @Override // com.google.common.collect.b0.y
        public z<K, V, w<K, V>> a() {
            return this.f16014c;
        }

        w<K, V> d(ReferenceQueue<K> referenceQueue, ReferenceQueue<V> referenceQueue2, w<K, V> wVar) {
            w<K, V> wVar2 = new w<>(referenceQueue, getKey(), this.f15986a, wVar);
            wVar2.f16014c = this.f16014c.b(referenceQueue2, wVar2);
            return wVar2;
        }

        void e(V v11, ReferenceQueue<V> referenceQueue) {
            z<K, V, w<K, V>> zVar = this.f16014c;
            this.f16014c = new a0(referenceQueue, v11, this);
            zVar.clear();
        }

        @Override // com.google.common.collect.b0.h
        public V getValue() {
            return this.f16014c.get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class x<K, V> extends m<K, V, w<K, V>, x<K, V>> {

        /* renamed from: h  reason: collision with root package name */
        private final ReferenceQueue<K> f16016h;

        /* renamed from: i  reason: collision with root package name */
        private final ReferenceQueue<V> f16017i;

        x(b0<K, V, w<K, V>, x<K, V>> b0Var, int i11, int i12) {
            super(b0Var, i11, i12);
            this.f16016h = new ReferenceQueue<>();
            this.f16017i = new ReferenceQueue<>();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.b0.m
        /* renamed from: I */
        public x<K, V> D() {
            return this;
        }

        @Override // com.google.common.collect.b0.m
        void o() {
            b((ReferenceQueue<K>) this.f16016h);
        }

        @Override // com.google.common.collect.b0.m
        void p() {
            e(this.f16016h);
            f(this.f16017i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface y<K, V, E extends h<K, V, E>> extends h<K, V, E> {
        z<K, V, E> a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface z<K, V, E extends h<K, V, E>> {
        E a();

        z<K, V, E> b(ReferenceQueue<V> referenceQueue, E e11);

        void clear();

        V get();
    }

    private b0(com.google.common.collect.a0 a0Var, i<K, V, E, S> iVar) {
        this.f15973d = Math.min(a0Var.a(), 65536);
        this.f15974e = a0Var.c();
        this.f15975f = iVar;
        int min = Math.min(a0Var.b(), 1073741824);
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        int i14 = 1;
        while (i14 < this.f15973d) {
            i13++;
            i14 <<= 1;
        }
        this.f15971b = 32 - i13;
        this.f15970a = i14 - 1;
        this.f15972c = h(i14);
        int i15 = min / i14;
        while (i12 < (i14 * i15 < min ? i15 + 1 : i15)) {
            i12 <<= 1;
        }
        while (true) {
            m<K, V, E, S>[] mVarArr = this.f15972c;
            if (i11 >= mVarArr.length) {
                return;
            }
            mVarArr[i11] = c(i12, -1);
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> b0<K, V, ? extends h<K, V, ?>, ?> b(com.google.common.collect.a0 a0Var) {
        n d11 = a0Var.d();
        n nVar = n.STRONG;
        if (d11 == nVar && a0Var.e() == nVar) {
            return new b0<>(a0Var, o.a.g());
        }
        if (a0Var.d() == nVar && a0Var.e() == n.WEAK) {
            return new b0<>(a0Var, q.a.g());
        }
        n d12 = a0Var.d();
        n nVar2 = n.WEAK;
        if (d12 == nVar2 && a0Var.e() == nVar) {
            return new b0<>(a0Var, u.a.g());
        }
        if (a0Var.d() == nVar2 && a0Var.e() == nVar2) {
            return new b0<>(a0Var, w.a.g());
        }
        throw new AssertionError();
    }

    static int k(int i11) {
        int i12 = i11 + ((i11 << 15) ^ (-12931));
        int i13 = i12 ^ (i12 >>> 10);
        int i14 = i13 + (i13 << 3);
        int i15 = i14 ^ (i14 >>> 6);
        int i16 = i15 + (i15 << 2) + (i15 << 14);
        return i16 ^ (i16 >>> 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> ArrayList<E> m(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        com.google.common.collect.x.a(arrayList, collection.iterator());
        return arrayList;
    }

    static <K, V, E extends h<K, V, E>> z<K, V, E> n() {
        return (z<K, V, E>) f15969j;
    }

    m<K, V, E, S> c(int i11, int i12) {
        return (S) this.f15975f.e(this, i11, i12);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (m<K, V, E, S> mVar : this.f15972c) {
            mVar.a();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int f11 = f(obj);
        return l(f11).c(obj, f11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.common.collect.b0$m] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.common.collect.b0$m<K, V, E extends com.google.common.collect.b0$h<K, V, E>, S extends com.google.common.collect.b0$m<K, V, E, S>>[]] */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        boolean z11 = false;
        if (obj == null) {
            return false;
        }
        m<K, V, E, S>[] mVarArr = this.f15972c;
        long j11 = -1;
        int i11 = 0;
        while (i11 < 3) {
            long j12 = 0;
            int length = mVarArr.length;
            for (int i12 = z11; i12 < length; i12++) {
                ?? r11 = mVarArr[i12];
                int i13 = r11.f15999b;
                AtomicReferenceArray<E> atomicReferenceArray = r11.f16002e;
                for (int i14 = z11; i14 < atomicReferenceArray.length(); i14++) {
                    for (E e11 = atomicReferenceArray.get(i14); e11 != null; e11 = e11.c()) {
                        Object l11 = r11.l(e11);
                        if (l11 != null && o().d(obj, l11)) {
                            return true;
                        }
                    }
                }
                j12 += r11.f16000c;
                z11 = false;
            }
            if (j12 == j11) {
                return false;
            }
            i11++;
            j11 = j12;
            z11 = false;
        }
        return z11;
    }

    V e(E e11) {
        if (e11.getKey() == null) {
            return null;
        }
        return (V) e11.getValue();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f15978i;
        if (set != null) {
            return set;
        }
        f fVar = new f();
        this.f15978i = fVar;
        return fVar;
    }

    int f(Object obj) {
        return k(this.f15974e.e(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int f11 = f(obj);
        return l(f11).h(obj, f11);
    }

    final m<K, V, E, S>[] h(int i11) {
        return new m[i11];
    }

    void i(E e11) {
        int b11 = e11.b();
        l(b11).u(e11, b11);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        m<K, V, E, S>[] mVarArr = this.f15972c;
        long j11 = 0;
        for (int i11 = 0; i11 < mVarArr.length; i11++) {
            if (mVarArr[i11].f15999b != 0) {
                return false;
            }
            j11 += mVarArr[i11].f16000c;
        }
        if (j11 != 0) {
            for (int i12 = 0; i12 < mVarArr.length; i12++) {
                if (mVarArr[i12].f15999b != 0) {
                    return false;
                }
                j11 -= mVarArr[i12].f16000c;
            }
            return j11 == 0;
        }
        return true;
    }

    void j(z<K, V, E> zVar) {
        E a11 = zVar.a();
        int b11 = a11.b();
        l(b11).v((K) a11.getKey(), b11, zVar);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f15976g;
        if (set != null) {
            return set;
        }
        k kVar = new k();
        this.f15976g = kVar;
        return kVar;
    }

    m<K, V, E, S> l(int i11) {
        return this.f15972c[(i11 >>> this.f15971b) & this.f15970a];
    }

    com.google.common.base.j<Object> o() {
        return this.f15975f.b().defaultEquivalence();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k11, V v11) {
        com.google.common.base.u.o(k11);
        com.google.common.base.u.o(v11);
        int f11 = f(k11);
        return l(f11).t(k11, f11, v11, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k11, V v11) {
        com.google.common.base.u.o(k11);
        com.google.common.base.u.o(v11);
        int f11 = f(k11);
        return l(f11).t(k11, f11, v11, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int f11 = f(obj);
        return l(f11).w(obj, f11);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k11, V v11, V v12) {
        com.google.common.base.u.o(k11);
        com.google.common.base.u.o(v12);
        if (v11 == null) {
            return false;
        }
        int f11 = f(k11);
        return l(f11).A(k11, f11, v11, v12);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j11 = 0;
        for (m<K, V, E, S> mVar : this.f15972c) {
            j11 += mVar.f15999b;
        }
        return fl.d.j(j11);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f15977h;
        if (collection != null) {
            return collection;
        }
        t tVar = new t();
        this.f15977h = tVar;
        return tVar;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int f11 = f(obj);
        return l(f11).x(obj, f11, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k11, V v11) {
        com.google.common.base.u.o(k11);
        com.google.common.base.u.o(v11);
        int f11 = f(k11);
        return l(f11).z(k11, f11, v11);
    }
}