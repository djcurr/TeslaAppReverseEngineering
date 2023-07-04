package g50;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class h implements org.bouncycastle.crypto.d {

    /* renamed from: b  reason: collision with root package name */
    private static final BigInteger f27786b = BigInteger.valueOf(1);

    /* renamed from: a  reason: collision with root package name */
    u50.g f27787a;

    private BigInteger b(u50.i iVar, u50.j jVar, u50.k kVar, u50.j jVar2, u50.k kVar2, u50.k kVar3) {
        BigInteger g11 = iVar.g();
        BigInteger pow = BigInteger.valueOf(2L).pow((g11.bitLength() + 1) / 2);
        return kVar3.c().multiply(kVar.c().modPow(kVar3.c().mod(pow).add(pow), iVar.f())).modPow(jVar2.c().add(kVar2.c().mod(pow).add(pow).multiply(jVar.c())).mod(g11), iVar.f());
    }

    @Override // org.bouncycastle.crypto.d
    public BigInteger a(org.bouncycastle.crypto.i iVar) {
        u50.h hVar = (u50.h) iVar;
        u50.j c11 = this.f27787a.c();
        if (this.f27787a.c().b().equals(hVar.b().b())) {
            if (this.f27787a.c().b().g() != null) {
                BigInteger b11 = b(c11.b(), c11, hVar.b(), this.f27787a.a(), this.f27787a.b(), hVar.a());
                if (b11.equals(f27786b)) {
                    throw new IllegalStateException("1 is not a valid agreement value for MQV");
                }
                return b11;
            }
            throw new IllegalStateException("MQV key domain parameters do not have Q set");
        }
        throw new IllegalStateException("MQV public key components have wrong domain parameters");
    }

    @Override // org.bouncycastle.crypto.d
    public int getFieldSize() {
        return (this.f27787a.c().b().f().bitLength() + 7) / 8;
    }

    @Override // org.bouncycastle.crypto.d
    public void init(org.bouncycastle.crypto.i iVar) {
        this.f27787a = (u50.g) iVar;
    }
}