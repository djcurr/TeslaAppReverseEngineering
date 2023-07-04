package io.realm;

import io.realm.internal.OsObjectStore;
import io.realm.internal.OsRealmConfig;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.Util;
import io.realm.log.RealmLog;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class e0 {

    /* renamed from: f  reason: collision with root package name */
    private static final List<WeakReference<e0>> f31761f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private static final Collection<e0> f31762g = new ConcurrentLinkedQueue();

    /* renamed from: b  reason: collision with root package name */
    private final String f31764b;

    /* renamed from: c  reason: collision with root package name */
    private g0 f31765c;

    /* renamed from: a  reason: collision with root package name */
    private final Map<hz.a<d, OsSharedRealm.a>, e> f31763a = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final AtomicBoolean f31766d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    private final Set<String> f31767e = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ File f31768a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g0 f31769b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f31770c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f31771d;

        a(File file, g0 g0Var, boolean z11, String str) {
            this.f31768a = file;
            this.f31769b = g0Var;
            this.f31770c = z11;
            this.f31771d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f31768a != null) {
                e0.c(this.f31769b.c(), this.f31768a);
            }
            if (this.f31770c) {
                e0.c(this.f31771d, new File(io.realm.internal.i.b(this.f31769b.t()).f(this.f31769b)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public interface b {
        void onResult(int i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class c extends e {

        /* renamed from: c  reason: collision with root package name */
        private io.realm.a f31772c;

        private c() {
            super(null);
        }

        @Override // io.realm.e0.e
        public void a() {
            String path = this.f31772c.getPath();
            this.f31773a.set(null);
            this.f31772c = null;
            if (this.f31774b.decrementAndGet() >= 0) {
                return;
            }
            throw new IllegalStateException("Global reference counter of Realm" + path + " not be negative.");
        }

        @Override // io.realm.e0.e
        io.realm.a c() {
            return this.f31772c;
        }

        @Override // io.realm.e0.e
        int d() {
            return this.f31774b.get();
        }

        @Override // io.realm.e0.e
        boolean e() {
            return this.f31772c != null;
        }

        @Override // io.realm.e0.e
        void g(io.realm.a aVar) {
            this.f31772c = aVar;
            this.f31773a.set(0);
            this.f31774b.incrementAndGet();
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public enum d {
        TYPED_REALM,
        DYNAMIC_REALM;

        static d valueOf(Class<? extends io.realm.a> cls) {
            if (cls == a0.class) {
                return TYPED_REALM;
            }
            if (cls == h.class) {
                return DYNAMIC_REALM;
            }
            throw new IllegalArgumentException("The type of Realm class must be Realm or DynamicRealm.");
        }
    }

    private e0(String str) {
        this.f31764b = str;
    }

    private static void b(g0 g0Var) {
        File file = g0Var.p() ? new File(g0Var.l(), g0Var.m()) : null;
        String e11 = io.realm.internal.i.b(g0Var.t()).e(g0Var);
        boolean z11 = !Util.e(e11);
        if (file != null || z11) {
            OsObjectStore.a(g0Var, new a(file, g0Var, z11, e11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(java.lang.String r6, java.io.File r7) {
        /*
            boolean r0 = r7.exists()
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 0
            android.content.Context r1 = io.realm.a.f31738h     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L69
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L69
            java.io.InputStream r1 = r1.open(r6)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L69
            if (r1 == 0) goto L4d
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L49
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L49
            r7 = 4096(0x1000, float:5.74E-42)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
        L1d:
            int r3 = r1.read(r7)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            r4 = -1
            if (r3 <= r4) goto L29
            r4 = 0
            r2.write(r7, r4, r3)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            goto L1d
        L29:
            r1.close()     // Catch: java.io.IOException -> L2d
            goto L2e
        L2d:
            r0 = move-exception
        L2e:
            r2.close()     // Catch: java.io.IOException -> L32
            goto L36
        L32:
            r6 = move-exception
            if (r0 != 0) goto L36
            r0 = r6
        L36:
            if (r0 != 0) goto L39
            return
        L39:
            io.realm.exceptions.RealmFileException r6 = new io.realm.exceptions.RealmFileException
            io.realm.exceptions.RealmFileException$Kind r7 = io.realm.exceptions.RealmFileException.Kind.ACCESS_ERROR
            r6.<init>(r7, r0)
            throw r6
        L41:
            r6 = move-exception
            goto L47
        L43:
            r7 = move-exception
            goto L4b
        L45:
            r6 = move-exception
            r2 = r0
        L47:
            r0 = r1
            goto L85
        L49:
            r7 = move-exception
            r2 = r0
        L4b:
            r0 = r1
            goto L6b
        L4d:
            io.realm.exceptions.RealmFileException r7 = new io.realm.exceptions.RealmFileException     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L49
            io.realm.exceptions.RealmFileException$Kind r2 = io.realm.exceptions.RealmFileException.Kind.ACCESS_ERROR     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L49
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L49
            r3.<init>()     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L49
            java.lang.String r4 = "Invalid input stream to the asset file: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L49
            r3.append(r6)     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L49
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L49
            r7.<init>(r2, r3)     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L49
            throw r7     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L49
        L66:
            r6 = move-exception
            r2 = r0
            goto L85
        L69:
            r7 = move-exception
            r2 = r0
        L6b:
            io.realm.exceptions.RealmFileException r1 = new io.realm.exceptions.RealmFileException     // Catch: java.lang.Throwable -> L84
            io.realm.exceptions.RealmFileException$Kind r3 = io.realm.exceptions.RealmFileException.Kind.ACCESS_ERROR     // Catch: java.lang.Throwable -> L84
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r4.<init>()     // Catch: java.lang.Throwable -> L84
            java.lang.String r5 = "Could not resolve the path to the asset file: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L84
            r4.append(r6)     // Catch: java.lang.Throwable -> L84
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> L84
            r1.<init>(r3, r6, r7)     // Catch: java.lang.Throwable -> L84
            throw r1     // Catch: java.lang.Throwable -> L84
        L84:
            r6 = move-exception
        L85:
            if (r0 == 0) goto L8a
            r0.close()     // Catch: java.io.IOException -> L8a
        L8a:
            if (r2 == 0) goto L8f
            r2.close()     // Catch: java.io.IOException -> L8f
        L8f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.e0.c(java.lang.String, java.io.File):void");
    }

    private <E extends io.realm.a> void d(Class<E> cls, e eVar, OsSharedRealm.a aVar) {
        io.realm.a n02;
        if (cls == a0.class) {
            n02 = a0.Q0(this, aVar);
            n02.L().d();
        } else if (cls == h.class) {
            n02 = h.n0(this, aVar);
        } else {
            throw new IllegalArgumentException("The type of Realm class must be Realm or DynamicRealm.");
        }
        eVar.g(n02);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E extends io.realm.a> E e(g0 g0Var, Class<E> cls) {
        return (E) h(g0Var.k(), true).f(g0Var, cls, OsSharedRealm.a.f31886c);
    }

    private synchronized <E extends io.realm.a> E f(g0 g0Var, Class<E> cls, OsSharedRealm.a aVar) {
        e j11;
        j11 = j(cls, aVar);
        if (k() == 0) {
            b(g0Var);
            boolean z11 = g0Var.u() ? false : true;
            if (g0Var.t() && (z11 || this.f31767e.contains(g0Var.k()))) {
                io.realm.internal.i.d().i(new OsRealmConfig.b(g0Var).b());
                io.realm.internal.i.d().a(g0Var);
                this.f31767e.remove(g0Var.k());
            }
            this.f31765c = g0Var;
        } else {
            p(g0Var);
        }
        if (!j11.e()) {
            d(cls, j11, aVar);
        }
        j11.f(1);
        return (E) j11.c();
    }

    private synchronized void g(b bVar) {
        bVar.onResult(k());
    }

    private static e0 h(String str, boolean z11) {
        e0 e0Var;
        List<WeakReference<e0>> list = f31761f;
        synchronized (list) {
            Iterator<WeakReference<e0>> it2 = list.iterator();
            e0Var = null;
            while (it2.hasNext()) {
                e0 e0Var2 = it2.next().get();
                if (e0Var2 == null) {
                    it2.remove();
                } else if (e0Var2.f31764b.equals(str)) {
                    e0Var = e0Var2;
                }
            }
            if (e0Var == null && z11) {
                e0Var = new e0(str);
                f31761f.add(new WeakReference<>(e0Var));
            }
        }
        return e0Var;
    }

    private <E extends io.realm.a> e j(Class<E> cls, OsSharedRealm.a aVar) {
        hz.a<d, OsSharedRealm.a> aVar2 = new hz.a<>(d.valueOf(cls), aVar);
        e eVar = this.f31763a.get(aVar2);
        if (eVar == null) {
            if (aVar.equals(OsSharedRealm.a.f31886c)) {
                eVar = new f(null);
            } else {
                eVar = new c(null);
            }
            this.f31763a.put(aVar2, eVar);
        }
        return eVar;
    }

    private int k() {
        int i11 = 0;
        for (e eVar : this.f31763a.values()) {
            i11 += eVar.b();
        }
        return i11;
    }

    private int l() {
        int i11 = 0;
        for (e eVar : this.f31763a.values()) {
            if (eVar instanceof f) {
                i11 += eVar.b();
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void m(g0 g0Var, b bVar) {
        synchronized (f31761f) {
            e0 h11 = h(g0Var.k(), false);
            if (h11 == null) {
                bVar.onResult(0);
            } else {
                h11.g(bVar);
            }
        }
    }

    private void p(g0 g0Var) {
        if (this.f31765c.equals(g0Var)) {
            return;
        }
        if (Arrays.equals(this.f31765c.f(), g0Var.f())) {
            k0 i11 = g0Var.i();
            k0 i12 = this.f31765c.i();
            if (i12 != null && i11 != null && i12.getClass().equals(i11.getClass()) && !i11.equals(i12)) {
                throw new IllegalArgumentException("Configurations cannot be different if used to open the same file. The most likely cause is that equals() and hashCode() are not overridden in the migration class: " + g0Var.i().getClass().getCanonicalName());
            }
            throw new IllegalArgumentException("Configurations cannot be different if used to open the same file. \nCached configuration: \n" + this.f31765c + "\n\nNew configuration: \n" + g0Var);
        }
        throw new IllegalArgumentException("Wrong key used to decrypt Realm.");
    }

    public g0 i() {
        return this.f31765c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n() {
        if (this.f31766d.getAndSet(true)) {
            return;
        }
        f31762g.add(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void o(io.realm.a aVar) {
        io.realm.a c11;
        String path = aVar.getPath();
        e j11 = j(aVar.getClass(), aVar.a0() ? aVar.f31744e.getVersionID() : OsSharedRealm.a.f31886c);
        int d11 = j11.d();
        if (d11 <= 0) {
            RealmLog.g("%s has been closed already. refCount is %s", path, Integer.valueOf(d11));
            return;
        }
        int i11 = d11 - 1;
        if (i11 == 0) {
            j11.a();
            aVar.m();
            if (l() == 0) {
                this.f31765c = null;
                for (e eVar : this.f31763a.values()) {
                    if ((eVar instanceof c) && (c11 = eVar.c()) != null) {
                        while (!c11.isClosed()) {
                            c11.close();
                        }
                    }
                }
                io.realm.internal.i.b(aVar.J().t()).h(aVar.J());
            }
        } else {
            j11.h(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class f extends e {

        /* renamed from: c  reason: collision with root package name */
        private final ThreadLocal<io.realm.a> f31775c;

        private f() {
            super(null);
            this.f31775c = new ThreadLocal<>();
        }

        @Override // io.realm.e0.e
        public void a() {
            String path = this.f31775c.get().getPath();
            this.f31773a.set(null);
            this.f31775c.set(null);
            if (this.f31774b.decrementAndGet() >= 0) {
                return;
            }
            throw new IllegalStateException("Global reference counter of Realm" + path + " can not be negative.");
        }

        @Override // io.realm.e0.e
        public io.realm.a c() {
            return this.f31775c.get();
        }

        @Override // io.realm.e0.e
        public int d() {
            Integer num = this.f31773a.get();
            if (num != null) {
                return num.intValue();
            }
            return 0;
        }

        @Override // io.realm.e0.e
        public boolean e() {
            return this.f31775c.get() != null;
        }

        @Override // io.realm.e0.e
        public void g(io.realm.a aVar) {
            this.f31775c.set(aVar);
            this.f31773a.set(0);
            this.f31774b.incrementAndGet();
        }

        /* synthetic */ f(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        protected final ThreadLocal<Integer> f31773a;

        /* renamed from: b  reason: collision with root package name */
        protected AtomicInteger f31774b;

        private e() {
            this.f31773a = new ThreadLocal<>();
            this.f31774b = new AtomicInteger(0);
        }

        abstract void a();

        public int b() {
            return this.f31774b.get();
        }

        abstract io.realm.a c();

        abstract int d();

        abstract boolean e();

        public void f(int i11) {
            Integer num = this.f31773a.get();
            ThreadLocal<Integer> threadLocal = this.f31773a;
            if (num != null) {
                i11 += num.intValue();
            }
            threadLocal.set(Integer.valueOf(i11));
        }

        abstract void g(io.realm.a aVar);

        public void h(int i11) {
            this.f31773a.set(Integer.valueOf(i11));
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }
}