package g50;

import java.math.BigInteger;
import u50.w;
import u50.x;

/* loaded from: classes5.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private w f27781a;

    public byte[] a(org.bouncycastle.crypto.i iVar) {
        x xVar = (x) iVar;
        d dVar = new d();
        d dVar2 = new d();
        dVar.init(this.f27781a.b());
        BigInteger a11 = dVar.a(xVar.b());
        dVar2.init(this.f27781a.a());
        BigInteger a12 = dVar2.a(xVar.a());
        int b11 = b();
        byte[] bArr = new byte[b11 * 2];
        r70.a.a(a12, bArr, 0, b11);
        r70.a.a(a11, bArr, b11, b11);
        return bArr;
    }

    public int b() {
        return (this.f27781a.b().b().a().t() + 7) / 8;
    }

    public void c(org.bouncycastle.crypto.i iVar) {
        this.f27781a = (w) iVar;
    }
}