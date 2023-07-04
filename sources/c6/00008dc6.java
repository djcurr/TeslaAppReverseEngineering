package o70;

import f70.s;
import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.q;
import w40.p;
import w60.j;

/* loaded from: classes5.dex */
public class a implements PrivateKey {

    /* renamed from: a  reason: collision with root package name */
    private transient k f42304a;

    /* renamed from: b  reason: collision with root package name */
    private transient s f42305b;

    /* renamed from: c  reason: collision with root package name */
    private transient q f42306c;

    public a(p pVar) {
        a(pVar);
    }

    private void a(p pVar) {
        this.f42306c = pVar.e();
        this.f42304a = j.f(pVar.i().i()).i().e();
        this.f42305b = (s) e70.a.b(pVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f42304a.j(aVar.f42304a) && org.bouncycastle.util.a.c(this.f42305b.d(), aVar.f42305b.d());
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "XMSSMT";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return e70.b.a(this.f42305b, this.f42306c).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.f42304a.hashCode() + (org.bouncycastle.util.a.F(this.f42305b.d()) * 37);
    }
}