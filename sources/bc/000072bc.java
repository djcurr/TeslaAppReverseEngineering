package h60;

import java.security.spec.AlgorithmParameterSpec;

/* loaded from: classes5.dex */
public class k implements AlgorithmParameterSpec {

    /* renamed from: a  reason: collision with root package name */
    private final org.bouncycastle.asn1.k f28945a;

    /* renamed from: b  reason: collision with root package name */
    private final org.bouncycastle.asn1.k f28946b;

    /* renamed from: c  reason: collision with root package name */
    private final org.bouncycastle.asn1.k f28947c;

    public k(String str) {
        this(d(str), a(str), null);
    }

    public k(org.bouncycastle.asn1.k kVar, org.bouncycastle.asn1.k kVar2, org.bouncycastle.asn1.k kVar3) {
        this.f28945a = kVar;
        this.f28946b = kVar2;
        this.f28947c = kVar3;
    }

    private static org.bouncycastle.asn1.k a(String str) {
        return str.indexOf("12-512") > 0 ? x40.a.f57030d : str.indexOf("12-256") > 0 ? x40.a.f57029c : i40.a.f29853p;
    }

    private static org.bouncycastle.asn1.k d(String str) {
        return i40.b.i(str);
    }

    public org.bouncycastle.asn1.k b() {
        return this.f28946b;
    }

    public org.bouncycastle.asn1.k c() {
        return this.f28947c;
    }

    public org.bouncycastle.asn1.k e() {
        return this.f28945a;
    }
}