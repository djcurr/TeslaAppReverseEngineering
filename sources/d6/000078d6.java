package io.realm;

import io.realm.internal.OsResults;
import io.realm.internal.Table;
import io.realm.internal.UncheckedRow;
import io.realm.internal.core.NativeRealmAny;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class x<E> extends AbstractList<E> implements OrderedRealmCollection<E> {

    /* renamed from: a  reason: collision with root package name */
    public final io.realm.a f31992a;

    /* renamed from: b  reason: collision with root package name */
    final Class<E> f31993b;

    /* renamed from: c  reason: collision with root package name */
    final String f31994c;

    /* renamed from: d  reason: collision with root package name */
    final OsResults f31995d;

    /* renamed from: e  reason: collision with root package name */
    final b<E> f31996e;

    /* loaded from: classes5.dex */
    static class a extends e<Byte> {
        a(io.realm.a aVar, OsResults osResults, Class<Byte> cls, String str) {
            super(aVar, osResults, cls, str);
        }

        @Override // io.realm.x.e, io.realm.x.b
        /* renamed from: e */
        public Byte c(int i11) {
            return Byte.valueOf(((Long) this.f31998b.l(i11)).byteValue());
        }

        @Override // io.realm.x.e, io.realm.x.b
        /* renamed from: f */
        public Byte d(int i11, OsResults osResults) {
            Long l11 = (Long) osResults.l(i11);
            if (l11 == null) {
                return null;
            }
            return Byte.valueOf(l11.byteValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static abstract class b<T> {

        /* renamed from: a  reason: collision with root package name */
        protected final io.realm.a f31997a;

        /* renamed from: b  reason: collision with root package name */
        protected final OsResults f31998b;

        /* renamed from: c  reason: collision with root package name */
        protected final Class<T> f31999c;

        /* renamed from: d  reason: collision with root package name */
        protected final String f32000d;

        b(io.realm.a aVar, OsResults osResults, Class<T> cls, String str) {
            this.f31997a = aVar;
            this.f31998b = osResults;
            this.f31999c = cls;
            this.f32000d = str;
        }

        protected T a(UncheckedRow uncheckedRow, boolean z11, T t11) {
            if (uncheckedRow != null) {
                return (T) this.f31997a.D(this.f31999c, this.f32000d, uncheckedRow);
            }
            if (z11) {
                throw new IndexOutOfBoundsException("No results were found.");
            }
            return t11;
        }

        public abstract T b(boolean z11, T t11);

        public abstract T c(int i11);

        public abstract T d(int i11, OsResults osResults);
    }

    /* loaded from: classes5.dex */
    static class c extends e<Integer> {
        c(io.realm.a aVar, OsResults osResults, Class<Integer> cls, String str) {
            super(aVar, osResults, cls, str);
        }

        @Override // io.realm.x.e, io.realm.x.b
        /* renamed from: e */
        public Integer c(int i11) {
            return Integer.valueOf(((Long) this.f31998b.l(i11)).intValue());
        }

        @Override // io.realm.x.e, io.realm.x.b
        /* renamed from: f */
        public Integer d(int i11, OsResults osResults) {
            Long l11 = (Long) osResults.l(i11);
            if (l11 == null) {
                return null;
            }
            return Integer.valueOf(l11.intValue());
        }
    }

    /* loaded from: classes5.dex */
    static class d<T> extends b<T> {
        d(io.realm.a aVar, OsResults osResults, Class<T> cls, String str) {
            super(aVar, osResults, cls, str);
        }

        @Override // io.realm.x.b
        public T b(boolean z11, T t11) {
            return a(this.f31998b.h(), z11, t11);
        }

        @Override // io.realm.x.b
        public T c(int i11) {
            return (T) this.f31997a.D(this.f31999c, this.f32000d, this.f31998b.k(i11));
        }

        @Override // io.realm.x.b
        public T d(int i11, OsResults osResults) {
            return e(osResults.k(i11));
        }

        public T e(UncheckedRow uncheckedRow) {
            return (T) this.f31997a.D(this.f31999c, this.f32000d, uncheckedRow);
        }
    }

    /* loaded from: classes5.dex */
    static class e<T> extends b<T> {
        e(io.realm.a aVar, OsResults osResults, Class<T> cls, String str) {
            super(aVar, osResults, cls, str);
        }

        @Override // io.realm.x.b
        public T b(boolean z11, T t11) {
            return this.f31998b.r() != 0 ? (T) this.f31998b.l(0) : t11;
        }

        @Override // io.realm.x.b
        public T c(int i11) {
            return (T) this.f31998b.l(i11);
        }

        @Override // io.realm.x.b
        public T d(int i11, OsResults osResults) {
            return (T) osResults.l(i11);
        }
    }

    /* loaded from: classes5.dex */
    static class f extends e<b0> {
        f(io.realm.a aVar, OsResults osResults, Class<b0> cls, String str) {
            super(aVar, osResults, cls, str);
        }

        @Override // io.realm.x.e, io.realm.x.b
        /* renamed from: e */
        public b0 c(int i11) {
            return new b0(d0.b(this.f31997a, (NativeRealmAny) this.f31998b.l(i11)));
        }

        @Override // io.realm.x.e, io.realm.x.b
        /* renamed from: f */
        public b0 d(int i11, OsResults osResults) {
            return new b0(d0.b(this.f31997a, (NativeRealmAny) osResults.l(i11)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class g extends OsResults.a<E> {
        g() {
            super(x.this.f31995d);
        }

        @Override // io.realm.internal.OsResults.a
        protected E d(int i11, OsResults osResults) {
            return x.this.f31996e.d(i11, osResults);
        }
    }

    /* loaded from: classes5.dex */
    private class h extends OsResults.b<E> {
        h(int i11) {
            super(x.this.f31995d, i11);
        }

        @Override // io.realm.internal.OsResults.a
        protected E d(int i11, OsResults osResults) {
            return x.this.f31996e.d(i11, osResults);
        }
    }

    /* loaded from: classes5.dex */
    static class i extends e<Short> {
        i(io.realm.a aVar, OsResults osResults, Class<Short> cls, String str) {
            super(aVar, osResults, cls, str);
        }

        @Override // io.realm.x.e, io.realm.x.b
        /* renamed from: e */
        public Short c(int i11) {
            return Short.valueOf(((Long) this.f31998b.l(i11)).shortValue());
        }

        @Override // io.realm.x.e, io.realm.x.b
        /* renamed from: f */
        public Short d(int i11, OsResults osResults) {
            Long l11 = (Long) osResults.l(i11);
            if (l11 == null) {
                return null;
            }
            return Short.valueOf(l11.shortValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(io.realm.a aVar, OsResults osResults, Class<E> cls, b<E> bVar) {
        this(aVar, osResults, cls, null, bVar);
    }

    private E c(boolean z11, E e11) {
        return this.f31996e.b(z11, e11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T> b<T> d(boolean z11, io.realm.a aVar, OsResults osResults, Class<T> cls, String str) {
        if (z11) {
            if (cls == Integer.class) {
                return new c(aVar, osResults, Integer.class, str);
            }
            if (cls == Short.class) {
                return new i(aVar, osResults, Short.class, str);
            }
            if (cls != Byte.class) {
                if (cls == b0.class) {
                    return new f(aVar, osResults, b0.class, str);
                }
                return new e(aVar, osResults, cls, str);
            }
            return new a(aVar, osResults, Byte.class, str);
        }
        return new d(aVar, osResults, cls, str);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public boolean add(E e11) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractList, java.util.List
    @Deprecated
    public boolean addAll(int i11, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    public boolean b() {
        this.f31992a.g();
        if (size() > 0) {
            this.f31995d.e();
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (!isLoaded() || ((obj instanceof io.realm.internal.m) && ((io.realm.internal.m) obj).d().d() == io.realm.internal.f.INSTANCE)) {
            return false;
        }
        Iterator<E> it2 = iterator();
        while (it2.hasNext()) {
            E next = it2.next();
            if ((next instanceof byte[]) && (obj instanceof byte[])) {
                if (Arrays.equals((byte[]) next, (byte[]) obj)) {
                    return true;
                }
            } else if (next != null && next.equals(obj)) {
                return true;
            } else {
                if (next == null && obj == null) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public OsResults e() {
        return this.f31995d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Table f() {
        return this.f31995d.j();
    }

    public E first() {
        return c(true, null);
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i11) {
        this.f31992a.g();
        return this.f31996e.c(i11);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new g();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return new h(0);
    }

    @Override // java.util.AbstractList, java.util.List
    @Deprecated
    public E remove(int i11) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractList, java.util.List
    @Deprecated
    public E set(int i11, E e11) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        if (isLoaded()) {
            long r11 = this.f31995d.r();
            if (r11 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) r11;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(io.realm.a aVar, OsResults osResults, String str, b<E> bVar) {
        this(aVar, osResults, null, str, bVar);
    }

    @Override // java.util.AbstractList, java.util.List
    @Deprecated
    public void add(int i11, E e11) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i11) {
        return new h(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    private x(io.realm.a aVar, OsResults osResults, Class<E> cls, String str, b<E> bVar) {
        this.f31992a = aVar;
        this.f31995d = osResults;
        this.f31993b = cls;
        this.f31994c = str;
        this.f31996e = bVar;
    }
}