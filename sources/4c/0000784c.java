package io.realm.internal;

import io.realm.f0;
import io.realm.internal.ObservableCollection;
import io.realm.w;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public class OsResults implements h, ObservableCollection {

    /* renamed from: h  reason: collision with root package name */
    private static final long f31870h = nativeGetFinalizerPtr();

    /* renamed from: a  reason: collision with root package name */
    private final long f31871a;

    /* renamed from: b  reason: collision with root package name */
    private final OsSharedRealm f31872b;

    /* renamed from: c  reason: collision with root package name */
    private final g f31873c;

    /* renamed from: d  reason: collision with root package name */
    private final Table f31874d;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f31875e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f31876f = false;

    /* renamed from: g  reason: collision with root package name */
    protected final j<ObservableCollection.b> f31877g = new j<>();

    /* loaded from: classes5.dex */
    public static abstract class a<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        protected OsResults f31878a;

        /* renamed from: b  reason: collision with root package name */
        protected int f31879b = -1;

        public a(OsResults osResults) {
            if (!osResults.f31872b.isClosed()) {
                this.f31878a = osResults;
                if (osResults.f31876f) {
                    return;
                }
                if (!osResults.f31872b.isInTransaction()) {
                    this.f31878a.f31872b.addIterator(this);
                    return;
                } else {
                    b();
                    return;
                }
            }
            throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
        }

        void a() {
            if (this.f31878a == null) {
                throw new ConcurrentModificationException("No outside changes to a Realm is allowed while iterating a living Realm collection.");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b() {
            this.f31878a = this.f31878a.g();
        }

        T c(int i11) {
            return d(i11, this.f31878a);
        }

        protected abstract T d(int i11, OsResults osResults);

        /* JADX INFO: Access modifiers changed from: package-private */
        public void e() {
            this.f31878a = null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return ((long) (this.f31879b + 1)) < this.f31878a.r();
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            int i11 = this.f31879b + 1;
            this.f31879b = i11;
            if (i11 < this.f31878a.r()) {
                return c(this.f31879b);
            }
            throw new NoSuchElementException("Cannot access index " + this.f31879b + " when size is " + this.f31878a.r() + ". Remember to check hasNext() before using next().");
        }

        @Override // java.util.Iterator
        @Deprecated
        public void remove() {
            throw new UnsupportedOperationException("remove() is not supported by RealmResults iterators.");
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class b<T> extends a<T> implements ListIterator<T> {
        public b(OsResults osResults, int i11) {
            super(osResults);
            if (i11 >= 0 && i11 <= this.f31878a.r()) {
                this.f31879b = i11 - 1;
                return;
            }
            throw new IndexOutOfBoundsException("Starting location must be a valid index: [0, " + (this.f31878a.r() - 1) + "]. Yours was " + i11);
        }

        @Override // java.util.ListIterator
        @Deprecated
        public void add(T t11) {
            throw new UnsupportedOperationException("Adding an element is not supported. Use Realm.createObject() instead.");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            a();
            return this.f31879b >= 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            a();
            return this.f31879b + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            a();
            try {
                this.f31879b--;
                return c(this.f31879b);
            } catch (IndexOutOfBoundsException unused) {
                throw new NoSuchElementException("Cannot access index less than zero. This was " + this.f31879b + ". Remember to check hasPrevious() before using previous().");
            }
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            a();
            return this.f31879b;
        }

        @Override // java.util.ListIterator
        @Deprecated
        public void set(T t11) {
            throw new UnsupportedOperationException("Replacing an element is not supported.");
        }
    }

    /* loaded from: classes5.dex */
    public enum c {
        EMPTY,
        TABLE,
        PRIMITIVE_LIST,
        QUERY,
        TABLEVIEW;

        static c getByValue(byte b11) {
            if (b11 != 0) {
                if (b11 != 1) {
                    if (b11 != 2) {
                        if (b11 != 3) {
                            if (b11 == 4) {
                                return TABLEVIEW;
                            }
                            throw new IllegalArgumentException("Invalid value: " + ((int) b11));
                        }
                        return QUERY;
                    }
                    return PRIMITIVE_LIST;
                }
                return TABLE;
            }
            return EMPTY;
        }
    }

    OsResults(OsSharedRealm osSharedRealm, Table table, long j11) {
        this.f31872b = osSharedRealm;
        g gVar = osSharedRealm.context;
        this.f31873c = gVar;
        this.f31874d = table;
        this.f31871a = j11;
        gVar.a(this);
        this.f31875e = i() != c.QUERY;
    }

    public static OsResults f(OsSharedRealm osSharedRealm, TableQuery tableQuery) {
        tableQuery.p();
        return new OsResults(osSharedRealm, tableQuery.i(), nativeCreateResults(osSharedRealm.getNativePtr(), tableQuery.getNativePtr()));
    }

    private static native Object nativeAggregate(long j11, long j12, byte b11);

    private static native void nativeClear(long j11);

    private static native boolean nativeContains(long j11, long j12);

    protected static native long nativeCreateResults(long j11, long j12);

    private static native long nativeCreateResultsFromBacklinks(long j11, long j12, long j13, long j14);

    private static native long nativeCreateSnapshot(long j11);

    private static native void nativeDelete(long j11, long j12);

    private static native boolean nativeDeleteFirst(long j11);

    private static native boolean nativeDeleteLast(long j11);

    private static native void nativeEvaluateQueryIfNeeded(long j11, boolean z11);

    private static native long nativeFirstRow(long j11);

    private static native long nativeFreeze(long j11, long j12);

    private static native long nativeGetFinalizerPtr();

    private static native byte nativeGetMode(long j11);

    private static native long nativeGetRow(long j11, int i11);

    private static native long nativeGetTable(long j11);

    private static native Object nativeGetValue(long j11, int i11);

    private static native long nativeIndexOf(long j11, long j12);

    private static native boolean nativeIsValid(long j11);

    private static native long nativeLastRow(long j11);

    private static native void nativeSetBinary(long j11, String str, byte[] bArr);

    private static native void nativeSetBoolean(long j11, String str, boolean z11);

    private static native void nativeSetDecimal128(long j11, String str, long j12, long j13);

    private static native void nativeSetDouble(long j11, String str, double d11);

    private static native void nativeSetFloat(long j11, String str, float f11);

    private static native void nativeSetInt(long j11, String str, long j12);

    private static native void nativeSetList(long j11, String str, long j12);

    private static native void nativeSetNull(long j11, String str);

    private static native void nativeSetObject(long j11, String str, long j12);

    private static native void nativeSetObjectId(long j11, String str, String str2);

    private static native void nativeSetString(long j11, String str, String str2);

    private static native void nativeSetTimestamp(long j11, String str, long j12);

    private static native void nativeSetUUID(long j11, String str, String str2);

    private static native long nativeSize(long j11);

    private native void nativeStartListening(long j11);

    private native void nativeStopListening(long j11);

    private static native long nativeStringDescriptor(long j11, String str, long j12);

    private static native long nativeWhere(long j11);

    private static native String toJSON(long j11, int i11);

    public <T> void c(T t11, w<T> wVar) {
        if (this.f31877g.d()) {
            nativeStartListening(this.f31871a);
        }
        this.f31877g.a(new ObservableCollection.b(t11, wVar));
    }

    public <T> void d(T t11, f0<T> f0Var) {
        c(t11, new ObservableCollection.c(f0Var));
    }

    public void e() {
        nativeClear(this.f31871a);
    }

    public OsResults g() {
        if (this.f31876f) {
            return this;
        }
        OsResults osResults = new OsResults(this.f31872b, this.f31874d, nativeCreateSnapshot(this.f31871a));
        osResults.f31876f = true;
        return osResults;
    }

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return f31870h;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.f31871a;
    }

    public UncheckedRow h() {
        long nativeFirstRow = nativeFirstRow(this.f31871a);
        if (nativeFirstRow != 0) {
            return this.f31874d.s(nativeFirstRow);
        }
        return null;
    }

    public c i() {
        return c.getByValue(nativeGetMode(this.f31871a));
    }

    public Table j() {
        return this.f31874d;
    }

    public UncheckedRow k(int i11) {
        return this.f31874d.s(nativeGetRow(this.f31871a, i11));
    }

    public Object l(int i11) {
        return nativeGetValue(this.f31871a, i11);
    }

    public boolean m() {
        return this.f31875e;
    }

    public boolean n() {
        return nativeIsValid(this.f31871a);
    }

    @Override // io.realm.internal.ObservableCollection
    public void notifyChangeListeners(long j11) {
        OsCollectionChangeSet osCollectionChangeSet;
        if (j11 == 0) {
            osCollectionChangeSet = new d();
        } else {
            osCollectionChangeSet = new OsCollectionChangeSet(j11, !m());
        }
        if (osCollectionChangeSet.e() && m()) {
            return;
        }
        this.f31875e = true;
        this.f31877g.c(new ObservableCollection.a(osCollectionChangeSet));
    }

    public void o() {
        if (this.f31875e) {
            return;
        }
        nativeEvaluateQueryIfNeeded(this.f31871a, false);
        notifyChangeListeners(0L);
    }

    public <T> void p(T t11, w<T> wVar) {
        this.f31877g.e(t11, wVar);
        if (this.f31877g.d()) {
            nativeStopListening(this.f31871a);
        }
    }

    public <T> void q(T t11, f0<T> f0Var) {
        p(t11, new ObservableCollection.c(f0Var));
    }

    public long r() {
        return nativeSize(this.f31871a);
    }

    public TableQuery s() {
        return new TableQuery(this.f31873c, this.f31874d, nativeWhere(this.f31871a));
    }
}