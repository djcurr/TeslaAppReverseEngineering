package io.realm;

import android.content.Context;
import android.os.SystemClock;
import io.realm.exceptions.RealmException;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.exceptions.RealmPrimaryKeyConstraintException;
import io.realm.g0;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.Table;
import io.realm.internal.Util;
import io.realm.internal.m;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class a0 extends io.realm.a {

    /* renamed from: k  reason: collision with root package name */
    private static final Object f31756k = new Object();

    /* renamed from: j  reason: collision with root package name */
    private final r0 f31757j;

    /* loaded from: classes5.dex */
    public interface a {
        void a(a0 a0Var);
    }

    private a0(e0 e0Var, OsSharedRealm.a aVar) {
        super(e0Var, P0(e0Var.i().n()), aVar);
        this.f31757j = new n(this, new io.realm.internal.b(this.f31742c.n(), this.f31744e.getSchemaInfo()));
        if (this.f31742c.r()) {
            io.realm.internal.n n11 = this.f31742c.n();
            for (Class<? extends l0> cls : n11.k()) {
                String q11 = Table.q(n11.l(cls));
                if (!this.f31744e.hasTable(q11)) {
                    this.f31744e.close();
                    throw new RealmMigrationNeededException(this.f31742c.k(), String.format(Locale.US, "Cannot open the read only Realm. '%s' is missing.", Table.h(q11)));
                }
            }
        }
    }

    private <E extends l0> void C0(E e11) {
        if (e11 != null) {
            if (n0.i(e11) && n0.j(e11)) {
                if (e11 instanceof j) {
                    throw new IllegalArgumentException("DynamicRealmObject cannot be copied from Realm.");
                }
                return;
            }
            throw new IllegalArgumentException("Only valid managed objects can be copied from Realm.");
        }
        throw new IllegalArgumentException("Null objects cannot be copied from Realm.");
    }

    private <E extends l0> E G0(E e11, boolean z11, Map<l0, io.realm.internal.m> map, Set<o> set) {
        g();
        if (e0()) {
            if (!this.f31742c.n().p(Util.b(e11.getClass()))) {
                try {
                    return (E) this.f31742c.n().c(this, e11, z11, map, set);
                } catch (IllegalStateException e12) {
                    if (e12.getMessage().startsWith("Attempting to create an object of type")) {
                        throw new RealmPrimaryKeyConstraintException(e12.getMessage());
                    }
                    throw e12;
                }
            }
            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
        }
        throw new IllegalStateException("`copyOrUpdate` can only be called inside a write transaction.");
    }

    private <E extends l0> E J0(E e11, int i11, Map<l0, m.a<l0>> map) {
        g();
        return (E) this.f31742c.n().e(e11, i11, map);
    }

    private static OsSchemaInfo P0(io.realm.internal.n nVar) {
        return new OsSchemaInfo(nVar.h().values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a0 Q0(e0 e0Var, OsSharedRealm.a aVar) {
        return new a0(e0Var, aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a0 R0(OsSharedRealm osSharedRealm) {
        return new a0(osSharedRealm);
    }

    public static Object S0() {
        try {
            Constructor<?> constructor = DefaultRealmModule.class.getDeclaredConstructors()[0];
            constructor.setAccessible(true);
            return constructor.newInstance(new Object[0]);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (IllegalAccessException e11) {
            throw new RealmException("Could not create an instance of io.realm.DefaultRealmModule", e11);
        } catch (InstantiationException e12) {
            throw new RealmException("Could not create an instance of io.realm.DefaultRealmModule", e12);
        } catch (InvocationTargetException e13) {
            throw new RealmException("Could not create an instance of io.realm.DefaultRealmModule", e13);
        }
    }

    public static a0 X0(g0 g0Var) {
        if (g0Var != null) {
            return (a0) e0.e(g0Var, a0.class);
        }
        throw new IllegalArgumentException("A non-null RealmConfiguration must be provided");
    }

    public static synchronized void h1(Context context) {
        synchronized (a0.class) {
            p1(context, "");
        }
    }

    private static void n0(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            if (filesDir.exists()) {
                return;
            }
            try {
                filesDir.mkdirs();
            } catch (SecurityException unused) {
            }
        }
        if (filesDir == null || !filesDir.exists()) {
            long[] jArr = {1, 2, 5, 10, 16};
            long j11 = 0;
            int i11 = -1;
            do {
                if (context.getFilesDir() != null && context.getFilesDir().exists()) {
                    break;
                }
                i11++;
                long j12 = jArr[Math.min(i11, 4)];
                SystemClock.sleep(j12);
                j11 += j12;
            } while (j11 <= 200);
        }
        if (context.getFilesDir() == null || !context.getFilesDir().exists()) {
            throw new IllegalStateException("Context.getFilesDir() returns " + context.getFilesDir() + " which is not an existing directory. See https://issuetracker.google.com/issues/36918154");
        }
    }

    private void p0(Class<? extends l0> cls) {
        if (b1(cls)) {
            return;
        }
        throw new IllegalArgumentException("A RealmObject with no @PrimaryKey cannot be updated: " + cls.toString());
    }

    private static void p1(Context context, String str) {
        if (io.realm.a.f31738h == null) {
            if (context != null) {
                n0(context);
                io.realm.internal.l.a(context);
                t1(new g0.a(context).a());
                io.realm.internal.i.d().g(context, str);
                if (context.getApplicationContext() != null) {
                    io.realm.a.f31738h = context.getApplicationContext();
                } else {
                    io.realm.a.f31738h = context;
                }
                OsSharedRealm.initialize(new File(context.getFilesDir(), ".realm.temp"));
                return;
            }
            throw new IllegalArgumentException("Non-null context required.");
        }
    }

    private void t0(int i11) {
        if (i11 >= 0) {
            return;
        }
        throw new IllegalArgumentException("maxDepth must be > 0. It was: " + i11);
    }

    public static void t1(g0 g0Var) {
        if (g0Var != null) {
            synchronized (f31756k) {
            }
            return;
        }
        throw new IllegalArgumentException("A non-null RealmConfiguration must be provided");
    }

    private <E extends l0> void u0(E e11) {
        if (e11 == null) {
            throw new IllegalArgumentException("Null objects cannot be copied into Realm.");
        }
    }

    public <E extends l0> List<E> D0(Iterable<E> iterable) {
        return F0(iterable, Integer.MAX_VALUE);
    }

    public <E extends l0> List<E> F0(Iterable<E> iterable, int i11) {
        ArrayList arrayList;
        t0(i11);
        if (iterable == null) {
            return new ArrayList(0);
        }
        if (iterable instanceof Collection) {
            arrayList = new ArrayList(((Collection) iterable).size());
        } else {
            arrayList = new ArrayList();
        }
        HashMap hashMap = new HashMap();
        for (E e11 : iterable) {
            C0(e11);
            arrayList.add(J0(e11, i11, hashMap));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E extends l0> E I0(E e11, o... oVarArr) {
        u0(e11);
        p0(e11.getClass());
        return (E) G0(e11, true, new HashMap(), Util.g(oVarArr));
    }

    @Override // io.realm.a
    public r0 L() {
        return this.f31757j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Table Z0(Class<? extends l0> cls) {
        return this.f31757j.i(cls);
    }

    boolean b1(Class<? extends l0> cls) {
        return this.f31742c.n().n(cls);
    }

    public <E extends l0> RealmQuery<E> v1(Class<E> cls) {
        g();
        return RealmQuery.e(this, cls);
    }

    private a0(OsSharedRealm osSharedRealm) {
        super(osSharedRealm);
        this.f31757j = new n(this, new io.realm.internal.b(this.f31742c.n(), osSharedRealm.getSchemaInfo()));
    }
}