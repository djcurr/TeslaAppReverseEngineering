package g50;

import java.math.BigInteger;
import u50.l;
import u50.m;

/* loaded from: classes5.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private l f27778a;

    public byte[] a(org.bouncycastle.crypto.i iVar) {
        m mVar = (m) iVar;
        a aVar = new a();
        a aVar2 = new a();
        aVar.init(this.f27778a.b());
        BigInteger a11 = aVar.a(mVar.b());
        aVar2.init(this.f27778a.a());
        BigInteger a12 = aVar2.a(mVar.a());
        int b11 = b();
        byte[] bArr = new byte[b11 * 2];
        r70.a.a(a12, bArr, 0, b11);
        r70.a.a(a11, bArr, b11, b11);
        return bArr;
    }

    public int b() {
        return (this.f27778a.b().b().f().bitLength() + 7) / 8;
    }

    public void c(org.bouncycastle.crypto.i iVar) {
        this.f27778a = (l) iVar;
    }
}