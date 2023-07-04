package u50;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class c0 extends y {

    /* renamed from: m  reason: collision with root package name */
    private org.bouncycastle.asn1.k f53194m;

    public c0(org.bouncycastle.asn1.k kVar, f50.i iVar) {
        super(iVar);
        this.f53194m = kVar;
    }

    public c0(org.bouncycastle.asn1.k kVar, n60.e eVar, n60.i iVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        super(eVar, iVar, bigInteger, bigInteger2, bArr);
        this.f53194m = kVar;
    }

    public c0(org.bouncycastle.asn1.k kVar, y yVar) {
        super(yVar.a(), yVar.b(), yVar.e(), yVar.c(), yVar.f());
        this.f53194m = kVar;
    }

    public org.bouncycastle.asn1.k j() {
        return this.f53194m;
    }
}