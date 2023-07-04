package js;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class f implements js.a {

    /* renamed from: a  reason: collision with root package name */
    private final ct.i f33948a;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
    }

    public f(ct.i realmHelper) {
        s.g(realmHelper, "realmHelper");
        this.f33948a = realmHelper;
    }

    @Override // js.a
    public String a() {
        return this.f33948a.g("_SSO_AUTH_TOKEN");
    }

    @Override // js.a
    public String b() {
        return this.f33948a.g("_SSO_AUTH_REFRESH_TOKEN");
    }

    @Override // js.a
    public void c(String str) {
        this.f33948a.t("_SSO_AUTH_TOKEN", str);
    }

    @Override // js.a
    public String d() {
        return this.f33948a.g("_SSO_AUTH_ID_TOKEN");
    }

    @Override // js.a
    public void e(String str) {
        this.f33948a.t("_SSO_AUTH_REFRESH_TOKEN", str);
    }

    @Override // js.a
    public void f(String str) {
        this.f33948a.t("_SSO_AUTH_ID_TOKEN", str);
    }

    @Override // js.a
    public String getIssuer() {
        com.auth0.android.jwt.c a11;
        String d11 = d();
        if (d11 == null || (a11 = at.c.f6724a.a(d11)) == null) {
            return null;
        }
        return a11.f();
    }
}