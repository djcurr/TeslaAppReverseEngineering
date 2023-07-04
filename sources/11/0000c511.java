package zp;

/* loaded from: classes2.dex */
public final class d extends a {

    /* renamed from: d  reason: collision with root package name */
    public static final d f60576d;

    /* renamed from: e  reason: collision with root package name */
    public static final d f60577e;

    /* renamed from: f  reason: collision with root package name */
    public static final d f60578f;

    /* renamed from: g  reason: collision with root package name */
    public static final d f60579g;

    /* renamed from: h  reason: collision with root package name */
    public static final d f60580h;

    /* renamed from: i  reason: collision with root package name */
    public static final d f60581i;

    /* renamed from: j  reason: collision with root package name */
    public static final d f60582j;

    /* renamed from: k  reason: collision with root package name */
    public static final d f60583k;

    /* renamed from: l  reason: collision with root package name */
    public static final d f60584l;

    /* renamed from: c  reason: collision with root package name */
    private final int f60585c;

    static {
        com.nimbusds.jose.d dVar = com.nimbusds.jose.d.REQUIRED;
        f60576d = new d("A128CBC-HS256", dVar, 256);
        com.nimbusds.jose.d dVar2 = com.nimbusds.jose.d.OPTIONAL;
        f60577e = new d("A192CBC-HS384", dVar2, 384);
        f60578f = new d("A256CBC-HS512", dVar, 512);
        f60579g = new d("A128CBC+HS256", dVar2, 256);
        f60580h = new d("A256CBC+HS512", dVar2, 512);
        com.nimbusds.jose.d dVar3 = com.nimbusds.jose.d.RECOMMENDED;
        f60581i = new d("A128GCM", dVar3, 128);
        f60582j = new d("A192GCM", dVar2, 192);
        f60583k = new d("A256GCM", dVar3, 256);
        f60584l = new d("XC20P", dVar2, 256);
    }

    public d(String str, com.nimbusds.jose.d dVar, int i11) {
        super(str, dVar);
        this.f60585c = i11;
    }

    public static d c(String str) {
        d dVar = f60576d;
        if (str.equals(dVar.getName())) {
            return dVar;
        }
        d dVar2 = f60577e;
        if (str.equals(dVar2.getName())) {
            return dVar2;
        }
        d dVar3 = f60578f;
        if (str.equals(dVar3.getName())) {
            return dVar3;
        }
        d dVar4 = f60581i;
        if (str.equals(dVar4.getName())) {
            return dVar4;
        }
        d dVar5 = f60582j;
        if (str.equals(dVar5.getName())) {
            return dVar5;
        }
        d dVar6 = f60583k;
        if (str.equals(dVar6.getName())) {
            return dVar6;
        }
        d dVar7 = f60579g;
        if (str.equals(dVar7.getName())) {
            return dVar7;
        }
        d dVar8 = f60580h;
        if (str.equals(dVar8.getName())) {
            return dVar8;
        }
        d dVar9 = f60584l;
        return str.equals(dVar9.getName()) ? dVar9 : new d(str);
    }

    public int b() {
        return this.f60585c;
    }

    public d(String str) {
        this(str, null, 0);
    }
}