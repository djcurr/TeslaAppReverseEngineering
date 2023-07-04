package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class x {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes3.dex */
    class a<T> extends v0<T> {

        /* renamed from: a  reason: collision with root package name */
        boolean f16159a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f16160b;

        a(Object obj) {
            this.f16160b = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f16159a;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f16159a) {
                this.f16159a = true;
                return (T) this.f16160b;
            }
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class b<T> extends com.google.common.collect.a<T> {

        /* renamed from: e  reason: collision with root package name */
        static final w0<Object> f16161e = new b(new Object[0], 0, 0, 0);

        /* renamed from: c  reason: collision with root package name */
        private final T[] f16162c;

        /* renamed from: d  reason: collision with root package name */
        private final int f16163d;

        b(T[] tArr, int i11, int i12, int i13) {
            super(i12, i13);
            this.f16162c = tArr;
            this.f16163d = i11;
        }

        @Override // com.google.common.collect.a
        protected T a(int i11) {
            return this.f16162c[this.f16163d + i11];
        }
    }

    /* loaded from: classes3.dex */
    private enum c implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            h.c(false);
        }
    }

    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it2) {
        com.google.common.base.u.o(collection);
        com.google.common.base.u.o(it2);
        boolean z11 = false;
        while (it2.hasNext()) {
            z11 |= collection.add(it2.next());
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Iterator<?> it2) {
        com.google.common.base.u.o(it2);
        while (it2.hasNext()) {
            it2.next();
            it2.remove();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0006  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(java.util.Iterator<?> r3, java.util.Iterator<?> r4) {
        /*
        L0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1d
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.next()
            boolean r0 = com.google.common.base.q.a(r0, r2)
            if (r0 != 0) goto L0
            return r1
        L1d:
            boolean r3 = r4.hasNext()
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.x.c(java.util.Iterator, java.util.Iterator):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> v0<T> d() {
        return e();
    }

    static <T> w0<T> e() {
        return (w0<T>) b.f16161e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> Iterator<T> f() {
        return c.INSTANCE;
    }

    public static <T> T g(Iterator<T> it2) {
        T next;
        do {
            next = it2.next();
        } while (it2.hasNext());
        return next;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T h(Iterator<T> it2) {
        if (it2.hasNext()) {
            T next = it2.next();
            it2.remove();
            return next;
        }
        return null;
    }

    public static boolean i(Iterator<?> it2, Collection<?> collection) {
        com.google.common.base.u.o(collection);
        boolean z11 = false;
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                z11 = true;
            }
        }
        return z11;
    }

    public static <T> v0<T> j(T t11) {
        return new a(t11);
    }

    public static String k(Iterator<?> it2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        boolean z11 = true;
        while (it2.hasNext()) {
            if (!z11) {
                sb2.append(", ");
            }
            z11 = false;
            sb2.append(it2.next());
        }
        sb2.append(']');
        return sb2.toString();
    }
}