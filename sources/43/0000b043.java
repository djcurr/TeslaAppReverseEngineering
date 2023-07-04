package r60;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    protected final BigInteger f49264a;

    /* renamed from: b  reason: collision with root package name */
    protected final BigInteger f49265b;

    /* renamed from: c  reason: collision with root package name */
    protected final BigInteger f49266c;

    /* renamed from: d  reason: collision with root package name */
    protected final BigInteger f49267d;

    /* renamed from: e  reason: collision with root package name */
    protected final BigInteger f49268e;

    /* renamed from: f  reason: collision with root package name */
    protected final BigInteger f49269f;

    /* renamed from: g  reason: collision with root package name */
    protected final int f49270g;

    public g(BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2, BigInteger bigInteger, BigInteger bigInteger2, int i11) {
        a(bigIntegerArr, "v1");
        a(bigIntegerArr2, "v2");
        this.f49264a = bigIntegerArr[0];
        this.f49265b = bigIntegerArr[1];
        this.f49266c = bigIntegerArr2[0];
        this.f49267d = bigIntegerArr2[1];
        this.f49268e = bigInteger;
        this.f49269f = bigInteger2;
        this.f49270g = i11;
    }

    private static void a(BigInteger[] bigIntegerArr, String str) {
        if (bigIntegerArr == null || bigIntegerArr.length != 2 || bigIntegerArr[0] == null || bigIntegerArr[1] == null) {
            throw new IllegalArgumentException("'" + str + "' must consist of exactly 2 (non-null) values");
        }
    }

    public int b() {
        return this.f49270g;
    }

    public BigInteger c() {
        return this.f49268e;
    }

    public BigInteger d() {
        return this.f49269f;
    }

    public BigInteger e() {
        return this.f49264a;
    }

    public BigInteger f() {
        return this.f49265b;
    }

    public BigInteger g() {
        return this.f49266c;
    }

    public BigInteger h() {
        return this.f49267d;
    }
}