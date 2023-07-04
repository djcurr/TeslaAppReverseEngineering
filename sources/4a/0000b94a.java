package v50;

import java.io.InputStream;
import java.math.BigInteger;
import org.bouncycastle.crypto.u;
import u50.i;
import u50.k;

/* loaded from: classes5.dex */
public class a implements u {

    /* renamed from: a  reason: collision with root package name */
    private i f54083a;

    public a(i iVar) {
        this.f54083a = iVar;
    }

    @Override // org.bouncycastle.crypto.u
    public u50.b readKey(InputStream inputStream) {
        int bitLength = (this.f54083a.f().bitLength() + 7) / 8;
        byte[] bArr = new byte[bitLength];
        t70.a.f(inputStream, bArr, 0, bitLength);
        return new k(new BigInteger(1, bArr), this.f54083a);
    }
}