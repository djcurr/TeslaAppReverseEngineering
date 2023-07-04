package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.room.migration.Migration;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import v4.h;

/* loaded from: classes.dex */
public abstract class t0 {
    private static final String DB_IMPL_SUFFIX = "_Impl";
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean mAllowMainThreadQueries;
    private androidx.room.a mAutoCloser;
    @Deprecated
    protected List<b> mCallbacks;
    @Deprecated
    protected volatile v4.g mDatabase;
    private v4.h mOpenHelper;
    private Executor mQueryExecutor;
    private Executor mTransactionExecutor;
    boolean mWriteAheadLoggingEnabled;
    private final ReentrantReadWriteLock mCloseLock = new ReentrantReadWriteLock();
    private final ThreadLocal<Integer> mSuspendingTransactionId = new ThreadLocal<>();
    private final Map<String, Object> mBackingFieldMap = Collections.synchronizedMap(new HashMap());
    private final y mInvalidationTracker = createInvalidationTracker();
    private final Map<Class<?>, Object> mTypeConverters = new HashMap();
    protected Map<Class<? extends t4.a>, t4.a> mAutoMigrationSpecs = new HashMap();

    /* loaded from: classes.dex */
    public static class a<T extends t0> {

        /* renamed from: a */
        private final Class<T> f5832a;

        /* renamed from: b */
        private final String f5833b;

        /* renamed from: c */
        private final Context f5834c;

        /* renamed from: d */
        private ArrayList<b> f5835d;

        /* renamed from: e */
        private e f5836e;

        /* renamed from: f */
        private f f5837f;

        /* renamed from: g */
        private Executor f5838g;

        /* renamed from: h */
        private List<Object> f5839h;

        /* renamed from: i */
        private List<t4.a> f5840i;

        /* renamed from: j */
        private Executor f5841j;

        /* renamed from: k */
        private Executor f5842k;

        /* renamed from: l */
        private h.c f5843l;

        /* renamed from: m */
        private boolean f5844m;

        /* renamed from: o */
        private Intent f5846o;

        /* renamed from: q */
        private boolean f5848q;

        /* renamed from: s */
        private TimeUnit f5850s;

        /* renamed from: u */
        private Set<Integer> f5852u;

        /* renamed from: v */
        private Set<Integer> f5853v;

        /* renamed from: w */
        private String f5854w;

        /* renamed from: x */
        private File f5855x;

        /* renamed from: y */
        private Callable<InputStream> f5856y;

        /* renamed from: r */
        private long f5849r = -1;

        /* renamed from: n */
        private c f5845n = c.AUTOMATIC;

        /* renamed from: p */
        private boolean f5847p = true;

        /* renamed from: t */
        private final d f5851t = new d();

        public a(Context context, Class<T> cls, String str) {
            this.f5834c = context;
            this.f5832a = cls;
            this.f5833b = str;
        }

        public a<T> a(b bVar) {
            if (this.f5835d == null) {
                this.f5835d = new ArrayList<>();
            }
            this.f5835d.add(bVar);
            return this;
        }

        public a<T> b(Migration... migrationArr) {
            if (this.f5853v == null) {
                this.f5853v = new HashSet();
            }
            for (Migration migration : migrationArr) {
                this.f5853v.add(Integer.valueOf(migration.f51626a));
                this.f5853v.add(Integer.valueOf(migration.f51627b));
            }
            this.f5851t.b(migrationArr);
            return this;
        }

        public a<T> c() {
            this.f5844m = true;
            return this;
        }

        public T d() {
            Executor executor;
            if (this.f5834c != null) {
                if (this.f5832a != null) {
                    Executor executor2 = this.f5841j;
                    if (executor2 == null && this.f5842k == null) {
                        Executor d11 = n.a.d();
                        this.f5842k = d11;
                        this.f5841j = d11;
                    } else if (executor2 != null && this.f5842k == null) {
                        this.f5842k = executor2;
                    } else if (executor2 == null && (executor = this.f5842k) != null) {
                        this.f5841j = executor;
                    }
                    Set<Integer> set = this.f5853v;
                    if (set != null && this.f5852u != null) {
                        for (Integer num : set) {
                            if (this.f5852u.contains(num)) {
                                throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + num);
                            }
                        }
                    }
                    m mVar = this.f5843l;
                    if (mVar == null) {
                        mVar = new w4.c();
                    }
                    long j11 = this.f5849r;
                    if (j11 > 0) {
                        if (this.f5833b != null) {
                            mVar = new m(mVar, new androidx.room.a(j11, this.f5850s, this.f5842k));
                        } else {
                            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                        }
                    }
                    String str = this.f5854w;
                    if (str != null || this.f5855x != null || this.f5856y != null) {
                        if (this.f5833b != null) {
                            int i11 = str == null ? 0 : 1;
                            File file = this.f5855x;
                            int i12 = i11 + (file == null ? 0 : 1);
                            Callable<InputStream> callable = this.f5856y;
                            if (i12 + (callable != null ? 1 : 0) == 1) {
                                mVar = new y0(str, file, callable, mVar);
                            } else {
                                throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                            }
                        } else {
                            throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                        }
                    }
                    f fVar = this.f5837f;
                    l0 l0Var = fVar != null ? new l0(mVar, fVar, this.f5838g) : mVar;
                    Context context = this.f5834c;
                    p pVar = new p(context, this.f5833b, l0Var, this.f5851t, this.f5835d, this.f5844m, this.f5845n.resolve(context), this.f5841j, this.f5842k, this.f5846o, this.f5847p, this.f5848q, this.f5852u, this.f5854w, this.f5855x, this.f5856y, this.f5836e, this.f5839h, this.f5840i);
                    T t11 = (T) q0.b(this.f5832a, t0.DB_IMPL_SUFFIX);
                    t11.init(pVar);
                    return t11;
                }
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        }

        public a<T> e() {
            this.f5847p = false;
            this.f5848q = true;
            return this;
        }

        public a<T> f(h.c cVar) {
            this.f5843l = cVar;
            return this;
        }

        public a<T> g(Executor executor) {
            this.f5841j = executor;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public void a(v4.g gVar) {
        }

        public void b(v4.g gVar) {
        }

        public void c(v4.g gVar) {
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private static boolean isLowRamDevice(ActivityManager activityManager) {
            if (Build.VERSION.SDK_INT >= 19) {
                return v4.c.b(activityManager);
            }
            return false;
        }

        c resolve(Context context) {
            ActivityManager activityManager;
            if (this != AUTOMATIC) {
                return this;
            }
            if (Build.VERSION.SDK_INT >= 16 && (activityManager = (ActivityManager) context.getSystemService("activity")) != null && !isLowRamDevice(activityManager)) {
                return WRITE_AHEAD_LOGGING;
            }
            return TRUNCATE;
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        private HashMap<Integer, TreeMap<Integer, t4.b>> f5857a = new HashMap<>();

        private void a(t4.b bVar) {
            int i11 = bVar.f51626a;
            int i12 = bVar.f51627b;
            TreeMap<Integer, t4.b> treeMap = this.f5857a.get(Integer.valueOf(i11));
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                this.f5857a.put(Integer.valueOf(i11), treeMap);
            }
            t4.b bVar2 = treeMap.get(Integer.valueOf(i12));
            if (bVar2 != null) {
                Log.w("ROOM", "Overriding migration " + bVar2 + " with " + bVar);
            }
            treeMap.put(Integer.valueOf(i12), bVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:51:0x0017  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0016 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private java.util.List<t4.b> d(java.util.List<t4.b> r7, boolean r8, int r9, int r10) {
            /*
                r6 = this;
            L0:
                if (r8 == 0) goto L5
                if (r9 >= r10) goto L5a
                goto L7
            L5:
                if (r9 <= r10) goto L5a
            L7:
                java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, t4.b>> r0 = r6.f5857a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
                java.lang.Object r0 = r0.get(r1)
                java.util.TreeMap r0 = (java.util.TreeMap) r0
                r1 = 0
                if (r0 != 0) goto L17
                return r1
            L17:
                if (r8 == 0) goto L1e
                java.util.NavigableSet r2 = r0.descendingKeySet()
                goto L22
            L1e:
                java.util.Set r2 = r0.keySet()
            L22:
                java.util.Iterator r2 = r2.iterator()
            L26:
                boolean r3 = r2.hasNext()
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L56
                java.lang.Object r3 = r2.next()
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                if (r8 == 0) goto L40
                if (r3 > r10) goto L45
                if (r3 <= r9) goto L45
            L3e:
                r5 = r4
                goto L45
            L40:
                if (r3 < r10) goto L45
                if (r3 >= r9) goto L45
                goto L3e
            L45:
                if (r5 == 0) goto L26
                java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
                java.lang.Object r9 = r0.get(r9)
                t4.b r9 = (t4.b) r9
                r7.add(r9)
                r9 = r3
                goto L57
            L56:
                r4 = r5
            L57:
                if (r4 != 0) goto L0
                return r1
            L5a:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.t0.d.d(java.util.List, boolean, int, int):java.util.List");
        }

        public void b(t4.b... bVarArr) {
            for (t4.b bVar : bVarArr) {
                a(bVar);
            }
        }

        public List<t4.b> c(int i11, int i12) {
            if (i11 == i12) {
                return Collections.emptyList();
            }
            return d(new ArrayList(), i12 > i11, i11, i12);
        }

        public Map<Integer, Map<Integer, t4.b>> e() {
            return Collections.unmodifiableMap(this.f5857a);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(String str, List<Object> list);
    }

    public static /* synthetic */ Object a(t0 t0Var, v4.g gVar) {
        return t0Var.lambda$beginTransaction$0(gVar);
    }

    public static /* synthetic */ Object b(t0 t0Var, v4.g gVar) {
        return t0Var.lambda$endTransaction$1(gVar);
    }

    private void internalBeginTransaction() {
        assertNotMainThread();
        v4.g W0 = this.mOpenHelper.W0();
        this.mInvalidationTracker.q(W0);
        if (Build.VERSION.SDK_INT >= 16 && W0.B1()) {
            W0.Q();
        } else {
            W0.beginTransaction();
        }
    }

    private void internalEndTransaction() {
        this.mOpenHelper.W0().X();
        if (inTransaction()) {
            return;
        }
        this.mInvalidationTracker.h();
    }

    private static boolean isMainThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public /* synthetic */ Object lambda$beginTransaction$0(v4.g gVar) {
        internalBeginTransaction();
        return null;
    }

    public /* synthetic */ Object lambda$endTransaction$1(v4.g gVar) {
        internalEndTransaction();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> T unwrapOpenHelper(Class<T> cls, v4.h hVar) {
        if (cls.isInstance(hVar)) {
            return hVar;
        }
        if (hVar instanceof q) {
            return (T) unwrapOpenHelper(cls, ((q) hVar).getDelegate());
        }
        return null;
    }

    public void assertNotMainThread() {
        if (!this.mAllowMainThreadQueries && isMainThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.mSuspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public void beginTransaction() {
        assertNotMainThread();
        androidx.room.a aVar = this.mAutoCloser;
        if (aVar == null) {
            internalBeginTransaction();
        } else {
            aVar.c(new p.a() { // from class: androidx.room.r0
                {
                    t0.this = this;
                }

                @Override // p.a
                public final Object apply(Object obj) {
                    return t0.a(t0.this, (v4.g) obj);
                }
            });
        }
    }

    public abstract void clearAllTables();

    public void close() {
        if (isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.mCloseLock.writeLock();
            writeLock.lock();
            try {
                this.mInvalidationTracker.n();
                this.mOpenHelper.close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    public v4.k compileStatement(String str) {
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return this.mOpenHelper.W0().H0(str);
    }

    protected abstract y createInvalidationTracker();

    protected abstract v4.h createOpenHelper(p pVar);

    @Deprecated
    public void endTransaction() {
        androidx.room.a aVar = this.mAutoCloser;
        if (aVar == null) {
            internalEndTransaction();
        } else {
            aVar.c(new p.a() { // from class: androidx.room.s0
                {
                    t0.this = this;
                }

                @Override // p.a
                public final Object apply(Object obj) {
                    return t0.b(t0.this, (v4.g) obj);
                }
            });
        }
    }

    public List<t4.b> getAutoMigrations(Map<Class<? extends t4.a>, t4.a> map) {
        return Collections.emptyList();
    }

    public Map<String, Object> getBackingFieldMap() {
        return this.mBackingFieldMap;
    }

    public Lock getCloseLock() {
        return this.mCloseLock.readLock();
    }

    public y getInvalidationTracker() {
        return this.mInvalidationTracker;
    }

    public v4.h getOpenHelper() {
        return this.mOpenHelper;
    }

    public Executor getQueryExecutor() {
        return this.mQueryExecutor;
    }

    public Set<Class<? extends t4.a>> getRequiredAutoMigrationSpecs() {
        return Collections.emptySet();
    }

    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return Collections.emptyMap();
    }

    ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.mSuspendingTransactionId;
    }

    public Executor getTransactionExecutor() {
        return this.mTransactionExecutor;
    }

    public <T> T getTypeConverter(Class<T> cls) {
        return (T) this.mTypeConverters.get(cls);
    }

    public boolean inTransaction() {
        return this.mOpenHelper.W0().s1();
    }

    public void init(p pVar) {
        boolean z11;
        this.mOpenHelper = createOpenHelper(pVar);
        Set<Class<? extends t4.a>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        BitSet bitSet = new BitSet();
        Iterator<Class<? extends t4.a>> it2 = requiredAutoMigrationSpecs.iterator();
        while (true) {
            int i11 = -1;
            if (it2.hasNext()) {
                Class<? extends t4.a> next = it2.next();
                int size = pVar.f5812h.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    } else if (next.isAssignableFrom(pVar.f5812h.get(size).getClass())) {
                        bitSet.set(size);
                        i11 = size;
                        break;
                    } else {
                        size--;
                    }
                }
                if (i11 >= 0) {
                    this.mAutoMigrationSpecs.put(next, pVar.f5812h.get(i11));
                } else {
                    throw new IllegalArgumentException("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.");
                }
            } else {
                for (int size2 = pVar.f5812h.size() - 1; size2 >= 0; size2--) {
                    if (!bitSet.get(size2)) {
                        throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                    }
                }
                Iterator<t4.b> it3 = getAutoMigrations(this.mAutoMigrationSpecs).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    t4.b next2 = it3.next();
                    if (!pVar.f5808d.e().containsKey(Integer.valueOf(next2.f51626a))) {
                        pVar.f5808d.b(next2);
                    }
                }
                x0 x0Var = (x0) unwrapOpenHelper(x0.class, this.mOpenHelper);
                if (x0Var != null) {
                    x0Var.j(pVar);
                }
                i iVar = (i) unwrapOpenHelper(i.class, this.mOpenHelper);
                if (iVar != null) {
                    androidx.room.a a11 = iVar.a();
                    this.mAutoCloser = a11;
                    this.mInvalidationTracker.k(a11);
                }
                if (Build.VERSION.SDK_INT >= 16) {
                    z11 = pVar.f5814j == c.WRITE_AHEAD_LOGGING;
                    this.mOpenHelper.setWriteAheadLoggingEnabled(z11);
                }
                this.mCallbacks = pVar.f5809e;
                this.mQueryExecutor = pVar.f5815k;
                this.mTransactionExecutor = new b1(pVar.f5816l);
                this.mAllowMainThreadQueries = pVar.f5813i;
                this.mWriteAheadLoggingEnabled = z11;
                Intent intent = pVar.f5818n;
                if (intent != null) {
                    this.mInvalidationTracker.l(pVar.f5806b, pVar.f5807c, intent);
                }
                Map<Class<?>, List<Class<?>>> requiredTypeConverters = getRequiredTypeConverters();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry<Class<?>, List<Class<?>>> entry : requiredTypeConverters.entrySet()) {
                    Class<?> key = entry.getKey();
                    for (Class<?> cls : entry.getValue()) {
                        int size3 = pVar.f5811g.size() - 1;
                        while (true) {
                            if (size3 < 0) {
                                size3 = -1;
                                break;
                            } else if (cls.isAssignableFrom(pVar.f5811g.get(size3).getClass())) {
                                bitSet2.set(size3);
                                break;
                            } else {
                                size3--;
                            }
                        }
                        if (size3 >= 0) {
                            this.mTypeConverters.put(cls, pVar.f5811g.get(size3));
                        } else {
                            throw new IllegalArgumentException("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.");
                        }
                    }
                }
                for (int size4 = pVar.f5811g.size() - 1; size4 >= 0; size4--) {
                    if (!bitSet2.get(size4)) {
                        throw new IllegalArgumentException("Unexpected type converter " + pVar.f5811g.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                }
                return;
            }
        }
    }

    public void internalInitInvalidationTracker(v4.g gVar) {
        this.mInvalidationTracker.e(gVar);
    }

    public boolean isOpen() {
        androidx.room.a aVar = this.mAutoCloser;
        if (aVar != null) {
            return aVar.g();
        }
        v4.g gVar = this.mDatabase;
        return gVar != null && gVar.isOpen();
    }

    public Cursor query(String str, Object[] objArr) {
        return this.mOpenHelper.W0().d0(new v4.a(str, objArr));
    }

    public void runInTransaction(Runnable runnable) {
        beginTransaction();
        try {
            runnable.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    @Deprecated
    public void setTransactionSuccessful() {
        this.mOpenHelper.W0().N();
    }

    public Cursor query(v4.j jVar) {
        return query(jVar, (CancellationSignal) null);
    }

    public Cursor query(v4.j jVar, CancellationSignal cancellationSignal) {
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (cancellationSignal != null && Build.VERSION.SDK_INT >= 16) {
            return this.mOpenHelper.W0().e1(jVar, cancellationSignal);
        }
        return this.mOpenHelper.W0().d0(jVar);
    }

    public <V> V runInTransaction(Callable<V> callable) {
        beginTransaction();
        try {
            try {
                V call = callable.call();
                setTransactionSuccessful();
                endTransaction();
                return call;
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception e12) {
                u4.e.a(e12);
                endTransaction();
                return null;
            }
        } catch (Throwable th2) {
            endTransaction();
            throw th2;
        }
    }
}