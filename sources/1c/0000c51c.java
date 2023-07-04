package zp;

/* loaded from: classes2.dex */
public final class n extends a {

    /* renamed from: c  reason: collision with root package name */
    public static final n f60652c = new n("HS256", com.nimbusds.jose.d.REQUIRED);

    /* renamed from: d  reason: collision with root package name */
    public static final n f60653d;

    /* renamed from: e  reason: collision with root package name */
    public static final n f60654e;

    /* renamed from: f  reason: collision with root package name */
    public static final n f60655f;

    /* renamed from: g  reason: collision with root package name */
    public static final n f60656g;

    /* renamed from: h  reason: collision with root package name */
    public static final n f60657h;

    /* renamed from: i  reason: collision with root package name */
    public static final n f60658i;

    /* renamed from: j  reason: collision with root package name */
    public static final n f60659j;

    /* renamed from: k  reason: collision with root package name */
    public static final n f60660k;

    /* renamed from: l  reason: collision with root package name */
    public static final n f60661l;

    /* renamed from: m  reason: collision with root package name */
    public static final n f60662m;

    /* renamed from: n  reason: collision with root package name */
    public static final n f60663n;

    /* renamed from: o  reason: collision with root package name */
    public static final n f60664o;

    /* renamed from: p  reason: collision with root package name */
    public static final n f60665p;

    static {
        com.nimbusds.jose.d dVar = com.nimbusds.jose.d.OPTIONAL;
        f60653d = new n("HS384", dVar);
        f60654e = new n("HS512", dVar);
        com.nimbusds.jose.d dVar2 = com.nimbusds.jose.d.RECOMMENDED;
        f60655f = new n("RS256", dVar2);
        f60656g = new n("RS384", dVar);
        f60657h = new n("RS512", dVar);
        f60658i = new n("ES256", dVar2);
        f60659j = new n("ES256K", dVar);
        f60660k = new n("ES384", dVar);
        f60661l = new n("ES512", dVar);
        f60662m = new n("PS256", dVar);
        f60663n = new n("PS384", dVar);
        f60664o = new n("PS512", dVar);
        f60665p = new n("EdDSA", dVar);
    }

    public n(String str, com.nimbusds.jose.d dVar) {
        super(str, dVar);
    }

    public static n b(String str) {
        n nVar = f60652c;
        if (str.equals(nVar.getName())) {
            return nVar;
        }
        n nVar2 = f60653d;
        if (str.equals(nVar2.getName())) {
            return nVar2;
        }
        n nVar3 = f60654e;
        if (str.equals(nVar3.getName())) {
            return nVar3;
        }
        n nVar4 = f60655f;
        if (str.equals(nVar4.getName())) {
            return nVar4;
        }
        n nVar5 = f60656g;
        if (str.equals(nVar5.getName())) {
            return nVar5;
        }
        n nVar6 = f60657h;
        if (str.equals(nVar6.getName())) {
            return nVar6;
        }
        n nVar7 = f60658i;
        if (str.equals(nVar7.getName())) {
            return nVar7;
        }
        n nVar8 = f60659j;
        if (str.equals(nVar8.getName())) {
            return nVar8;
        }
        n nVar9 = f60660k;
        if (str.equals(nVar9.getName())) {
            return nVar9;
        }
        n nVar10 = f60661l;
        if (str.equals(nVar10.getName())) {
            return nVar10;
        }
        n nVar11 = f60662m;
        if (str.equals(nVar11.getName())) {
            return nVar11;
        }
        n nVar12 = f60663n;
        if (str.equals(nVar12.getName())) {
            return nVar12;
        }
        n nVar13 = f60664o;
        if (str.equals(nVar13.getName())) {
            return nVar13;
        }
        n nVar14 = f60665p;
        return str.equals(nVar14.getName()) ? nVar14 : new n(str);
    }

    public n(String str) {
        super(str, null);
    }
}