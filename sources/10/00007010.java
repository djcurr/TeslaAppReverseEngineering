package g50;

import java.math.BigInteger;
import u50.g1;

/* loaded from: classes5.dex */
public class a implements org.bouncycastle.crypto.d {

    /* renamed from: c  reason: collision with root package name */
    private static final BigInteger f27775c = BigInteger.valueOf(1);

    /* renamed from: a  reason: collision with root package name */
    private u50.j f27776a;

    /* renamed from: b  reason: collision with root package name */
    private u50.i f27777b;

    @Override // org.bouncycastle.crypto.d
    public BigInteger a(org.bouncycastle.crypto.i iVar) {
        u50.k kVar = (u50.k) iVar;
        if (kVar.b().equals(this.f27777b)) {
            BigInteger f11 = this.f27777b.f();
            BigInteger c11 = kVar.c();
            if (c11 != null) {
                BigInteger bigInteger = f27775c;
                if (c11.compareTo(bigInteger) > 0 && c11.compareTo(f11.subtract(bigInteger)) < 0) {
                    BigInteger modPow = c11.modPow(this.f27776a.c(), f11);
                    if (modPow.equals(bigInteger)) {
                        throw new IllegalStateException("Shared key can't be 1");
                    }
                    return modPow;
                }
            }
            throw new IllegalArgumentException("Diffie-Hellman public key is weak");
        }
        throw new IllegalArgumentException("Diffie-Hellman public key has wrong parameters.");
    }

    @Override // org.bouncycastle.crypto.d
    public int getFieldSize() {
        return (this.f27776a.b().f().bitLength() + 7) / 8;
    }

    @Override // org.bouncycastle.crypto.d
    public void init(org.bouncycastle.crypto.i iVar) {
        if (iVar instanceof g1) {
            iVar = ((g1) iVar).a();
        }
        u50.b bVar = (u50.b) iVar;
        if (!(bVar instanceof u50.j)) {
            throw new IllegalArgumentException("DHEngine expects DHPrivateKeyParameters");
        }
        u50.j jVar = (u50.j) bVar;
        this.f27776a = jVar;
        this.f27777b = jVar.b();
    }
}