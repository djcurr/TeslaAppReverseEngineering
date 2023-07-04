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
public class x0 extends ct.l implements io.realm.internal.m {

    /* renamed from: e  reason: collision with root package name */
    private static final OsObjectSchemaInfo f32003e = o();

    /* renamed from: c  reason: collision with root package name */
    private a f32004c;

    /* renamed from: d  reason: collision with root package name */
    private z<ct.l> f32005d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f32006e;

        /* renamed from: f  reason: collision with root package name */
        long f32007f;

        a(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo b11 = osSchemaInfo.b("RealmRawItem");
            this.f32006e = a("async_key", "async_key", b11);
            this.f32007f = a("async_value", "async_value", b11);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f32006e = aVar.f32006e;
            aVar2.f32007f = aVar.f32007f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x0() {
        this.f32005d.i();
    }

    public static ct.l k(a0 a0Var, a aVar, ct.l lVar, boolean z11, Map<l0, io.realm.internal.m> map, Set<o> set) {
        io.realm.internal.m mVar = map.get(lVar);
        if (mVar != null) {
            return (ct.l) mVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(a0Var.Z0(ct.l.class), set);
        osObjectBuilder.g(aVar.f32006e, lVar.c());
        osObjectBuilder.a(aVar.f32007f, lVar.b());
        x0 q11 = q(a0Var, osObjectBuilder.j());
        map.put(lVar, q11);
        return q11;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ct.l l(io.realm.a0 r7, io.realm.x0.a r8, ct.l r9, boolean r10, java.util.Map<io.realm.l0, io.realm.internal.m> r11, java.util.Set<io.realm.o> r12) {
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
            ct.l r1 = (ct.l) r1
            return r1
        L51:
            r1 = 0
            if (r10 == 0) goto L93
            java.lang.Class<ct.l> r2 = ct.l.class
            io.realm.internal.Table r2 = r7.Z0(r2)
            long r3 = r8.f32006e
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
            io.realm.x0 r1 = new io.realm.x0     // Catch: java.lang.Throwable -> L8e
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
            ct.l r7 = r(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            ct.l r7 = k(r7, r8, r9, r10, r11, r12)
        La5:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.x0.l(io.realm.a0, io.realm.x0$a, ct.l, boolean, java.util.Map, java.util.Set):ct.l");
    }

    public static a m(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static ct.l n(ct.l lVar, int i11, int i12, Map<l0, m.a<l0>> map) {
        ct.l lVar2;
        if (i11 > i12 || lVar == null) {
            return null;
        }
        m.a<l0> aVar = map.get(lVar);
        if (aVar == null) {
            lVar2 = new ct.l();
            map.put(lVar, new m.a<>(i11, lVar2));
        } else if (i11 >= aVar.f31949a) {
            return (ct.l) aVar.f31950b;
        } else {
            aVar.f31949a = i11;
            lVar2 = (ct.l) aVar.f31950b;
        }
        a0 a0Var = (a0) ((io.realm.internal.m) lVar).d().c();
        lVar2.a(lVar.c());
        lVar2.g(lVar.b());
        return lVar2;
    }

    private static OsObjectSchemaInfo o() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "RealmRawItem", false, 2, 0);
        bVar.a("", "async_key", RealmFieldType.STRING, true, false, false);
        bVar.a("", "async_value", RealmFieldType.BINARY, false, false, false);
        return bVar.b();
    }

    public static OsObjectSchemaInfo p() {
        return f32003e;
    }

    static x0 q(io.realm.a aVar, io.realm.internal.o oVar) {
        a.d dVar = io.realm.a.f31739i.get();
        dVar.g(aVar, oVar, aVar.L().e(ct.l.class), false, Collections.emptyList());
        x0 x0Var = new x0();
        dVar.a();
        return x0Var;
    }

    static ct.l r(a0 a0Var, a aVar, ct.l lVar, ct.l lVar2, Map<l0, io.realm.internal.m> map, Set<o> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(a0Var.Z0(ct.l.class), set);
        osObjectBuilder.g(aVar.f32006e, lVar2.c());
        osObjectBuilder.a(aVar.f32007f, lVar2.b());
        osObjectBuilder.l();
        return lVar;
    }

    @Override // ct.l, io.realm.y0
    public void a(String str) {
        if (this.f32005d.e()) {
            return;
        }
        this.f32005d.c().g();
        throw new RealmException("Primary key field 'async_key' cannot be changed after object was created.");
    }

    @Override // ct.l, io.realm.y0
    public byte[] b() {
        this.f32005d.c().g();
        return this.f32005d.d().getBinaryByteArray(this.f32004c.f32007f);
    }

    @Override // ct.l, io.realm.y0
    public String c() {
        this.f32005d.c().g();
        return this.f32005d.d().getString(this.f32004c.f32006e);
    }

    @Override // io.realm.internal.m
    public z<?> d() {
        return this.f32005d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x0.class != obj.getClass()) {
            return false;
        }
        x0 x0Var = (x0) obj;
        io.realm.a c11 = this.f32005d.c();
        io.realm.a c12 = x0Var.f32005d.c();
        String path = c11.getPath();
        String path2 = c12.getPath();
        if (path == null ? path2 == null : path.equals(path2)) {
            if (c11.a0() == c12.a0() && c11.f31744e.getVersionID().equals(c12.f31744e.getVersionID())) {
                String o11 = this.f32005d.d().getTable().o();
                String o12 = x0Var.f32005d.d().getTable().o();
                if (o11 == null ? o12 == null : o11.equals(o12)) {
                    return this.f32005d.d().getObjectKey() == x0Var.f32005d.d().getObjectKey();
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // io.realm.internal.m
    public void f() {
        if (this.f32005d != null) {
            return;
        }
        a.d dVar = io.realm.a.f31739i.get();
        this.f32004c = (a) dVar.c();
        z<ct.l> zVar = new z<>(this);
        this.f32005d = zVar;
        zVar.k(dVar.e());
        this.f32005d.l(dVar.f());
        this.f32005d.h(dVar.b());
        this.f32005d.j(dVar.d());
    }

    @Override // ct.l, io.realm.y0
    public void g(byte[] bArr) {
        if (this.f32005d.e()) {
            if (this.f32005d.b()) {
                io.realm.internal.o d11 = this.f32005d.d();
                if (bArr == null) {
                    d11.getTable().z(this.f32004c.f32007f, d11.getObjectKey(), true);
                    return;
                } else {
                    d11.getTable().y(this.f32004c.f32007f, d11.getObjectKey(), bArr, true);
                    return;
                }
            }
            return;
        }
        this.f32005d.c().g();
        if (bArr == null) {
            this.f32005d.d().setNull(this.f32004c.f32007f);
        } else {
            this.f32005d.d().setBinaryByteArray(this.f32004c.f32007f, bArr);
        }
    }

    public int hashCode() {
        String path = this.f32005d.c().getPath();
        String o11 = this.f32005d.d().getTable().o();
        long objectKey = this.f32005d.d().getObjectKey();
        return ((((527 + (path != null ? path.hashCode() : 0)) * 31) + (o11 != null ? o11.hashCode() : 0)) * 31) + ((int) ((objectKey >>> 32) ^ objectKey));
    }

    public String toString() {
        if (n0.j(this)) {
            StringBuilder sb2 = new StringBuilder("RealmRawItem = proxy[");
            sb2.append("{async_key:");
            String c11 = c();
            String str = Address.ADDRESS_NULL_PLACEHOLDER;
            sb2.append(c11 != null ? c() : Address.ADDRESS_NULL_PLACEHOLDER);
            sb2.append("}");
            sb2.append(",");
            sb2.append("{async_value:");
            if (b() != null) {
                str = "binary(" + b().length + ")";
            }
            sb2.append(str);
            sb2.append("}");
            sb2.append("]");
            return sb2.toString();
        }
        return "Invalid object";
    }
}