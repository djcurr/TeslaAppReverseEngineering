package io.realm;

import io.realm.internal.OsObjectStore;
import io.realm.internal.Table;
import io.realm.p0;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes5.dex */
class q extends p0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f31975a;

        static {
            int[] iArr = new int[RealmFieldType.values().length];
            f31975a = iArr;
            try {
                iArr[RealmFieldType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31975a[RealmFieldType.DATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(io.realm.a aVar, r0 r0Var, Table table) {
        super(aVar, r0Var, table, new p0.a(table));
    }

    private void i(String str, k[] kVarArr) {
        if (kVarArr != null) {
            boolean z11 = false;
            try {
                if (kVarArr.length > 0) {
                    if (p(kVarArr, k.INDEXED)) {
                        h(str);
                        z11 = true;
                    }
                    if (p(kVarArr, k.PRIMARY_KEY)) {
                        j(str);
                    }
                }
            } catch (Exception e11) {
                long e12 = e(str);
                if (z11) {
                    this.f31972b.x(e12);
                }
                throw ((RuntimeException) e11);
            }
        }
    }

    private void k() {
        if (this.f31971a.f31742c.t()) {
            throw new UnsupportedOperationException("'addPrimaryKey' is not supported by synced Realms.");
        }
    }

    private void l(String str) {
        if (this.f31972b.j(str) == -1) {
            return;
        }
        throw new IllegalArgumentException("Field already exists in '" + d() + "': " + str);
    }

    private void m(String str, RealmFieldType realmFieldType) {
        int i11 = a.f31975a[realmFieldType.ordinal()];
        if (i11 == 1) {
            throw new IllegalArgumentException("Boolean fields cannot be marked as primary keys: " + str);
        } else if (i11 != 2) {
        } else {
            throw new IllegalArgumentException("Date fields cannot be marked as primary keys: " + str);
        }
    }

    private void n(String str, Class<?> cls) {
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            m(str, RealmFieldType.BOOLEAN);
        }
        if (cls == Date.class) {
            m(str, RealmFieldType.DATE);
        }
    }

    private void o(String str) {
        p0.c(str);
        l(str);
    }

    static boolean p(k[] kVarArr, k kVar) {
        if (kVarArr != null && kVarArr.length != 0) {
            for (k kVar2 : kVarArr) {
                if (kVar2 == kVar) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // io.realm.p0
    public p0 a(String str, Class<?> cls, k... kVarArr) {
        p0.b bVar = p0.f31967c.get(cls);
        if (bVar == null) {
            if (!p0.f31970f.containsKey(cls)) {
                if (l0.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Use 'addRealmObjectField()' instead to add fields that link to other RealmObjects: %s(%s)", str, cls));
                }
                throw new IllegalArgumentException(String.format(Locale.US, "Realm doesn't support this field type: %s(%s)", str, cls));
            }
            throw new IllegalArgumentException("Use addRealmObjectField() instead to add fields that link to other RealmObjects: " + str);
        }
        if (p(kVarArr, k.PRIMARY_KEY)) {
            k();
            n(str, cls);
        }
        o(str);
        long a11 = this.f31972b.a(bVar.f31973a, str, p(kVarArr, k.REQUIRED) ? false : bVar.f31974b);
        try {
            i(str, kVarArr);
            return this;
        } catch (Exception e11) {
            this.f31972b.w(a11);
            throw e11;
        }
    }

    public p0 h(String str) {
        p0.c(str);
        b(str);
        long e11 = e(str);
        if (!this.f31972b.t(e11)) {
            this.f31972b.b(e11);
            return this;
        }
        throw new IllegalStateException(str + " already has an index.");
    }

    public p0 j(String str) {
        k();
        p0.c(str);
        b(str);
        String b11 = OsObjectStore.b(this.f31971a.f31744e, d());
        if (b11 == null) {
            long e11 = e(str);
            RealmFieldType f11 = f(str);
            m(str, f11);
            if (f11 != RealmFieldType.STRING && !this.f31972b.t(e11)) {
                this.f31972b.b(e11);
            }
            OsObjectStore.d(this.f31971a.f31744e, d(), str);
            return this;
        }
        throw new IllegalStateException(String.format(Locale.ENGLISH, "Field '%s' has been already defined as primary key.", b11));
    }
}