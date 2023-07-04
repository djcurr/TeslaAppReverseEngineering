package io.realm;

import android.content.Context;
import io.realm.a0;
import io.realm.exceptions.RealmException;
import io.realm.internal.CheckedRow;
import io.realm.internal.OsRealmConfig;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.Table;
import io.realm.internal.UncheckedRow;
import io.realm.log.RealmLog;
import java.io.Closeable;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class a implements Closeable {

    /* renamed from: h  reason: collision with root package name */
    static volatile Context f31738h;

    /* renamed from: i  reason: collision with root package name */
    public static final e f31739i;

    /* renamed from: a  reason: collision with root package name */
    final boolean f31740a;

    /* renamed from: b  reason: collision with root package name */
    final long f31741b;

    /* renamed from: c  reason: collision with root package name */
    protected final g0 f31742c;

    /* renamed from: d  reason: collision with root package name */
    private e0 f31743d;

    /* renamed from: e  reason: collision with root package name */
    public OsSharedRealm f31744e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f31745f;

    /* renamed from: g  reason: collision with root package name */
    private OsSharedRealm.SchemaChangedCallback f31746g;

    /* renamed from: io.realm.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class C0596a implements OsSharedRealm.SchemaChangedCallback {
        C0596a() {
        }

        @Override // io.realm.internal.OsSharedRealm.SchemaChangedCallback
        public void onSchemaChanged() {
            r0 L = a.this.L();
            if (L != null) {
                L.m();
            }
            if (a.this instanceof a0) {
                L.d();
            }
        }
    }

    /* loaded from: classes5.dex */
    class b implements OsSharedRealm.InitializationCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a0.a f31748a;

        b(a0.a aVar) {
            this.f31748a = aVar;
        }

        @Override // io.realm.internal.OsSharedRealm.InitializationCallback
        public void onInit(OsSharedRealm osSharedRealm) {
            this.f31748a.a(a0.R0(osSharedRealm));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class c implements OsSharedRealm.MigrationCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k0 f31750a;

        c(k0 k0Var) {
            this.f31750a = k0Var;
        }

        @Override // io.realm.internal.OsSharedRealm.MigrationCallback
        public void onMigrationNeeded(OsSharedRealm osSharedRealm, long j11, long j12) {
            this.f31750a.a(h.p0(osSharedRealm), j11, j12);
        }
    }

    /* loaded from: classes5.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private a f31751a;

        /* renamed from: b  reason: collision with root package name */
        private io.realm.internal.o f31752b;

        /* renamed from: c  reason: collision with root package name */
        private io.realm.internal.c f31753c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f31754d;

        /* renamed from: e  reason: collision with root package name */
        private List<String> f31755e;

        public void a() {
            this.f31751a = null;
            this.f31752b = null;
            this.f31753c = null;
            this.f31754d = false;
            this.f31755e = null;
        }

        public boolean b() {
            return this.f31754d;
        }

        public io.realm.internal.c c() {
            return this.f31753c;
        }

        public List<String> d() {
            return this.f31755e;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a e() {
            return this.f31751a;
        }

        public io.realm.internal.o f() {
            return this.f31752b;
        }

        public void g(a aVar, io.realm.internal.o oVar, io.realm.internal.c cVar, boolean z11, List<String> list) {
            this.f31751a = aVar;
            this.f31752b = oVar;
            this.f31753c = cVar;
            this.f31754d = z11;
            this.f31755e = list;
        }
    }

    /* loaded from: classes5.dex */
    static final class e extends ThreadLocal<d> {
        e() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public d initialValue() {
            return new d();
        }
    }

    static {
        io.realm.internal.async.a.c();
        io.realm.internal.async.a.d();
        f31739i = new e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(e0 e0Var, OsSchemaInfo osSchemaInfo, OsSharedRealm.a aVar) {
        this(e0Var.i(), osSchemaInfo, aVar);
        this.f31743d = e0Var;
    }

    private static OsSharedRealm.MigrationCallback l(k0 k0Var) {
        return new c(k0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <E extends l0> E C(Class<E> cls, String str, long j11) {
        boolean z11 = str != null;
        Table j12 = z11 ? L().j(str) : L().i(cls);
        if (z11) {
            return new j(this, j11 != -1 ? j12.f(j11) : io.realm.internal.f.INSTANCE);
        }
        return (E) this.f31742c.n().q(cls, this, j11 != -1 ? j12.r(j11) : io.realm.internal.f.INSTANCE, L().e(cls), false, Collections.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <E extends l0> E D(Class<E> cls, String str, UncheckedRow uncheckedRow) {
        if (str != null) {
            return new j(this, CheckedRow.e(uncheckedRow));
        }
        return (E) this.f31742c.n().q(cls, this, uncheckedRow, L().e(cls), false, Collections.emptyList());
    }

    public g0 J() {
        return this.f31742c;
    }

    public abstract r0 L();

    /* JADX INFO: Access modifiers changed from: package-private */
    public OsSharedRealm R() {
        return this.f31744e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
        if (R().capabilities.a() && !J().q()) {
            throw new RealmException("Queries on the UI thread have been disabled. They can be enabled by setting 'RealmConfiguration.Builder.allowQueriesOnUiThread(true)'.");
        }
    }

    public boolean a0() {
        OsSharedRealm osSharedRealm = this.f31744e;
        if (osSharedRealm != null && !osSharedRealm.isClosed()) {
            return this.f31740a;
        }
        throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
    }

    public void beginTransaction() {
        g();
        this.f31744e.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f31740a && this.f31741b != Thread.currentThread().getId()) {
            throw new IllegalStateException("Realm access from incorrect thread. Realm instance can only be closed on the thread it was created.");
        }
        e0 e0Var = this.f31743d;
        if (e0Var != null) {
            e0Var.o(this);
        } else {
            m();
        }
    }

    public boolean e0() {
        g();
        return this.f31744e.isInTransaction();
    }

    protected void finalize() {
        OsSharedRealm osSharedRealm;
        if (this.f31745f && (osSharedRealm = this.f31744e) != null && !osSharedRealm.isClosed()) {
            RealmLog.g("Remember to call close() on all Realm instances. Realm %s is being finalized without being closed, this can lead to running out of native memory.", this.f31742c.k());
            e0 e0Var = this.f31743d;
            if (e0Var != null) {
                e0Var.n();
            }
        }
        super.finalize();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g() {
        OsSharedRealm osSharedRealm = this.f31744e;
        if (osSharedRealm != null && !osSharedRealm.isClosed()) {
            if (!this.f31740a && this.f31741b != Thread.currentThread().getId()) {
                throw new IllegalStateException("Realm access from incorrect thread. Realm objects can only be accessed on the thread they were created.");
            }
            return;
        }
        throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
    }

    public String getPath() {
        return this.f31742c.k();
    }

    public boolean isClosed() {
        if (!this.f31740a && this.f31741b != Thread.currentThread().getId()) {
            throw new IllegalStateException("Realm access from incorrect thread. Realm objects can only be accessed on the thread they were created.");
        }
        OsSharedRealm osSharedRealm = this.f31744e;
        return osSharedRealm == null || osSharedRealm.isClosed();
    }

    public void j() {
        g();
        this.f31744e.commitTransaction();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m() {
        this.f31743d = null;
        OsSharedRealm osSharedRealm = this.f31744e;
        if (osSharedRealm == null || !this.f31745f) {
            return;
        }
        osSharedRealm.close();
        this.f31744e = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <E extends l0> E p(Class<E> cls, long j11, boolean z11, List<String> list) {
        return (E) this.f31742c.n().q(cls, this, L().i(cls).r(j11), L().e(cls), z11, list);
    }

    a(g0 g0Var, OsSchemaInfo osSchemaInfo, OsSharedRealm.a aVar) {
        this.f31746g = new C0596a();
        this.f31741b = Thread.currentThread().getId();
        this.f31742c = g0Var;
        this.f31743d = null;
        OsSharedRealm.MigrationCallback l11 = (osSchemaInfo == null || g0Var.i() == null) ? null : l(g0Var.i());
        a0.a g11 = g0Var.g();
        OsSharedRealm osSharedRealm = OsSharedRealm.getInstance(new OsRealmConfig.b(g0Var).c(new File(f31738h.getFilesDir(), ".realm.temp")).a(true).e(l11).f(osSchemaInfo).d(g11 != null ? new b(g11) : null), aVar);
        this.f31744e = osSharedRealm;
        this.f31740a = osSharedRealm.isFrozen();
        this.f31745f = true;
        this.f31744e.registerSchemaChangedCallback(this.f31746g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(OsSharedRealm osSharedRealm) {
        this.f31746g = new C0596a();
        this.f31741b = Thread.currentThread().getId();
        this.f31742c = osSharedRealm.getConfiguration();
        this.f31743d = null;
        this.f31744e = osSharedRealm;
        this.f31740a = osSharedRealm.isFrozen();
        this.f31745f = false;
    }
}