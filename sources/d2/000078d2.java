package io.realm;

import com.adyen.checkout.components.model.payments.request.Address;
import io.realm.a;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.m;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class v0 extends ct.j implements io.realm.internal.m {

    /* renamed from: e  reason: collision with root package name */
    private static final OsObjectSchemaInfo f31987e = s();

    /* renamed from: c  reason: collision with root package name */
    private a f31988c;

    /* renamed from: d  reason: collision with root package name */
    private z<ct.j> f31989d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f31990e;

        /* renamed from: f  reason: collision with root package name */
        long f31991f;

        a(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo b11 = osSchemaInfo.b("RealmItem");
            this.f31990e = a("async_key", "async_key", b11);
            this.f31991f = a("async_value", "async_value", b11);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f31990e = aVar.f31990e;
            aVar2.f31991f = aVar.f31991f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v0() {
        this.f31989d.i();
    }

    public static ct.j o(a0 a0Var, a aVar, ct.j jVar, boolean z11, Map<l0, io.realm.internal.m> map, Set<o> set) {
        io.realm.internal.m mVar = map.get(jVar);
        if (mVar != null) {
            return (ct.j) mVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(a0Var.Z0(ct.j.class), set);
        osObjectBuilder.g(aVar.f31990e, jVar.c());
        osObjectBuilder.g(aVar.f31991f, jVar.b());
        v0 u11 = u(a0Var, osObjectBuilder.j());
        map.put(jVar, u11);
        return u11;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ct.j p(io.realm.a0 r7, io.realm.v0.a r8, ct.j r9, boolean r10, java.util.Map<io.realm.l0, io.realm.internal.m> r11, java.util.Set<io.realm.o> r12) {
        /*
            boolean r0 = r9 instanceof io.realm.internal.m
            if (r0 == 0) goto L3e
            boolean r0 = io.realm.n0.h(r9)
            if (r0 != 0) goto L3e
            r0 = r9
            io.realm.internal.m r0 = (io.realm.internal.m) r0
            io.realm.z r1 = r0.d()
            io.realm.a r1 = r1.c()
            if (r1 == 0) goto L3e
            io.realm.z r0 = r0.d()
            io.realm.a r0 = r0.c()
            long r1 = r0.f31741b
            long r3 = r7.f31741b
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L36
            java.lang.String r0 = r0.getPath()
            java.lang.String r1 = r7.getPath()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3e
            return r9
        L36:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Objects which belong to Realm instances in other threads cannot be copied into this Realm instance."
            r7.<init>(r8)
            throw r7
        L3e:
            io.realm.a$e r0 = io.realm.a.f31739i
            java.lang.Object r0 = r0.get()
            io.realm.a$d r0 = (io.realm.a.d) r0
            java.lang.Object r1 = r11.get(r9)
            io.realm.internal.m r1 = (io.realm.internal.m) r1
            if (r1 == 0) goto L51
            ct.j r1 = (ct.j) r1
            return r1
        L51:
            r1 = 0
            if (r10 == 0) goto L93
            java.lang.Class<ct.j> r2 = ct.j.class
            io.realm.internal.Table r2 = r7.Z0(r2)
            long r3 = r8.f31990e
            java.lang.String r5 = r9.c()
            if (r5 != 0) goto L67
            long r3 = r2.d(r3)
            goto L6b
        L67:
            long r3 = r2.e(r3, r5)
        L6b:
            r5 = -1
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L73
            r0 = 0
            goto L94
        L73:
            io.realm.internal.UncheckedRow r3 = r2.r(r3)     // Catch: java.lang.Throwable -> L8e
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L8e
            r1 = r0
            r2 = r7
            r4 = r8
            r1.g(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L8e
            io.realm.v0 r1 = new io.realm.v0     // Catch: java.lang.Throwable -> L8e
            r1.<init>()     // Catch: java.lang.Throwable -> L8e
            r11.put(r9, r1)     // Catch: java.lang.Throwable -> L8e
            r0.a()
            goto L93
        L8e:
            r7 = move-exception
            r0.a()
            throw r7
        L93:
            r0 = r10
        L94:
            r3 = r1
            if (r0 == 0) goto La1
            r1 = r7
            r2 = r8
            r4 = r9
            r5 = r11
            r6 = r12
            ct.j r7 = v(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            ct.j r7 = o(r7, r8, r9, r10, r11, r12)
        La5:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.v0.p(io.realm.a0, io.realm.v0$a, ct.j, boolean, java.util.Map, java.util.Set):ct.j");
    }

    public static a q(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static ct.j r(ct.j jVar, int i11, int i12, Map<l0, m.a<l0>> map) {
        ct.j jVar2;
        if (i11 > i12 || jVar == null) {
            return null;
        }
        m.a<l0> aVar = map.get(jVar);
        if (aVar == null) {
            jVar2 = new ct.j();
            map.put(jVar, new m.a<>(i11, jVar2));
        } else if (i11 >= aVar.f31949a) {
            return (ct.j) aVar.f31950b;
        } else {
            aVar.f31949a = i11;
            jVar2 = (ct.j) aVar.f31950b;
        }
        a0 a0Var = (a0) ((io.realm.internal.m) jVar).d().c();
        jVar2.a(jVar.c());
        jVar2.e(jVar.b());
        return jVar2;
    }

    private static OsObjectSchemaInfo s() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "RealmItem", false, 2, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.a("", "async_key", realmFieldType, true, false, false);
        bVar.a("", "async_value", realmFieldType, false, false, false);
        return bVar.b();
    }

    public static OsObjectSchemaInfo t() {
        return f31987e;
    }

    static v0 u(io.realm.a aVar, io.realm.internal.o oVar) {
        a.d dVar = io.realm.a.f31739i.get();
        dVar.g(aVar, oVar, aVar.L().e(ct.j.class), false, Collections.emptyList());
        v0 v0Var = new v0();
        dVar.a();
        return v0Var;
    }

    static ct.j v(a0 a0Var, a aVar, ct.j jVar, ct.j jVar2, Map<l0, io.realm.internal.m> map, Set<o> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(a0Var.Z0(ct.j.class), set);
        osObjectBuilder.g(aVar.f31990e, jVar2.c());
        osObjectBuilder.g(aVar.f31991f, jVar2.b());
        osObjectBuilder.l();
        return jVar;
    }

    @Override // ct.j, io.realm.w0
    public void a(String str) {
        if (this.f31989d.e()) {
            return;
        }
        this.f31989d.c().g();
        throw new RealmException("Primary key field 'async_key' cannot be changed after object was created.");
    }

    @Override // ct.j, io.realm.w0
    public String b() {
        this.f31989d.c().g();
        return this.f31989d.d().getString(this.f31988c.f31991f);
    }

    @Override // ct.j, io.realm.w0
    public String c() {
        this.f31989d.c().g();
        return this.f31989d.d().getString(this.f31988c.f31990e);
    }

    @Override // io.realm.internal.m
    public z<?> d() {
        return this.f31989d;
    }

    @Override // ct.j, io.realm.w0
    public void e(String str) {
        if (this.f31989d.e()) {
            if (this.f31989d.b()) {
                io.realm.internal.o d11 = this.f31989d.d();
                if (str == null) {
                    d11.getTable().z(this.f31988c.f31991f, d11.getObjectKey(), true);
                    return;
                } else {
                    d11.getTable().A(this.f31988c.f31991f, d11.getObjectKey(), str, true);
                    return;
                }
            }
            return;
        }
        this.f31989d.c().g();
        if (str == null) {
            this.f31989d.d().setNull(this.f31988c.f31991f);
        } else {
            this.f31989d.d().setString(this.f31988c.f31991f, str);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        io.realm.a c11 = this.f31989d.c();
        io.realm.a c12 = v0Var.f31989d.c();
        String path = c11.getPath();
        String path2 = c12.getPath();
        if (path == null ? path2 == null : path.equals(path2)) {
            if (c11.a0() == c12.a0() && c11.f31744e.getVersionID().equals(c12.f31744e.getVersionID())) {
                String o11 = this.f31989d.d().getTable().o();
                String o12 = v0Var.f31989d.d().getTable().o();
                if (o11 == null ? o12 == null : o11.equals(o12)) {
                    return this.f31989d.d().getObjectKey() == v0Var.f31989d.d().getObjectKey();
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // io.realm.internal.m
    public void f() {
        if (this.f31989d != null) {
            return;
        }
        a.d dVar = io.realm.a.f31739i.get();
        this.f31988c = (a) dVar.c();
        z<ct.j> zVar = new z<>(this);
        this.f31989d = zVar;
        zVar.k(dVar.e());
        this.f31989d.l(dVar.f());
        this.f31989d.h(dVar.b());
        this.f31989d.j(dVar.d());
    }

    public int hashCode() {
        String path = this.f31989d.c().getPath();
        String o11 = this.f31989d.d().getTable().o();
        long objectKey = this.f31989d.d().getObjectKey();
        return ((((527 + (path != null ? path.hashCode() : 0)) * 31) + (o11 != null ? o11.hashCode() : 0)) * 31) + ((int) ((objectKey >>> 32) ^ objectKey));
    }

    public String toString() {
        if (n0.j(this)) {
            StringBuilder sb2 = new StringBuilder("RealmItem = proxy[");
            sb2.append("{async_key:");
            String c11 = c();
            String str = Address.ADDRESS_NULL_PLACEHOLDER;
            sb2.append(c11 != null ? c() : Address.ADDRESS_NULL_PLACEHOLDER);
            sb2.append("}");
            sb2.append(",");
            sb2.append("{async_value:");
            if (b() != null) {
                str = b();
            }
            sb2.append(str);
            sb2.append("}");
            sb2.append("]");
            return sb2.toString();
        }
        return "Invalid object";
    }
}