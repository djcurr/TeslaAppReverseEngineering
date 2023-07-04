package io.realm;

import android.content.Context;
import io.realm.a0;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsRealmConfig;
import io.realm.internal.Util;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes5.dex */
public class g0 {

    /* renamed from: r  reason: collision with root package name */
    private static final Object f31776r;

    /* renamed from: s  reason: collision with root package name */
    protected static final io.realm.internal.n f31777s;

    /* renamed from: a  reason: collision with root package name */
    private final File f31778a;

    /* renamed from: b  reason: collision with root package name */
    private final String f31779b;

    /* renamed from: c  reason: collision with root package name */
    private final String f31780c;

    /* renamed from: d  reason: collision with root package name */
    private final String f31781d;

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f31782e;

    /* renamed from: f  reason: collision with root package name */
    private final long f31783f;

    /* renamed from: g  reason: collision with root package name */
    private final k0 f31784g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f31785h;

    /* renamed from: i  reason: collision with root package name */
    private final OsRealmConfig.c f31786i;

    /* renamed from: j  reason: collision with root package name */
    private final io.realm.internal.n f31787j;

    /* renamed from: k  reason: collision with root package name */
    private final iz.b f31788k;

    /* renamed from: l  reason: collision with root package name */
    private final a0.a f31789l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f31790m;

    /* renamed from: n  reason: collision with root package name */
    private final CompactOnLaunchCallback f31791n;

    /* renamed from: o  reason: collision with root package name */
    private final long f31792o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f31793p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f31794q;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private File f31795a;

        /* renamed from: b  reason: collision with root package name */
        private String f31796b;

        /* renamed from: c  reason: collision with root package name */
        private String f31797c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f31798d;

        /* renamed from: e  reason: collision with root package name */
        private long f31799e;

        /* renamed from: f  reason: collision with root package name */
        private k0 f31800f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f31801g;

        /* renamed from: h  reason: collision with root package name */
        private OsRealmConfig.c f31802h;

        /* renamed from: i  reason: collision with root package name */
        private HashSet<Object> f31803i;

        /* renamed from: j  reason: collision with root package name */
        private HashSet<Class<? extends l0>> f31804j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f31805k;

        /* renamed from: l  reason: collision with root package name */
        private iz.b f31806l;

        /* renamed from: m  reason: collision with root package name */
        private ez.a f31807m;

        /* renamed from: n  reason: collision with root package name */
        private a0.a f31808n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f31809o;

        /* renamed from: p  reason: collision with root package name */
        private CompactOnLaunchCallback f31810p;

        /* renamed from: q  reason: collision with root package name */
        private long f31811q;

        /* renamed from: r  reason: collision with root package name */
        private boolean f31812r;

        /* renamed from: s  reason: collision with root package name */
        private boolean f31813s;

        public a() {
            this(io.realm.a.f31738h);
        }

        private void b(Context context) {
            this.f31795a = context.getFilesDir();
            this.f31796b = "default.realm";
            this.f31798d = null;
            this.f31799e = 0L;
            this.f31800f = null;
            this.f31801g = false;
            this.f31802h = OsRealmConfig.c.FULL;
            this.f31809o = false;
            this.f31810p = null;
            if (g0.f31776r != null) {
                this.f31803i.add(g0.f31776r);
            }
            this.f31812r = false;
            this.f31813s = true;
        }

        public g0 a() {
            if (this.f31809o) {
                if (this.f31808n == null) {
                    if (this.f31797c != null) {
                        if (!this.f31801g) {
                            if (this.f31810p != null) {
                                throw new IllegalStateException("'compactOnLaunch()' and read-only Realms cannot be combined");
                            }
                        } else {
                            throw new IllegalStateException("'deleteRealmIfMigrationNeeded()' and read-only Realms cannot be combined");
                        }
                    } else {
                        throw new IllegalStateException("Only Realms provided using 'assetFile(path)' can be marked read-only. No such Realm was provided.");
                    }
                } else {
                    throw new IllegalStateException("This Realm is marked as read-only. Read-only Realms cannot use initialData(Realm.Transaction).");
                }
            }
            if (this.f31806l == null && Util.f()) {
                this.f31806l = new iz.a(true);
            }
            if (this.f31807m == null && Util.d()) {
                this.f31807m = new ez.b(Boolean.TRUE);
            }
            return new g0(new File(this.f31795a, this.f31796b), this.f31797c, this.f31798d, this.f31799e, this.f31800f, this.f31801g, this.f31802h, g0.b(this.f31803i, this.f31804j, this.f31805k), this.f31806l, this.f31807m, this.f31808n, this.f31809o, this.f31810p, false, this.f31811q, this.f31812r, this.f31813s);
        }

        public a c(k0 k0Var) {
            if (k0Var != null) {
                this.f31800f = k0Var;
                return this;
            }
            throw new IllegalArgumentException("A non-null migration must be provided");
        }

        public a d(String str) {
            if (str != null && !str.isEmpty()) {
                this.f31796b = str;
                return this;
            }
            throw new IllegalArgumentException("A non-empty filename must be provided");
        }

        public a e(long j11) {
            if (j11 >= 0) {
                this.f31799e = j11;
                return this;
            }
            throw new IllegalArgumentException("Realm schema version numbers must be 0 (zero) or higher. Yours was: " + j11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Context context) {
            this.f31803i = new HashSet<>();
            this.f31804j = new HashSet<>();
            this.f31805k = false;
            this.f31811q = Long.MAX_VALUE;
            if (context != null) {
                io.realm.internal.l.a(context);
                b(context);
                return;
            }
            throw new IllegalStateException("Call `Realm.init(Context)` before creating a RealmConfiguration");
        }
    }

    static {
        Object S0 = a0.S0();
        f31776r = S0;
        if (S0 != null) {
            io.realm.internal.n j11 = j(S0.getClass().getCanonicalName());
            if (j11.r()) {
                f31777s = j11;
                return;
            }
            throw new ExceptionInInitializerError("RealmTransformer doesn't seem to be applied. Please update the project configuration to use the Realm Gradle plugin. See https://realm.io/news/android-installation-change/");
        }
        f31777s = null;
    }

    protected g0(File file, String str, byte[] bArr, long j11, k0 k0Var, boolean z11, OsRealmConfig.c cVar, io.realm.internal.n nVar, iz.b bVar, ez.a aVar, a0.a aVar2, boolean z12, CompactOnLaunchCallback compactOnLaunchCallback, boolean z13, long j12, boolean z14, boolean z15) {
        this.f31778a = file.getParentFile();
        this.f31779b = file.getName();
        this.f31780c = file.getAbsolutePath();
        this.f31781d = str;
        this.f31782e = bArr;
        this.f31783f = j11;
        this.f31784g = k0Var;
        this.f31785h = z11;
        this.f31786i = cVar;
        this.f31787j = nVar;
        this.f31788k = bVar;
        this.f31789l = aVar2;
        this.f31790m = z12;
        this.f31791n = compactOnLaunchCallback;
        this.f31794q = z13;
        this.f31792o = j12;
        this.f31793p = z15;
    }

    protected static io.realm.internal.n b(Set<Object> set, Set<Class<? extends l0>> set2, boolean z11) {
        if (set2.size() > 0) {
            return new gz.b(f31777s, set2, z11);
        }
        if (set.size() == 1) {
            return j(set.iterator().next().getClass().getCanonicalName());
        }
        io.realm.internal.n[] nVarArr = new io.realm.internal.n[set.size()];
        int i11 = 0;
        for (Object obj : set) {
            nVarArr[i11] = j(obj.getClass().getCanonicalName());
            i11++;
        }
        return new gz.a(nVarArr);
    }

    private static io.realm.internal.n j(String str) {
        String[] split = str.split("\\.");
        String format = String.format(Locale.US, "io.realm.%s%s", split[split.length - 1], "Mediator");
        try {
            Constructor<?> constructor = Class.forName(format).getDeclaredConstructors()[0];
            constructor.setAccessible(true);
            return (io.realm.internal.n) constructor.newInstance(new Object[0]);
        } catch (ClassNotFoundException e11) {
            throw new RealmException("Could not find " + format, e11);
        } catch (IllegalAccessException e12) {
            throw new RealmException("Could not create an instance of " + format, e12);
        } catch (InstantiationException e13) {
            throw new RealmException("Could not create an instance of " + format, e13);
        } catch (InvocationTargetException e14) {
            throw new RealmException("Could not create an instance of " + format, e14);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c() {
        return this.f31781d;
    }

    public CompactOnLaunchCallback d() {
        return this.f31791n;
    }

    public OsRealmConfig.c e() {
        return this.f31786i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g0.class != obj.getClass()) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (this.f31783f == g0Var.f31783f && this.f31785h == g0Var.f31785h && this.f31790m == g0Var.f31790m && this.f31794q == g0Var.f31794q) {
            File file = this.f31778a;
            if (file == null ? g0Var.f31778a == null : file.equals(g0Var.f31778a)) {
                String str = this.f31779b;
                if (str == null ? g0Var.f31779b == null : str.equals(g0Var.f31779b)) {
                    if (this.f31780c.equals(g0Var.f31780c)) {
                        String str2 = this.f31781d;
                        if (str2 == null ? g0Var.f31781d == null : str2.equals(g0Var.f31781d)) {
                            if (Arrays.equals(this.f31782e, g0Var.f31782e)) {
                                k0 k0Var = this.f31784g;
                                if (k0Var == null ? g0Var.f31784g == null : k0Var.equals(g0Var.f31784g)) {
                                    if (this.f31786i == g0Var.f31786i && this.f31787j.equals(g0Var.f31787j)) {
                                        iz.b bVar = this.f31788k;
                                        if (bVar == null ? g0Var.f31788k == null : bVar.equals(g0Var.f31788k)) {
                                            a0.a aVar = this.f31789l;
                                            if (aVar == null ? g0Var.f31789l == null : aVar.equals(g0Var.f31789l)) {
                                                CompactOnLaunchCallback compactOnLaunchCallback = this.f31791n;
                                                if (compactOnLaunchCallback == null ? g0Var.f31791n == null : compactOnLaunchCallback.equals(g0Var.f31791n)) {
                                                    return this.f31792o == g0Var.f31792o;
                                                }
                                                return false;
                                            }
                                            return false;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public byte[] f() {
        byte[] bArr = this.f31782e;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a0.a g() {
        return this.f31789l;
    }

    public long h() {
        return this.f31792o;
    }

    public int hashCode() {
        File file = this.f31778a;
        int hashCode = (file != null ? file.hashCode() : 0) * 31;
        String str = this.f31779b;
        int hashCode2 = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f31780c.hashCode()) * 31;
        String str2 = this.f31781d;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        long j11 = this.f31783f;
        int hashCode4 = (((((hashCode2 + hashCode3) * 31) + Arrays.hashCode(this.f31782e)) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        k0 k0Var = this.f31784g;
        int hashCode5 = (((((((hashCode4 + (k0Var != null ? k0Var.hashCode() : 0)) * 31) + (this.f31785h ? 1 : 0)) * 31) + this.f31786i.hashCode()) * 31) + this.f31787j.hashCode()) * 31;
        iz.b bVar = this.f31788k;
        int hashCode6 = (hashCode5 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        a0.a aVar = this.f31789l;
        int hashCode7 = (((hashCode6 + (aVar != null ? aVar.hashCode() : 0)) * 31) + (this.f31790m ? 1 : 0)) * 31;
        CompactOnLaunchCallback compactOnLaunchCallback = this.f31791n;
        int hashCode8 = compactOnLaunchCallback != null ? compactOnLaunchCallback.hashCode() : 0;
        long j12 = this.f31792o;
        return ((((hashCode7 + hashCode8) * 31) + (this.f31794q ? 1 : 0)) * 31) + ((int) (j12 ^ (j12 >>> 32)));
    }

    public k0 i() {
        return this.f31784g;
    }

    public String k() {
        return this.f31780c;
    }

    public File l() {
        return this.f31778a;
    }

    public String m() {
        return this.f31779b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public io.realm.internal.n n() {
        return this.f31787j;
    }

    public long o() {
        return this.f31783f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p() {
        return !Util.e(this.f31781d);
    }

    public boolean q() {
        return this.f31793p;
    }

    public boolean r() {
        return this.f31790m;
    }

    public boolean s() {
        return this.f31794q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean t() {
        return false;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("realmDirectory: ");
        File file = this.f31778a;
        sb2.append(file != null ? file.toString() : "");
        sb2.append("\n");
        sb2.append("realmFileName : ");
        sb2.append(this.f31779b);
        sb2.append("\n");
        sb2.append("canonicalPath: ");
        sb2.append(this.f31780c);
        sb2.append("\n");
        sb2.append("key: ");
        sb2.append("[length: ");
        sb2.append(this.f31782e == null ? 0 : 64);
        sb2.append("]");
        sb2.append("\n");
        sb2.append("schemaVersion: ");
        sb2.append(Long.toString(this.f31783f));
        sb2.append("\n");
        sb2.append("migration: ");
        sb2.append(this.f31784g);
        sb2.append("\n");
        sb2.append("deleteRealmIfMigrationNeeded: ");
        sb2.append(this.f31785h);
        sb2.append("\n");
        sb2.append("durability: ");
        sb2.append(this.f31786i);
        sb2.append("\n");
        sb2.append("schemaMediator: ");
        sb2.append(this.f31787j);
        sb2.append("\n");
        sb2.append("readOnly: ");
        sb2.append(this.f31790m);
        sb2.append("\n");
        sb2.append("compactOnLaunch: ");
        sb2.append(this.f31791n);
        sb2.append("\n");
        sb2.append("maxNumberOfActiveVersions: ");
        sb2.append(this.f31792o);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean u() {
        return new File(this.f31780c).exists();
    }

    public boolean v() {
        return this.f31785h;
    }
}