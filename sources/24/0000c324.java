package yu;

import zu.z;

/* loaded from: classes6.dex */
public final class i {

    /* renamed from: a */
    public static final i f59792a = new i();

    /* renamed from: b */
    private static final cz.e<String> f59793b;

    /* renamed from: c */
    private static final cz.e<String> f59794c;

    /* renamed from: d */
    private static final cz.e<String> f59795d;

    /* loaded from: classes6.dex */
    public static final class a implements zu.z {
        a() {
        }

        @Override // zu.z
        public void a(String key, String value) {
            kotlin.jvm.internal.s.g(key, "key");
            kotlin.jvm.internal.s.g(value, "value");
            i.f59795d.b(value);
        }

        @Override // zu.z
        public void b(String key) {
            kotlin.jvm.internal.s.g(key, "key");
            z.a.a(this, key);
            i.f59795d.b("");
        }
    }

    /* loaded from: classes6.dex */
    public static final class b implements zu.z {
        b() {
        }

        @Override // zu.z
        public void a(String key, String value) {
            kotlin.jvm.internal.s.g(key, "key");
            kotlin.jvm.internal.s.g(value, "value");
            i.f59793b.b(value);
        }

        @Override // zu.z
        public void b(String key) {
            kotlin.jvm.internal.s.g(key, "key");
            z.a.a(this, key);
            i.f59793b.b("");
        }
    }

    /* loaded from: classes6.dex */
    public static final class c implements zu.z {
        c() {
        }

        @Override // zu.z
        public void a(String key, String value) {
            kotlin.jvm.internal.s.g(key, "key");
            kotlin.jvm.internal.s.g(value, "value");
            i.f59794c.b(value);
        }

        @Override // zu.z
        public void b(String key) {
            kotlin.jvm.internal.s.g(key, "key");
            z.a.a(this, key);
            i.f59794c.b("");
        }
    }

    static {
        cz.e U = cz.a.W().U();
        kotlin.jvm.internal.s.f(U, "create<String>().toSerialized()");
        f59793b = U;
        cz.e U2 = cz.a.W().U();
        kotlin.jvm.internal.s.f(U2, "create<String>().toSerialized()");
        f59794c = U2;
        cz.e U3 = cz.a.W().U();
        kotlin.jvm.internal.s.f(U3, "create<String>().toSerialized()");
        f59795d = U3;
    }

    private i() {
    }

    public static /* synthetic */ Boolean a(String str, String str2) {
        return i(str, str2);
    }

    private final void f(ct.i iVar) {
        String g11 = iVar.g("_SSO_AUTH_TOKEN");
        cz.e<String> eVar = f59795d;
        if (g11 == null) {
            g11 = "";
        }
        eVar.b(g11);
        iVar.p("_SSO_AUTH_TOKEN", new a());
    }

    private final void g(ct.i iVar) {
        String g11 = iVar.g("_ACCOUNT_EMAIL");
        cz.e<String> eVar = f59793b;
        if (g11 == null) {
            g11 = "";
        }
        eVar.b(g11);
        iVar.p("_ACCOUNT_EMAIL", new b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0017, code lost:
        if ((!r1) != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Boolean i(java.lang.String r1, java.lang.String r2) {
        /*
            java.lang.String r0 = "emailValue"
            kotlin.jvm.internal.s.f(r1, r0)
            boolean r1 = kotlin.text.m.w(r1)
            r0 = 1
            r1 = r1 ^ r0
            if (r1 == 0) goto L1a
            java.lang.String r1 = "tokenValue"
            kotlin.jvm.internal.s.f(r2, r1)
            boolean r1 = kotlin.text.m.w(r2)
            r1 = r1 ^ r0
            if (r1 == 0) goto L1a
            goto L1b
        L1a:
            r0 = 0
        L1b:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yu.i.i(java.lang.String, java.lang.String):java.lang.Boolean");
    }

    private final void j(ct.i iVar) {
        String g11 = iVar.g("_ACCOUNT_PHONE");
        cz.e<String> eVar = f59794c;
        if (g11 == null) {
            g11 = "";
        }
        eVar.b(g11);
        iVar.p("_ACCOUNT_PHONE", new c());
    }

    public final void e(ct.i realmHelper) {
        kotlin.jvm.internal.s.g(realmHelper, "realmHelper");
        g(realmHelper);
        j(realmHelper);
        f(realmHelper);
    }

    public final hy.i<Boolean> h() {
        hy.i<Boolean> k11 = hy.i.f(f59793b, f59795d, new ky.c() { // from class: yu.h
            @Override // ky.c
            public final Object a(Object obj, Object obj2) {
                return i.a((String) obj, (String) obj2);
            }
        }).k();
        kotlin.jvm.internal.s.f(k11, "combineLatest(\n      ema… ).distinctUntilChanged()");
        return k11;
    }
}